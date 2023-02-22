package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdzf extends zzdwx<zzdzr> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzf() {
        super(zzdzr.class, new zzdzi(zzdxd.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzdzv zzdzvVar) throws GeneralSecurityException {
        if (zzdzvVar.zzayn() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzdzvVar.zzayn() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzeq(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzdzr> zzaxv() {
        return new zzdzh(this, zzdzs.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzdzr zzdzrVar) throws GeneralSecurityException {
        zzdzr zzdzrVar2 = zzdzrVar;
        zzeej.zzy(zzdzrVar2.getVersion(), 0);
        zzeq(zzdzrVar2.zzayi().size());
        zza(zzdzrVar2.zzayj());
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzdzr zzp(zzeff zzeffVar) throws zzegz {
        return zzdzr.zzc(zzeffVar, zzegc.zzbex());
    }
}
