package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbli implements zzelo<zzblf> {
    private final zzelx<zzaya> zzeyo;

    private zzbli(zzelx<zzaya> zzelxVar) {
        this.zzeyo = zzelxVar;
    }

    public static zzbli zza(zzelx<zzaya> zzelxVar) {
        return new zzbli(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzblf(this.zzeyo.get());
    }
}
