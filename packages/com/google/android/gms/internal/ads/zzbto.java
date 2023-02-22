package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbto extends zzbxe<zzbtp> {
    public zzbto(Set<zzbys<zzbtp>> set) {
        super(set);
    }

    public final void zzbz(final Context context) {
        zza(new zzbxg(context) { // from class: com.google.android.gms.internal.ads.zzbtr
            private final Context zzcxz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcxz = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbtp) obj).zzbz(this.zzcxz);
            }
        });
    }

    public final void zzca(final Context context) {
        zza(new zzbxg(context) { // from class: com.google.android.gms.internal.ads.zzbtq
            private final Context zzcxz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcxz = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbtp) obj).zzca(this.zzcxz);
            }
        });
    }

    public final void zzcb(final Context context) {
        zza(new zzbxg(context) { // from class: com.google.android.gms.internal.ads.zzbtt
            private final Context zzcxz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcxz = context;
            }

            @Override // com.google.android.gms.internal.ads.zzbxg
            public final void zzp(Object obj) {
                ((zzbtp) obj).zzcb(this.zzcxz);
            }
        });
    }

    public final void zza(zzbzi zzbziVar, Executor executor) {
        zza(zzbys.zzb(new zzbts(this, zzbziVar), executor));
    }
}
