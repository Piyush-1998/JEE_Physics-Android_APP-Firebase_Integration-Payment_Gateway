package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbbw implements zzdvi<T> {
    private final /* synthetic */ zzbbx zzeeg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbw(zzbbx zzbbxVar) {
        this.zzeeg = zzbbxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void onSuccess(T t) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zzeeg.zzeei;
        atomicInteger.set(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zzeeg.zzeei;
        atomicInteger.set(-1);
    }
}
