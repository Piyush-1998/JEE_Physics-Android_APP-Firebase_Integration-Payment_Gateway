package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdym extends zzdwx<zzecj> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdym() {
        super(zzecj.class, new zzdyp(zzdwq.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzecj> zzaxv() {
        return new zzdyo(this, zzecm.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzecj zzecjVar) throws GeneralSecurityException {
        zzeej.zzy(zzecjVar.getVersion(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzecj zzp(zzeff zzeffVar) throws zzegz {
        return zzecj.zzv(zzeffVar, zzegc.zzbex());
    }
}
