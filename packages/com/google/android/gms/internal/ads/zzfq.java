package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfq extends zzgm {
    public zzfq(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzabc.zzf(-1L);
        this.zzabc.zzg(-1L);
        int[] iArr = (int[]) this.zzabm.invoke(null, this.zzwg.getContext());
        synchronized (this.zzabc) {
            this.zzabc.zzf(iArr[0]);
            this.zzabc.zzg(iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.zzabc.zzaf(iArr[2]);
            }
        }
    }
}
