package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzelf {
    public static final zzelf zziqu = new zzelf(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzelf zziqv = new zzelf(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzelf zziqw = new zzelf(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private static final zzelf zziqx = new zzelf(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double w;
    private final double zziqq;
    private final double zziqr;
    private final double zziqs;
    private final double zziqt;

    private zzelf(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.zziqq = d5;
        this.zziqr = d6;
        this.w = d7;
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.zziqs = d8;
        this.zziqt = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzelf zzelfVar = (zzelf) obj;
        return Double.compare(zzelfVar.a, this.a) == 0 && Double.compare(zzelfVar.b, this.b) == 0 && Double.compare(zzelfVar.c, this.c) == 0 && Double.compare(zzelfVar.d, this.d) == 0 && Double.compare(zzelfVar.zziqs, this.zziqs) == 0 && Double.compare(zzelfVar.zziqt, this.zziqt) == 0 && Double.compare(zzelfVar.zziqq, this.zziqq) == 0 && Double.compare(zzelfVar.zziqr, this.zziqr) == 0 && Double.compare(zzelfVar.w, this.w) == 0;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.zziqq);
        long doubleToLongBits2 = Double.doubleToLongBits(this.zziqr);
        long doubleToLongBits3 = Double.doubleToLongBits(this.w);
        long doubleToLongBits4 = Double.doubleToLongBits(this.a);
        long doubleToLongBits5 = Double.doubleToLongBits(this.b);
        long doubleToLongBits6 = Double.doubleToLongBits(this.c);
        long doubleToLongBits7 = Double.doubleToLongBits(this.d);
        long doubleToLongBits8 = Double.doubleToLongBits(this.zziqs);
        long doubleToLongBits9 = Double.doubleToLongBits(this.zziqt);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(zziqu)) {
            return "Rotate 0°";
        }
        if (equals(zziqv)) {
            return "Rotate 90°";
        }
        if (equals(zziqw)) {
            return "Rotate 180°";
        }
        if (equals(zziqx)) {
            return "Rotate 270°";
        }
        double d = this.zziqq;
        double d2 = this.zziqr;
        double d3 = this.w;
        double d4 = this.a;
        double d5 = this.b;
        double d6 = this.c;
        double d7 = this.d;
        double d8 = this.zziqs;
        double d9 = this.zziqt;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }

    public static zzelf zzs(ByteBuffer byteBuffer) {
        double zzi = zzbq.zzi(byteBuffer);
        double zzi2 = zzbq.zzi(byteBuffer);
        double zzj = zzbq.zzj(byteBuffer);
        return new zzelf(zzi, zzi2, zzbq.zzi(byteBuffer), zzbq.zzi(byteBuffer), zzj, zzbq.zzj(byteBuffer), zzbq.zzj(byteBuffer), zzbq.zzi(byteBuffer), zzbq.zzi(byteBuffer));
    }
}
