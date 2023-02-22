package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
final class zzdtp extends zzdub<T> {
    private boolean zzhnk;
    private final /* synthetic */ Object zzhnl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtp(Object obj) {
        this.zzhnl = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzhnk;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @Override // java.util.Iterator
    public final T next() {
        if (this.zzhnk) {
            throw new NoSuchElementException();
        }
        this.zzhnk = true;
        return this.zzhnl;
    }
}
