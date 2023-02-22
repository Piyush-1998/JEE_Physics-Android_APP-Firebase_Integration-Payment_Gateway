package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zznq {
    public final int length;
    private int zzahr;
    private final zzho[] zzbfk;

    public zznq(zzho... zzhoVarArr) {
        zzoz.checkState(zzhoVarArr.length > 0);
        this.zzbfk = zzhoVarArr;
        this.length = zzhoVarArr.length;
    }

    public final zzho zzbe(int i) {
        return this.zzbfk[i];
    }

    public final int zzh(zzho zzhoVar) {
        int i = 0;
        while (true) {
            zzho[] zzhoVarArr = this.zzbfk;
            if (i >= zzhoVarArr.length) {
                return -1;
            }
            if (zzhoVar == zzhoVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.zzahr == 0) {
            this.zzahr = Arrays.hashCode(this.zzbfk) + 527;
        }
        return this.zzahr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznq zznqVar = (zznq) obj;
            if (this.length == zznqVar.length && Arrays.equals(this.zzbfk, zznqVar.zzbfk)) {
                return true;
            }
        }
        return false;
    }
}
