package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchs implements zzahp {
    private final zzbtu zzfqj;
    private final zzaue zzgcz;
    private final String zzgda;
    private final String zzgdb;

    public zzchs(zzbtu zzbtuVar, zzdkx zzdkxVar) {
        this.zzfqj = zzbtuVar;
        this.zzgcz = zzdkxVar.zzdsh;
        this.zzgda = zzdkxVar.zzdjz;
        this.zzgdb = zzdkxVar.zzdka;
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzsv() {
        this.zzfqj.onRewardedVideoStarted();
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    @ParametersAreNonnullByDefault
    public final void zza(zzaue zzaueVar) {
        String str;
        int i;
        zzaue zzaueVar2 = this.zzgcz;
        if (zzaueVar2 != null) {
            zzaueVar = zzaueVar2;
        }
        if (zzaueVar != null) {
            str = zzaueVar.type;
            i = zzaueVar.zzdva;
        } else {
            str = "";
            i = 1;
        }
        this.zzfqj.zzb(new zzath(str, i), this.zzgda, this.zzgdb);
    }

    @Override // com.google.android.gms.internal.ads.zzahp
    public final void zzsw() {
        this.zzfqj.onRewardedVideoCompleted();
    }
}
