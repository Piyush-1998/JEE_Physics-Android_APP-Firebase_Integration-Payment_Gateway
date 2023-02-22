package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdth<E> {
    public abstract zzdth<E> zzab(E e);

    public zzdth<E> zzg(Iterable<? extends E> iterable) {
        for (E e : iterable) {
            zzab(e);
        }
        return this;
    }

    public zzdth<E> zza(Iterator<? extends E> it) {
        while (it.hasNext()) {
            zzab(it.next());
        }
        return this;
    }
}
