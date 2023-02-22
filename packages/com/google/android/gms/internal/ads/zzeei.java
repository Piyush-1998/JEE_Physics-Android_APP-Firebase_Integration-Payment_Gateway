package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeei {
    private static final ThreadLocal<SecureRandom> zziad = new zzeeh();

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom zzbcv() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] zzfo(int i) {
        byte[] bArr = new byte[i];
        zziad.get().nextBytes(bArr);
        return bArr;
    }
}
