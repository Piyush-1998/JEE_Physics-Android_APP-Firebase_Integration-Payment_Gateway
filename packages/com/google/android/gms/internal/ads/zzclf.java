package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclf implements zzelo<zzclg> {
    private final zzelx<zzcln> zzesn;

    private zzclf(zzelx<zzcln> zzelxVar) {
        this.zzesn = zzelxVar;
    }

    public static zzclf zzab(zzelx<zzcln> zzelxVar) {
        return new zzclf(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzclg(this.zzesn.get());
    }
}
