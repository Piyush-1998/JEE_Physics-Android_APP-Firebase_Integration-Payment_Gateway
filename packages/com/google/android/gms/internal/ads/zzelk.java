package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzelk<K, V, V2> {
    final LinkedHashMap<K, zzelx<V>> zziqz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelk(int i) {
        this.zziqz = zzelj.zzia(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public zzelk<K, V, V2> zza(K k, zzelx<V> zzelxVar) {
        this.zziqz.put(zzelu.zza(k, "key"), zzelu.zza(zzelxVar, "provider"));
        return this;
    }
}
