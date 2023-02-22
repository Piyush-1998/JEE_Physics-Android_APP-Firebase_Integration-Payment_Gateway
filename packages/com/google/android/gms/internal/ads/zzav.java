package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzav implements zzk {
    private final Map<String, zzax> zzci;
    private long zzcj;
    private final zzaz zzck;
    private final int zzcl;

    public zzav(File file, int i) {
        this.zzci = new LinkedHashMap(16, 0.75f, true);
        this.zzcj = 0L;
        this.zzck = new zzay(this, file);
        this.zzcl = 20971520;
    }

    private zzav(zzaz zzazVar, int i) {
        this.zzci = new LinkedHashMap(16, 0.75f, true);
        this.zzcj = 0L;
        this.zzck = zzazVar;
        this.zzcl = 5242880;
    }

    public zzav(zzaz zzazVar) {
        this(zzazVar, 5242880);
    }

    @Override // com.google.android.gms.internal.ads.zzk
    public final synchronized zzn zzb(String str) {
        zzax zzaxVar = this.zzci.get(str);
        if (zzaxVar == null) {
            return null;
        }
        File zzf = zzf(str);
        try {
            zzba zzbaVar = new zzba(new BufferedInputStream(zza(zzf)), zzf.length());
            try {
                zzax zzc = zzax.zzc(zzbaVar);
                if (!TextUtils.equals(str, zzc.zzcn)) {
                    zzaq.d("%s: key=%s, found=%s", zzf.getAbsolutePath(), str, zzc.zzcn);
                    removeEntry(str);
                    return null;
                }
                byte[] zza = zza(zzbaVar, zzbaVar.zzp());
                zzn zznVar = new zzn();
                zznVar.data = zza;
                zznVar.zzr = zzaxVar.zzr;
                zznVar.zzs = zzaxVar.zzs;
                zznVar.zzt = zzaxVar.zzt;
                zznVar.zzu = zzaxVar.zzu;
                zznVar.zzv = zzaxVar.zzv;
                List<zzu> list = zzaxVar.zzx;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzu zzuVar : list) {
                    treeMap.put(zzuVar.getName(), zzuVar.getValue());
                }
                zznVar.zzw = treeMap;
                zznVar.zzx = Collections.unmodifiableList(zzaxVar.zzx);
                return zznVar;
            } finally {
                zzbaVar.close();
            }
        } catch (IOException e) {
            zzaq.d("%s: %s", zzf.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzk
    public final synchronized void initialize() {
        long length;
        zzba zzbaVar;
        File zzo = this.zzck.zzo();
        if (!zzo.exists()) {
            if (!zzo.mkdirs()) {
                zzaq.e("Unable to create cache dir %s", zzo.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = zzo.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                length = file.length();
                zzbaVar = new zzba(new BufferedInputStream(zza(file)), length);
            } catch (IOException unused) {
                file.delete();
            }
            try {
                zzax zzc = zzax.zzc(zzbaVar);
                zzc.zzcm = length;
                zza(zzc.zzcn, zzc);
                zzbaVar.close();
            } catch (Throwable th) {
                zzbaVar.close();
                throw th;
                break;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzk
    public final synchronized void zza(String str, boolean z) {
        zzn zzb = zzb(str);
        if (zzb != null) {
            zzb.zzv = 0L;
            zzb.zzu = 0L;
            zza(str, zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzk
    public final synchronized void zza(String str, zzn zznVar) {
        long j;
        if (this.zzcj + zznVar.data.length <= this.zzcl || zznVar.data.length <= this.zzcl * 0.9f) {
            File zzf = zzf(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzf));
                zzax zzaxVar = new zzax(str, zznVar);
                if (!zzaxVar.zza(bufferedOutputStream)) {
                    bufferedOutputStream.close();
                    zzaq.d("Failed to write header for %s", zzf.getAbsolutePath());
                    throw new IOException();
                }
                bufferedOutputStream.write(zznVar.data);
                bufferedOutputStream.close();
                zzaxVar.zzcm = zzf.length();
                zza(str, zzaxVar);
                if (this.zzcj >= this.zzcl) {
                    if (zzaq.DEBUG) {
                        zzaq.v("Pruning old cache entries.", new Object[0]);
                    }
                    long j2 = this.zzcj;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    Iterator<Map.Entry<String, zzax>> it = this.zzci.entrySet().iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            j = j2;
                            break;
                        }
                        zzax value = it.next().getValue();
                        if (zzf(value.zzcn).delete()) {
                            j = j2;
                            this.zzcj -= value.zzcm;
                        } else {
                            j = j2;
                            zzaq.d("Could not delete cache entry for key=%s, filename=%s", value.zzcn, zze(value.zzcn));
                        }
                        it.remove();
                        i++;
                        if (((float) this.zzcj) < this.zzcl * 0.9f) {
                            break;
                        }
                        j2 = j;
                    }
                    if (zzaq.DEBUG) {
                        zzaq.v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.zzcj - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                    }
                }
            } catch (IOException unused) {
                if (!zzf.delete()) {
                    zzaq.d("Could not clean up file %s", zzf.getAbsolutePath());
                }
                if (this.zzck.zzo().exists()) {
                    return;
                }
                zzaq.d("Re-initializing cache after external clearing.", new Object[0]);
                this.zzci.clear();
                this.zzcj = 0L;
                initialize();
            }
        }
    }

    private final synchronized void remove(String str) {
        boolean delete = zzf(str).delete();
        removeEntry(str);
        if (!delete) {
            zzaq.d("Could not delete cache entry for key=%s, filename=%s", str, zze(str));
        }
    }

    private static String zze(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private final File zzf(String str) {
        return new File(this.zzck.zzo(), zze(str));
    }

    private final void zza(String str, zzax zzaxVar) {
        if (!this.zzci.containsKey(str)) {
            this.zzcj += zzaxVar.zzcm;
        } else {
            this.zzcj += zzaxVar.zzcm - this.zzci.get(str).zzcm;
        }
        this.zzci.put(str, zzaxVar);
    }

    private final void removeEntry(String str) {
        zzax remove = this.zzci.remove(str);
        if (remove != null) {
            this.zzcj -= remove.zzcm;
        }
    }

    private static byte[] zza(zzba zzbaVar, long j) throws IOException {
        long zzp = zzbaVar.zzp();
        if (j >= 0 && j <= zzp) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzbaVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(73);
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(zzp);
        throw new IOException(sb.toString());
    }

    private static InputStream zza(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    private static int zza(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write(i >>> 24);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(InputStream inputStream) throws IOException {
        return (zza(inputStream) << 24) | zza(inputStream) | 0 | (zza(inputStream) << 8) | (zza(inputStream) << 16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzc(InputStream inputStream) throws IOException {
        return (zza(inputStream) & 255) | 0 | ((zza(inputStream) & 255) << 8) | ((zza(inputStream) & 255) << 16) | ((zza(inputStream) & 255) << 24) | ((zza(inputStream) & 255) << 32) | ((zza(inputStream) & 255) << 40) | ((zza(inputStream) & 255) << 48) | ((255 & zza(inputStream)) << 56);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        zza(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzba zzbaVar) throws IOException {
        return new String(zza(zzbaVar, zzc(zzbaVar)), "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<zzu> zzb(zzba zzbaVar) throws IOException {
        int zzb = zzb((InputStream) zzbaVar);
        if (zzb < 0) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(zzb);
            throw new IOException(sb.toString());
        }
        List<zzu> emptyList = zzb == 0 ? Collections.emptyList() : new ArrayList<>();
        for (int i = 0; i < zzb; i++) {
            emptyList.add(new zzu(zza(zzbaVar).intern(), zza(zzbaVar).intern()));
        }
        return emptyList;
    }
}
