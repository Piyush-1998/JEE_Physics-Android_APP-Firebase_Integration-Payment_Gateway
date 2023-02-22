package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdtm<E> extends zzdte<E> {
    private int zzahr;
    @NullableDecl
    private Object[] zzhni;

    public zzdtm() {
        super(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtm(int i) {
        super(i);
        this.zzhni = new Object[zzdtn.zzen(i)];
    }

    public final zzdtn<E> zzawx() {
        zzdtn<E> zza;
        boolean zzv;
        int i = this.size;
        if (i != 0) {
            if (i == 1) {
                return zzdtn.zzad(this.zzhmy[0]);
            }
            if (this.zzhni != null && zzdtn.zzen(this.size) == this.zzhni.length) {
                zzv = zzdtn.zzv(this.size, this.zzhmy.length);
                Object[] copyOf = zzv ? Arrays.copyOf(this.zzhmy, this.size) : this.zzhmy;
                int i2 = this.zzahr;
                Object[] objArr = this.zzhni;
                zza = new zzdtw<>(copyOf, i2, objArr, objArr.length - 1, this.size);
            } else {
                zza = zzdtn.zza(this.size, this.zzhmy);
                this.size = zza.size();
            }
            this.zzhmz = true;
            this.zzhni = null;
            return zza;
        }
        return zzdtw.zzhnu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdte, com.google.android.gms.internal.ads.zzdth
    public final /* synthetic */ zzdth zzg(Iterable iterable) {
        zzdsv.checkNotNull(iterable);
        if (this.zzhni != null) {
            for (Object obj : iterable) {
                zzab(obj);
            }
        } else {
            super.zzg(iterable);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdte
    public final /* synthetic */ zzdte zzaa(Object obj) {
        return (zzdtm) zzab(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdth
    public final /* synthetic */ zzdth zza(Iterator it) {
        zzdsv.checkNotNull(it);
        while (it.hasNext()) {
            zzab(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdte, com.google.android.gms.internal.ads.zzdth
    public final /* synthetic */ zzdth zzab(Object obj) {
        zzdsv.checkNotNull(obj);
        if (this.zzhni != null) {
            int zzen = zzdtn.zzen(this.size);
            Object[] objArr = this.zzhni;
            if (zzen <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zzel = zzdtc.zzel(hashCode);
                while (true) {
                    int i = zzel & length;
                    Object[] objArr2 = this.zzhni;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zzahr += hashCode;
                        super.zzab(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zzel = i + 1;
                    }
                }
                return this;
            }
        }
        this.zzhni = null;
        super.zzab(obj);
        return this;
    }
}
