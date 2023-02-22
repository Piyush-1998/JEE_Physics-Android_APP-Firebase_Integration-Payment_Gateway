package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcqn implements zzelo<zzcqo> {
    private final zzelx<zzcqt> zzgjx;

    private zzcqn(zzelx<zzcqt> zzelxVar) {
        this.zzgjx = zzelxVar;
    }

    public static zzcqn zzag(zzelx<zzcqt> zzelxVar) {
        return new zzcqn(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcqo(this.zzgjx.get());
    }
}
