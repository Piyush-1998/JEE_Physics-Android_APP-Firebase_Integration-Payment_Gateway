package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdyr extends zzdwx<zzecs> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyr() {
        super(zzecs.class, new zzdyq(zzdwq.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzecs> zzaxv() {
        return new zzdyt(this, zzect.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzecs zzecsVar) throws GeneralSecurityException {
        zzecs zzecsVar2 = zzecsVar;
        zzeej.zzy(zzecsVar2.getVersion(), 0);
        if (zzecsVar2.zzayi().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzecs zzp(zzeff zzeffVar) throws zzegz {
        return zzecs.zzx(zzeffVar, zzegc.zzbex());
    }
}
