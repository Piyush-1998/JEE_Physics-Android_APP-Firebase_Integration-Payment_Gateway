package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzlr {
    private final String mimeType;
    public final String name;
    public final boolean zzali;
    public final boolean zzbba;
    public final boolean zzbbb;
    private final MediaCodecInfo.CodecCapabilities zzbbc;

    public static zzlr zzbb(String str) {
        return new zzlr(str, null, null, false, false);
    }

    public static zzlr zza(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzlr(str, str2, codecCapabilities, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
        if ((com.google.android.gms.internal.ads.zzpq.SDK_INT >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private zzlr(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzoz.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.name = r2
            r1.mimeType = r3
            r1.zzbbc = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L2a
            if (r4 == 0) goto L2a
            int r5 = com.google.android.gms.internal.ads.zzpq.SDK_INT
            r0 = 19
            if (r5 < r0) goto L25
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            if (r5 == 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            r1.zzbba = r5
            r5 = 21
            if (r4 == 0) goto L44
            int r0 = com.google.android.gms.internal.ads.zzpq.SDK_INT
            if (r0 < r5) goto L3f
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r1.zzali = r0
            if (r6 != 0) goto L5e
            if (r4 == 0) goto L5d
            int r6 = com.google.android.gms.internal.ads.zzpq.SDK_INT
            if (r6 < r5) goto L59
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L59
            r4 = 1
            goto L5a
        L59:
            r4 = 0
        L5a:
            if (r4 == 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            r1.zzbbb = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlr.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzha() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzbbc;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.zzbbc.profileLevels;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzbc(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlr.zzbc(java.lang.String):boolean");
    }

    public final boolean zza(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzbbc;
        if (codecCapabilities == null) {
            zzbd("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzbd("sizeAndRate.vCaps");
            return false;
        } else if (zza(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !zza(videoCapabilities, i2, i, d)) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                zzbd(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d);
            String sb3 = sb2.toString();
            String str = this.name;
            String str2 = this.mimeType;
            String str3 = zzpq.zzbki;
            StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb4.append("AssumedSupport [");
            sb4.append(sb3);
            sb4.append("] [");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(str2);
            sb4.append("] [");
            sb4.append(str3);
            sb4.append("]");
            Log.d("MediaCodecInfo", sb4.toString());
            return true;
        }
    }

    public final Point zzd(int i, int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzbbc;
        if (codecCapabilities == null) {
            zzbd("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzbd("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzpq.zzf(i, widthAlignment) * widthAlignment, zzpq.zzf(i2, heightAlignment) * heightAlignment);
    }

    public final boolean zzay(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzbbc;
        if (codecCapabilities == null) {
            zzbd("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzbd("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("sampleRate.support, ");
            sb.append(i);
            zzbd(sb.toString());
            return false;
        }
    }

    public final boolean zzaz(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzbbc;
        if (codecCapabilities == null) {
            zzbd("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzbd("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() < i) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("channelCount.support, ");
            sb.append(i);
            zzbd(sb.toString());
            return false;
        } else {
            return true;
        }
    }

    private final void zzbd(String str) {
        String str2 = this.name;
        String str3 = this.mimeType;
        String str4 = zzpq.zzbki;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    private static boolean zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }
}
