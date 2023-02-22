package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzega extends zzeez<Double> implements zzeha<Double>, zzeil, RandomAccess {
    private static final zzega zzici;
    private int size;
    private double[] zzicj;

    zzega() {
        this(new double[10], 0);
    }

    private zzega(double[] dArr, int i) {
        this.zzicj = dArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbdh();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzicj;
        System.arraycopy(dArr, i2, dArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzega)) {
            return super.equals(obj);
        }
        zzega zzegaVar = (zzega) obj;
        if (this.size != zzegaVar.size) {
            return false;
        }
        double[] dArr = zzegaVar.zzicj;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.zzicj[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzegr.zzfr(Double.doubleToLongBits(this.zzicj[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.zzicj[i] == doubleValue) {
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

    public final void zzd(double d) {
        zzbdh();
        int i = this.size;
        double[] dArr = this.zzicj;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zzicj = dArr2;
        }
        double[] dArr3 = this.zzicj;
        int i2 = this.size;
        this.size = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zzbdh();
        zzegr.checkNotNull(collection);
        if (!(collection instanceof zzega)) {
            return super.addAll(collection);
        }
        zzega zzegaVar = (zzega) collection;
        int i = zzegaVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.zzicj;
        if (i3 > dArr.length) {
            this.zzicj = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(zzegaVar.zzicj, 0, this.zzicj, this.size, zzegaVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbdh();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzicj[i]))) {
                double[] dArr = this.zzicj;
                System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
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
        double doubleValue = ((Double) obj).doubleValue();
        zzbdh();
        zzfr(i);
        double[] dArr = this.zzicj;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzbdh();
        zzfr(i);
        double[] dArr = this.zzicj;
        double d = dArr[i];
        if (i < this.size - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zzbdh();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfs(i));
        }
        double[] dArr = this.zzicj;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzicj, i, dArr2, i + 1, this.size - i);
            this.zzicj = dArr2;
        }
        this.zzicj[i] = doubleValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzd(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final /* synthetic */ zzeha<Double> zzft(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzega(Arrays.copyOf(this.zzicj, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzfr(i);
        return Double.valueOf(this.zzicj[i]);
    }

    static {
        zzega zzegaVar = new zzega(new double[0], 0);
        zzici = zzegaVar;
        zzegaVar.zzbdg();
    }
}
