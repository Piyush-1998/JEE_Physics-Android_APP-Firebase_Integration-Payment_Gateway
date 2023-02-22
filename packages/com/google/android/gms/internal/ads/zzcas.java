package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcas implements zzelo<zzcap> {
    private final zzelx<zzbur> zzewj;
    private final zzelx<zzbyo> zzfja;

    private zzcas(zzelx<zzbur> zzelxVar, zzelx<zzbyo> zzelxVar2) {
        this.zzewj = zzelxVar;
        this.zzfja = zzelxVar2;
    }

    public static zzcas zzw(zzelx<zzbur> zzelxVar, zzelx<zzbyo> zzelxVar2) {
        return new zzcas(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcap(this.zzewj.get(), this.zzfja.get());
    }
}
