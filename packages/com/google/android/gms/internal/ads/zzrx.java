package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzrx extends zzrq {
    private MessageDigest zzbuc;
    private final int zzbud;
    private final int zzbue;

    public zzrx(int i) {
        int i2 = i / 8;
        this.zzbud = i % 8 > 0 ? i2 + 1 : i2;
        this.zzbue = i;
    }

    @Override // com.google.android.gms.internal.ads.zzrq
    public final byte[] zzbu(String str) {
        synchronized (this.mLock) {
            MessageDigest zzmq = zzmq();
            this.zzbuc = zzmq;
            if (zzmq == null) {
                return new byte[0];
            }
            zzmq.reset();
            this.zzbuc.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = this.zzbuc.digest();
            int length = digest.length > this.zzbud ? this.zzbud : digest.length;
            byte[] bArr = new byte[length];
            System.arraycopy(digest, 0, bArr, 0, length);
            if (this.zzbue % 8 > 0) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    if (i > 0) {
                        j <<= 8;
                    }
                    j += bArr[i] & 255;
                }
                long j2 = j >>> (8 - (this.zzbue % 8));
                for (int i2 = this.zzbud - 1; i2 >= 0; i2--) {
                    bArr[i2] = (byte) (255 & j2);
                    j2 >>>= 8;
                }
            }
            return bArr;
        }
    }
}
