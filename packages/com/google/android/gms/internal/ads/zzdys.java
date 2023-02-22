package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdys extends zzdxj<zzebd, zzebe> {
    private static final byte[] zzhso = new byte[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdys() {
        super(zzebd.class, zzebe.class, new zzdyv(zzdwu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<zzeaz, zzebd> zzaxv() {
        return new zzdyu(this, zzeaz.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzehz zzehzVar) throws GeneralSecurityException {
        zzebd zzebdVar = (zzebd) zzehzVar;
        if (zzebdVar.zzayi().isEmpty()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzeej.zzy(zzebdVar.getVersion(), 0);
        zzdze.zza(zzebdVar.zzbac().zzazv());
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzehz zzp(zzeff zzeffVar) throws zzegz {
        return zzebd.zzp(zzeffVar, zzegc.zzbex());
    }
}
