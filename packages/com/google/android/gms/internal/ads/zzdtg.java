package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdtg<E> extends zzdtf<E> implements List<E>, RandomAccess {
    private static final zzdua<Object> zzhnb = new zzdti(zzdtq.zzhnm, 0);

    public static <E> zzdtg<E> zzawt() {
        return (zzdtg<E>) zzdtq.zzhnm;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdtg<E> zzawr() {
        return this;
    }

    public static <E> zzdtg<E> zzac(E e) {
        Object[] objArr = {e};
        for (int i = 0; i <= 0; i++) {
            zzdtr.zzd(objArr[0], 0);
        }
        return zzb(objArr, 1);
    }

    public static <E> zzdtg<E> zzh(Iterable<? extends E> iterable) {
        zzdsv.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection instanceof zzdtf) {
                zzdtg<E> zzawr = ((zzdtf) collection).zzawr();
                if (zzawr.zzaws()) {
                    Object[] array = zzawr.toArray();
                    return zzb(array, array.length);
                }
                return zzawr;
            }
            Object[] array2 = collection.toArray();
            int length = array2.length;
            for (int i = 0; i < length; i++) {
                zzdtr.zzd(array2[i], i);
            }
            return zzb(array2, array2.length);
        }
        Iterator<? extends E> it = iterable.iterator();
        if (!it.hasNext()) {
            return (zzdtg<E>) zzdtq.zzhnm;
        }
        E next = it.next();
        if (!it.hasNext()) {
            return zzac(next);
        }
        zzdtj zzdtjVar = (zzdtj) ((zzdtj) new zzdtj().zzab(next)).zza(it);
        zzdtjVar.zzhmz = true;
        return zzb(zzdtjVar.zzhmy, zzdtjVar.size);
    }

    public static <E> zzdtg<E> zzb(E[] eArr) {
        if (eArr.length == 0) {
            return (zzdtg<E>) zzdtq.zzhnm;
        }
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            zzdtr.zzd(objArr[i], i);
        }
        return zzb(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> zzdtg<E> zzc(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> zzdtg<E> zzb(Object[] objArr, int i) {
        if (i == 0) {
            return (zzdtg<E>) zzdtq.zzhnm;
        }
        return new zzdtq(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public final zzdub<E> zzawn() {
        return (zzdua) listIterator();
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (this instanceof RandomAccess) {
            int size = size();
            int i = 0;
            if (obj == null) {
                while (i < size) {
                    if (get(i) == null) {
                        return i;
                    }
                    i++;
                }
            } else {
                while (i < size) {
                    if (obj.equals(get(i))) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        ListIterator<E> listIterator = listIterator();
        while (listIterator.hasNext()) {
            if (zzdss.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        if (!(this instanceof RandomAccess)) {
            ListIterator<E> listIterator = listIterator(size());
            while (listIterator.hasPrevious()) {
                if (zzdss.equal(obj, listIterator.previous())) {
                    return listIterator.nextIndex();
                }
            }
            return -1;
        }
        if (obj == null) {
            for (int size = size() - 1; size >= 0; size--) {
                if (get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = size() - 1; size2 >= 0; size2--) {
                if (obj.equals(get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List
    /* renamed from: zzu */
    public zzdtg<E> subList(int i, int i2) {
        zzdsv.zzf(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return (zzdtg<E>) zzdtq.zzhnm;
        }
        return new zzdtl(this, i, i3);
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzdtf
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        if (obj == zzdsv.checkNotNull(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if ((this instanceof RandomAccess) && (list instanceof RandomAccess)) {
                    for (int i = 0; i < size; i++) {
                        if (zzdss.equal(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                zzdtg<E> zzdtgVar = this;
                int size2 = zzdtgVar.size();
                Iterator<E> it = list.iterator();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e = zzdtgVar.get(i2);
                        i2++;
                        if (!zzdss.equal(e, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (((i * 31) + get(i2).hashCode()) ^ (-1)) ^ (-1);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i) {
        zzdsv.zzt(i, size());
        if (isEmpty()) {
            return zzhnb;
        }
        return new zzdti(this, i);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzdua) listIterator(0);
    }
}
