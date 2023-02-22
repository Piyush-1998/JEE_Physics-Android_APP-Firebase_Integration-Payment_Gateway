package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzmu implements zzoy {
    private final Uri uri;
    private final zzom zzaoo;
    private final zzmt zzbdm;
    private final zzpb zzbdn;
    private final /* synthetic */ zzmn zzbeg;
    private volatile boolean zzbem;
    private long zzbeo;
    private final zzkb zzbel = new zzkb();
    private boolean zzben = true;
    private long zzcp = -1;

    public zzmu(zzmn zzmnVar, Uri uri, zzom zzomVar, zzmt zzmtVar, zzpb zzpbVar) {
        this.zzbeg = zzmnVar;
        this.uri = (Uri) zzoz.checkNotNull(uri);
        this.zzaoo = (zzom) zzoz.checkNotNull(zzomVar);
        this.zzbdm = (zzmt) zzoz.checkNotNull(zzmtVar);
        this.zzbdn = zzpbVar;
    }

    public final void zze(long j, long j2) {
        this.zzbel.position = j;
        this.zzbeo = j2;
        this.zzben = true;
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void cancelLoad() {
        this.zzbem = true;
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final boolean zzhv() {
        return this.zzbem;
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzhw() throws IOException, InterruptedException {
        int i = 0;
        while (i == 0 && !this.zzbem) {
            zzjw zzjwVar = null;
            try {
                long j = this.zzbel.position;
                long zza = this.zzaoo.zza(new zzon(this.uri, j, -1L, zzmn.zzf(this.zzbeg)));
                this.zzcp = zza;
                if (zza != -1) {
                    this.zzcp = zza + j;
                }
                zzjw zzjwVar2 = new zzjw(this.zzaoo, j, this.zzcp);
                try {
                    zzjv zza2 = this.zzbdm.zza(zzjwVar2, this.zzaoo.getUri());
                    if (this.zzben) {
                        zza2.zzc(j, this.zzbeo);
                        this.zzben = false;
                    }
                    while (i == 0 && !this.zzbem) {
                        this.zzbdn.block();
                        i = zza2.zza(zzjwVar2, this.zzbel);
                        if (zzjwVar2.getPosition() > zzmn.zzg(this.zzbeg) + j) {
                            j = zzjwVar2.getPosition();
                            this.zzbdn.zzis();
                            zzmn.zzi(this.zzbeg).post(zzmn.zzh(this.zzbeg));
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.zzbel.position = zzjwVar2.getPosition();
                    }
                    zzpq.zza(this.zzaoo);
                } catch (Throwable th) {
                    th = th;
                    zzjwVar = zzjwVar2;
                    if (i != 1 && zzjwVar != null) {
                        this.zzbel.position = zzjwVar.getPosition();
                    }
                    zzpq.zza(this.zzaoo);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
