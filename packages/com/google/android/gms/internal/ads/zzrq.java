package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class zzrq {
    private static MessageDigest zzbtz;
    protected Object mLock = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] zzbu(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    public final MessageDigest zzmq() {
        synchronized (this.mLock) {
            if (zzbtz != null) {
                return zzbtz;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzbtz = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzbtz;
        }
    }
}
