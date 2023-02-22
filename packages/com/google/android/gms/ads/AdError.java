package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int code;
    private final String zzacm;
    private final String zzacn;
    private final AdError zzaco;

    public AdError(int i, String str, String str2) {
        this.code = i;
        this.zzacm = str;
        this.zzacn = str2;
        this.zzaco = null;
    }

    public AdError(int i, String str, String str2, AdError adError) {
        this.code = i;
        this.zzacm = str;
        this.zzacn = str2;
        this.zzaco = adError;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.zzacm;
    }

    public String getDomain() {
        return this.zzacn;
    }

    public AdError getCause() {
        return this.zzaco;
    }
}
