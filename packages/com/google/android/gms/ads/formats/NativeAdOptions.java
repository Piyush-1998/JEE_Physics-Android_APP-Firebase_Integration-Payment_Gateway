package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.VideoOptions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    @Deprecated
    public static final int ORIENTATION_ANY = 0;
    @Deprecated
    public static final int ORIENTATION_LANDSCAPE = 2;
    @Deprecated
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean zzbni;
    private final int zzbnj;
    private final int zzbnk;
    private final boolean zzbnl;
    private final int zzbnm;
    private final VideoOptions zzbnn;
    private final boolean zzbno;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public @interface AdChoicesPlacement {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public @interface NativeMediaAspectRatio {
    }

    private NativeAdOptions(Builder builder) {
        this.zzbni = builder.zzbni;
        this.zzbnj = builder.zzbnj;
        this.zzbnk = builder.zzbnk;
        this.zzbnl = builder.zzbnl;
        this.zzbnm = builder.zzbnm;
        this.zzbnn = builder.zzbnn;
        this.zzbno = builder.zzbno;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private VideoOptions zzbnn;
        private boolean zzbni = false;
        private int zzbnj = -1;
        private int zzbnk = 0;
        private boolean zzbnl = false;
        private int zzbnm = 1;
        private boolean zzbno = false;

        public final Builder setReturnUrlsForImageAssets(boolean z) {
            this.zzbni = z;
            return this;
        }

        @Deprecated
        public final Builder setImageOrientation(int i) {
            this.zzbnj = i;
            return this;
        }

        public final Builder setMediaAspectRatio(int i) {
            this.zzbnk = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean z) {
            this.zzbnl = z;
            return this;
        }

        public final Builder setAdChoicesPlacement(int i) {
            this.zzbnm = i;
            return this;
        }

        public final Builder setVideoOptions(VideoOptions videoOptions) {
            this.zzbnn = videoOptions;
            return this;
        }

        public final Builder setRequestCustomMuteThisAd(boolean z) {
            this.zzbno = z;
            return this;
        }

        public final NativeAdOptions build() {
            return new NativeAdOptions(this);
        }
    }

    public final boolean shouldReturnUrlsForImageAssets() {
        return this.zzbni;
    }

    @Deprecated
    public final int getImageOrientation() {
        return this.zzbnj;
    }

    public final int getMediaAspectRatio() {
        return this.zzbnk;
    }

    public final boolean shouldRequestMultipleImages() {
        return this.zzbnl;
    }

    public final int getAdChoicesPlacement() {
        return this.zzbnm;
    }

    public final VideoOptions getVideoOptions() {
        return this.zzbnn;
    }

    public final boolean zzjr() {
        return this.zzbno;
    }
}
