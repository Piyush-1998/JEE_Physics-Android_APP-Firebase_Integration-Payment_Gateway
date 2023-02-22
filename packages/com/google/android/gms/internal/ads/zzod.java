package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzod {
    public final int length;
    private int zzahr;
    private final zzob[] zzbhq;

    public zzod(zzob... zzobVarArr) {
        this.zzbhq = zzobVarArr;
        this.length = zzobVarArr.length;
    }

    public final zzob zzbg(int i) {
        return this.zzbhq[i];
    }

    public final zzob[] zzik() {
        return (zzob[]) this.zzbhq.clone();
    }

    public final int hashCode() {
        if (this.zzahr == 0) {
            this.zzahr = Arrays.hashCode(this.zzbhq) + 527;
        }
        return this.zzahr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.zzbhq, ((zzod) obj).zzbhq);
    }
}
