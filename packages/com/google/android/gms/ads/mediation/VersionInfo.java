package com.google.android.gms.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class VersionInfo {
    private final int zzeqs;
    private final int zzeqt;
    private final int zzequ;

    public VersionInfo(int i, int i2, int i3) {
        this.zzeqs = i;
        this.zzeqt = i2;
        this.zzequ = i3;
    }

    public final int getMajorVersion() {
        return this.zzeqs;
    }

    public final int getMinorVersion() {
        return this.zzeqt;
    }

    public final int getMicroVersion() {
        return this.zzequ;
    }
}
