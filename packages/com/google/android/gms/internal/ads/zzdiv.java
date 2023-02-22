package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdiv implements zzdsl<zzcpa, zzdix> {
    private final /* synthetic */ zzdit zzgza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdiv(zzdit zzditVar) {
        this.zzgza = zzditVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    @NullableDecl
    public final /* synthetic */ zzdix apply(@NullableDecl zzcpa zzcpaVar) {
        zzdnk zzash;
        zzdix zzdixVar;
        zzbbd.zzc("", zzcpaVar);
        zzaxy.zzei("Failed to get a cache key, reverting to legacy flow.");
        zzdit zzditVar = this.zzgza;
        zzash = this.zzgza.zzash();
        zzditVar.zzgyz = new zzdix(null, zzash, null);
        zzdixVar = this.zzgza.zzgyz;
        return zzdixVar;
    }
}
