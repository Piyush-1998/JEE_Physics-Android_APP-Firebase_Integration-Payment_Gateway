package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdor<E> {
    private static final zzdvt<?> zzhgo = zzdvl.zzaf(null);
    private final ScheduledExecutorService zzfnh;
    private final zzdvw zzgay;
    private final zzdpd<E> zzhgp;

    public zzdor(zzdvw zzdvwVar, ScheduledExecutorService scheduledExecutorService, zzdpd<E> zzdpdVar) {
        this.zzgay = zzdvwVar;
        this.zzfnh = scheduledExecutorService;
        this.zzhgp = zzdpdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String zzv(E e);

    public final zzdov zzu(E e) {
        return new zzdov(this, e);
    }

    public final <I> zzdox<I> zza(E e, zzdvt<I> zzdvtVar) {
        return new zzdox<>(this, e, zzdvtVar, Collections.singletonList(zzdvtVar), zzdvtVar);
    }

    public final zzdot zza(E e, zzdvt<?>... zzdvtVarArr) {
        return new zzdot(this, e, Arrays.asList(zzdvtVarArr));
    }
}
