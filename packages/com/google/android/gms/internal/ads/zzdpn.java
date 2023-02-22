package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdpn implements zzelo<zzdpi> {
    private final zzelx<Set<zzbys<zzdpl>>> zzfor;

    private zzdpn(zzelx<Set<zzbys<zzdpl>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzdpn zzar(zzelx<Set<zzbys<zzdpl>>> zzelxVar) {
        return new zzdpn(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdpi(this.zzfor.get());
    }
}
