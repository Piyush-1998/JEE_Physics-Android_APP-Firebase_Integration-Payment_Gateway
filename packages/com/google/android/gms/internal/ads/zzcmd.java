package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcmd implements zzelo<Set<zzbys<zzdpl>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcmg> zzgek;
    private final zzclw zzgfx;

    private zzcmd(zzclw zzclwVar, zzelx<zzcmg> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzgfx = zzclwVar;
        this.zzgek = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzcmd zzg(zzclw zzclwVar, zzelx<zzcmg> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzcmd(zzclwVar, zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(zzclw.zzh(this.zzgek.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
