package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.zzaac;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class VideoOptions {
    private final boolean zzadr;
    private final boolean zzads;
    private final boolean zzadt;

    public VideoOptions(zzaac zzaacVar) {
        this.zzadr = zzaacVar.zzadr;
        this.zzads = zzaacVar.zzads;
        this.zzadt = zzaacVar.zzadt;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private boolean zzadr = true;
        private boolean zzads = false;
        private boolean zzadt = false;

        public final Builder setStartMuted(boolean z) {
            this.zzadr = z;
            return this;
        }

        public final Builder setCustomControlsRequested(boolean z) {
            this.zzads = z;
            return this;
        }

        public final Builder setClickToExpandRequested(boolean z) {
            this.zzadt = z;
            return this;
        }

        public final VideoOptions build() {
            return new VideoOptions(this);
        }
    }

    private VideoOptions(Builder builder) {
        this.zzadr = builder.zzadr;
        this.zzads = builder.zzads;
        this.zzadt = builder.zzadt;
    }

    public final boolean getStartMuted() {
        return this.zzadr;
    }

    public final boolean getCustomControlsRequested() {
        return this.zzads;
    }

    public final boolean getClickToExpandRequested() {
        return this.zzadt;
    }
}
