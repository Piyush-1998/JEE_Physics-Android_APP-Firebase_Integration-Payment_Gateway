package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdyb extends zzdwx<zzeah> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyb() {
        super(zzeah.class, new zzdya(zzdwq.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzeah> zzaxv() {
        return new zzdyd(this, zzeai.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzeah zzeahVar) throws GeneralSecurityException {
        zzeah zzeahVar2 = zzeahVar;
        zzeej.zzy(zzeahVar2.getVersion(), 0);
        zzeej.zzfp(zzeahVar2.zzayi().size());
        if (zzeahVar2.zzazg().zzazd() != 12 && zzeahVar2.zzazg().zzazd() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzeah zzp(zzeff zzeffVar) throws zzegz {
        return zzeah.zzi(zzeffVar, zzegc.zzbex());
    }
}
