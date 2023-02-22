package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgr implements zzelo<zzcgs> {
    private final zzelx<String> zzfsn;
    private final zzelx<zzccv> zzfwo;
    private final zzelx<zzcco> zzgcf;

    private zzcgr(zzelx<String> zzelxVar, zzelx<zzcco> zzelxVar2, zzelx<zzccv> zzelxVar3) {
        this.zzfsn = zzelxVar;
        this.zzgcf = zzelxVar2;
        this.zzfwo = zzelxVar3;
    }

    public static zzcgr zzk(zzelx<String> zzelxVar, zzelx<zzcco> zzelxVar2, zzelx<zzccv> zzelxVar3) {
        return new zzcgr(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcgs(this.zzfsn.get(), this.zzgcf.get(), this.zzfwo.get());
    }
}
