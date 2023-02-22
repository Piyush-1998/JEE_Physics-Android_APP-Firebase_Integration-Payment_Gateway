package com.google.android.gms.internal.ads;

import java.lang.Throwable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzduj<V, X extends Throwable> extends zzduh<V, X, zzdsl<? super X, ? extends V>, V> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduj(zzdvt<? extends V> zzdvtVar, Class<X> cls, zzdsl<? super X, ? extends V> zzdslVar) {
        super(zzdvtVar, cls, zzdslVar);
    }

    @Override // com.google.android.gms.internal.ads.zzduh
    final void setResult(@NullableDecl V v) {
        set(v);
    }

    @Override // com.google.android.gms.internal.ads.zzduh
    @NullableDecl
    final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        return ((zzdsl) obj).apply(th);
    }
}
