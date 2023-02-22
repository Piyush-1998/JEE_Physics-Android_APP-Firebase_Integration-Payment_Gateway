package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbme implements zzelo<zzblr> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzqo> zzfmz;
    private final zzelx<zzalz> zzfna;

    private zzbme(zzelx<zzqo> zzelxVar, zzelx<zzalz> zzelxVar2, zzelx<Executor> zzelxVar3) {
        this.zzfmz = zzelxVar;
        this.zzfna = zzelxVar2;
        this.zzerr = zzelxVar3;
    }

    public static zzbme zzb(zzelx<zzqo> zzelxVar, zzelx<zzalz> zzelxVar2, zzelx<Executor> zzelxVar3) {
        return new zzbme(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzblr) zzelu.zza(new zzblr(this.zzfmz.get().getUniqueId(), this.zzfna.get(), this.zzerr.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
