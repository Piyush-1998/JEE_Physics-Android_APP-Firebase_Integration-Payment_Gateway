package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdtw<E> extends zzdtn<E> {
    static final zzdtw<Object> zzhnu = new zzdtw<>(new Object[0], 0, null, 0, 0);
    private final transient int mask;
    private final transient int size;
    private final transient int zzahr;
    private final transient Object[] zzhnv;
    private final transient Object[] zzhnw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtw(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.zzhnv = objArr;
        this.zzhnw = objArr2;
        this.mask = i2;
        this.zzahr = i;
        this.size = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final int zzawp() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final boolean zzaws() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final boolean zzawy() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.zzhnw;
        if (obj == null || objArr == null) {
            return false;
        }
        int zzel = zzdtc.zzel(obj == null ? 0 : obj.hashCode());
        while (true) {
            int i = zzel & this.mask;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzel = i + 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdub<E> zzawn() {
        return (zzdub) zzawr().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final Object[] zzawo() {
        return this.zzhnv;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    final int zzawq() {
        return this.size;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public final int zza(Object[] objArr, int i) {
        System.arraycopy(this.zzhnv, 0, objArr, i, this.size);
        return i + this.size;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn
    final zzdtg<E> zzawz() {
        return zzdtg.zzb(this.zzhnv, this.size);
    }

    @Override // com.google.android.gms.internal.ads.zzdtn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzahr;
    }

    @Override // com.google.android.gms.internal.ads.zzdtn, com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
