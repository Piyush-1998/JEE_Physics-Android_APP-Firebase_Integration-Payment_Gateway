package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcmf implements zzelo<zzcmg> {
    private final zzelx<zzbii> zzerp;
    private final zzelx<zzclu> zzgek;

    private zzcmf(zzelx<zzclu> zzelxVar, zzelx<zzbii> zzelxVar2) {
        this.zzgek = zzelxVar;
        this.zzerp = zzelxVar2;
    }

    public static zzcmf zzan(zzelx<zzclu> zzelxVar, zzelx<zzbii> zzelxVar2) {
        return new zzcmf(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcmg(this.zzgek.get(), this.zzerp.get());
    }
}
