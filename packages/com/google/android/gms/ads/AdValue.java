package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class AdValue {
    private final int zzadb;
    private final String zzadc;
    private final long zzadd;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PrecisionType {
        public static final int ESTIMATED = 1;
        public static final int PRECISE = 3;
        public static final int PUBLISHER_PROVIDED = 2;
        public static final int UNKNOWN = 0;
    }

    private AdValue(int i, String str, long j) {
        this.zzadb = i;
        this.zzadc = str;
        this.zzadd = j;
    }

    public static AdValue zza(int i, String str, long j) {
        return new AdValue(i, str, j);
    }

    public final int getPrecisionType() {
        return this.zzadb;
    }

    public final String getCurrencyCode() {
        return this.zzadc;
    }

    public final long getValueMicros() {
        return this.zzadd;
    }
}
