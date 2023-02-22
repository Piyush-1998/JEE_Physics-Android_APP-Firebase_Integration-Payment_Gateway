package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbye implements zzelo<zzcud> {
    private final zzelx<zzcuf> zzezo;
    private final zzelx<Clock> zzfms;
    private final zzbxj zzfug;

    private zzbye(zzbxj zzbxjVar, zzelx<Clock> zzelxVar, zzelx<zzcuf> zzelxVar2) {
        this.zzfug = zzbxjVar;
        this.zzfms = zzelxVar;
        this.zzezo = zzelxVar2;
    }

    public static zzbye zza(zzbxj zzbxjVar, zzelx<Clock> zzelxVar, zzelx<zzcuf> zzelxVar2) {
        return new zzbye(zzbxjVar, zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzcud) zzelu.zza(this.zzfug.zza(this.zzfms.get(), this.zzezo.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
