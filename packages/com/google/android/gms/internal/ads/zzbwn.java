package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbwn implements zzelo<zzbwl> {
    private final zzelx<Set<zzbys<zzbwm>>> zzfor;

    private zzbwn(zzelx<Set<zzbys<zzbwm>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbwn zzp(zzelx<Set<zzbys<zzbwm>>> zzelxVar) {
        return new zzbwn(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbwl(this.zzfor.get());
    }
}
