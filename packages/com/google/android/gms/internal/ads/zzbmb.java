package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbmb implements zzelo<zzbma> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzalz> zzfmp;
    private final zzelx<zzbly> zzfmq;
    private final zzelx<zzblr> zzfmr;
    private final zzelx<Clock> zzfms;

    private zzbmb(zzelx<zzalz> zzelxVar, zzelx<zzbly> zzelxVar2, zzelx<Executor> zzelxVar3, zzelx<zzblr> zzelxVar4, zzelx<Clock> zzelxVar5) {
        this.zzfmp = zzelxVar;
        this.zzfmq = zzelxVar2;
        this.zzerr = zzelxVar3;
        this.zzfmr = zzelxVar4;
        this.zzfms = zzelxVar5;
    }

    public static zzbmb zza(zzelx<zzalz> zzelxVar, zzelx<zzbly> zzelxVar2, zzelx<Executor> zzelxVar3, zzelx<zzblr> zzelxVar4, zzelx<Clock> zzelxVar5) {
        return new zzbmb(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbma(this.zzfmp.get(), this.zzfmq.get(), this.zzerr.get(), this.zzfmr.get(), this.zzfms.get());
    }
}
