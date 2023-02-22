package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcly implements zzelo<Set<zzbys<zzbsz>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcmg> zzgek;
    private final zzclw zzgfx;

    private zzcly(zzclw zzclwVar, zzelx<zzcmg> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzgfx = zzclwVar;
        this.zzgek = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzcly zzc(zzclw zzclwVar, zzelx<zzcmg> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzcly(zzclwVar, zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Set) zzelu.zza(zzclw.zzd(this.zzgek.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
