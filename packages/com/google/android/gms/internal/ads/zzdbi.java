package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdek;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdbi<S extends zzdek<?>> {
    private final Clock zzbpw;
    public final zzdvt<S> zzgtm;
    private final long zzgtn;

    public zzdbi(zzdvt<S> zzdvtVar, long j, Clock clock) {
        this.zzgtm = zzdvtVar;
        this.zzbpw = clock;
        this.zzgtn = clock.elapsedRealtime() + j;
    }

    public final boolean hasExpired() {
        return this.zzgtn < this.zzbpw.elapsedRealtime();
    }
}
