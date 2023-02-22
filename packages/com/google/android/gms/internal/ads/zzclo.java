package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclo implements zzelo<zzclm> {
    private final zzelx<Clock> zzfms;
    private final zzelx<zzclg> zzgfn;
    private final zzelx<Set<zzcll>> zzgfo;

    private zzclo(zzelx<zzclg> zzelxVar, zzelx<Set<zzcll>> zzelxVar2, zzelx<Clock> zzelxVar3) {
        this.zzgfn = zzelxVar;
        this.zzgfo = zzelxVar2;
        this.zzfms = zzelxVar3;
    }

    public static zzclo zzn(zzelx<zzclg> zzelxVar, zzelx<Set<zzcll>> zzelxVar2, zzelx<Clock> zzelxVar3) {
        return new zzclo(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzclm(this.zzgfn.get(), this.zzgfo.get(), this.zzfms.get());
    }
}
