package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzecw implements zzdxd {
    private final SecretKey zzhyd;
    private final int zzhye;
    private byte[] zzhyf;
    private byte[] zzhyg;

    private static Cipher zzbcq() throws GeneralSecurityException {
        return zzedt.zzhzm.zzhs("AES/ECB/NoPadding");
    }

    public zzecw(byte[] bArr, int i) throws GeneralSecurityException {
        zzeej.zzfp(bArr.length);
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, min is 10 bytes");
        }
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("tag size too large, max is 16 bytes");
        }
        this.zzhyd = new SecretKeySpec(bArr, "AES");
        this.zzhye = i;
        Cipher zzbcq = zzbcq();
        zzbcq.init(1, this.zzhyd);
        byte[] zzq = zzede.zzq(zzbcq.doFinal(new byte[16]));
        this.zzhyf = zzq;
        this.zzhyg = zzede.zzq(zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzdxd
    public final byte[] zzl(byte[] bArr) throws GeneralSecurityException {
        byte[] zzd;
        Cipher zzbcq = zzbcq();
        zzbcq.init(1, this.zzhyd);
        double length = bArr.length;
        Double.isNaN(length);
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        if ((max << 4) == bArr.length) {
            zzd = zzedd.zza(bArr, (max - 1) << 4, this.zzhyf, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, (max - 1) << 4, bArr.length);
            if (copyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[copyOfRange.length] = Byte.MIN_VALUE;
            zzd = zzedd.zzd(copyOf, this.zzhyg);
        }
        byte[] bArr2 = new byte[16];
        for (int i = 0; i < max - 1; i++) {
            bArr2 = zzbcq.doFinal(zzedd.zza(bArr2, 0, bArr, i << 4, 16));
        }
        byte[] zzd2 = zzedd.zzd(zzd, bArr2);
        byte[] bArr3 = new byte[this.zzhye];
        System.arraycopy(zzbcq.doFinal(zzd2), 0, bArr3, 0, this.zzhye);
        return bArr3;
    }
}
