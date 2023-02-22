package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzgi extends zzgm {
    public zzgi(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzabc.zza(zzcn.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.zzabm.invoke(null, this.zzwg.getContext())).booleanValue();
        synchronized (this.zzabc) {
            if (booleanValue) {
                this.zzabc.zza(zzcn.ENUM_TRUE);
            } else {
                this.zzabc.zza(zzcn.ENUM_FALSE);
            }
        }
    }
}
