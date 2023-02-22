package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzjk extends zzjh {
    public long zzanx;
    public ByteBuffer zzdd;
    public final zzjg zzanw = new zzjg();
    private final int zzany = 0;

    public zzjk(int i) {
    }

    public final void zzae(int i) throws IllegalStateException {
        ByteBuffer byteBuffer = this.zzdd;
        if (byteBuffer == null) {
            this.zzdd = zzaf(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.zzdd.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer zzaf = zzaf(i2);
        if (position > 0) {
            this.zzdd.position(0);
            this.zzdd.limit(position);
            zzaf.put(this.zzdd);
        }
        this.zzdd = zzaf;
    }

    public final boolean isEncrypted() {
        return zzad(1073741824);
    }

    @Override // com.google.android.gms.internal.ads.zzjh
    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.zzdd;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    private final ByteBuffer zzaf(int i) {
        ByteBuffer byteBuffer = this.zzdd;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(capacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }
}
