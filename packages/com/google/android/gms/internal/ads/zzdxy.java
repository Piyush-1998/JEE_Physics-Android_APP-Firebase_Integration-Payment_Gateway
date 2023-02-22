package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdxy extends zzdxa<zzead, zzeaa> {
    private final /* synthetic */ zzdxw zzhsf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdxy(zzdxw zzdxwVar, Class cls) {
        super(cls);
        this.zzhsf = zzdxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzeaa zze(zzead zzeadVar) throws GeneralSecurityException {
        zzead zzeadVar2 = zzeadVar;
        return (zzeaa) ((zzegp) zzeaa.zzayy().zzc(zzeadVar2.zzayx()).zzu(zzeff.zzu(zzeei.zzfo(zzeadVar2.getKeySize()))).zzeu(0).zzbfx());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzead zzr(zzeff zzeffVar) throws zzegz {
        return zzead.zzh(zzeffVar, zzegc.zzbex());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ void zzd(zzead zzeadVar) throws GeneralSecurityException {
        zzead zzeadVar2 = zzeadVar;
        zzeej.zzfp(zzeadVar2.getKeySize());
        zzdxw zzdxwVar = this.zzhsf;
        zzdxw.zza(zzeadVar2.zzayx());
    }
}
