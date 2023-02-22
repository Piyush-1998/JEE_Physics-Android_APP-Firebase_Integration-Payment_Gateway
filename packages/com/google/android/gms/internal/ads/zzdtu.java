package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
final class zzdtu<K> extends zzdtn<K> {
    private final transient zzdtg<K> zzhnc;
    private final transient zzdtk<K, ?> zzhno;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtu(zzdtk<K, ?> zzdtkVar, zzdtg<K> zzdtgVar) {
        this.zzhno = zzdtkVar;
        this.zzhnc = zzdtgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final boolean zzaws() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdub<K> zzawn() {
        return (zzdub) zzawr().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final int zza(Object[] objArr, int i) {
        return zzawr().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdtn, com.google.android.gms.internal.ads.zzdtf
    public final zzdtg<K> zzawr() {
        return this.zzhnc;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return this.zzhno.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzhno.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdtn, com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
