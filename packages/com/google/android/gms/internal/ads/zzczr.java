package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczr implements zzden<Object> {
    private final Executor executor;
    private final zzdvt<String> zzgsj;

    public zzczr(zzdvt<String> zzdvtVar, Executor executor) {
        this.zzgsj = zzdvtVar;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<Object> zzaqs() {
        return zzdvl.zzb(this.zzgsj, zzczq.zzbok, this.executor);
    }
}
