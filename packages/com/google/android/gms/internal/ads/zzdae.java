package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdae implements zzelo<zzdac> {
    private final zzelx<zzcji> zzero;
    private final zzelx<zzdvw> zzgsh;
    private final zzelx<String> zzgsv;

    private zzdae(zzelx<String> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzcji> zzelxVar3) {
        this.zzgsv = zzelxVar;
        this.zzgsh = zzelxVar2;
        this.zzero = zzelxVar3;
    }

    public static zzdae zzq(zzelx<String> zzelxVar, zzelx<zzdvw> zzelxVar2, zzelx<zzcji> zzelxVar3) {
        return new zzdae(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdac(this.zzgsv.get(), this.zzgsh.get(), this.zzero.get());
    }
}
