package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzpj {
    private byte[] data;
    private int zzbju;
    private int zzbjv = 0;
    private int zzbjw;

    public zzpj(byte[] bArr, int i, int i2) {
        this.data = bArr;
        this.zzbju = i;
        this.zzbjw = i2;
        zzix();
    }

    public final void zzbl(int i) {
        int i2 = this.zzbju;
        int i3 = (i / 8) + i2;
        this.zzbju = i3;
        int i4 = this.zzbjv + (i % 8);
        this.zzbjv = i4;
        if (i4 > 7) {
            this.zzbju = i3 + 1;
            this.zzbjv = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 <= this.zzbju) {
                if (zzbm(i2)) {
                    this.zzbju++;
                    i2 += 2;
                }
            } else {
                zzix();
                return;
            }
        }
    }

    public final boolean zzit() {
        return zzbk(1) == 1;
    }

    public final int zzbk(int i) {
        int i2;
        int i3;
        if (i == 0) {
            return 0;
        }
        int i4 = i / 8;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = zzbm(this.zzbju + 1) ? this.zzbju + 2 : this.zzbju + 1;
            int i8 = this.zzbjv;
            if (i8 != 0) {
                byte[] bArr = this.data;
                i3 = ((bArr[i7] & 255) >>> (8 - i8)) | ((bArr[this.zzbju] & 255) << i8);
            } else {
                i3 = this.data[this.zzbju];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.zzbju = i7;
        }
        if (i > 0) {
            int i9 = this.zzbjv + i;
            byte b = (byte) (255 >> (8 - i));
            int i10 = zzbm(this.zzbju + 1) ? this.zzbju + 2 : this.zzbju + 1;
            if (i9 > 8) {
                byte[] bArr2 = this.data;
                i2 = (b & (((255 & bArr2[i10]) >> (16 - i9)) | ((bArr2[this.zzbju] & 255) << (i9 - 8)))) | i5;
                this.zzbju = i10;
            } else {
                i2 = (b & ((255 & this.data[this.zzbju]) >> (8 - i9))) | i5;
                if (i9 == 8) {
                    this.zzbju = i10;
                }
            }
            i5 = i2;
            this.zzbjv = i9 % 8;
        }
        zzix();
        return i5;
    }

    public final int zziu() {
        return zziw();
    }

    public final int zziv() {
        int zziw = zziw();
        return (zziw % 2 == 0 ? -1 : 1) * ((zziw + 1) / 2);
    }

    private final int zziw() {
        int i = 0;
        while (!zzit()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? zzbk(i) : 0);
    }

    private final boolean zzbm(int i) {
        if (2 > i || i >= this.zzbjw) {
            return false;
        }
        byte[] bArr = this.data;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    private final void zzix() {
        int i;
        int i2;
        int i3 = this.zzbju;
        zzoz.checkState(i3 >= 0 && (i = this.zzbjv) >= 0 && i < 8 && (i3 < (i2 = this.zzbjw) || (i3 == i2 && i == 0)));
    }
}
