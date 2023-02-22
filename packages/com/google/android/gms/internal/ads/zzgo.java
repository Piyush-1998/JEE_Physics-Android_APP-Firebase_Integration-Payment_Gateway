package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public enum zzgo implements zzegu {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6);
    
    private static final zzegt<zzgo> zzes = new zzegt<zzgo>() { // from class: com.google.android.gms.internal.ads.zzgn
    };
    private final int value;

    @Override // com.google.android.gms.internal.ads.zzegu
    public final int zzv() {
        return this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
    }

    zzgo(int i) {
        this.value = i;
    }
}
