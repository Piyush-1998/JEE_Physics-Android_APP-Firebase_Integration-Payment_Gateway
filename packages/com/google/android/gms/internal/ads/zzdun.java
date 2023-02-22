package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdun<I, O> extends zzduk<I, O, zzduv<? super I, ? extends O>, zzdvt<? extends O>> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdun(zzdvt<? extends I> zzdvtVar, zzduv<? super I, ? extends O> zzduvVar) {
        super(zzdvtVar, zzduvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    final /* synthetic */ void setResult(Object obj) {
        setFuture((zzdvt) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    final /* synthetic */ Object zzd(Object obj, @NullableDecl Object obj2) throws Exception {
        zzduv zzduvVar = (zzduv) obj;
        zzdvt<O> zzf = zzduvVar.zzf(obj2);
        zzdsv.zza(zzf, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzduvVar);
        return zzf;
    }
}
