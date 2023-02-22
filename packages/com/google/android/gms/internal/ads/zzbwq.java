package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbwq implements zzelo<zzbwp> {
    private final zzelx<Set<zzbys<zzbwt>>> zzfor;

    private zzbwq(zzelx<Set<zzbys<zzbwt>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbwq zzq(zzelx<Set<zzbys<zzbwt>>> zzelxVar) {
        return new zzbwq(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbwp(this.zzfor.get());
    }
}
