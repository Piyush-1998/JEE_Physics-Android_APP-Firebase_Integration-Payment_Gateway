package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfs extends zzgm {
    private long startTime;

    public zzfs(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, long j, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 25);
        this.startTime = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzabm.invoke(null, new Object[0])).longValue();
        synchronized (this.zzabc) {
            this.zzabc.zzak(longValue);
            if (this.startTime != 0) {
                this.zzabc.zzm(longValue - this.startTime);
                this.zzabc.zzp(this.startTime);
            }
        }
    }
}
