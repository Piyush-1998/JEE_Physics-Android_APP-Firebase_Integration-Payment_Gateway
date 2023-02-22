package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzckc implements zzelo<Set<zzbys<zzdpl>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcks> zzfmx;

    private zzckc(zzelx<Executor> zzelxVar, zzelx<zzcks> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzfmx = zzelxVar2;
    }

    public static zzckc zzaf(zzelx<Executor> zzelxVar, zzelx<zzcks> zzelxVar2) {
        return new zzckc(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        Set emptySet;
        Executor executor = this.zzerr.get();
        zzcks zzcksVar = this.zzfmx.get();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctk)).booleanValue()) {
            emptySet = Collections.singleton(new zzbys(zzcksVar, executor));
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzelu.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }
}
