package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcpc implements zzduv {
    static final zzduv zzbok = new zzcpc();

    private zzcpc() {
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final zzdvt zzf(Object obj) {
        return zzdvl.immediateFailedFuture(((ExecutionException) obj).getCause());
    }
}
