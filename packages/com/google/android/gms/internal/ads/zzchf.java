package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchf implements zzdvi<zzbfq> {
    private final /* synthetic */ String zzemq;
    private final /* synthetic */ zzahf zzgco;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchf(zzchc zzchcVar, String str, zzahf zzahfVar) {
        this.zzemq = str;
        this.zzgco = zzahfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzbfq zzbfqVar) {
        zzbfqVar.zzb(this.zzemq, this.zzgco);
    }
}
