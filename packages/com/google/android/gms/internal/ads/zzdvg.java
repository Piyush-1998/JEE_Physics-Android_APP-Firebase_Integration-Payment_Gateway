package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdvg<V> extends zzdvh<V> implements zzdvt<V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdvh
    /* renamed from: zzaxk */
    public abstract zzdvt<? extends V> zzaxl();

    @Override // com.google.android.gms.internal.ads.zzdvt
    public void addListener(Runnable runnable, Executor executor) {
        zzaxl().addListener(runnable, executor);
    }
}
