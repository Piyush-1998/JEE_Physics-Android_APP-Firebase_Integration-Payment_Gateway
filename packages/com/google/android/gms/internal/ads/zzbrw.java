package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbrw implements zzdvi<Boolean> {
    private final /* synthetic */ zzbru zzfrv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbrw(zzbru zzbruVar) {
        this.zzfrv = zzbruVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(@NullableDecl Boolean bool) {
        zzbtl zzbtlVar;
        zzbtlVar = this.zzfrv.zzfrn;
        zzbtlVar.onAdImpression();
    }
}
