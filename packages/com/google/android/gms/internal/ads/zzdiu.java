package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdiu implements zzdsl<zzasp, zzdix> {
    private final /* synthetic */ zzdit zzgza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdiu(zzdit zzditVar) {
        this.zzgza = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    @NullableDecl
    public final /* synthetic */ zzdix apply(@NullableDecl zzasp zzaspVar) {
        zzdix zzdixVar;
        zzasp zzaspVar2 = zzaspVar;
        this.zzgza.zzgyz = new zzdix(zzaspVar2, new zzdnm(zzaspVar2.zzdth), null);
        zzdixVar = this.zzgza.zzgyz;
        return zzdixVar;
    }
}
