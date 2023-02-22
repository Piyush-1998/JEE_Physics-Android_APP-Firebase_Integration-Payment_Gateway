package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbpr implements zzdvi<zzbpj> {
    private final /* synthetic */ zzdvi zzfqf;
    private final /* synthetic */ zzbpo zzfqg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpr(zzbpo zzbpoVar, zzdvi zzdviVar) {
        this.zzfqg = zzbpoVar;
        this.zzfqf = zzdviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        this.zzfqf.zzb(th);
        this.zzfqg.zzaip();
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzbpj zzbpjVar) {
        this.zzfqg.zza(zzbpjVar.zzfpy, this.zzfqf);
    }
}
