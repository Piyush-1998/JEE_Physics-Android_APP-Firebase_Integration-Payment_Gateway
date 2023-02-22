package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public enum zzcn implements zzegu {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);
    
    private static final zzegt<zzcn> zzes = new zzegt<zzcn>() { // from class: com.google.android.gms.internal.ads.zzcq
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzegu
    public final int zzv() {
        return this.value;
    }

    public static zzcn zzn(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 1000) {
                        return null;
                    }
                    return ENUM_UNKNOWN;
                }
                return ENUM_FAILURE;
            }
            return ENUM_TRUE;
        }
        return ENUM_FALSE;
    }

    public static zzegw zzw() {
        return zzcp.zzeu;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzcn(int i) {
        this.value = i;
    }
}
