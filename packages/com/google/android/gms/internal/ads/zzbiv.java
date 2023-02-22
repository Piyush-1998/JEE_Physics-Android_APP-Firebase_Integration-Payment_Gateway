package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbiv implements zzelo<zzdma<zzchc>> {
    private final zzelx<zzchm> zzerq;
    private final zzelx<zzdvw> zzerr;

    public zzbiv(zzelx<zzchm> zzelxVar, zzelx<zzdvw> zzelxVar2) {
        this.zzerq = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzdma) zzelu.zza(new zzdma(this.zzerq.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
