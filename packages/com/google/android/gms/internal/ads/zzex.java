package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzcf;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzex {
    private static final String TAG = zzex.class.getSimpleName();
    protected Context zzvr;
    private zzev zzyt;
    private ExecutorService zzyu;
    private DexClassLoader zzyv;
    private zzei zzyw;
    private byte[] zzyx;
    private boolean zzza;
    private zzdu zzzd;
    private Map<Pair<String, String>, zzgk> zzzg;
    private volatile AdvertisingIdClient zzyy = null;
    private volatile boolean zzxj = false;
    private Future zzyz = null;
    private volatile zzcf.zza zzzb = null;
    private Future zzzc = null;
    private boolean zzze = false;
    private boolean zzzf = false;
    private boolean zzzh = false;

    public static zzex zza(Context context, String str, String str2, boolean z) {
        zzex zzexVar = new zzex(context);
        try {
            zzexVar.zzyu = Executors.newCachedThreadPool(new zzfa());
            zzexVar.zzxj = z;
            if (z) {
                zzexVar.zzyz = zzexVar.zzyu.submit(new zzez(zzexVar));
            }
            zzexVar.zzyu.execute(new zzfb(zzexVar));
            try {
                GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
                zzexVar.zzze = googleApiAvailabilityLight.getApkVersion(zzexVar.zzvr) > 0;
                zzexVar.zzzf = googleApiAvailabilityLight.isGooglePlayServicesAvailable(zzexVar.zzvr) == 0;
            } catch (Throwable unused) {
            }
            zzexVar.zza(0, true);
            if (zzfg.isMainThread() && ((Boolean) zzwe.zzpu().zzd(zzaat.zzcqv)).booleanValue()) {
                throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
            }
            zzei zzeiVar = new zzei(null);
            zzexVar.zzyw = zzeiVar;
            try {
                zzexVar.zzyx = zzeiVar.zzap(str);
                try {
                    try {
                        File cacheDir = zzexVar.zzvr.getCacheDir();
                        if (cacheDir == null && (cacheDir = zzexVar.zzvr.getDir("dex", 0)) == null) {
                            throw new zzeu();
                        }
                        File file = new File(String.format("%s/%s.jar", cacheDir, "1588462714860"));
                        if (!file.exists()) {
                            byte[] zza = zzexVar.zzyw.zza(zzexVar.zzyx, str2);
                            file.createNewFile();
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            fileOutputStream.write(zza, 0, zza.length);
                            fileOutputStream.close();
                        }
                        zzexVar.zzb(cacheDir, "1588462714860");
                        try {
                            zzexVar.zzyv = new DexClassLoader(file.getAbsolutePath(), cacheDir.getAbsolutePath(), null, zzexVar.zzvr.getClassLoader());
                            zzc(file);
                            zzexVar.zza(cacheDir, "1588462714860");
                            zzaq(String.format("%s/%s.dex", cacheDir, "1588462714860"));
                            zzexVar.zzzd = new zzdu(zzexVar);
                            zzexVar.zzzh = true;
                        } catch (Throwable th) {
                            zzc(file);
                            zzexVar.zza(cacheDir, "1588462714860");
                            zzaq(String.format("%s/%s.dex", cacheDir, "1588462714860"));
                            throw th;
                        }
                    } catch (zzeh e) {
                        throw new zzeu(e);
                    } catch (NullPointerException e2) {
                        throw new zzeu(e2);
                    }
                } catch (FileNotFoundException e3) {
                    throw new zzeu(e3);
                } catch (IOException e4) {
                    throw new zzeu(e4);
                }
            } catch (zzeh e5) {
                throw new zzeu(e5);
            }
        } catch (zzeu unused2) {
        }
        return zzexVar;
    }

    public final Context getContext() {
        return this.zzvr;
    }

    public final boolean isInitialized() {
        return this.zzzh;
    }

    public final ExecutorService zzcg() {
        return this.zzyu;
    }

    public final DexClassLoader zzch() {
        return this.zzyv;
    }

    public final zzei zzci() {
        return this.zzyw;
    }

    public final byte[] zzcj() {
        return this.zzyx;
    }

    public final boolean zzck() {
        return this.zzze;
    }

    public final zzdu zzcl() {
        return this.zzzd;
    }

    public final boolean zzcm() {
        return this.zzzf;
    }

    public final boolean zzcb() {
        return this.zzyt.zzcb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzev zzcn() {
        return this.zzyt;
    }

    public final zzcf.zza zzco() {
        return this.zzzb;
    }

    public final Future zzcp() {
        return this.zzzc;
    }

    private zzex(Context context) {
        Context applicationContext = context.getApplicationContext();
        boolean z = applicationContext != null;
        this.zzza = z;
        this.zzvr = z ? applicationContext : context;
        this.zzzg = new HashMap();
        if (this.zzyt == null) {
            this.zzyt = new zzev(this.zzvr);
        }
    }

    private final void zza(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (file2.exists()) {
            return;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (!file3.exists()) {
            return;
        }
        long length = file3.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file3);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    zzc(file3);
                    return;
                }
                System.out.print("test");
                System.out.print("test");
                System.out.print("test");
                zzcf.zzc.zza zzc = zzcf.zzc.zzbe().zzd(zzeff.zzu(Build.VERSION.SDK.getBytes())).zzc(zzeff.zzu(str.getBytes()));
                byte[] bytes = this.zzyw.zzb(this.zzyx, bArr).getBytes();
                zzc.zza(zzeff.zzu(bytes)).zzb(zzeff.zzu(zzcx.zzb(bytes)));
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] byteArray = ((zzcf.zzc) ((zzegp) zzc.zzbfx())).toByteArray();
                    fileOutputStream.write(byteArray, 0, byteArray.length);
                    fileOutputStream.close();
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                    zzc(file3);
                } catch (zzeh | IOException | NoSuchAlgorithmException unused4) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    zzc(file3);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused7) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused8) {
                        }
                    }
                    zzc(file3);
                    throw th;
                }
            } catch (zzeh | IOException | NoSuchAlgorithmException unused9) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzeh | IOException | NoSuchAlgorithmException unused10) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void zzaq(String str) {
        zzc(new File(str));
    }

    private static void zzc(File file) {
        if (!file.exists()) {
            Log.d(TAG, String.format("File %s not found. No need for deletion", file.getAbsolutePath()));
        } else {
            file.delete();
        }
    }

    private final boolean zzb(File file, String str) {
        FileOutputStream fileOutputStream;
        File file2 = new File(String.format("%s/%s.tmp", file, str));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", file, str));
        if (file3.exists()) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            long length = file2.length();
            if (length <= 0) {
                zzc(file2);
                return false;
            }
            byte[] bArr = new byte[(int) length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            try {
                if (fileInputStream2.read(bArr) <= 0) {
                    Log.d(TAG, "Cannot read the cache data.");
                    zzc(file2);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return false;
                }
                zzcf.zzc zzb = zzcf.zzc.zzb(bArr, zzegc.zzbey());
                if (str.equals(new String(zzb.zzbc().toByteArray())) && Arrays.equals(zzb.zzbb().toByteArray(), zzcx.zzb(zzb.zzba().toByteArray())) && Arrays.equals(zzb.zzbd().toByteArray(), Build.VERSION.SDK.getBytes())) {
                    byte[] zza = this.zzyw.zza(this.zzyx, new String(zzb.zzba().toByteArray()));
                    file3.createNewFile();
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        fileOutputStream.write(zza, 0, zza.length);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                        return true;
                    } catch (zzeh | IOException | NoSuchAlgorithmException unused4) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused6) {
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused7) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused8) {
                            }
                        }
                        throw th;
                    }
                }
                zzc(file2);
                try {
                    fileInputStream2.close();
                } catch (IOException unused9) {
                }
                return false;
            } catch (zzeh | IOException | NoSuchAlgorithmException unused10) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (zzeh | IOException | NoSuchAlgorithmException unused11) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public final boolean zza(String str, String str2, Class<?>... clsArr) {
        if (this.zzzg.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.zzzg.put(new Pair<>(str, str2), new zzgk(this, str, str2, clsArr));
        return true;
    }

    public final Method zza(String str, String str2) {
        zzgk zzgkVar = this.zzzg.get(new Pair(str, str2));
        if (zzgkVar == null) {
            return null;
        }
        return zzgkVar.zzdb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcq() {
        try {
            if (this.zzyy == null && this.zzza) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.zzvr);
                advertisingIdClient.start();
                this.zzyy = advertisingIdClient;
            }
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
            this.zzyy = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, boolean z) {
        if (this.zzzf) {
            Future<?> submit = this.zzyu.submit(new zzfc(this, i, z));
            if (i == 0) {
                this.zzzc = submit;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcf.zza zzb(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        return zzcr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zza(int i, zzcf.zza zzaVar) {
        if (i < 4) {
            return zzaVar == null || !zzaVar.zzaj() || zzaVar.zzaf().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzaVar.zzao() || !zzaVar.zzap().zzbg() || zzaVar.zzap().zzbh() == -2;
        }
        return false;
    }

    private final zzcf.zza zzcr() {
        try {
            return zzdqi.zzj(this.zzvr, this.zzvr.getPackageName(), Integer.toString(this.zzvr.getPackageManager().getPackageInfo(this.zzvr.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final AdvertisingIdClient zzcs() {
        if (this.zzxj) {
            if (this.zzyy != null) {
                return this.zzyy;
            }
            Future future = this.zzyz;
            if (future != null) {
                try {
                    future.get(2000L, TimeUnit.MILLISECONDS);
                    this.zzyz = null;
                } catch (InterruptedException | ExecutionException unused) {
                } catch (TimeoutException unused2) {
                    this.zzyz.cancel(true);
                }
            }
            return this.zzyy;
        }
        return null;
    }

    public final int zzbu() {
        if (this.zzzd != null) {
            return zzdu.zzbu();
        }
        return Integer.MIN_VALUE;
    }
}
