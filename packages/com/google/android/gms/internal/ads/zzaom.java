package com.google.android.gms.internal.ads;

import com.google.ads.AdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzaom {
    private static final /* synthetic */ int[] zzdlj;
    static final /* synthetic */ int[] zzdlk;

    static {
        int[] iArr = new int[AdRequest.ErrorCode.values().length];
        zzdlk = iArr;
        try {
            iArr[AdRequest.ErrorCode.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzdlk[AdRequest.ErrorCode.INVALID_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzdlk[AdRequest.ErrorCode.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zzdlk[AdRequest.ErrorCode.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[AdRequest.Gender.values().length];
        zzdlj = iArr2;
        try {
            iArr2[AdRequest.Gender.FEMALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzdlj[AdRequest.Gender.MALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            zzdlj[AdRequest.Gender.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
