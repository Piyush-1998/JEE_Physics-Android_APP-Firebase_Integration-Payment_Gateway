package com.google.android.gms.internal.ads;

import java.lang.Throwable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdug<V, X extends Throwable> extends zzduh<V, X, zzduv<? super X, ? extends V>, zzdvt<? extends V>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdug(zzdvt<? extends V> zzdvtVar, Class<X> cls, zzduv<? super X, ? extends V> zzduvVar) {
        super(zzdvtVar, cls, zzduvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzduh
    final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdvt) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzduh
    final /* synthetic */ Object zza(Object obj, Throwable th) throws Exception {
        zzduv zzduvVar = (zzduv) obj;
        zzdvt zzf = zzduvVar.zzf(th);
        zzdsv.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzduvVar);
        return zzf;
    }
}
