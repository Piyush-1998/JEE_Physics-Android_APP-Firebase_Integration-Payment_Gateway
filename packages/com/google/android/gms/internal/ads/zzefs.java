package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzefs extends zzefq {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzibu;
    private int zzibv;
    private int zzibw;
    private int zzibx;
    private int zziby;

    private zzefs(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zziby = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzibw = i;
        this.zzibu = z;
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbdt() throws IOException {
        if (zzbej()) {
            this.zzibx = 0;
            return 0;
        }
        int zzbel = zzbel();
        this.zzibx = zzbel;
        if ((zzbel >>> 3) != 0) {
            return zzbel;
        }
        throw zzegz.zzbge();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final void zzfy(int i) throws zzegz {
        if (this.zzibx != i) {
            throw zzegz.zzbgf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final boolean zzfz(int i) throws IOException {
        int zzbdt;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.limit - this.pos >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.buffer;
                    int i4 = this.pos;
                    this.pos = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzegz.zzbgd();
            }
            while (i3 < 10) {
                if (zzbeq() < 0) {
                    i3++;
                }
            }
            throw zzegz.zzbgd();
            return true;
        } else if (i2 == 1) {
            zzgd(8);
            return true;
        } else if (i2 == 2) {
            zzgd(zzbel());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzgd(4);
                    return true;
                }
                throw zzegz.zzbgg();
            }
            return false;
        } else {
            do {
                zzbdt = zzbdt();
                if (zzbdt == 0) {
                    break;
                }
            } while (zzfz(zzbdt));
            zzfy(((i >>> 3) << 3) | 4);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzbeo());
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzben());
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final long zzbdu() throws IOException {
        return zzbem();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final long zzbdv() throws IOException {
        return zzbem();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbdw() throws IOException {
        return zzbel();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final long zzbdx() throws IOException {
        return zzbeo();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbdy() throws IOException {
        return zzben();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final boolean zzbdz() throws IOException {
        return zzbem() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final String readString() throws IOException {
        int zzbel = zzbel();
        if (zzbel > 0 && zzbel <= this.limit - this.pos) {
            String str = new String(this.buffer, this.pos, zzbel, zzegr.UTF_8);
            this.pos += zzbel;
            return str;
        } else if (zzbel == 0) {
            return "";
        } else {
            if (zzbel < 0) {
                throw zzegz.zzbgc();
            }
            throw zzegz.zzbgb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final String zzbea() throws IOException {
        int zzbel = zzbel();
        if (zzbel > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzbel <= i - i2) {
                String zzo = zzejw.zzo(this.buffer, i2, zzbel);
                this.pos += zzbel;
                return zzo;
            }
        }
        if (zzbel == 0) {
            return "";
        }
        if (zzbel <= 0) {
            throw zzegz.zzbgc();
        }
        throw zzegz.zzbgb();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final zzeff zzbeb() throws IOException {
        byte[] bArr;
        int zzbel = zzbel();
        if (zzbel > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzbel <= i - i2) {
                zzeff zzi = zzeff.zzi(this.buffer, i2, zzbel);
                this.pos += zzbel;
                return zzi;
            }
        }
        if (zzbel == 0) {
            return zzeff.zzibd;
        }
        if (zzbel > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzbel <= i3 - i4) {
                int i5 = zzbel + i4;
                this.pos = i5;
                bArr = Arrays.copyOfRange(this.buffer, i4, i5);
                return zzeff.zzv(bArr);
            }
        }
        if (zzbel <= 0) {
            if (zzbel == 0) {
                bArr = zzegr.zzibj;
                return zzeff.zzv(bArr);
            }
            throw zzegz.zzbgc();
        }
        throw zzegz.zzbgb();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbec() throws IOException {
        return zzbel();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbed() throws IOException {
        return zzbel();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbee() throws IOException {
        return zzben();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final long zzbef() throws IOException {
        return zzbeo();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbeg() throws IOException {
        return zzgc(zzbel());
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final long zzbeh() throws IOException {
        return zzfh(zzbem());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzbel() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.limit
            if (r1 == r0) goto L6b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.pos = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.pos = r1
            return r0
        L6b:
            long r0 = r5.zzbei()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefs.zzbel():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r2[r0] >= 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzbem() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 189
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefs.zzbem():long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzefq
    public final long zzbei() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzbeq = zzbeq();
            j |= (zzbeq & Byte.MAX_VALUE) << i;
            if ((zzbeq & 128) == 0) {
                return j;
            }
        }
        throw zzegz.zzbgd();
    }

    private final int zzben() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzegz.zzbgb();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzbeo() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzegz.zzbgb();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzga(int i) throws zzegz {
        if (i < 0) {
            throw zzegz.zzbgc();
        }
        int zzbek = i + zzbek();
        int i2 = this.zziby;
        if (zzbek > i2) {
            throw zzegz.zzbgb();
        }
        this.zziby = zzbek;
        zzbep();
        return i2;
    }

    private final void zzbep() {
        int i = this.limit + this.zzibv;
        this.limit = i;
        int i2 = i - this.zzibw;
        int i3 = this.zziby;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzibv = i4;
            this.limit = i - i4;
            return;
        }
        this.zzibv = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final void zzgb(int i) {
        this.zziby = i;
        zzbep();
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final boolean zzbej() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbek() {
        return this.pos - this.zzibw;
    }

    private final byte zzbeq() throws IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw zzegz.zzbgb();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    private final void zzgd(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzegz.zzbgc();
        }
        throw zzegz.zzbgb();
    }
}
