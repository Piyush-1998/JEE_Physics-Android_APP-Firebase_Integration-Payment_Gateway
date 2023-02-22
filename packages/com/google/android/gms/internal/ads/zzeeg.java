package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeeg implements zzdxd {
    private final Mac zzhzz;
    private final int zziaa;
    private final String zziab;
    private final Key zziac;

    public zzeeg(String str, Key key, int i) throws GeneralSecurityException {
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1823053428) {
            if (hashCode != 392315118) {
                if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                    c = 2;
                }
            } else if (str.equals("HMACSHA256")) {
                c = 1;
            }
        } else if (str.equals("HMACSHA1")) {
            c = 0;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    String valueOf = String.valueOf(str);
                    throw new NoSuchAlgorithmException(valueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(valueOf) : new String("unknown Hmac algorithm: "));
                } else if (i > 64) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i > 32) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
        } else if (i > 20) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.zziab = str;
        this.zziaa = i;
        this.zziac = key;
        Mac zzhs = zzedt.zzhzn.zzhs(str);
        this.zzhzz = zzhs;
        zzhs.init(key);
    }

    @Override // com.google.android.gms.internal.ads.zzdxd
    public final byte[] zzl(byte[] bArr) throws GeneralSecurityException {
        Mac zzhs;
        try {
            zzhs = (Mac) this.zzhzz.clone();
        } catch (CloneNotSupportedException unused) {
            zzhs = zzedt.zzhzn.zzhs(this.zziab);
            zzhs.init(this.zziac);
        }
        zzhs.update(bArr);
        byte[] bArr2 = new byte[this.zziaa];
        System.arraycopy(zzhs.doFinal(), 0, bArr2, 0, this.zziaa);
        return bArr2;
    }
}
