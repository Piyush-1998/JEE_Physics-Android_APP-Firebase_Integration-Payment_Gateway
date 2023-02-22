package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzegs extends zzeez<Integer> implements zzegv, zzeil, RandomAccess {
    private static final zzegs zzigm;
    private int size;
    private int[] zzign;

    public static zzegs zzbga() {
        return zzigm;
    }

    zzegs() {
        this(new int[10], 0);
    }

    private zzegs(int[] iArr, int i) {
        this.zzign = iArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbdh();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.zzign;
        System.arraycopy(iArr, i2, iArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzegs)) {
            return super.equals(obj);
        }
        zzegs zzegsVar = (zzegs) obj;
        if (this.size != zzegsVar.size) {
            return false;
        }
        int[] iArr = zzegsVar.zzign;
        for (int i = 0; i < this.size; i++) {
            if (this.zzign[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzign[i2];
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    /* renamed from: zzhb */
    public final zzegv zzft(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzegs(Arrays.copyOf(this.zzign, i), this.size);
    }

    public final int getInt(int i) {
        zzfr(i);
        return this.zzign[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int intValue = ((Integer) obj).intValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.zzign[i] == intValue) {
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

    @Override // com.google.android.gms.internal.ads.zzegv
    public final void zzhc(int i) {
        zzbdh();
        int i2 = this.size;
        int[] iArr = this.zzign;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zzign = iArr2;
        }
        int[] iArr3 = this.zzign;
        int i3 = this.size;
        this.size = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zzbdh();
        zzegr.checkNotNull(collection);
        if (!(collection instanceof zzegs)) {
            return super.addAll(collection);
        }
        zzegs zzegsVar = (zzegs) collection;
        int i = zzegsVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.zzign;
        if (i3 > iArr.length) {
            this.zzign = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(zzegsVar.zzign, 0, this.zzign, this.size, zzegsVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbdh();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzign[i]))) {
                int[] iArr = this.zzign;
                System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
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
        int intValue = ((Integer) obj).intValue();
        zzbdh();
        zzfr(i);
        int[] iArr = this.zzign;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzbdh();
        zzfr(i);
        int[] iArr = this.zzign;
        int i3 = iArr[i];
        if (i < this.size - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zzbdh();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfs(i));
        }
        int[] iArr = this.zzign;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzign, i, iArr2, i + 1, this.size - i);
            this.zzign = iArr2;
        }
        this.zzign[i] = intValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzhc(((Integer) obj).intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzegs zzegsVar = new zzegs(new int[0], 0);
        zzigm = zzegsVar;
        zzegsVar.zzbdg();
    }
}
