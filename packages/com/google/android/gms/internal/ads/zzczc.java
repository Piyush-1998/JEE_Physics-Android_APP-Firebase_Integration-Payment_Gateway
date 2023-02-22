package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczc implements zzelo<zzdvt<zzczg>> {
    private final zzelx<zzdpf> zzfow;
    private final zzelx<zzczf> zzgry;
    private final zzelx<zzbrz> zzgrz;

    public zzczc(zzelx<zzdpf> zzelxVar, zzelx<zzczf> zzelxVar2, zzelx<zzbrz> zzelxVar3) {
        this.zzfow = zzelxVar;
        this.zzgry = zzelxVar2;
        this.zzgrz = zzelxVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzdvt) zzelu.zza(this.zzfow.get().zza((zzdpf) zzdpg.GENERATE_SIGNALS, (zzdvt) this.zzgrz.get().zzajd()).zza(this.zzgry.get()).zza(((Integer) zzwe.zzpu().zzd(zzaat.zzcuo)).intValue(), TimeUnit.SECONDS).zzauz(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
