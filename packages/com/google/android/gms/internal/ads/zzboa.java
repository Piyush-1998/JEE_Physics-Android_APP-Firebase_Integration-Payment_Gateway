package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzboa implements zzelo<zzavy> {
    private final zzelx<Context> zzert;
    private final zzbnl zzfoq;
    private final zzelx<zzdln> zzfos;

    public zzboa(zzbnl zzbnlVar, zzelx<Context> zzelxVar, zzelx<zzdln> zzelxVar2) {
        this.zzfoq = zzbnlVar;
        this.zzert = zzelxVar;
        this.zzfos = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzavy) zzelu.zza(new zzavy(this.zzert.get(), this.zzfos.get().zzhbv), "Cannot return null from a non-@Nullable @Provides method");
    }
}
