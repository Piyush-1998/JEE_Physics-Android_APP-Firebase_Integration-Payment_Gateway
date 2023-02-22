package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzgb extends zzgm {
    private final boolean zzabf;

    public zzgb(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 61);
        this.zzabf = zzexVar.zzcb();
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zzabm.invoke(null, this.zzwg.getContext(), Boolean.valueOf(this.zzabf))).longValue();
        synchronized (this.zzabc) {
            this.zzabc.zzah(longValue);
        }
    }
}
