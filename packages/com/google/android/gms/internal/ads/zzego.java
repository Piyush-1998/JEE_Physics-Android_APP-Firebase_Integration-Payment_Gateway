package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzego extends zzeez<Float> implements zzeha<Float>, zzeil, RandomAccess {
    private static final zzego zzifm;
    private int size;
    private float[] zzifn;

    zzego() {
        this(new float[10], 0);
    }

    private zzego(float[] fArr, int i) {
        this.zzifn = fArr;
        this.size = i;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        zzbdh();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzifn;
        System.arraycopy(fArr, i2, fArr, i, this.size - i2);
        this.size -= i2 - i;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzego)) {
            return super.equals(obj);
        }
        zzego zzegoVar = (zzego) obj;
        if (this.size != zzegoVar.size) {
            return false;
        }
        float[] fArr = zzegoVar.zzifn;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zzifn[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzifn[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            int size = size();
            for (int i = 0; i < size; i++) {
                if (this.zzifn[i] == floatValue) {
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

    public final void zzh(float f) {
        zzbdh();
        int i = this.size;
        float[] fArr = this.zzifn;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.zzifn = fArr2;
        }
        float[] fArr3 = this.zzifn;
        int i2 = this.size;
        this.size = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        zzbdh();
        zzegr.checkNotNull(collection);
        if (!(collection instanceof zzego)) {
            return super.addAll(collection);
        }
        zzego zzegoVar = (zzego) collection;
        int i = zzegoVar.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.zzifn;
        if (i3 > fArr.length) {
            this.zzifn = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zzegoVar.zzifn, 0, this.zzifn, this.size, zzegoVar.size);
        this.size = i3;
        this.modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zzbdh();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzifn[i]))) {
                float[] fArr = this.zzifn;
                System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
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
        float floatValue = ((Float) obj).floatValue();
        zzbdh();
        zzfr(i);
        float[] fArr = this.zzifn;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        zzbdh();
        zzfr(i);
        float[] fArr = this.zzifn;
        float f = fArr[i];
        if (i < this.size - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f);
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zzbdh();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzfs(i));
        }
        float[] fArr = this.zzifn;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzifn, i, fArr2, i + 1, this.size - i);
            this.zzifn = fArr2;
        }
        this.zzifn[i] = floatValue;
        this.size++;
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzeez, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzeha
    public final /* synthetic */ zzeha<Float> zzft(int i) {
        if (i < this.size) {
            throw new IllegalArgumentException();
        }
        return new zzego(Arrays.copyOf(this.zzifn, i), this.size);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzfr(i);
        return Float.valueOf(this.zzifn[i]);
    }

    static {
        zzego zzegoVar = new zzego(new float[0], 0);
        zzifm = zzegoVar;
        zzegoVar.zzbdg();
    }
}
