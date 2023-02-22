package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcrd<DelegateT, AdapterT> implements zzcre<AdapterT> {
    private final zzcre<DelegateT> zzgla;
    private final zzdsl<DelegateT, AdapterT> zzglb;

    public zzcrd(zzcre<DelegateT> zzcreVar, zzdsl<DelegateT, AdapterT> zzdslVar) {
        this.zzgla = zzcreVar;
        this.zzglb = zzdslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return this.zzgla.zza(zzdljVar, zzdkxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<AdapterT> zzb(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return zzdvl.zzb(this.zzgla.zzb(zzdljVar, zzdkxVar), this.zzglb, zzbbi.zzedu);
    }
}
