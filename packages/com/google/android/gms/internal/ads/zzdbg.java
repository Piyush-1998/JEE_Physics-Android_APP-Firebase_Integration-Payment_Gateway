package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbg implements zzelo<zzdbe> {
    private final zzelx<zzdij> zzfrt;

    private zzdbg(zzelx<zzdij> zzelxVar) {
        this.zzfrt = zzelxVar;
    }

    public static zzdbg zzam(zzelx<zzdij> zzelxVar) {
        return new zzdbg(zzelxVar);
    }

    public static zzdbe zzb(zzdij zzdijVar) {
        return new zzdbe(zzdijVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzfrt.get());
    }
}
