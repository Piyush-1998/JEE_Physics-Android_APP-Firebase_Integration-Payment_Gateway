package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchi implements zzdvi<zzbfq> {
    private final /* synthetic */ String zzgcp;
    private final /* synthetic */ Map zzgcq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchi(zzchc zzchcVar, String str, Map map) {
        this.zzgcp = str;
        this.zzgcq = map;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(zzbfq zzbfqVar) {
        zzbfqVar.zza(this.zzgcp, this.zzgcq);
    }
}
