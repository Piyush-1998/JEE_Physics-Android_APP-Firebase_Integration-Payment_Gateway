package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzell<T> implements zzeli<T>, zzelx<T> {
    private static final Object zzira = new Object();
    private volatile Object zzecl = zzira;
    private volatile zzelx<T> zzirb;

    private zzell(zzelx<T> zzelxVar) {
        this.zzirb = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeli, com.google.android.gms.internal.ads.zzelx
    public final T get() {
        T t = (T) this.zzecl;
        if (t == zzira) {
            synchronized (this) {
                t = this.zzecl;
                if (t == zzira) {
                    t = this.zzirb.get();
                    Object obj = this.zzecl;
                    if (((obj == zzira || (obj instanceof zzelr)) ? false : true) && obj != t) {
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.zzecl = t;
                    this.zzirb = null;
                }
            }
        }
        return t;
    }

    public static <P extends zzelx<T>, T> zzelx<T> zzas(P p) {
        zzelu.checkNotNull(p);
        return p instanceof zzell ? p : new zzell(p);
    }

    public static <P extends zzelx<T>, T> zzeli<T> zzat(P p) {
        if (p instanceof zzeli) {
            return (zzeli) p;
        }
        return new zzell((zzelx) zzelu.checkNotNull(p));
    }
}
