package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdzh extends zzdxa<zzdzs, zzdzr> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzh(zzdzf zzdzfVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzdzr zze(zzdzs zzdzsVar) throws GeneralSecurityException {
        zzdzs zzdzsVar2 = zzdzsVar;
        return (zzdzr) ((zzegp) zzdzr.zzayk().zzes(0).zzt(zzeff.zzu(zzeei.zzfo(zzdzsVar2.getKeySize()))).zzd(zzdzsVar2.zzayj()).zzbfx());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzdzs zzr(zzeff zzeffVar) throws zzegz {
        return zzdzs.zzd(zzeffVar, zzegc.zzbex());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ void zzd(zzdzs zzdzsVar) throws GeneralSecurityException {
        zzdzs zzdzsVar2 = zzdzsVar;
        zzdzf.zza(zzdzsVar2.zzayj());
        zzdzf.zzeq(zzdzsVar2.getKeySize());
    }
}
