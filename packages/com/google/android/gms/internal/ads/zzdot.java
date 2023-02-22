package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdot {
    private final E zzhgq;
    private final List<zzdvt<?>> zzhgt;
    private final /* synthetic */ zzdor zzhgu;

    private zzdot(zzdor zzdorVar, E e, List<zzdvt<?>> list) {
        this.zzhgu = zzdorVar;
        this.zzhgq = e;
        this.zzhgt = list;
    }

    public final <O> zzdox<O> zzb(Callable<O> callable) {
        zzdvw zzdvwVar;
        zzdvm zzk = zzdvl.zzk(this.zzhgt);
        zzdvt zza = zzk.zza(zzdow.zzgtz, zzbbi.zzedz);
        zzdor zzdorVar = this.zzhgu;
        E e = this.zzhgq;
        List<zzdvt<?>> list = this.zzhgt;
        zzdvwVar = zzdorVar.zzgay;
        return new zzdox<>(zzdorVar, e, zza, list, zzk.zza(callable, zzdvwVar));
    }
}
