package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbve extends zzbxe<zzbvj> implements zzbvj {
    public zzbve(Set<zzbys<zzbvj>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzd(final zzasp zzaspVar) {
        zza(new zzbxg(zzaspVar) { // from class: com.google.android.gms.internal.ads.zzbvh
            private final zzasp zzftf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftf = zzaspVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbvj) obj).zzd(this.zzftf);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzb(final zzdlj zzdljVar) {
        zza(new zzbxg(zzdljVar) { // from class: com.google.android.gms.internal.ads.zzbvg
            private final zzdlj zzfte;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfte = zzdljVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbvj) obj).zzb(this.zzfte);
            }
        });
    }
}
