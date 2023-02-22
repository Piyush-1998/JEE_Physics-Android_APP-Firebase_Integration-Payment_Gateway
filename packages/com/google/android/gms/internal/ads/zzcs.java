package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public enum zzcs implements zzegu {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);
    
    private static final zzegt<zzcs> zzes = new zzegt<zzcs>() { // from class: com.google.android.gms.internal.ads.zzcr
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzegu
    public final int zzv() {
        return this.value;
    }

    public static zzcs zzo(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PARTNER_SIGNALS;
                }
                return UNITY_SIGNALS;
            }
            return AFMA_SIGNALS;
        }
        return UNKNOWN_PROTO;
    }

    public static zzegw zzw() {
        return zzct.zzeu;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzcs(int i) {
        this.value = i;
    }
}
