package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zznp {
    public static final zznp zzbgq = new zznp(new zznq[0]);
    public final int length;
    private int zzahr;
    private final zznq[] zzbgr;

    public zznp(zznq... zznqVarArr) {
        this.zzbgr = zznqVarArr;
        this.length = zznqVarArr.length;
    }

    public final zznq zzbd(int i) {
        return this.zzbgr[i];
    }

    public final int zza(zznq zznqVar) {
        for (int i = 0; i < this.length; i++) {
            if (this.zzbgr[i] == zznqVar) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        if (this.zzahr == 0) {
            this.zzahr = Arrays.hashCode(this.zzbgr);
        }
        return this.zzahr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznp zznpVar = (zznp) obj;
            if (this.length == zznpVar.length && Arrays.equals(this.zzbgr, zznpVar.zzbgr)) {
                return true;
            }
        }
        return false;
    }
}
