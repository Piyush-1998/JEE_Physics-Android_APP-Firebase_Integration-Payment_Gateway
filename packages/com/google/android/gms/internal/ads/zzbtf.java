package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbtf extends zzbxe<zzbti> implements zzbsy {
    public zzbtf(Set<zzbys<zzbti>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zza(zzcbc zzcbcVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzh(final zzuw zzuwVar) {
        zza(new zzbxg(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzbte
            private final zzuw zzfsu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsu = zzuwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbti) obj).zzf(this.zzfsu);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzajk() {
        zza(zzbth.zzfst);
    }
}
