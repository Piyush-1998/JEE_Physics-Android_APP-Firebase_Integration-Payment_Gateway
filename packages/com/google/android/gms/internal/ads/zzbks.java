package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbks implements zzelo<zzbbh> {
    private final zzelx<String> zzfkv;

    public zzbks(zzelx<String> zzelxVar) {
        this.zzfkv = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbbh) zzelu.zza(new zzbbh(this.zzfkv.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
