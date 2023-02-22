package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdxw extends zzdwx<zzeaa> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxw() {
        super(zzeaa.class, new zzdxz(zzeed.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzeaa> zzaxv() {
        return new zzdxy(this, zzead.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(zzeae zzeaeVar) throws GeneralSecurityException {
        if (zzeaeVar.zzazd() < 12 || zzeaeVar.zzazd() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzeaa zzeaaVar) throws GeneralSecurityException {
        zzeaa zzeaaVar2 = zzeaaVar;
        zzeej.zzy(zzeaaVar2.getVersion(), 0);
        zzeej.zzfp(zzeaaVar2.zzayi().size());
        zza(zzeaaVar2.zzayx());
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzeaa zzp(zzeff zzeffVar) throws zzegz {
        return zzeaa.zzg(zzeffVar, zzegc.zzbex());
    }
}
