package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzejr implements ListIterator<String> {
    private final /* synthetic */ int zzhoy;
    private ListIterator<String> zziki;
    private final /* synthetic */ zzejs zzikj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejr(zzejs zzejsVar, int i) {
        zzehk zzehkVar;
        this.zzikj = zzejsVar;
        this.zzhoy = i;
        zzehkVar = this.zzikj.zzikk;
        this.zziki = zzehkVar.listIterator(this.zzhoy);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.zziki.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zziki.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zziki.nextIndex();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zziki.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zziki.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.zziki.next();
    }
}
