package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzji {
    private final MediaCodec.CryptoInfo zzant;
    private final MediaCodec.CryptoInfo.Pattern zzanv;

    private zzji(MediaCodec.CryptoInfo cryptoInfo) {
        this.zzant = cryptoInfo;
        this.zzanv = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set(int i, int i2) {
        this.zzanv.set(i, i2);
        this.zzant.setPattern(this.zzanv);
    }
}
