package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdxx extends zzdxa<zzdzz, zzdzw> {
    private final /* synthetic */ zzdxv zzhse;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdxx(zzdxv zzdxvVar, Class cls) {
        super(cls);
        this.zzhse = zzdxvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzdzw zze(zzdzz zzdzzVar) throws GeneralSecurityException {
        zzdzz zzdzzVar2 = zzdzzVar;
        return (zzdzw) ((zzegp) zzdzw.zzays().zzb(new zzdxw().zzaxv().zze(zzdzzVar2.zzayu())).zzb(new zzdzk().zzaxv().zze(zzdzzVar2.zzayv())).zzet(0).zzbfx());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzdzz zzr(zzeff zzeffVar) throws zzegz {
        return zzdzz.zzf(zzeffVar, zzegc.zzbex());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ void zzd(zzdzz zzdzzVar) throws GeneralSecurityException {
        zzdzz zzdzzVar2 = zzdzzVar;
        new zzdxw().zzaxv().zzd(zzdzzVar2.zzayu());
        new zzdzk().zzaxv().zzd(zzdzzVar2.zzayv());
        zzeej.zzfp(zzdzzVar2.zzayu().getKeySize());
    }
}
