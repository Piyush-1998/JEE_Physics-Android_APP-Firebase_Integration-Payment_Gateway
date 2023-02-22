package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbuu implements zzelo<zzbur> {
    private final zzelx<Set<zzbys<com.google.android.gms.ads.internal.overlay.zzo>>> zzfor;

    private zzbuu(zzelx<Set<zzbys<com.google.android.gms.ads.internal.overlay.zzo>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbuu zzo(zzelx<Set<zzbys<com.google.android.gms.ads.internal.overlay.zzo>>> zzelxVar) {
        return new zzbuu(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbur(this.zzfor.get());
    }
}
