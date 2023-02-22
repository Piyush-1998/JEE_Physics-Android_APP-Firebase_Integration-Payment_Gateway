package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvo implements zzelo<zzcvl> {
    private final zzelx<zzcws> zzgog;

    private zzcvo(zzelx<zzcws> zzelxVar) {
        this.zzgog = zzelxVar;
    }

    public static zzcvo zzai(zzelx<zzcws> zzelxVar) {
        return new zzcvo(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcvl(this.zzgog.get());
    }
}
