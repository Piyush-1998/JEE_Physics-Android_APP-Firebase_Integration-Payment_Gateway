package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzhk {
    public final int index;
    private final zzhx[] zzael;
    private final zzog zzaem;
    public final zzmx zzafi;
    public final Object zzafj;
    public final zznm[] zzafk;
    private final boolean[] zzafl;
    public final long zzafm;
    public int zzafn;
    public long zzafo;
    public boolean zzafp;
    public boolean zzafq;
    public boolean zzafr;
    public zzhk zzafs;
    public zzoi zzaft;
    private final zzhw[] zzafu;
    private final zzhs zzafv;
    private final zzmz zzafw;
    private zzoi zzafx;

    public zzhk(zzhx[] zzhxVarArr, zzhw[] zzhwVarArr, long j, zzog zzogVar, zzhs zzhsVar, zzmz zzmzVar, Object obj, int i, int i2, boolean z, long j2) {
        this.zzael = zzhxVarArr;
        this.zzafu = zzhwVarArr;
        this.zzafm = j;
        this.zzaem = zzogVar;
        this.zzafv = zzhsVar;
        this.zzafw = zzmzVar;
        this.zzafj = zzoz.checkNotNull(obj);
        this.index = i;
        this.zzafn = i2;
        this.zzafp = z;
        this.zzafo = j2;
        this.zzafk = new zznm[zzhxVarArr.length];
        this.zzafl = new boolean[zzhxVarArr.length];
        this.zzafi = zzmzVar.zza(i2, zzhsVar.zzfb());
    }

    public final long zzen() {
        return this.zzafm - this.zzafo;
    }

    public final void zzc(int i, boolean z) {
        this.zzafn = i;
        this.zzafp = z;
    }

    public final boolean zzeo() {
        if (this.zzafq) {
            return !this.zzafr || this.zzafi.zzhp() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzep() throws com.google.android.gms.internal.ads.zzhd {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzog r0 = r6.zzaem
            com.google.android.gms.internal.ads.zzhw[] r1 = r6.zzafu
            com.google.android.gms.internal.ads.zzmx r2 = r6.zzafi
            com.google.android.gms.internal.ads.zznp r2 = r2.zzhm()
            com.google.android.gms.internal.ads.zzoi r0 = r0.zza(r1, r2)
            com.google.android.gms.internal.ads.zzoi r1 = r6.zzafx
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            goto L28
        L16:
            r4 = 0
        L17:
            com.google.android.gms.internal.ads.zzod r5 = r0.zzbht
            int r5 = r5.length
            if (r4 >= r5) goto L27
            boolean r5 = r0.zza(r1, r4)
            if (r5 != 0) goto L24
            goto L14
        L24:
            int r4 = r4 + 1
            goto L17
        L27:
            r1 = 1
        L28:
            if (r1 == 0) goto L2b
            return r3
        L2b:
            r6.zzaft = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhk.zzep():boolean");
    }

    public final long zzb(long j, boolean z) {
        return zza(j, false, new boolean[this.zzael.length]);
    }

    public final long zza(long j, boolean z, boolean[] zArr) {
        zzod zzodVar = this.zzaft.zzbht;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzodVar.length) {
                break;
            }
            boolean[] zArr2 = this.zzafl;
            if (z || !this.zzaft.zza(this.zzafx, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zza = this.zzafi.zza(zzodVar.zzik(), this.zzafl, this.zzafk, zArr, j);
        this.zzafx = this.zzaft;
        this.zzafr = false;
        int i2 = 0;
        while (true) {
            zznm[] zznmVarArr = this.zzafk;
            if (i2 < zznmVarArr.length) {
                if (zznmVarArr[i2] != null) {
                    zzoz.checkState(zzodVar.zzbg(i2) != null);
                    this.zzafr = true;
                } else {
                    zzoz.checkState(zzodVar.zzbg(i2) == null);
                }
                i2++;
            } else {
                this.zzafv.zza(this.zzael, this.zzaft.zzbhs, zzodVar);
                return zza;
            }
        }
    }

    public final void release() {
        try {
            this.zzafw.zzb(this.zzafi);
        } catch (RuntimeException e) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e);
        }
    }
}
