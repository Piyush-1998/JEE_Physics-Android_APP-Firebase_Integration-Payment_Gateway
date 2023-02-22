package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import com.google.android.gms.internal.ads.zzecb;
import com.google.android.gms.internal.ads.zzece;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdxq {
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    public static zzece zzb(zzecb zzecbVar) {
        zzece.zzb zzfi = zzece.zzbbt().zzfi(zzecbVar.zzbbl());
        for (zzecb.zzb zzbVar : zzecbVar.zzbbm()) {
            zzfi.zzb((zzece.zza) ((zzegp) zzece.zza.zzbbv().zzhr(zzbVar.zzbbq().zzbay()).zzb(zzbVar.zzaya()).zzb(zzbVar.zzayb()).zzfj(zzbVar.zzbbr()).zzbfx()));
        }
        return (zzece) ((zzegp) zzfi.zzbfx());
    }

    public static void zzc(zzecb zzecbVar) throws GeneralSecurityException {
        int zzbbl = zzecbVar.zzbbl();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzecb.zzb zzbVar : zzecbVar.zzbbm()) {
            if (zzbVar.zzaya() == zzebu.ENABLED) {
                if (!zzbVar.zzbbp()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzbVar.zzbbr())));
                }
                if (zzbVar.zzayb() == zzecn.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzbVar.zzbbr())));
                }
                if (zzbVar.zzaya() == zzebu.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzbVar.zzbbr())));
                }
                if (zzbVar.zzbbr() == zzbbl) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                if (zzbVar.zzbbq().zzbba() != zzebt.zza.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i++;
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
