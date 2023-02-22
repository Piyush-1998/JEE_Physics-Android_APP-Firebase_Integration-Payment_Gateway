package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgp implements zzelo<zzcgo> {
    private final zzelx<zzccv> zzfwo;
    private final zzelx<zzcco> zzgcf;

    private zzcgp(zzelx<zzcco> zzelxVar, zzelx<zzccv> zzelxVar2) {
        this.zzgcf = zzelxVar;
        this.zzfwo = zzelxVar2;
    }

    public static zzcgp zzy(zzelx<zzcco> zzelxVar, zzelx<zzccv> zzelxVar2) {
        return new zzcgp(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcgo(this.zzgcf.get(), this.zzfwo.get());
    }
}
