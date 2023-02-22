package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdyi extends zzdwx<zzecf> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyi() {
        super(zzecf.class, new zzdyl(zzdwq.class));
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzebt.zza zzaxs() {
        return zzebt.zza.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final zzdxa<?, zzecf> zzaxv() {
        return new zzdyk(this, zzeci.class);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ void zzc(zzecf zzecfVar) throws GeneralSecurityException {
        zzeej.zzy(zzecfVar.getVersion(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzdwx
    public final /* synthetic */ zzecf zzp(zzeff zzeffVar) throws zzegz {
        return zzecf.zzt(zzeffVar, zzegc.zzbex());
    }
}
