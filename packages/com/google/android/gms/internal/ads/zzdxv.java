package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdxv extends zzdwx<zzdzw> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxv() {
        super(zzdzw.class, new zzdxu(zzdwq.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzdzw> zzaxv() {
        return new zzdxx(this, zzdzz.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzdzw zzdzwVar) throws GeneralSecurityException {
        zzeej.zzy(zzdzwVar.getVersion(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzdzw zzp(zzeff zzeffVar) throws zzegz {
        return zzdzw.zze(zzeffVar, zzegc.zzbex());
    }
}
