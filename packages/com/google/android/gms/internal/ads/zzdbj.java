package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzdek;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbj<S extends zzdek<?>> implements zzden<S> {
    private final Clock zzbpw;
    private final AtomicReference<zzdbi<S>> zzgto = new AtomicReference<>();
    private final zzden<S> zzgtp;
    private final long zzgtq;

    public zzdbj(zzden<S> zzdenVar, long j, Clock clock) {
        this.zzbpw = clock;
        this.zzgtp = zzdenVar;
        this.zzgtq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<S> zzaqs() {
        zzdbi<S> zzdbiVar = this.zzgto.get();
        if (zzdbiVar == null || zzdbiVar.hasExpired()) {
            zzdbiVar = new zzdbi<>(this.zzgtp.zzaqs(), this.zzgtq, this.zzbpw);
            this.zzgto.set(zzdbiVar);
        }
        return zzdbiVar.zzgtm;
    }
}
