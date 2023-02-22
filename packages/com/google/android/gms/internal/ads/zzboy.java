package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzboy implements zzbuj, zzqu {
    private final zzdkx zzflh;
    private final zzbtl zzfpk;
    private final zzbun zzfpl;
    private final AtomicBoolean zzfpm = new AtomicBoolean();
    private final AtomicBoolean zzfpn = new AtomicBoolean();

    public zzboy(zzdkx zzdkxVar, zzbtl zzbtlVar, zzbun zzbunVar) {
        this.zzflh = zzdkxVar;
        this.zzfpk = zzbtlVar;
        this.zzfpl = zzbunVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final synchronized void onAdLoaded() {
        if (this.zzflh.zzhah != 1) {
            zzaij();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqu
    public final void zza(zzqr zzqrVar) {
        if (this.zzflh.zzhah == 1 && zzqrVar.zzbrk) {
            zzaij();
        }
        if (zzqrVar.zzbrk && this.zzfpn.compareAndSet(false, true)) {
            this.zzfpl.zzajl();
        }
    }

    private final void zzaij() {
        if (this.zzfpm.compareAndSet(false, true)) {
            this.zzfpk.onAdImpression();
        }
    }
}
