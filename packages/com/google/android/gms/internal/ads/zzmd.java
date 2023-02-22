package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzmd implements zzmb {
    private final int zzbdb;
    private MediaCodecInfo[] zzbdc;

    public zzmd(boolean z) {
        this.zzbdb = z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zzhj() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final int getCodecCount() {
        zzhk();
        return this.zzbdc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final MediaCodecInfo getCodecInfoAt(int i) {
        zzhk();
        return this.zzbdc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzmb
    public final boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private final void zzhk() {
        if (this.zzbdc == null) {
            this.zzbdc = new MediaCodecList(this.zzbdb).getCodecInfos();
        }
    }
}
