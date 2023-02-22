package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzctz extends zzcty<zzbzr> {
    private final zzbxj zzetx;
    private final zzcwh zzfga;
    private final zzbii zzgmy;
    private final zzbsg.zza zzgmz;

    public zzctz(zzbii zzbiiVar, zzbsg.zza zzaVar, zzcwh zzcwhVar, zzbxj zzbxjVar) {
        this.zzgmy = zzbiiVar;
        this.zzgmz = zzaVar;
        this.zzfga = zzcwhVar;
        this.zzetx = zzbxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcty
    protected final zzdvt<zzbzr> zza(zzdln zzdlnVar, Bundle bundle) {
        return this.zzgmy.zzadt().zzd(this.zzgmz.zza(zzdlnVar).zzf(bundle).zzajj()).zzd(this.zzetx).zzb(this.zzfga).zzafz().zzafc().zzaiv();
    }
}
