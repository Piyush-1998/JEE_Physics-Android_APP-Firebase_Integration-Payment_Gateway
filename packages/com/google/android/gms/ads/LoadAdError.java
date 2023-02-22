package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class LoadAdError extends AdError {
    private final ResponseInfo zzadg;

    public LoadAdError(int i, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i, str, str2, adError);
        this.zzadg = responseInfo;
    }
}
