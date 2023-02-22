package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdyc extends zzdwx<zzeam> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyc() {
        super(zzeam.class, new zzdyf(zzdwq.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzeam> zzaxv() {
        return new zzdye(this, zzeap.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzeam zzeamVar) throws GeneralSecurityException {
        zzeam zzeamVar2 = zzeamVar;
        zzeej.zzy(zzeamVar2.getVersion(), 0);
        zzeej.zzfp(zzeamVar2.zzayi().size());
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzeam zzp(zzeff zzeffVar) throws zzegz {
        return zzeam.zzk(zzeffVar, zzegc.zzbex());
    }
}
