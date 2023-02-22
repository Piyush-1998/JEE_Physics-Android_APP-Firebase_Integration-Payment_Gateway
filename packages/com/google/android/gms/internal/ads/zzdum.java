package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdum<I, O> extends zzduk<I, O, zzdsl<? super I, ? extends O>, O> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdum(zzdvt<? extends I> zzdvtVar, zzdsl<? super I, ? extends O> zzdslVar) {
        super(zzdvtVar, zzdslVar);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    final void setResult(@NullableDecl O o) {
        set(o);
    }

    @Override // com.google.android.gms.internal.ads.zzduk
    @NullableDecl
    final /* synthetic */ Object zzd(Object obj, @NullableDecl Object obj2) throws Exception {
        return ((zzdsl) obj).apply(obj2);
    }
}
