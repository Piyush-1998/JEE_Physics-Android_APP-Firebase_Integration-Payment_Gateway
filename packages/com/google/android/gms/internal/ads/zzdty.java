package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdty<E> extends zzdtn<E> {
    private final transient E zzhnx;
    private transient int zzhny;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdty(E e) {
        this.zzhnx = (E) zzdsv.checkNotNull(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final boolean zzaws() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdty(E e, int i) {
        this.zzhnx = e;
        this.zzhny = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zzhnx.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdub<E> zzawn() {
        return new zzdtp(this.zzhnx);
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final zzdtg<E> zzawz() {
        return zzdtg.zzac(this.zzhnx);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final int zza(Object[] objArr, int i) {
        objArr[i] = this.zzhnx;
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i = this.zzhny;
        if (i == 0) {
            int hashCode = this.zzhnx.hashCode();
            this.zzhny = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final boolean zzawy() {
        return this.zzhny != 0;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String obj = this.zzhnx.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdtn, com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
