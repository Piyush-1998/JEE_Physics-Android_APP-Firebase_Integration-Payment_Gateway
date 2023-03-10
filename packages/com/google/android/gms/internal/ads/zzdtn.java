package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdtn<E> extends zzdtf<E> implements Set<E> {
    @NullableDecl
    private transient zzdtg<E> zzhnj;

    public static <E> zzdtn<E> zzad(E e) {
        return new zzdty(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzv(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    boolean zzawy() {
        return false;
    }

    @SafeVarargs
    public static <E> zzdtn<E> zza(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        zzdsv.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return zza(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> zzdtn<E> zza(int i, Object... objArr) {
        while (i != 0) {
            if (i == 1) {
                return zzad(objArr[0]);
            }
            int zzen = zzen(i);
            Object[] objArr2 = new Object[zzen];
            int i2 = zzen - 1;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                Object zzd = zzdtr.zzd(objArr[i5], i5);
                int hashCode = zzd.hashCode();
                int zzel = zzdtc.zzel(hashCode);
                while (true) {
                    int i6 = zzel & i2;
                    Object obj = objArr2[i6];
                    if (obj == null) {
                        objArr[i4] = zzd;
                        objArr2[i6] = zzd;
                        i3 += hashCode;
                        i4++;
                        break;
                    } else if (!obj.equals(zzd)) {
                        zzel++;
                    }
                }
            }
            Arrays.fill(objArr, i4, i, (Object) null);
            if (i4 == 1) {
                return new zzdty(objArr[0], i3);
            }
            if (zzen(i4) >= zzen / 2) {
                if (zzv(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzdtw(objArr, i3, objArr2, i2, i4);
            }
            i = i4;
        }
        return zzdtw.zzhnu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzen(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d = highestOneBit;
                Double.isNaN(d);
                if (d * 0.7d >= max) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            zzdsv.checkArgument(max < 1073741824, "collection too large");
            return 1073741824;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdtn) && zzawy() && ((zzdtn) obj).zzawy() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzdtz.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzdtz.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzdtf
    public zzdtg<E> zzawr() {
        zzdtg<E> zzdtgVar = this.zzhnj;
        if (zzdtgVar == null) {
            zzdtg<E> zzawz = zzawz();
            this.zzhnj = zzawz;
            return zzawz;
        }
        return zzdtgVar;
    }

    zzdtg<E> zzawz() {
        return zzdtg.zzc(toArray());
    }

    public static <E> zzdtm<E> zzeo(int i) {
        zzdta.zzh(i, "expectedSize");
        return new zzdtm<>(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdtf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
