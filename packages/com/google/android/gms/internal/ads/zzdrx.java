package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdrx extends Exception {
    private final int zzhky;

    public zzdrx(int i, String str) {
        super(str);
        this.zzhky = i;
    }

    public zzdrx(int i, Throwable th) {
        super(th);
        this.zzhky = i;
    }

    public final int zzawg() {
        return this.zzhky;
    }
}
