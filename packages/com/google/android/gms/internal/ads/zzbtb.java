package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbtb extends zzbxe<zzbsy> implements zzbsy {
    public zzbtb(zzbtf zzbtfVar, Set<zzbys<zzbsy>> set, Executor executor) {
        super(set);
        zza(zzbtfVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzh(final zzuw zzuwVar) {
        zza(new zzbxg(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzbta
            private final zzuw zzfsu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsu = zzuwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbsy) obj).zzh(this.zzfsu);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zza(final zzcbc zzcbcVar) {
        zza(new zzbxg(zzcbcVar) { // from class: com.google.android.gms.internal.ads.zzbtd
            private final zzcbc zzfsv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsv = zzcbcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbsy) obj).zza(this.zzfsv);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzajk() {
        zza(zzbtc.zzfst);
    }
}
