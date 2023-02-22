package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzefv extends zzefq {
    private final byte[] buffer;
    private int pos;
    private int zzajz;
    private int zzibv;
    private int zzibx;
    private int zziby;
    private final InputStream zzibz;
    private int zzica;
    private zzefu zzicb;

    private zzefv(InputStream inputStream, int i) {
        super();
        this.zziby = Integer.MAX_VALUE;
        this.zzicb = null;
        zzegr.zza(inputStream, "input");
        this.zzibz = inputStream;
        this.buffer = new byte[i];
        this.zzajz = 0;
        this.pos = 0;
        this.zzica = 0;
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
            if (this.zzajz - this.pos >= 10) {
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
        if (zzbel > 0 && zzbel <= this.zzajz - this.pos) {
            String str = new String(this.buffer, this.pos, zzbel, zzegr.UTF_8);
            this.pos += zzbel;
            return str;
        } else if (zzbel == 0) {
            return "";
        } else {
            if (zzbel <= this.zzajz) {
                zzge(zzbel);
                String str2 = new String(this.buffer, this.pos, zzbel, zzegr.UTF_8);
                this.pos += zzbel;
                return str2;
            }
            return new String(zzg(zzbel, false), zzegr.UTF_8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final String zzbea() throws IOException {
        byte[] zzg;
        int zzbel = zzbel();
        int i = this.pos;
        if (zzbel <= this.zzajz - i && zzbel > 0) {
            zzg = this.buffer;
            this.pos = i + zzbel;
        } else if (zzbel == 0) {
            return "";
        } else {
            if (zzbel <= this.zzajz) {
                zzge(zzbel);
                zzg = this.buffer;
                this.pos = zzbel;
            } else {
                zzg = zzg(zzbel, false);
            }
            i = 0;
        }
        return zzejw.zzo(zzg, i, zzbel);
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final zzeff zzbeb() throws IOException {
        int zzbel = zzbel();
        int i = this.zzajz;
        int i2 = this.pos;
        if (zzbel <= i - i2 && zzbel > 0) {
            zzeff zzi = zzeff.zzi(this.buffer, i2, zzbel);
            this.pos += zzbel;
            return zzi;
        } else if (zzbel == 0) {
            return zzeff.zzibd;
        } else {
            byte[] zzgg = zzgg(zzbel);
            if (zzgg != null) {
                return zzeff.zzu(zzgg);
            }
            int i3 = this.pos;
            int i4 = this.zzajz;
            int i5 = i4 - i3;
            this.zzica += i4;
            this.pos = 0;
            this.zzajz = 0;
            List<byte[]> zzgh = zzgh(zzbel - i5);
            byte[] bArr = new byte[zzbel];
            System.arraycopy(this.buffer, i3, bArr, 0, i5);
            for (byte[] bArr2 : zzgh) {
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return zzeff.zzv(bArr);
        }
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
            int r1 = r5.zzajz
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefv.zzbel():int");
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzefv.zzbem():long");
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
        if (this.zzajz - i < 4) {
            zzge(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzbeo() throws IOException {
        int i = this.pos;
        if (this.zzajz - i < 8) {
            zzge(8);
            i = this.pos;
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
        int i2 = i + this.zzica + this.pos;
        int i3 = this.zziby;
        if (i2 > i3) {
            throw zzegz.zzbgb();
        }
        this.zziby = i2;
        zzbep();
        return i3;
    }

    private final void zzbep() {
        int i = this.zzajz + this.zzibv;
        this.zzajz = i;
        int i2 = this.zzica + i;
        int i3 = this.zziby;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzibv = i4;
            this.zzajz = i - i4;
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
        return this.pos == this.zzajz && !zzgf(1);
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final int zzbek() {
        return this.zzica + this.pos;
    }

    private final void zzge(int i) throws IOException {
        if (zzgf(i)) {
            return;
        }
        if (i > (this.zzibr - this.zzica) - this.pos) {
            throw zzegz.zzbgh();
        }
        throw zzegz.zzbgb();
    }

    private final boolean zzgf(int i) throws IOException {
        while (this.pos + i > this.zzajz) {
            int i2 = this.zzibr;
            int i3 = this.zzica;
            int i4 = this.pos;
            if (i > (i2 - i3) - i4 || i3 + i4 + i > this.zziby) {
                return false;
            }
            if (i4 > 0) {
                int i5 = this.zzajz;
                if (i5 > i4) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.zzica += i4;
                this.zzajz -= i4;
                this.pos = 0;
            }
            InputStream inputStream = this.zzibz;
            byte[] bArr2 = this.buffer;
            int i6 = this.zzajz;
            int read = inputStream.read(bArr2, i6, Math.min(bArr2.length - i6, (this.zzibr - this.zzica) - this.zzajz));
            if (read == 0 || read < -1 || read > this.buffer.length) {
                String valueOf = String.valueOf(this.zzibz.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                sb.append(valueOf);
                sb.append("#read(byte[]) returned invalid result: ");
                sb.append(read);
                sb.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb.toString());
            } else if (read <= 0) {
                return false;
            } else {
                this.zzajz += read;
                zzbep();
                if (this.zzajz >= i) {
                    return true;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("refillBuffer() called when ");
        sb2.append(i);
        sb2.append(" bytes were already available in buffer");
        throw new IllegalStateException(sb2.toString());
    }

    private final byte zzbeq() throws IOException {
        if (this.pos == this.zzajz) {
            zzge(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    private final byte[] zzg(int i, boolean z) throws IOException {
        byte[] zzgg = zzgg(i);
        if (zzgg != null) {
            return zzgg;
        }
        int i2 = this.pos;
        int i3 = this.zzajz;
        int i4 = i3 - i2;
        this.zzica += i3;
        this.pos = 0;
        this.zzajz = 0;
        List<byte[]> zzgh = zzgh(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzgh) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    private final byte[] zzgg(int i) throws IOException {
        if (i == 0) {
            return zzegr.zzibj;
        }
        if (i < 0) {
            throw zzegz.zzbgc();
        }
        int i2 = this.zzica + this.pos + i;
        if (i2 - this.zzibr > 0) {
            throw zzegz.zzbgh();
        }
        int i3 = this.zziby;
        if (i2 > i3) {
            zzgd((i3 - this.zzica) - this.pos);
            throw zzegz.zzbgb();
        }
        int i4 = this.zzajz - this.pos;
        int i5 = i - i4;
        if (i5 < 4096 || i5 <= this.zzibz.available()) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.buffer, this.pos, bArr, 0, i4);
            this.zzica += this.zzajz;
            this.pos = 0;
            this.zzajz = 0;
            while (i4 < i) {
                int read = this.zzibz.read(bArr, i4, i - i4);
                if (read == -1) {
                    throw zzegz.zzbgb();
                }
                this.zzica += read;
                i4 += read;
            }
            return bArr;
        }
        return null;
    }

    private final List<byte[]> zzgh(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zzibz.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw zzegz.zzbgb();
                }
                this.zzica += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzgd(int i) throws IOException {
        int i2 = this.zzajz;
        int i3 = this.pos;
        if (i <= i2 - i3 && i >= 0) {
            this.pos = i3 + i;
        } else if (i < 0) {
            throw zzegz.zzbgc();
        } else {
            int i4 = this.zzica;
            int i5 = this.pos;
            int i6 = i4 + i5 + i;
            int i7 = this.zziby;
            if (i6 > i7) {
                zzgd((i7 - i4) - i5);
                throw zzegz.zzbgb();
            }
            this.zzica = i4 + i5;
            int i8 = this.zzajz - i5;
            this.zzajz = 0;
            this.pos = 0;
            while (i8 < i) {
                try {
                    long j = i - i8;
                    long skip = this.zzibz.skip(j);
                    if (skip >= 0 && skip <= j) {
                        if (skip == 0) {
                            break;
                        }
                        i8 += (int) skip;
                    } else {
                        String valueOf = String.valueOf(this.zzibz.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                        sb.append(valueOf);
                        sb.append("#skip returned invalid result: ");
                        sb.append(skip);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    }
                } finally {
                    this.zzica += i8;
                    zzbep();
                }
            }
            if (i8 >= i) {
                return;
            }
            int i9 = this.zzajz;
            int i10 = i9 - this.pos;
            this.pos = i9;
            zzge(1);
            while (true) {
                int i11 = i - i10;
                int i12 = this.zzajz;
                if (i11 > i12) {
                    i10 += i12;
                    this.pos = i12;
                    zzge(1);
                } else {
                    this.pos = i11;
                    return;
                }
            }
        }
    }
}
