package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbux extends zzbxe<zzbuy> implements zzbtm, zzbuo {
    private final zzdkx zzflh;
    private AtomicBoolean zzftb;

    public zzbux(Set<zzbys<zzbuy>> set, zzdkx zzdkxVar) {
        super(set);
        this.zzftb = new AtomicBoolean();
        this.zzflh = zzdkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void onAdImpression() {
        if (this.zzflh.zzhag == 2 || this.zzflh.zzhag == 5 || this.zzflh.zzhag == 4) {
            zzajm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzajl() {
        if (this.zzflh.zzhag == 1) {
            zzajm();
        }
    }

    private final void zzajm() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxg)).booleanValue() && this.zzftb.compareAndSet(false, true) && this.zzflh.zzhbc != null && this.zzflh.zzhbc.type == 3) {
            zza(new zzbxg(this) { // from class: com.google.android.gms.internal.ads.zzbuw
                private final zzbux zzfta;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfta = this;
                }

                @Override // com.google.android.gms.internal.ads.zzbxg
                public final void zzp(Object obj) {
                    this.zzfta.zza((zzbuy) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbuy zzbuyVar) throws Exception {
        zzbuyVar.zzb(this.zzflh.zzhbc);
    }
}
