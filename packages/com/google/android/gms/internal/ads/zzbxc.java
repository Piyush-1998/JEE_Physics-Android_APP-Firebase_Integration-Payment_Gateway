package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxc implements zzelo<zzbwx> {
    private final zzelx<Set<zzbys<zzbxf>>> zzfor;

    private zzbxc(zzelx<Set<zzbys<zzbxf>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbxc zzs(zzelx<Set<zzbys<zzbxf>>> zzelxVar) {
        return new zzbxc(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbwx(this.zzfor.get());
    }
}
