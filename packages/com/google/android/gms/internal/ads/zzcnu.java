package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcnu implements zzdvi<zzdlj> {
    private final /* synthetic */ zzcnr zzghs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcnu(zzcnr zzcnrVar) {
        this.zzghs = zzcnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzdlj zzdljVar) {
        zzbve zzbveVar;
        zzbveVar = this.zzghs.zzgho;
        zzbveVar.zzb(zzdljVar);
    }
}
