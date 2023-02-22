package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public enum zzug implements zzegu {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);
    
    private static final zzegt<zzug> zzes = new zzegt<zzug>() { // from class: com.google.android.gms.internal.ads.zzuj
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzegu
    public final int zzv() {
        return this.value;
    }

    public static zzug zzcg(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 1000) {
                    return null;
                }
                return ENUM_UNKNOWN;
            }
            return ENUM_TRUE;
        }
        return ENUM_FALSE;
    }

    public static zzegw zzw() {
        return zzui.zzeu;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzug(int i) {
        this.value = i;
    }
}
