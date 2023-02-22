package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzejs extends AbstractList<String> implements zzehk, RandomAccess {
    private final zzehk zzikk;

    public zzejs(zzehk zzehkVar) {
        this.zzikk = zzehkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final zzehk zzbgo() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final Object zzhe(int i) {
        return this.zzikk.zzhe(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzikk.size();
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final void zzaj(zzeff zzeffVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new zzejr(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzeju(this);
    }

    @Override // com.google.android.gms.internal.ads.zzehk
    public final List<?> zzbgn() {
        return this.zzikk.zzbgn();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.zzikk.get(i);
    }
}
