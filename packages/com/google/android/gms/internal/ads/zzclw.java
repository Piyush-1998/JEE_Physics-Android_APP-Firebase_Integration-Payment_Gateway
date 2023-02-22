package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclw {
    public static Set<zzbys<zzbtp>> zza(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    public static Set<zzbys<AppEventListener>> zzb(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    public static Set<zzbys<zzbuj>> zzc(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    public static Set<zzbys<zzbsz>> zzd(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    public static Set<zzbys<zzbsu>> zze(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    public static Set<zzbys<zzbtm>> zzf(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    public static Set<zzbys<zzut>> zzg(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    public static Set<zzbys<zzdpl>> zzh(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    public static Set<zzbys<zzbvj>> zzi(zzcmg zzcmgVar, Executor executor) {
        return zzc(zzcmgVar, executor);
    }

    private static <T> Set<zzbys<T>> zzc(T t, Executor executor) {
        if (zzacn.zzdaw.get().booleanValue()) {
            return Collections.singleton(new zzbys(t, executor));
        }
        return Collections.emptySet();
    }
}
