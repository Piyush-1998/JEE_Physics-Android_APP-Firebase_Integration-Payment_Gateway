package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdnu implements zzdvi<zzdnh<AdT>> {
    private final /* synthetic */ zzdnp zzhfy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnu(zzdnp zzdnpVar) {
        this.zzhfy = zzdnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzdnw zzdnwVar;
        zzdwe zzdweVar;
        synchronized (this.zzhfy) {
            zzdnwVar = this.zzhfy.zzhfs;
            zzdnwVar.zzb(th);
            zzdweVar = this.zzhfy.zzhfp;
            zzdweVar.setException(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(Object obj) {
        zzdnw zzdnwVar;
        int i;
        int i2;
        zzdwe zzdweVar;
        zzdnv zzdnvVar;
        zzdna zzdnaVar;
        zzdnv zzdnvVar2;
        zzdnh<?> zzdnhVar = (zzdnh) obj;
        synchronized (this.zzhfy) {
            zzdnwVar = this.zzhfy.zzhfs;
            zzdnwVar.zza(zzdnhVar);
            i = this.zzhfy.zzhfr;
            if (i != zzdnf.zzhfa) {
                zzdnaVar = this.zzhfy.zzgyr;
                zzdnvVar2 = this.zzhfy.zzhfo;
                zzdnaVar.zza(zzdnvVar2.zzasd(), zzdnhVar);
            }
            i2 = this.zzhfy.zzhfr;
            if (i2 == zzdnf.zzhez) {
                zzdnp zzdnpVar = this.zzhfy;
                zzdnvVar = this.zzhfy.zzhfo;
                zzdnpVar.zzd(zzdnvVar);
            }
            this.zzhfy.zzhfr = zzdnf.zzhez;
            zzdweVar = this.zzhfy.zzhfp;
            zzdweVar.set(zzdnhVar);
        }
    }
}
