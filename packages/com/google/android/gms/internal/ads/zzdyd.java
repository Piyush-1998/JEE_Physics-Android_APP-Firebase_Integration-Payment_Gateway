package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdyd extends zzdxa<zzeai, zzeah> {
    private final /* synthetic */ zzdyb zzhsg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdyd(zzdyb zzdybVar, Class cls) {
        super(cls);
        this.zzhsg = zzdybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzeah zze(zzeai zzeaiVar) throws GeneralSecurityException {
        zzeai zzeaiVar2 = zzeaiVar;
        return (zzeah) ((zzegp) zzeah.zzazh().zzv(zzeff.zzu(zzeei.zzfo(zzeaiVar2.getKeySize()))).zzb(zzeaiVar2.zzazg()).zzev(0).zzbfx());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzeai zzr(zzeff zzeffVar) throws zzegz {
        return zzeai.zzj(zzeffVar, zzegc.zzbex());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ void zzd(zzeai zzeaiVar) throws GeneralSecurityException {
        zzeai zzeaiVar2 = zzeaiVar;
        zzeej.zzfp(zzeaiVar2.getKeySize());
        if (zzeaiVar2.zzazg().zzazd() != 12 && zzeaiVar2.zzazg().zzazd() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
