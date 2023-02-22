package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcxh implements zzbuy {
    private final AtomicReference<zzya> zzgqi = new AtomicReference<>();

    public final void zzb(zzya zzyaVar) {
        this.zzgqi.set(zzyaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzb(final zzvl zzvlVar) {
        zzdip.zza(this.zzgqi, new zzdio(zzvlVar) { // from class: com.google.android.gms.internal.ads.zzcxk
            private final zzvl zzfto;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfto = zzvlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdio
            public final void zzq(Object obj) {
                ((zzya) obj).zza(this.zzfto);
            }
        });
    }
}
