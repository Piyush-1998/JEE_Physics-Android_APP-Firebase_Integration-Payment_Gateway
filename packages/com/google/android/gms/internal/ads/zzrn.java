package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzrn {
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;
    private final int zzbts;

    public zzrn(float f, float f2, float f3, float f4, int i) {
        this.left = f;
        this.top = f2;
        this.right = f + f3;
        this.bottom = f2 + f4;
        this.zzbts = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzml() {
        return this.left;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzmm() {
        return this.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzmn() {
        return this.right;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float zzmo() {
        return this.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzmp() {
        return this.zzbts;
    }
}
