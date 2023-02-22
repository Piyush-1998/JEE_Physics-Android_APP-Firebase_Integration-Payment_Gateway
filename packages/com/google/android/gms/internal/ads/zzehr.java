package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzehr<K, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void zza(zzefz zzefzVar, zzehu<K, V> zzehuVar, K k, V v) throws IOException {
        zzegi.zza(zzefzVar, zzehuVar.zzihu, 1, k);
        zzegi.zza(zzefzVar, zzehuVar.zzihw, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int zza(zzehu<K, V> zzehuVar, K k, V v) {
        return zzegi.zza(zzehuVar.zzihu, 1, k) + zzegi.zza(zzehuVar.zzihw, 2, v);
    }
}
