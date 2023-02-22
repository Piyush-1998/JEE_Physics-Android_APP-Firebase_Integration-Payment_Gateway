package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public enum zzehb {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzeff.class, zzeff.class, zzeff.zzibd),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzigz;
    private final Class<?> zziha;
    private final Object zzihb;

    zzehb(Class cls, Class cls2, Object obj) {
        this.zzigz = cls;
        this.zziha = cls2;
        this.zzihb = obj;
    }

    public final Class<?> zzbgk() {
        return this.zziha;
    }
}
