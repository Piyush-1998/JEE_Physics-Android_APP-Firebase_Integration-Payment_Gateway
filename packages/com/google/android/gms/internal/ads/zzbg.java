package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbg extends FilterInputStream {
    private final HttpURLConnection zzcx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbg(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = com.google.android.gms.internal.ads.zzbd.zzb(r2)
            r1.<init>(r0)
            r1.zzcx = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbg.<init>(java.net.HttpURLConnection):void");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.zzcx.disconnect();
    }
}