package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcsm implements zzdvi<zzbni> {
    private final /* synthetic */ zzcsh zzgma;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsm(zzcsh zzcshVar) {
        this.zzgma = zzcshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzbsx zzbsxVar;
        zzuw zze = zzcmt.zze(th);
        zzbsxVar = this.zzgma.zzfue;
        zzbsxVar.zzg(zze);
        zzdly.zza(zze.errorCode, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzbni zzbniVar) {
        zzbniVar.zzahw();
    }
}
