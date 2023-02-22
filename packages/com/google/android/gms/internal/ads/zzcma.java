package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcma implements zzelo<Set<zzbys<zzbuj>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcmg> zzgek;
    private final zzclw zzgfx;

    private zzcma(zzclw zzclwVar, zzelx<zzcmg> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzgfx = zzclwVar;
        this.zzgek = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzcma zzd(zzclw zzclwVar, zzelx<zzcmg> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzcma(zzclwVar, zzelxVar, zzelxVar2);
    }

    public static Set<zzbys<zzbuj>> zzb(zzclw zzclwVar, zzcmg zzcmgVar, Executor executor) {
        return (Set) zzelu.zza(zzclw.zzc(zzcmgVar, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzb(this.zzgfx, this.zzgek.get(), this.zzerr.get());
    }
}
