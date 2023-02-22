package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcnv implements zzduv {
    static final zzduv zzbok = new zzcnv();

    private zzcnv() {
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final zzdvt zzf(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcs, "Timed out waiting for ad response."));
    }
}
