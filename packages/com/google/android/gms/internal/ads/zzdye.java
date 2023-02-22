package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdye extends zzdxa<zzeap, zzeam> {
    private final /* synthetic */ zzdyc zzhsh;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdye(zzdyc zzdycVar, Class cls) {
        super(cls);
        this.zzhsh = zzdycVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzeam zze(zzeap zzeapVar) throws GeneralSecurityException {
        return (zzeam) ((zzegp) zzeam.zzazm().zzw(zzeff.zzu(zzeei.zzfo(zzeapVar.getKeySize()))).zzew(0).zzbfx());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzeap zzr(zzeff zzeffVar) throws zzegz {
        return zzeap.zzl(zzeffVar, zzegc.zzbex());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ void zzd(zzeap zzeapVar) throws GeneralSecurityException {
        zzeej.zzfp(zzeapVar.getKeySize());
    }
}
