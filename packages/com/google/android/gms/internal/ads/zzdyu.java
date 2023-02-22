package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdyu extends zzdxa<zzeaz, zzebd> {
    private final /* synthetic */ zzdys zzhsq;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdyu(zzdys zzdysVar, Class cls) {
        super(cls);
        this.zzhsq = zzdysVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzebd zze(zzeaz zzeazVar) throws GeneralSecurityException {
        zzeaz zzeazVar2 = zzeazVar;
        KeyPair zza = zzedq.zza(zzedq.zza(zzdze.zza(zzeazVar2.zzazv().zzazx().zzbak())));
        ECPoint w = ((ECPublicKey) zza.getPublic()).getW();
        return (zzebd) ((zzegp) zzebd.zzbad().zzez(0).zzb((zzebe) ((zzegp) zzebe.zzbah().zzfa(0).zzc(zzeazVar2.zzazv()).zzab(zzeff.zzu(w.getAffineX().toByteArray())).zzac(zzeff.zzu(w.getAffineY().toByteArray())).zzbfx())).zzaa(zzeff.zzu(((ECPrivateKey) zza.getPrivate()).getS().toByteArray())).zzbfx());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzeaz zzr(zzeff zzeffVar) throws zzegz {
        return zzeaz.zzo(zzeffVar, zzegc.zzbex());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ void zzd(zzeaz zzeazVar) throws GeneralSecurityException {
        zzdze.zza(zzeazVar.zzazv());
    }
}
