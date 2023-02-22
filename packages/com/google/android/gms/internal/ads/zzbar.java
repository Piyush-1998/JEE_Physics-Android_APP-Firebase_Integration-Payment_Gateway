package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbar {
    private static List<MediaCodecInfo> zzeda;
    private static Map<String, List<Map<String, Object>>> zzecz = new HashMap();
    private static final Object zzedb = new Object();

    public static List<Map<String, Object>> zzew(String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        synchronized (zzedb) {
            if (zzecz.containsKey(str)) {
                return zzecz.get(str);
            }
            try {
                synchronized (zzedb) {
                    if (zzeda == null) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            zzeda = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else {
                            int codecCount = MediaCodecList.getCodecCount();
                            zzeda = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                zzeda.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        }
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : zzeda) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("codecName", mediaCodecInfo.getName());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (Build.VERSION.SDK_INT >= 21) {
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", zza(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", zza(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", zza(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", zza(videoCapabilities.getSupportedHeights()));
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                zzecz.put(str, arrayList);
                return arrayList;
            } catch (LinkageError | RuntimeException e) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                zzecz.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    private static Integer[] zza(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }
}
