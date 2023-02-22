package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbfg extends zzbev implements zzbei {
    private String zzefy;
    private boolean zzelf;
    private zzbeb zzeli;
    private Exception zzelj;
    private boolean zzelk;

    public zzbfg(zzbde zzbdeVar, zzbdf zzbdfVar) {
        super(zzbdeVar);
        zzbeb zzbebVar = new zzbeb(zzbdeVar.getContext(), zzbdfVar);
        this.zzeli = zzbebVar;
        zzbebVar.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zzdq(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zzn(int i, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zzb(final boolean z, final long j) {
        final zzbde zzbdeVar = this.zzekx.get();
        if (zzbdeVar != null) {
            zzbbi.zzedy.execute(new Runnable(zzbdeVar, z, j) { // from class: com.google.android.gms.internal.ads.zzbfj
                private final boolean zzegf;
                private final long zzejh;
                private final zzbde zzelq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzelq = zzbdeVar;
                    this.zzegf = z;
                    this.zzejh = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzelq.zza(this.zzegf, this.zzejh);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zza(String str, Exception exc) {
        String str2 = (String) zzwe.zzpu().zzd(zzaat.zzclt);
        if (str2 != null) {
            List asList = Arrays.asList(str2.split(","));
            if (asList.contains("all") || asList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.zzelj = exc;
        zzaxy.zzd("Precache error", exc);
        zzfq(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void zzdm(int i) {
        this.zzeli.zzaat().zzdt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void zzdl(int i) {
        this.zzeli.zzaat().zzds(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void zzdn(int i) {
        this.zzeli.zzaat().zzdn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void zzdo(int i) {
        this.zzeli.zzaat().zzdo(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbev, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzbeb zzbebVar = this.zzeli;
        if (zzbebVar != null) {
            zzbebVar.zza((zzbei) null);
            this.zzeli.release();
        }
        super.release();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzbev
    public final String zzfo(String str) {
        String valueOf = String.valueOf(super.zzfo(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean zzfn(String str) {
        return zze(str, new String[]{str});
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean zze(String str, String[] strArr) {
        String str2;
        long j;
        long j2;
        long j3;
        String str3;
        long j4;
        long j5;
        this.zzefy = str;
        String zzfo = zzfo(str);
        String str4 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                try {
                    uriArr[i] = Uri.parse(strArr[i]);
                } catch (Exception e) {
                    e = e;
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                    sb.append("Failed to preload url ");
                    sb.append(str);
                    sb.append(" Exception: ");
                    sb.append(message);
                    zzaxy.zzfe(sb.toString());
                    release();
                    zza(str, zzfo, str4, zzb(str4, e));
                    return false;
                }
            }
            this.zzeli.zza(uriArr, this.zzecp);
            zzbde zzbdeVar = this.zzekx.get();
            if (zzbdeVar != null) {
                zzbdeVar.zza(zzfo, this);
            }
            Clock zzkw = com.google.android.gms.ads.internal.zzp.zzkw();
            long currentTimeMillis = zzkw.currentTimeMillis();
            long longValue = ((Long) zzwe.zzpu().zzd(zzaat.zzcma)).longValue();
            long longValue2 = ((Long) zzwe.zzpu().zzd(zzaat.zzclz)).longValue() * 1000;
            long intValue = ((Integer) zzwe.zzpu().zzd(zzaat.zzcly)).intValue();
            long j6 = -1;
            while (true) {
                try {
                    synchronized (this) {
                        try {
                            if (zzkw.currentTimeMillis() - currentTimeMillis > longValue2) {
                                long j7 = longValue2;
                                StringBuilder sb2 = new StringBuilder(47);
                                sb2.append("Timeout reached. Limit: ");
                                sb2.append(j7);
                                sb2.append(" ms");
                                throw new IOException(sb2.toString());
                            } else if (this.zzelf) {
                                if (this.zzelj != null) {
                                    throw this.zzelj;
                                }
                                throw new IOException("Abort requested before buffering finished. ");
                            } else if (!this.zzelk) {
                                zzhc zzaaq = this.zzeli.zzaaq();
                                if (zzaaq == null) {
                                    throw new IOException("ExoPlayer was released during preloading.");
                                }
                                str2 = str4;
                                try {
                                    long duration = zzaaq.getDuration();
                                    if (duration > 0) {
                                        long bufferedPosition = zzaaq.getBufferedPosition();
                                        if (bufferedPosition != j6) {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            zza(str, zzfo, bufferedPosition, duration, bufferedPosition > 0, zzbeb.zzaar(), zzbeb.zzaas());
                                            j5 = bufferedPosition;
                                        } else {
                                            j = intValue;
                                            j2 = longValue2;
                                            j4 = longValue;
                                            j5 = j6;
                                        }
                                        if (bufferedPosition >= duration) {
                                            zzc(str, zzfo, duration);
                                        } else if (this.zzeli.getBytesTransferred() < j || bufferedPosition <= 0) {
                                            j3 = j4;
                                            str3 = j5;
                                        }
                                    } else {
                                        j = intValue;
                                        j2 = longValue2;
                                        j3 = longValue;
                                        str3 = j6;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    str4 = str2;
                                }
                                try {
                                    try {
                                        wait(j3);
                                    } catch (InterruptedException unused) {
                                        throw new IOException("Wait interrupted.");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    str4 = str3;
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    longValue = j3;
                    str4 = str2;
                    intValue = j;
                    longValue2 = j2;
                    j6 = str3;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            return true;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final void abort() {
        zzfq(null);
    }

    private final void zzfq(String str) {
        synchronized (this) {
            this.zzelf = true;
            notify();
            release();
        }
        String str2 = this.zzefy;
        if (str2 != null) {
            String zzfo = zzfo(str2);
            Exception exc = this.zzelj;
            if (exc != null) {
                zza(this.zzefy, zzfo, "badUrl", zzb(str, exc));
            } else {
                zza(this.zzefy, zzfo, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    public final zzbeb zzaav() {
        synchronized (this) {
            this.zzelk = true;
            notify();
        }
        this.zzeli.zza((zzbei) null);
        zzbeb zzbebVar = this.zzeli;
        this.zzeli = null;
        return zzbebVar;
    }

    private static String zzb(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }
}
