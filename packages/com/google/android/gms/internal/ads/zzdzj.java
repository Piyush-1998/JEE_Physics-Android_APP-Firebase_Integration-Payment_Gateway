package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdzj extends zzdwz<zzdxd, zzebl> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzj(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzdwz
    public final /* synthetic */ zzdxd zzag(zzebl zzeblVar) throws GeneralSecurityException {
        zzebl zzeblVar2 = zzeblVar;
        zzebj zzbav = zzeblVar2.zzbap().zzbav();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzeblVar2.zzayi().toByteArray(), "HMAC");
        int zzayn = zzeblVar2.zzbap().zzayn();
        int i = zzdzl.zzhsu[zzbav.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new zzeeg("HMACSHA512", secretKeySpec, zzayn);
                }
                throw new GeneralSecurityException("unknown hash");
            }
            return new zzeeg("HMACSHA256", secretKeySpec, zzayn);
        }
        return new zzeeg("HMACSHA1", secretKeySpec, zzayn);
    }
}
