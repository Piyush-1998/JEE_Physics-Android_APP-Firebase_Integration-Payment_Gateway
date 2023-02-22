package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbg implements zzelo<zzcbd> {
    private final zzelx<zzbto> zzfrs;

    private zzcbg(zzelx<zzbto> zzelxVar) {
        this.zzfrs = zzelxVar;
    }

    public static zzcbg zzx(zzelx<zzbto> zzelxVar) {
        return new zzcbg(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcbd(this.zzfrs.get());
    }
}
