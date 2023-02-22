package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzrr {
    private ByteArrayOutputStream zzbua = new ByteArrayOutputStream(4096);
    private Base64OutputStream zzbub = new Base64OutputStream(this.zzbua, 10);

    public final void write(byte[] bArr) throws IOException {
        this.zzbub.write(bArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.ByteArrayOutputStream, android.util.Base64OutputStream] */
    public final String toString() {
        try {
            this.zzbub.close();
        } catch (IOException e) {
            zzaxy.zzc("HashManager: Unable to convert to Base64.", e);
        }
        try {
            this.zzbua.close();
            return this.zzbua.toString();
        } catch (IOException e2) {
            zzaxy.zzc("HashManager: Unable to convert to Base64.", e2);
            return "";
        } finally {
            this.zzbua = null;
            this.zzbub = null;
        }
    }
}
