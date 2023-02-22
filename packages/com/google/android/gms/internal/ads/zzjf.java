package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzjf {
    private final int zzahj;
    private final int zzamw;
    private final int zzamx;
    private final int zzamy;
    private final int zzamz;
    private final short[] zzana;
    private int zzanb;
    private short[] zzanc;
    private int zzand;
    private short[] zzane;
    private int zzanf;
    private short[] zzang;
    private int zzanj;
    private int zzank;
    private int zzanl;
    private int zzanm;
    private int zzano;
    private int zzanp;
    private int zzanq;
    private int zzanh = 0;
    private int zzani = 0;
    private int zzann = 0;
    private float zzahw = 1.0f;
    private float zzahx = 1.0f;

    public zzjf(int i, int i2) {
        this.zzahj = i;
        this.zzamw = i2;
        this.zzamx = i / 400;
        int i3 = i / 65;
        this.zzamy = i3;
        int i4 = i3 * 2;
        this.zzamz = i4;
        this.zzana = new short[i4];
        this.zzanb = i4;
        this.zzanc = new short[i4 * i2];
        this.zzand = i4;
        this.zzane = new short[i4 * i2];
        this.zzanf = i4;
        this.zzang = new short[i4 * i2];
    }

    public final void setSpeed(float f) {
        this.zzahw = f;
    }

    public final void zzc(float f) {
        this.zzahx = f;
    }

    public final void zza(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzamw;
        int i2 = remaining / i;
        zzab(i2);
        shortBuffer.get(this.zzanc, this.zzanj * this.zzamw, ((i * i2) << 1) / 2);
        this.zzanj += i2;
        zzgg();
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzamw, this.zzank);
        shortBuffer.put(this.zzane, 0, this.zzamw * min);
        int i = this.zzank - min;
        this.zzank = i;
        short[] sArr = this.zzane;
        int i2 = this.zzamw;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zzfj() {
        int i;
        int i2 = this.zzanj;
        float f = this.zzahw;
        float f2 = this.zzahx;
        int i3 = this.zzank + ((int) ((((i2 / (f / f2)) + this.zzanl) / f2) + 0.5f));
        zzab((this.zzamz * 2) + i2);
        int i4 = 0;
        while (true) {
            i = this.zzamz;
            int i5 = this.zzamw;
            if (i4 >= i * 2 * i5) {
                break;
            }
            this.zzanc[(i5 * i2) + i4] = 0;
            i4++;
        }
        this.zzanj += i * 2;
        zzgg();
        if (this.zzank > i3) {
            this.zzank = i3;
        }
        this.zzanj = 0;
        this.zzanm = 0;
        this.zzanl = 0;
    }

    public final int zzgf() {
        return this.zzank;
    }

    private final void zzaa(int i) {
        int i2 = this.zzank + i;
        int i3 = this.zzand;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzand = i4;
            this.zzane = Arrays.copyOf(this.zzane, i4 * this.zzamw);
        }
    }

    private final void zzab(int i) {
        int i2 = this.zzanj + i;
        int i3 = this.zzanb;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.zzanb = i4;
            this.zzanc = Arrays.copyOf(this.zzanc, i4 * this.zzamw);
        }
    }

    private final void zza(short[] sArr, int i, int i2) {
        zzaa(i2);
        int i3 = this.zzamw;
        System.arraycopy(sArr, i * i3, this.zzane, this.zzank * i3, i3 * i2);
        this.zzank += i2;
    }

    private final void zzb(short[] sArr, int i, int i2) {
        int i3 = this.zzamz / i2;
        int i4 = this.zzamw;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.zzana[i7] = (short) (i8 / i5);
        }
    }

    private final int zza(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzamw;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.zzanp = i5 / i7;
        this.zzanq = i8 / i6;
        return i7;
    }

    private final void zzgg() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.zzank;
        float f = this.zzahw / this.zzahx;
        double d = f;
        int i8 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i9 = this.zzanj;
            if (i9 >= this.zzamz) {
                int i10 = 0;
                while (true) {
                    int i11 = this.zzanm;
                    if (i11 > 0) {
                        int min = Math.min(this.zzamz, i11);
                        zza(this.zzanc, i10, min);
                        this.zzanm -= min;
                        i10 += min;
                    } else {
                        short[] sArr = this.zzanc;
                        int i12 = this.zzahj;
                        int i13 = i12 > 4000 ? i12 / 4000 : 1;
                        if (this.zzamw == i8 && i13 == i8) {
                            i = zza(sArr, i10, this.zzamx, this.zzamy);
                        } else {
                            zzb(sArr, i10, i13);
                            int zza = zza(this.zzana, 0, this.zzamx / i13, this.zzamy / i13);
                            if (i13 != i8) {
                                int i14 = zza * i13;
                                int i15 = i13 << 2;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.zzamx;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.zzamy;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.zzamw == i8) {
                                    i = zza(sArr, i10, i16, i17);
                                } else {
                                    zzb(sArr, i10, i8);
                                    i = zza(this.zzana, 0, i16, i17);
                                }
                            } else {
                                i = zza;
                            }
                        }
                        int i20 = this.zzanp;
                        int i21 = i20 != 0 && this.zzann != 0 && this.zzanq <= i20 * 3 && (i20 << 1) > this.zzano * 3 ? this.zzann : i;
                        this.zzano = this.zzanp;
                        this.zzann = i;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzanc;
                            if (f >= 2.0f) {
                                i3 = (int) (i21 / (f - 1.0f));
                            } else {
                                this.zzanm = (int) ((i21 * (2.0f - f)) / (f - 1.0f));
                                i3 = i21;
                            }
                            zzaa(i3);
                            int i22 = i3;
                            zza(i3, this.zzamw, this.zzane, this.zzank, sArr2, i10, sArr2, i10 + i21);
                            this.zzank += i22;
                            i10 += i21 + i22;
                        } else {
                            int i23 = i21;
                            short[] sArr3 = this.zzanc;
                            if (f < 0.5f) {
                                i2 = (int) ((i23 * f) / (1.0f - f));
                            } else {
                                this.zzanm = (int) ((i23 * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i2 = i23;
                            }
                            int i24 = i23 + i2;
                            zzaa(i24);
                            int i25 = this.zzamw;
                            System.arraycopy(sArr3, i10 * i25, this.zzane, this.zzank * i25, i25 * i23);
                            zza(i2, this.zzamw, this.zzane, this.zzank + i23, sArr3, i23 + i10, sArr3, i10);
                            this.zzank += i24;
                            i10 += i2;
                        }
                    }
                    if (this.zzamz + i10 > i9) {
                        break;
                    }
                    i8 = 1;
                }
                int i26 = this.zzanj - i10;
                short[] sArr4 = this.zzanc;
                int i27 = this.zzamw;
                System.arraycopy(sArr4, i10 * i27, sArr4, 0, i27 * i26);
                this.zzanj = i26;
            }
        } else {
            zza(this.zzanc, 0, this.zzanj);
            this.zzanj = 0;
        }
        float f2 = this.zzahx;
        if (f2 == 1.0f || this.zzank == i7) {
            return;
        }
        int i28 = this.zzahj;
        int i29 = (int) (i28 / f2);
        while (true) {
            if (i29 <= 16384 && i28 <= 16384) {
                break;
            }
            i29 /= 2;
            i28 /= 2;
        }
        int i30 = this.zzank - i7;
        int i31 = this.zzanl + i30;
        int i32 = this.zzanf;
        if (i31 > i32) {
            int i33 = i32 + (i32 / 2) + i30;
            this.zzanf = i33;
            this.zzang = Arrays.copyOf(this.zzang, i33 * this.zzamw);
        }
        short[] sArr5 = this.zzane;
        int i34 = this.zzamw;
        System.arraycopy(sArr5, i7 * i34, this.zzang, this.zzanl * i34, i34 * i30);
        this.zzank = i7;
        this.zzanl += i30;
        int i35 = 0;
        while (true) {
            i4 = this.zzanl;
            if (i35 >= i4 - 1) {
                break;
            }
            while (true) {
                i5 = this.zzanh;
                int i36 = (i5 + 1) * i29;
                i6 = this.zzani;
                if (i36 <= i6 * i28) {
                    break;
                }
                zzaa(1);
                int i37 = 0;
                while (true) {
                    int i38 = this.zzamw;
                    if (i37 < i38) {
                        short[] sArr6 = this.zzang;
                        int i39 = (i35 * i38) + i37;
                        short s = sArr6[i39];
                        short s2 = sArr6[i39 + i38];
                        int i40 = this.zzanh;
                        int i41 = i40 * i29;
                        int i42 = (i40 + 1) * i29;
                        int i43 = i42 - (this.zzani * i28);
                        int i44 = i42 - i41;
                        this.zzane[(this.zzank * i38) + i37] = (short) (((s * i43) + ((i44 - i43) * s2)) / i44);
                        i37++;
                    }
                }
                this.zzani++;
                this.zzank++;
            }
            int i45 = i5 + 1;
            this.zzanh = i45;
            if (i45 == i28) {
                this.zzanh = 0;
                zzoz.checkState(i6 == i29);
                this.zzani = 0;
            }
            i35++;
        }
        int i46 = i4 - 1;
        if (i46 != 0) {
            short[] sArr7 = this.zzang;
            int i47 = this.zzamw;
            System.arraycopy(sArr7, i46 * i47, sArr7, 0, (i4 - i46) * i47);
            this.zzanl -= i46;
        }
    }

    private static void zza(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
