package com.google.android.gms.internal.ads;

import java.io.OutputStream;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzefo extends OutputStream {
    private static final byte[] zzibj = new byte[0];
    private int zzibm;
    private int zzibn;
    private final int zzibk = 128;
    private final ArrayList<zzeff> zzibl = new ArrayList<>();
    private byte[] buffer = new byte[128];

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefo(int i) {
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.zzibn == this.buffer.length) {
            zzfx(1);
        }
        byte[] bArr = this.buffer;
        int i2 = this.zzibn;
        this.zzibn = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (i2 <= this.buffer.length - this.zzibn) {
            System.arraycopy(bArr, i, this.buffer, this.zzibn, i2);
            this.zzibn += i2;
            return;
        }
        int length = this.buffer.length - this.zzibn;
        System.arraycopy(bArr, i, this.buffer, this.zzibn, length);
        int i3 = i2 - length;
        zzfx(i3);
        System.arraycopy(bArr, i + length, this.buffer, 0, i3);
        this.zzibn = i3;
    }

    public final synchronized zzeff zzbda() {
        if (this.zzibn < this.buffer.length) {
            if (this.zzibn > 0) {
                byte[] bArr = this.buffer;
                int i = this.zzibn;
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                this.zzibl.add(new zzefp(bArr2));
            }
        } else {
            this.zzibl.add(new zzefp(this.buffer));
            this.buffer = zzibj;
        }
        this.zzibm += this.zzibn;
        this.zzibn = 0;
        return zzeff.zzl(this.zzibl);
    }

    private final synchronized int size() {
        return this.zzibm + this.zzibn;
    }

    public final String toString() {
        return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    private final void zzfx(int i) {
        this.zzibl.add(new zzefp(this.buffer));
        int length = this.zzibm + this.buffer.length;
        this.zzibm = length;
        this.buffer = new byte[Math.max(this.zzibk, Math.max(i, length >>> 1))];
        this.zzibn = 0;
    }
}
