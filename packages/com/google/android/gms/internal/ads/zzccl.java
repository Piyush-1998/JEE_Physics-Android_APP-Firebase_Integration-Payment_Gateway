package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccl implements zzelo<zzccm> {
    private final zzelx<zzccv> zzfwo;

    private zzccl(zzelx<zzccv> zzelxVar) {
        this.zzfwo = zzelxVar;
    }

    public static zzccl zzy(zzelx<zzccv> zzelxVar) {
        return new zzccl(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzccm(this.zzfwo.get());
    }
}
