package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdyh extends zzdwx<zzeaq> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyh() {
        super(zzeaq.class, new zzdyg(zzdwq.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzeaq> zzaxv() {
        return new zzdyj(this, zzeat.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzeaq zzeaqVar) throws GeneralSecurityException {
        zzeaq zzeaqVar2 = zzeaqVar;
        zzeej.zzy(zzeaqVar2.getVersion(), 0);
        if (zzeaqVar2.zzayi().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzeaq zzp(zzeff zzeffVar) throws zzegz {
        return zzeaq.zzm(zzeffVar, zzegc.zzbex());
    }
}
