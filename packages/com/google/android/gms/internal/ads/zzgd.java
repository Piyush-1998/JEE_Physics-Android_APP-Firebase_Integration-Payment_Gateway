package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzgd extends zzgm {
    public zzgd(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.zzabc) {
            zzey zzeyVar = new zzey((String) this.zzabm.invoke(null, new Object[0]));
            this.zzabc.zzac(zzeyVar.zzzi.longValue());
            this.zzabc.zzad(zzeyVar.zzzj.longValue());
        }
    }
}
