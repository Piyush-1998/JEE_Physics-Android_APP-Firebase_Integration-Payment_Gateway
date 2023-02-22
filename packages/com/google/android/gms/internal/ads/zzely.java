package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzely<T> implements zzelx<T> {
    private static final Object zzira = new Object();
    private volatile Object zzecl = zzira;
    private volatile zzelx<T> zzirb;

    private zzely(zzelx<T> zzelxVar) {
        this.zzirb = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final T get() {
        T t = (T) this.zzecl;
        if (t == zzira) {
            zzelx<T> zzelxVar = this.zzirb;
            if (zzelxVar == null) {
                return (T) this.zzecl;
            }
            T t2 = zzelxVar.get();
            this.zzecl = t2;
            this.zzirb = null;
            return t2;
        }
        return t;
    }

    public static <P extends zzelx<T>, T> zzelx<T> zzas(P p) {
        return ((p instanceof zzely) || (p instanceof zzell)) ? p : new zzely((zzelx) zzelu.checkNotNull(p));
    }
}
