package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzctw extends zzcty<zzbpj> {
    private final zzbxj zzetx;
    private final zzcbj zzetz;
    private final zzbii zzgmy;
    private final zzbsg.zza zzgmz;

    public zzctw(zzbii zzbiiVar, zzcbj zzcbjVar, zzbsg.zza zzaVar, zzbxj zzbxjVar) {
        this.zzgmy = zzbiiVar;
        this.zzetz = zzcbjVar;
        this.zzgmz = zzaVar;
        this.zzetx = zzbxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcty
    protected final zzdvt<zzbpj> zza(zzdln zzdlnVar, Bundle bundle) {
        return this.zzgmy.zzadu().zza(this.zzgmz.zza(zzdlnVar).zzf(bundle).zzajj()).zza(this.zzetx).zza(this.zzetz).zzaek().zzafc().zzaiv();
    }
}
