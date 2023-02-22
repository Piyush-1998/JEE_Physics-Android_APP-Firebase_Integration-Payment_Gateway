package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcnd implements zzelo<zzdvt<String>> {
    private final zzelx<Context> zzert;
    private final zzelx<zzeg> zzfly;
    private final zzelx<zzdvw> zzfru;

    private zzcnd(zzelx<zzeg> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzdvw> zzelxVar3) {
        this.zzfly = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfru = zzelxVar3;
    }

    public static zzcnd zzo(zzelx<zzeg> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzdvw> zzelxVar3) {
        return new zzcnd(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        final zzeg zzegVar = this.zzfly.get();
        final Context context = this.zzert.get();
        return (zzdvt) zzelu.zza(this.zzfru.get().zze(new Callable(zzegVar, context) { // from class: com.google.android.gms.internal.ads.zzcne
            private final Context zzcjx;
            private final zzeg zzghi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzghi = zzegVar;
                this.zzcjx = context;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeg zzegVar2 = this.zzghi;
                return zzegVar2.zzca().zzb(this.zzcjx);
            }
        }), "Cannot return null from a non-@Nullable @Provides method");
    }
}
