package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdox<O> {
    private final E zzhgq;
    private final String zzhgr;
    private final List<zzdvt<?>> zzhgt;
    final /* synthetic */ zzdor zzhgu;
    private final zzdvt<?> zzhgv;
    private final zzdvt<O> zzhgw;

    private zzdox(zzdor zzdorVar, E e, String str, zzdvt<?> zzdvtVar, List<zzdvt<?>> list, zzdvt<O> zzdvtVar2) {
        this.zzhgu = zzdorVar;
        this.zzhgq = e;
        this.zzhgr = str;
        this.zzhgv = zzdvtVar;
        this.zzhgt = list;
        this.zzhgw = zzdvtVar2;
    }

    public final zzdox<O> zzgx(String str) {
        return new zzdox<>(this.zzhgu, this.zzhgq, str, this.zzhgv, this.zzhgt, this.zzhgw);
    }

    public final <O2> zzdox<O2> zzb(final zzdoq<O, O2> zzdoqVar) {
        return zza(new zzduv(zzdoqVar) { // from class: com.google.android.gms.internal.ads.zzdpa
            private final zzdoq zzhgy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhgy = zzdoqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return zzdvl.zzaf(this.zzhgy.apply(obj));
            }
        });
    }

    public final <O2> zzdox<O2> zza(zzduv<O, O2> zzduvVar) {
        zzdvw zzdvwVar;
        zzdvwVar = this.zzhgu.zzgay;
        return zza(zzduvVar, zzdvwVar);
    }

    private final <O2> zzdox<O2> zza(zzduv<O, O2> zzduvVar, Executor executor) {
        return new zzdox<>(this.zzhgu, this.zzhgq, this.zzhgr, this.zzhgv, this.zzhgt, zzdvl.zzb(this.zzhgw, zzduvVar, executor));
    }

    public final <O2> zzdox<O2> zze(final zzdvt<O2> zzdvtVar) {
        return zza(new zzduv(zzdvtVar) { // from class: com.google.android.gms.internal.ads.zzdoz
            private final zzdvt zzgbt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbt = zzdvtVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgbt;
            }
        }, zzbbi.zzedz);
    }

    public final <T extends Throwable> zzdox<O> zza(Class<T> cls, final zzdoq<T, O> zzdoqVar) {
        return zza(cls, new zzduv(zzdoqVar) { // from class: com.google.android.gms.internal.ads.zzdpc
            private final zzdoq zzhgy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhgy = zzdoqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return zzdvl.zzaf(this.zzhgy.apply((Throwable) obj));
            }
        });
    }

    public final <T extends Throwable> zzdox<O> zza(Class<T> cls, zzduv<T, O> zzduvVar) {
        zzdvw zzdvwVar;
        zzdor zzdorVar = this.zzhgu;
        E e = this.zzhgq;
        String str = this.zzhgr;
        zzdvt<?> zzdvtVar = this.zzhgv;
        List<zzdvt<?>> list = this.zzhgt;
        zzdvt<O> zzdvtVar2 = this.zzhgw;
        zzdvwVar = zzdorVar.zzgay;
        return new zzdox<>(zzdorVar, e, str, zzdvtVar, list, zzdvl.zzb(zzdvtVar2, cls, zzduvVar, zzdvwVar));
    }

    public final zzdox<O> zza(long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService;
        zzdor zzdorVar = this.zzhgu;
        E e = this.zzhgq;
        String str = this.zzhgr;
        zzdvt<?> zzdvtVar = this.zzhgv;
        List<zzdvt<?>> list = this.zzhgt;
        zzdvt<O> zzdvtVar2 = this.zzhgw;
        scheduledExecutorService = zzdorVar.zzfnh;
        return new zzdox<>(zzdorVar, e, str, zzdvtVar, list, zzdvl.zza(zzdvtVar2, j, timeUnit, scheduledExecutorService));
    }

    public final zzdos<E, O> zzauz() {
        E e = this.zzhgq;
        String str = this.zzhgr;
        if (str == null) {
            str = this.zzhgu.zzv(e);
        }
        final zzdos<E, O> zzdosVar = new zzdos<>(e, str, this.zzhgw);
        this.zzhgu.zzhgp.zza(zzdosVar);
        this.zzhgv.addListener(new Runnable(this, zzdosVar) { // from class: com.google.android.gms.internal.ads.zzdpb
            private final zzdox zzhgz;
            private final zzdos zzhha;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhgz = this;
                this.zzhha = zzdosVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdox zzdoxVar = this.zzhgz;
                zzdoxVar.zzhgu.zzhgp.zzb(this.zzhha);
            }
        }, zzbbi.zzedz);
        zzdvl.zza(zzdosVar, new zzdpe(this, zzdosVar), zzbbi.zzedz);
        return zzdosVar;
    }

    public final zzdox<O> zzw(E e) {
        return this.zzhgu.zza((zzdor) e, zzauz());
    }
}
