package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbqg implements zzdvi<zzasp> {
    private final /* synthetic */ zzbqb zzfqz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqg(zzbqb zzbqbVar) {
        this.zzfqz = zzbqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzbwx zzbwxVar;
        zzbwxVar = this.zzfqz.zzfqr;
        zzbwxVar.zzbg(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(@NullableDecl zzasp zzaspVar) {
        zzbwx zzbwxVar;
        zzbwxVar = this.zzfqz.zzfqr;
        zzbwxVar.zzbg(true);
    }
}
