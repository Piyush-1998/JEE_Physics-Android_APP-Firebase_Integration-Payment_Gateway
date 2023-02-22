package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzmo implements zznl {
    private final zznl[] zzbef;

    public zzmo(zznl[] zznlVarArr) {
        this.zzbef = zznlVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final long zzhn() {
        long j = Long.MAX_VALUE;
        for (zznl zznlVar : this.zzbef) {
            long zzhn = zznlVar.zzhn();
            if (zzhn != Long.MIN_VALUE) {
                j = Math.min(j, zzhn);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final boolean zzef(long j) {
        zznl[] zznlVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzhn = zzhn();
            if (zzhn == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zznl zznlVar : this.zzbef) {
                if (zznlVar.zzhn() == zzhn) {
                    z |= zznlVar.zzef(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
