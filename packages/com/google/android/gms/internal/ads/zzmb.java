package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
interface zzmb {
    int getCodecCount();

    MediaCodecInfo getCodecInfoAt(int i);

    boolean zza(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

    boolean zzhj();
}
