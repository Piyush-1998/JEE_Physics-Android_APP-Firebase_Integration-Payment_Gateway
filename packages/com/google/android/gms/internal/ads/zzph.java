package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzph {
    private byte[] data;
    private int zzbju;
    private int zzbjv;
    private int zzbjw;

    public zzph() {
    }

    public zzph(byte[] bArr) {
        this(bArr, bArr.length);
    }

    private zzph(byte[] bArr, int i) {
        this.data = bArr;
        this.zzbjw = i;
    }

    public final int zzbk(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        if (i == 0) {
            return 0;
        }
        int i6 = i / 8;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = this.zzbjv;
            if (i9 != 0) {
                byte[] bArr = this.data;
                int i10 = this.zzbju;
                i5 = ((bArr[i10 + 1] & 255) >>> (8 - i9)) | ((bArr[i10] & 255) << i9);
            } else {
                i5 = this.data[this.zzbju];
            }
            i -= 8;
            i7 |= (255 & i5) << i;
            this.zzbju++;
        }
        if (i > 0) {
            int i11 = this.zzbjv + i;
            byte b = (byte) (255 >> (8 - i));
            if (i11 > 8) {
                byte[] bArr2 = this.data;
                int i12 = this.zzbju;
                i4 = (b & (((bArr2[i12 + 1] & 255) >> (16 - i11)) | ((bArr2[i12] & 255) << (i11 - 8)))) | i7;
                this.zzbju = i12 + 1;
            } else {
                byte[] bArr3 = this.data;
                int i13 = this.zzbju;
                i4 = (b & ((bArr3[i13] & 255) >> (8 - i11))) | i7;
                if (i11 == 8) {
                    this.zzbju = i13 + 1;
                }
            }
            i7 = i4;
            this.zzbjv = i11 % 8;
        }
        int i14 = this.zzbju;
        if (i14 >= 0 && (i2 = this.zzbjv) >= 0 && i2 < 8 && (i14 < (i3 = this.zzbjw) || (i14 == i3 && i2 == 0))) {
            z = true;
        }
        zzoz.checkState(z);
        return i7;
    }
}
