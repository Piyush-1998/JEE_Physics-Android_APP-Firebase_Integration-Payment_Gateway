package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzeiw extends InputStream {
    private int mark;
    private final /* synthetic */ zzeis zziiz;
    private zzeit zzijj;
    private zzefm zzijk;
    private int zzijl;
    private int zzijm;
    private int zzijn;

    public zzeiw(zzeis zzeisVar) {
        this.zziiz = zzeisVar;
        initialize();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw null;
        }
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        int zzl = zzl(bArr, i, i2);
        if (zzl == 0) {
            return -1;
        }
        return zzl;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        return zzl(null, 0, (int) j);
    }

    private final int zzl(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            zzbhk();
            if (this.zzijk == null) {
                break;
            }
            int min = Math.min(this.zzijl - this.zzijm, i3);
            if (bArr != null) {
                this.zzijk.zza(bArr, this.zzijm, i, min);
                i += min;
            }
            this.zzijm += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        zzbhk();
        zzefm zzefmVar = this.zzijk;
        if (zzefmVar == null) {
            return -1;
        }
        int i = this.zzijm;
        this.zzijm = i + 1;
        return zzefmVar.zzfu(i) & 255;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.zziiz.size() - (this.zzijn + this.zzijm);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.mark = this.zzijn + this.zzijm;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        initialize();
        zzl(null, 0, this.mark);
    }

    private final void initialize() {
        zzeit zzeitVar = new zzeit(this.zziiz, null);
        this.zzijj = zzeitVar;
        zzefm zzefmVar = (zzefm) zzeitVar.next();
        this.zzijk = zzefmVar;
        this.zzijl = zzefmVar.size();
        this.zzijm = 0;
        this.zzijn = 0;
    }

    private final void zzbhk() {
        if (this.zzijk != null) {
            int i = this.zzijm;
            int i2 = this.zzijl;
            if (i == i2) {
                this.zzijn += i2;
                this.zzijm = 0;
                if (this.zzijj.hasNext()) {
                    zzefm zzefmVar = (zzefm) this.zzijj.next();
                    this.zzijk = zzefmVar;
                    this.zzijl = zzefmVar.size();
                    return;
                }
                this.zzijk = null;
                this.zzijl = 0;
            }
        }
    }
}
