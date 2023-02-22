package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdpe implements zzdvi<O> {
    private final /* synthetic */ zzdos zzhhb;
    private final /* synthetic */ zzdox zzhhc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpe(zzdox zzdoxVar, zzdos zzdosVar) {
        this.zzhhc = zzdoxVar;
        this.zzhhb = zzdosVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void onSuccess(O o) {
        this.zzhhc.zzhgu.zzhgp.zzc(this.zzhhb);
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        this.zzhhc.zzhgu.zzhgp.zza(this.zzhhb, th);
    }
}
