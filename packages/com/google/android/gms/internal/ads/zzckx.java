package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckx implements zzelo<zzcky> {
    private final zzelx<zzcln> zzesn;
    private final zzelx<zzclg> zzeyr;

    private zzckx(zzelx<zzclg> zzelxVar, zzelx<zzcln> zzelxVar2) {
        this.zzeyr = zzelxVar;
        this.zzesn = zzelxVar2;
    }

    public static zzckx zzai(zzelx<zzclg> zzelxVar, zzelx<zzcln> zzelxVar2) {
        return new zzckx(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcky(this.zzeyr.get(), this.zzesn.get());
    }
}
