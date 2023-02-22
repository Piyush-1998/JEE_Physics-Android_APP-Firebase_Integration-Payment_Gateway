package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import com.google.android.gms.internal.ads.zzecb;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzdxg {
    @Deprecated
    public static final zzdxc zzm(byte[] bArr) throws GeneralSecurityException {
        try {
            zzecb zzc = zzecb.zzc(bArr, zzegc.zzbex());
            for (zzecb.zzb zzbVar : zzc.zzbbm()) {
                if (zzbVar.zzbbq().zzbba() == zzebt.zza.UNKNOWN_KEYMATERIAL || zzbVar.zzbbq().zzbba() == zzebt.zza.SYMMETRIC || zzbVar.zzbbq().zzbba() == zzebt.zza.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzdxc.zza(zzc);
        } catch (zzegz unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
