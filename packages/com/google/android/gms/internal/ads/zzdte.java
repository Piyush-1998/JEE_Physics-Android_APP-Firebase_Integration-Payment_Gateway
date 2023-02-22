package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
class zzdte<E> extends zzdth<E> {
    int size;
    Object[] zzhmy;
    boolean zzhmz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdte(int i) {
        zzdta.zzh(i, "initialCapacity");
        this.zzhmy = new Object[i];
        this.size = 0;
    }

    private final void zzem(int i) {
        Object[] objArr = this.zzhmy;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                i2 = Integer.highestOneBit(i - 1) << 1;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.zzhmy = Arrays.copyOf(objArr, i2);
            this.zzhmz = false;
        } else if (this.zzhmz) {
            this.zzhmy = (Object[]) objArr.clone();
            this.zzhmz = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdth
    /* renamed from: zzaa */
    public zzdte<E> zzab(E e) {
        zzdsv.checkNotNull(e);
        zzem(this.size + 1);
        Object[] objArr = this.zzhmy;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = e;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdth
    public zzdth<E> zzg(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzem(this.size + collection.size());
            if (collection instanceof zzdtf) {
                this.size = ((zzdtf) collection).zza(this.zzhmy, this.size);
                return this;
            }
        }
        super.zzg(iterable);
        return this;
    }
}
