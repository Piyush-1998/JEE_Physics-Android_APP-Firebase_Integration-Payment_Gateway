package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzedc implements zzdwq {
    private static final ThreadLocal<Cipher> zzhxz = new zzedb();
    private final SecretKey zzhyd;

    public zzedc(byte[] bArr) throws GeneralSecurityException {
        zzeej.zzfp(bArr.length);
        this.zzhyd = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] zzfo = zzeei.zzfo(12);
        System.arraycopy(zzfo, 0, bArr3, 0, 12);
        zzhxz.get().init(1, this.zzhyd, zzf(zzfo, 0, zzfo.length));
        if (bArr2 != null && bArr2.length != 0) {
            zzhxz.get().updateAAD(bArr2);
        }
        int doFinal = zzhxz.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
    }

    private static AlgorithmParameterSpec zzf(byte[] bArr, int i, int i2) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i2);
        } catch (ClassNotFoundException unused) {
            if (zzeek.zzbcx()) {
                return new IvParameterSpec(bArr, 0, i2);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }
}
