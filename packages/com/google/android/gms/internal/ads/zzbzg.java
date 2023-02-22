package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbzg implements zzelo<zzbzc> {
    private final zzelx<Set<zzbys<zzahp>>> zzfor;

    public zzbzg(zzelx<Set<zzbys<zzahp>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbzc(this.zzfor.get());
    }
}
