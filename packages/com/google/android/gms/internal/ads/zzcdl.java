package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdl implements zzelo<zzavy> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdln> zzfos;
    private final zzcdh zzfyt;

    private zzcdl(zzcdh zzcdhVar, zzelx<Context> zzelxVar, zzelx<zzdln> zzelxVar2) {
        this.zzfyt = zzcdhVar;
        this.zzert = zzelxVar;
        this.zzfos = zzelxVar2;
    }

    public static zzcdl zza(zzcdh zzcdhVar, zzelx<Context> zzelxVar, zzelx<zzdln> zzelxVar2) {
        return new zzcdl(zzcdhVar, zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzavy) zzelu.zza(new zzavy(this.zzert.get(), this.zzfos.get().zzhbv), "Cannot return null from a non-@Nullable @Provides method");
    }
}
