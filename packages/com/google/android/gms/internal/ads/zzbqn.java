package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqn implements zzelo<zzaxj> {
    private final zzelx<zzaxv> zzeyd;
    private final zzelx<Clock> zzfms;
    private final zzelx<zzdln> zzfos;

    private zzbqn(zzelx<Clock> zzelxVar, zzelx<zzaxv> zzelxVar2, zzelx<zzdln> zzelxVar3) {
        this.zzfms = zzelxVar;
        this.zzeyd = zzelxVar2;
        this.zzfos = zzelxVar3;
    }

    public static zzbqn zzg(zzelx<Clock> zzelxVar, zzelx<zzaxv> zzelxVar2, zzelx<zzdln> zzelxVar3) {
        return new zzbqn(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzaxj) zzelu.zza(this.zzeyd.get().zza(this.zzfms.get(), this.zzfos.get().zzhbv), "Cannot return null from a non-@Nullable @Provides method");
    }
}
