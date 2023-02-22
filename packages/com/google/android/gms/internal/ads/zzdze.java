package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdze {
    public static void zza(zzeba zzebaVar) throws GeneralSecurityException {
        zzedq.zza(zza(zzebaVar.zzazx().zzbak()));
        zza(zzebaVar.zzazx().zzbal());
        if (zzebaVar.zzazz() == zzeau.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        zzdxm.zza(zzebaVar.zzazy().zzazs());
    }

    public static String zza(zzebj zzebjVar) throws NoSuchAlgorithmException {
        int i = zzdzd.zzhsu[zzebjVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                String valueOf = String.valueOf(zzebjVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }

    public static zzeds zza(zzebi zzebiVar) throws GeneralSecurityException {
        int i = zzdzd.zzhsv[zzebiVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzeds.NIST_P521;
                }
                String valueOf = String.valueOf(zzebiVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
            return zzeds.NIST_P384;
        }
        return zzeds.NIST_P256;
    }

    public static zzedr zza(zzeau zzeauVar) throws GeneralSecurityException {
        int i = zzdzd.zzhsw[zzeauVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return zzedr.COMPRESSED;
                }
                String valueOf = String.valueOf(zzeauVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
            }
            return zzedr.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        return zzedr.UNCOMPRESSED;
    }
}
