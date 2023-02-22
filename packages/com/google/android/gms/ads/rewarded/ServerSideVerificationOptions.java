package com.google.android.gms.ads.rewarded;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class ServerSideVerificationOptions {
    private final String zzdve;
    private final String zzdvf;

    private ServerSideVerificationOptions(Builder builder) {
        this.zzdve = builder.zzdve;
        this.zzdvf = builder.zzdvf;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private String zzdve = "";
        private String zzdvf = "";

        public final Builder setUserId(String str) {
            this.zzdve = str;
            return this;
        }

        public final Builder setCustomData(String str) {
            this.zzdvf = str;
            return this;
        }

        public final ServerSideVerificationOptions build() {
            return new ServerSideVerificationOptions(this);
        }
    }

    public String getUserId() {
        return this.zzdve;
    }

    public String getCustomData() {
        return this.zzdvf;
    }
}
