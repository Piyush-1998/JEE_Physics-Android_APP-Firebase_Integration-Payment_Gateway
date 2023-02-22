package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzdzd {
    static final /* synthetic */ int[] zzhsu;
    static final /* synthetic */ int[] zzhsv;
    static final /* synthetic */ int[] zzhsw;

    static {
        int[] iArr = new int[zzeau.values().length];
        zzhsw = iArr;
        try {
            iArr[zzeau.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzhsw[zzeau.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            zzhsw[zzeau.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[zzebi.values().length];
        zzhsv = iArr2;
        try {
            iArr2[zzebi.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zzhsv[zzebi.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zzhsv[zzebi.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] iArr3 = new int[zzebj.values().length];
        zzhsu = iArr3;
        try {
            iArr3[zzebj.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            zzhsu[zzebj.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            zzhsu[zzebj.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
