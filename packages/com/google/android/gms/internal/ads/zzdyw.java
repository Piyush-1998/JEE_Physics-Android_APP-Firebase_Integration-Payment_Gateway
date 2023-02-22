package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdyw extends zzdwz<zzdwt, zzebe> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyw(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdwz
    public final /* synthetic */ zzdwt zzag(zzebe zzebeVar) throws GeneralSecurityException {
        zzebe zzebeVar2 = zzebeVar;
        zzeba zzazv = zzebeVar2.zzazv();
        zzebh zzazx = zzazv.zzazx();
        return new zzedm(zzedq.zza(zzdze.zza(zzazx.zzbak()), zzebeVar2.zzbaf().toByteArray(), zzebeVar2.zzbag().toByteArray()), zzazx.zzbam().toByteArray(), zzdze.zza(zzazx.zzbal()), zzdze.zza(zzazv.zzazz()), new zzdzg(zzazv.zzazy().zzazs()));
    }
}
