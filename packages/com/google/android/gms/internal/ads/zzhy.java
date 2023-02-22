package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzhy {
    public static final zzhy zzahz = new zzib();

    public abstract zzia zza(int i, zzia zziaVar, boolean z);

    public abstract zzid zza(int i, zzid zzidVar, boolean z, long j);

    public abstract int zzc(Object obj);

    public abstract int zzfd();

    public abstract int zzfe();

    public final boolean isEmpty() {
        return zzfd() == 0;
    }

    public final zzid zza(int i, zzid zzidVar, boolean z) {
        return zza(i, zzidVar, false, 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((zzfd() - 1) == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(int r3, com.google.android.gms.internal.ads.zzia r4, com.google.android.gms.internal.ads.zzid r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.zza(r3, r4, r0)
            r2.zza(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.zzfd()
            int r6 = r6 - r4
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = 0
            goto L2a
        L22:
            int r6 = r2.zzfd()
            int r6 = r6 - r4
            if (r6 != 0) goto L2a
            r4 = -1
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.zza(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhy.zza(int, com.google.android.gms.internal.ads.zzia, com.google.android.gms.internal.ads.zzid, int):int");
    }
}
