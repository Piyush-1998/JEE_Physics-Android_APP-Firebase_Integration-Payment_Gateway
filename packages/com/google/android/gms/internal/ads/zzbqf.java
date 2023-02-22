package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqf implements zzdvi<Void> {
    private final /* synthetic */ zzbqb zzfqz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqf(zzbqb zzbqbVar) {
        this.zzfqz = zzbqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzbwx zzbwxVar;
        zzbwxVar = this.zzfqz.zzfqr;
        zzbwxVar.zzbh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(@NullableDecl Void r2) {
        zzbwx zzbwxVar;
        zzbwxVar = this.zzfqz.zzfqr;
        zzbwxVar.zzbh(true);
    }
}
