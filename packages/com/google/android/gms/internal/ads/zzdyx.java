package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdyx extends zzdwx<zzebe> {
    public zzdyx() {
        super(zzebe.class, new zzdyw(zzdwt.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzebe zzebeVar) throws GeneralSecurityException {
        zzebe zzebeVar2 = zzebeVar;
        zzeej.zzy(zzebeVar2.getVersion(), 0);
        zzdze.zza(zzebeVar2.zzazv());
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzebe zzp(zzeff zzeffVar) throws zzegz {
        return zzebe.zzq(zzeffVar, zzegc.zzbex());
    }
}
