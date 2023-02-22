package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzelj {
    private static int zzib(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static <T> List<T> zzhy(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> HashSet<T> zzhz(int i) {
        return new HashSet<>(zzib(i));
    }

    public static <K, V> LinkedHashMap<K, V> zzia(int i) {
        return new LinkedHashMap<>(zzib(i));
    }
}