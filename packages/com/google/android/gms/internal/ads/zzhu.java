package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzhu {
    public static final zzhu zzahv = new zzhu(1.0f, 1.0f);
    public final float zzahw;
    public final float zzahx;
    private final int zzahy;

    public zzhu(float f, float f2) {
        this.zzahw = f;
        this.zzahx = f2;
        this.zzahy = Math.round(f * 1000.0f);
    }

    public final long zzdu(long j) {
        return j * this.zzahy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzhu zzhuVar = (zzhu) obj;
            if (this.zzahw == zzhuVar.zzahw && this.zzahx == zzhuVar.zzahx) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzahw) + 527) * 31) + Float.floatToRawIntBits(this.zzahx);
    }
}
