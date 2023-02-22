package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@Deprecated
/* loaded from: classes.dex */
public class zzbbx<T> {
    private final zzbbq<T> zzeeh = new zzbbq<>();
    private final AtomicInteger zzeei = new AtomicInteger(0);

    public zzbbx() {
        zzdvl.zza(this.zzeeh, new zzbbw(this), zzbbi.zzedz);
    }

    @Deprecated
    public final void zza(zzbbu<T> zzbbuVar, zzbbs zzbbsVar) {
        zzdvl.zza(this.zzeeh, new zzbbz(this, zzbbuVar, zzbbsVar), zzbbi.zzedz);
    }

    @Deprecated
    public final void zzm(T t) {
        this.zzeeh.set(t);
    }

    @Deprecated
    public final void reject() {
        this.zzeeh.setException(new Exception());
    }

    @Deprecated
    public final int getStatus() {
        return this.zzeei.get();
    }
}
