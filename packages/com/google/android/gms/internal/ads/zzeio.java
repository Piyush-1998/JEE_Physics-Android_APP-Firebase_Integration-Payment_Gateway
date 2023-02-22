package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeio {
    private static final zzeio zziiu = new zzeio();
    private final ConcurrentMap<Class<?>, zzeiv<?>> zziiw = new ConcurrentHashMap();
    private final zzeiy zziiv = new zzehq();

    public static zzeio zzbhg() {
        return zziiu;
    }

    public final <T> zzeiv<T> zzh(Class<T> cls) {
        zzegr.zza(cls, "messageType");
        zzeiv<T> zzeivVar = (zzeiv<T>) this.zziiw.get(cls);
        if (zzeivVar == null) {
            zzeiv<T> zzg = this.zziiv.zzg(cls);
            zzegr.zza(cls, "messageType");
            zzegr.zza(zzg, "schema");
            zzeiv<T> zzeivVar2 = (zzeiv<T>) this.zziiw.putIfAbsent(cls, zzg);
            return zzeivVar2 != null ? zzeivVar2 : zzg;
        }
        return zzeivVar;
    }

    public final <T> zzeiv<T> zzaw(T t) {
        return zzh(t.getClass());
    }

    private zzeio() {
    }
}
