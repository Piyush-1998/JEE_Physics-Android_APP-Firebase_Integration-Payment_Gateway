package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcer implements zzelo<zzces> {
    private final zzelx<zzccz> zzeul;
    private final zzelx<zzccv> zzfwo;

    public zzcer(zzelx<zzccv> zzelxVar, zzelx<zzccz> zzelxVar2) {
        this.zzfwo = zzelxVar;
        this.zzeul = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzces(this.zzfwo.get(), this.zzeul.get());
    }
}
