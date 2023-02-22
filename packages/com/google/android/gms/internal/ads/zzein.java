package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzein<E> extends zzeez<E> implements RandomAccess {
    private static final zzein<Object> zziit;
    private int size;
    private E[] zzhnn;

    public static <E> zzein<E> zzbhf() {
        return (zzein<E>) zziit;
    }

    zzein() {
        this(new Object[10], 0);
    }

    private zzein(E[] eArr, int i) {
        this.zzhnn = eArr;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        zzbdh();
        int i = this.size;
        E[] eArr = this.zzhnn;
        if (i == eArr.length) {
            this.zzhnn = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.zzhnn;
        int i2 = this.size;
        this.size = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        zzbdh();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfs(i));
        }
        E[] eArr = this.zzhnn;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.zzhnn, i, eArr2, i + 1, this.size - i);
            this.zzhnn = eArr2;
        }
        this.zzhnn[i] = e;
        this.size++;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        zzfr(i);
        return this.zzhnn[i];
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        zzbdh();
        zzfr(i);
        E[] eArr = this.zzhnn;
        E e = eArr[i];
        if (i < this.size - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return e;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        zzbdh();
        zzfr(i);
        E[] eArr = this.zzhnn;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    private final void zzfr(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzfs(i));
        }
    }

    private final String zzfs(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final /* synthetic */ zzeha zzft(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzein(Arrays.copyOf(this.zzhnn, i), this.size);
    }

    static {
        zzein<Object> zzeinVar = new zzein<>(new Object[0], 0);
        zziit = zzeinVar;
        zzeinVar.zzbdg();
    }
}
