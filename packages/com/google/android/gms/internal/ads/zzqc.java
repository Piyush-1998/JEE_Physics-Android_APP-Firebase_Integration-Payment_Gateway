package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzqc implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ zzpx zzbmn;

    private zzqc(zzpx zzpxVar, MediaCodec mediaCodec) {
        this.zzbmn = zzpxVar;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        if (this != this.zzbmn.zzbly) {
            return;
        }
        this.zzbmn.zzji();
    }
}
