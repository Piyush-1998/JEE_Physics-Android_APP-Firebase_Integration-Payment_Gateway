package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
abstract class zzejn<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b, int i, zzeff zzeffVar);

    abstract void zza(B b, int i, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t, zzekk zzekkVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzeip zzeipVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzaj(Object obj);

    abstract T zzar(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzat(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzax(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzay(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzaz(T t);

    abstract void zzb(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzbhy();

    abstract void zzc(B b, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(T t, zzekk zzekkVar) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzi(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzj(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzk(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b, zzeip zzeipVar) throws IOException {
        int tag = zzeipVar.getTag();
        int i = tag >>> 3;
        int i2 = tag & 7;
        if (i2 == 0) {
            zza((zzejn<T, B>) b, i, zzeipVar.zzbdv());
            return true;
        } else if (i2 == 1) {
            zzb(b, i, zzeipVar.zzbdx());
            return true;
        } else if (i2 == 2) {
            zza((zzejn<T, B>) b, i, zzeipVar.zzbeb());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzc(b, i, zzeipVar.zzbdy());
                    return true;
                }
                throw zzegz.zzbgg();
            }
            return false;
        } else {
            B zzbhy = zzbhy();
            int i3 = 4 | (i << 3);
            while (zzeipVar.zzber() != Integer.MAX_VALUE && zza((zzejn<T, B>) zzbhy, zzeipVar)) {
            }
            if (i3 != zzeipVar.getTag()) {
                throw zzegz.zzbgf();
            }
            zza((zzejn<T, B>) b, i, (int) zzar(zzbhy));
            return true;
        }
    }
}
