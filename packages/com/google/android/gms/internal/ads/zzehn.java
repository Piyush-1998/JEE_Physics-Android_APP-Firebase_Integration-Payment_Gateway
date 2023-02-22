package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzehn extends zzeez<Long> implements zzegx, zzeil, RandomAccess {
    private static final zzehn zziho;
    private int size;
    private long[] zzihp;

    public static zzehn zzbgr() {
        return zziho;
    }

    zzehn() {
        this(new long[10], 0);
    }

    private zzehn(long[] jArr, int i) {
        this.zzihp = jArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbdh();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzihp;
        System.arraycopy(jArr, i2, jArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzehn)) {
            return super.equals(obj);
        }
        zzehn zzehnVar = (zzehn) obj;
        if (this.size != zzehnVar.size) {
            return false;
        }
        long[] jArr = zzehnVar.zzihp;
        for (int i = 0; i < this.size; i++) {
            if (this.zzihp[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzegr.zzfr(this.zzihp[i2]);
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    /* renamed from: zzhd */
    public final zzegx zzft(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzehn(Arrays.copyOf(this.zzihp, i), this.size);
    }

    public final long getLong(int i) {
        zzfr(i);
        return this.zzihp[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.zzihp[i] == longValue) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    public final void zzfs(long j) {
        zzbdh();
        int i = this.size;
        long[] jArr = this.zzihp;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zzihp = jArr2;
        }
        long[] jArr3 = this.zzihp;
        int i2 = this.size;
        this.size = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        zzbdh();
        zzegr.checkNotNull(collection);
        if (!(collection instanceof zzehn)) {
            return super.addAll(collection);
        }
        zzehn zzehnVar = (zzehn) collection;
        int i = zzehnVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.zzihp;
        if (i3 > jArr.length) {
            this.zzihp = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzehnVar.zzihp, 0, this.zzihp, this.size, zzehnVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbdh();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Long.valueOf(this.zzihp[i]))) {
                long[] jArr = this.zzihp;
                System.arraycopy(jArr, i + 1, jArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
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

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zzbdh();
        zzfr(i);
        long[] jArr = this.zzihp;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzbdh();
        zzfr(i);
        long[] jArr = this.zzihp;
        long j = jArr[i];
        if (i < this.size - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        zzbdh();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfs(i));
        }
        long[] jArr = this.zzihp;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.zzihp, i, jArr2, i + 1, this.size - i);
            this.zzihp = jArr2;
        }
        this.zzihp[i] = longValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzfs(((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(getLong(i));
    }

    static {
        zzehn zzehnVar = new zzehn(new long[0], 0);
        zziho = zzehnVar;
        zzehnVar.zzbdg();
    }
}
