package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdin implements zzdvi<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdin(zzdii zzdiiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzaxy.zzei("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(@NullableDecl Void r1) {
        zzaxy.zzei("Notification of cache hit successful.");
    }
}
