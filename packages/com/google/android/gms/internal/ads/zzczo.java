package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczo implements zzelo<zzczp> {
    private final zzelx<zzdln> zzfos;

    private zzczo(zzelx<zzdln> zzelxVar) {
        this.zzfos = zzelxVar;
    }

    public static zzczo zzak(zzelx<zzdln> zzelxVar) {
        return new zzczo(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzczp(this.zzfos.get());
    }
}
