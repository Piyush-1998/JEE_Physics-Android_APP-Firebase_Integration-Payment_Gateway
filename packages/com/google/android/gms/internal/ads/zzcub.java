package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbsg;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcub extends zzcty<zzchu> {
    private final zzbxj zzetx;
    private final zzbii zzgmy;
    private final zzbsg.zza zzgmz;

    public zzcub(zzbii zzbiiVar, zzbsg.zza zzaVar, zzbxj zzbxjVar) {
        this.zzgmy = zzbiiVar;
        this.zzgmz = zzaVar;
        this.zzetx = zzbxjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcty
    protected final zzdvt<zzchu> zza(zzdln zzdlnVar, Bundle bundle) {
        return this.zzgmy.zzadv().zze(this.zzgmz.zza(zzdlnVar).zzf(bundle).zzajj()).zze(this.zzetx).zzage().zzafc().zzaiv();
    }
}
