package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdyv extends zzdwz<zzdwu, zzebd> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyv(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdwz
    public final /* synthetic */ zzdwu zzag(zzebd zzebdVar) throws GeneralSecurityException {
        zzebd zzebdVar2 = zzebdVar;
        zzeba zzazv = zzebdVar2.zzbac().zzazv();
        zzebh zzazx = zzazv.zzazx();
        zzeds zza = zzdze.zza(zzazx.zzbak());
        byte[] byteArray = zzebdVar2.zzayi().toByteArray();
        return new zzedj((ECPrivateKey) zzedt.zzhzs.zzhs("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), zzedq.zza(zza))), zzazx.zzbam().toByteArray(), zzdze.zza(zzazx.zzbal()), zzdze.zza(zzazv.zzazz()), new zzdzg(zzazv.zzazy().zzazs()));
    }
}
