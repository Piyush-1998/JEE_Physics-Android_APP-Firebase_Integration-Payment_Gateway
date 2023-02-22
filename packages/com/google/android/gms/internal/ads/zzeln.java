package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeln<T> implements zzeli<T>, zzelo<T> {
    private static final zzeln<Object> zzird = new zzeln<>(null);
    private final T zzecl;

    public static <T> zzelo<T> zzba(T t) {
        return new zzeln(zzelu.zza(t, "instance cannot be null"));
    }

    public static <T> zzelo<T> zzbb(T t) {
        if (t == null) {
            return zzird;
        }
        return new zzeln(t);
    }

    private zzeln(T t) {
        this.zzecl = t;
    }

    @Override // com.google.android.gms.internal.ads.zzeli, com.google.android.gms.internal.ads.zzelx
    public final T get() {
        return this.zzecl;
    }
}
