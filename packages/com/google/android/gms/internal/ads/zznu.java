package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zznu implements zzob {
    private final int length;
    private int zzahr;
    private final zzho[] zzbfk;
    private final zznq zzbgs;
    private final int[] zzbgt;
    private final long[] zzbgu;

    public zznu(zznq zznqVar, int... iArr) {
        int i = 0;
        zzoz.checkState(iArr.length > 0);
        this.zzbgs = (zznq) zzoz.checkNotNull(zznqVar);
        int length = iArr.length;
        this.length = length;
        this.zzbfk = new zzho[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzbfk[i2] = zznqVar.zzbe(iArr[i2]);
        }
        Arrays.sort(this.zzbfk, new zznw());
        this.zzbgt = new int[this.length];
        while (true) {
            int i3 = this.length;
            if (i < i3) {
                this.zzbgt[i] = zznqVar.zzh(this.zzbfk[i]);
                i++;
            } else {
                this.zzbgu = new long[i3];
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final zznq zzij() {
        return this.zzbgs;
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final int length() {
        return this.zzbgt.length;
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final zzho zzbe(int i) {
        return this.zzbfk[i];
    }

    @Override // com.google.android.gms.internal.ads.zzob
    public final int zzbf(int i) {
        return this.zzbgt[0];
    }

    public int hashCode() {
        if (this.zzahr == 0) {
            this.zzahr = (System.identityHashCode(this.zzbgs) * 31) + Arrays.hashCode(this.zzbgt);
        }
        return this.zzahr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznu zznuVar = (zznu) obj;
            if (this.zzbgs == zznuVar.zzbgs && Arrays.equals(this.zzbgt, zznuVar.zzbgt)) {
                return true;
            }
        }
        return false;
    }
}
