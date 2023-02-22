package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcki implements zzelo<zzckb> {
    private final zzelx<zzdjf> zzeyl;
    private final zzelx<zzto> zzgek;

    private zzcki(zzelx<zzto> zzelxVar, zzelx<zzdjf> zzelxVar2) {
        this.zzgek = zzelxVar;
        this.zzeyl = zzelxVar2;
    }

    public static zzcki zzag(zzelx<zzto> zzelxVar, zzelx<zzdjf> zzelxVar2) {
        return new zzcki(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzckb(this.zzgek.get(), this.zzeyl.get());
    }
}
