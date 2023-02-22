package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbek implements zzela {
    private final ByteBuffer zzami;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbek(ByteBuffer byteBuffer) {
        this.zzami = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzela, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.zzami.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.zzami.remaining());
            byte[] bArr = new byte[min];
            this.zzami.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final long size() throws IOException {
        return this.zzami.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final long position() throws IOException {
        return this.zzami.position();
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final void zzfc(long j) throws IOException {
        this.zzami.position((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzela
    public final ByteBuffer zzh(long j, long j2) throws IOException {
        int position = this.zzami.position();
        this.zzami.position((int) j);
        ByteBuffer slice = this.zzami.slice();
        slice.limit((int) j2);
        this.zzami.position(position);
        return slice;
    }
}
