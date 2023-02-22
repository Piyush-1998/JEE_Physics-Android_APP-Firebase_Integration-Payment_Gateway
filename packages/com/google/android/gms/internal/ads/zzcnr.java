package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzcnr implements zzduv<zzasp, zzdlj> {
    private final zzbve zzgho;

    public zzcnr(zzbve zzbveVar) {
        this.zzgho = zzbveVar;
    }

    protected abstract zzdvt<zzdlj> zzb(zzasp zzaspVar) throws zzcmt;

    @Override // com.google.android.gms.internal.ads.zzduv
    public final /* synthetic */ zzdvt<zzdlj> zzf(zzasp zzaspVar) throws Exception {
        zzasp zzaspVar2 = zzaspVar;
        this.zzgho.zzd(zzaspVar2);
        zzdvt<zzdlj> zzb = zzb(zzaspVar2);
        zzdvl.zza(zzb, new zzcnu(this), zzbbi.zzedz);
        return zzb;
    }
}
