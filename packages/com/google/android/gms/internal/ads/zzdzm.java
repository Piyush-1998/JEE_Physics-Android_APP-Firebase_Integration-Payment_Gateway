package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdzm extends zzdxa<zzebp, zzebl> {
    private final /* synthetic */ zzdzk zzhtc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdzm(zzdzk zzdzkVar, Class cls) {
        super(cls);
        this.zzhtc = zzdzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzebl zze(zzebp zzebpVar) throws GeneralSecurityException {
        zzebp zzebpVar2 = zzebpVar;
        return (zzebl) ((zzegp) zzebl.zzbaq().zzfd(0).zzd(zzebpVar2.zzbap()).zzad(zzeff.zzu(zzeei.zzfo(zzebpVar2.getKeySize()))).zzbfx());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ zzebp zzr(zzeff zzeffVar) throws zzegz {
        return zzebp.zzs(zzeffVar, zzegc.zzbex());
    }

    @Override // com.google.android.gms.internal.ads.zzdxa
    public final /* synthetic */ void zzd(zzebp zzebpVar) throws GeneralSecurityException {
        zzebp zzebpVar2 = zzebpVar;
        if (zzebpVar2.getKeySize() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzdzk.zza(zzebpVar2.zzbap());
    }
}
