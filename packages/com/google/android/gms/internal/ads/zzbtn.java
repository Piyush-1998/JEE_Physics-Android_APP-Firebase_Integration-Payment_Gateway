package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbtn implements zzelo<zzbtl> {
    private final zzelx<Set<zzbys<zzbtm>>> zzfor;

    private zzbtn(zzelx<Set<zzbys<zzbtm>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbtn zzi(zzelx<Set<zzbys<zzbtm>>> zzelxVar) {
        return new zzbtn(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbtl(this.zzfor.get());
    }
}
