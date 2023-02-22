package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbdw implements zzom {
    private boolean isOpen;
    private Uri uri;
    private InputStream zzeji;
    private final zzom zzejj;
    private final zzpa<zzom> zzejk;
    private final zzbdz zzejl;
    private final Context zzvr;

    public zzbdw(Context context, zzom zzomVar, zzpa<zzom> zzpaVar, zzbdz zzbdzVar) {
        this.zzvr = context;
        this.zzejj = zzomVar;
        this.zzejk = zzpaVar;
        this.zzejl = zzbdzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final void close() throws IOException {
        if (!this.isOpen) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.isOpen = false;
        this.uri = null;
        InputStream inputStream = this.zzeji;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzeji = null;
        } else {
            this.zzejj.close();
        }
        zzpa<zzom> zzpaVar = this.zzejk;
        if (zzpaVar != null) {
            zzpaVar.zze(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final long zza(zzon zzonVar) throws IOException {
        Long l;
        zzon zzonVar2 = zzonVar;
        if (this.isOpen) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.isOpen = true;
        this.uri = zzonVar2.uri;
        zzpa<zzom> zzpaVar = this.zzejk;
        if (zzpaVar != null) {
            zzpaVar.zza(this, zzonVar2);
        }
        zzta zzd = zzta.zzd(zzonVar2.uri);
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcsr)).booleanValue()) {
            zzsv zzsvVar = null;
            if (zzd != null) {
                zzd.zzbvf = zzonVar2.position;
                zzsvVar = com.google.android.gms.ads.internal.zzp.zzkv().zza(zzd);
            }
            if (zzsvVar != null && zzsvVar.zzmu()) {
                this.zzeji = zzsvVar.zzmv();
                return -1L;
            }
        } else if (zzd != null) {
            zzd.zzbvf = zzonVar2.position;
            if (zzd.zzbve) {
                l = (Long) zzwe.zzpu().zzd(zzaat.zzcst);
            } else {
                l = (Long) zzwe.zzpu().zzd(zzaat.zzcss);
            }
            long longValue = l.longValue();
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
            com.google.android.gms.ads.internal.zzp.zzlj();
            Future<InputStream> zza = zztl.zza(this.zzvr, zzd);
            try {
                try {
                    this.zzeji = zza.get(longValue, TimeUnit.MILLISECONDS);
                    long elapsedRealtime2 = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - elapsedRealtime;
                    this.zzejl.zzb(true, elapsedRealtime2);
                    StringBuilder sb = new StringBuilder(44);
                    sb.append("Cache connection took ");
                    sb.append(elapsedRealtime2);
                    sb.append("ms");
                    zzaxy.zzei(sb.toString());
                    return -1L;
                } catch (InterruptedException unused) {
                    zza.cancel(true);
                    Thread.currentThread().interrupt();
                    long elapsedRealtime3 = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - elapsedRealtime;
                    this.zzejl.zzb(false, elapsedRealtime3);
                    StringBuilder sb2 = new StringBuilder(44);
                    sb2.append("Cache connection took ");
                    sb2.append(elapsedRealtime3);
                    sb2.append("ms");
                    zzaxy.zzei(sb2.toString());
                } catch (ExecutionException | TimeoutException unused2) {
                    zza.cancel(true);
                    long elapsedRealtime4 = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - elapsedRealtime;
                    this.zzejl.zzb(false, elapsedRealtime4);
                    StringBuilder sb3 = new StringBuilder(44);
                    sb3.append("Cache connection took ");
                    sb3.append(elapsedRealtime4);
                    sb3.append("ms");
                    zzaxy.zzei(sb3.toString());
                }
            } catch (Throwable th) {
                long elapsedRealtime5 = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - elapsedRealtime;
                this.zzejl.zzb(false, elapsedRealtime5);
                StringBuilder sb4 = new StringBuilder(44);
                sb4.append("Cache connection took ");
                sb4.append(elapsedRealtime5);
                sb4.append("ms");
                zzaxy.zzei(sb4.toString());
                throw th;
            }
        }
        if (zzd != null) {
            zzonVar2 = new zzon(Uri.parse(zzd.url), zzonVar2.zzbhy, zzonVar2.zzbhz, zzonVar2.position, zzonVar2.zzcp, zzonVar2.zzcn, zzonVar2.flags);
        }
        return this.zzejj.zza(zzonVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        if (!this.isOpen) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzeji;
        if (inputStream != null) {
            read = inputStream.read(bArr, i, i2);
        } else {
            read = this.zzejj.read(bArr, i, i2);
        }
        zzpa<zzom> zzpaVar = this.zzejk;
        if (zzpaVar != null) {
            zzpaVar.zzc(this, read);
        }
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final Uri getUri() {
        return this.uri;
    }
}
