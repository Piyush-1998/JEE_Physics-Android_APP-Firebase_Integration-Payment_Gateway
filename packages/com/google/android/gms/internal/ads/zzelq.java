package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzelq<K, V> extends zzelh<K, V, V> {
    private static final zzelx<Map<Object, Object>> zzire = zzeln.zzba(Collections.emptyMap());

    public static <K, V> zzels<K, V> zzic(int i) {
        return new zzels<>(i);
    }

    private zzelq(Map<K, zzelx<V>> map) {
        super(map);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        LinkedHashMap zzia = zzelj.zzia(zzbjm().size());
        for (Map.Entry<K, zzelx<V>> entry : zzbjm().entrySet()) {
            zzia.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(zzia);
    }
}
