package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzge extends zzgm {
    private final StackTraceElement[] zzabh;

    public zzge(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzexVar, str, str2, c0008zza, i, 45);
        this.zzabh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        zzcn zzcnVar;
        if (this.zzabh != null) {
            zzet zzetVar = new zzet((String) this.zzabm.invoke(null, this.zzabh));
            synchronized (this.zzabc) {
                this.zzabc.zzab(zzetVar.zzyn.longValue());
                if (zzetVar.zzyo.booleanValue()) {
                    zzcf.zza.C0008zza c0008zza = this.zzabc;
                    if (zzetVar.zzyp.booleanValue()) {
                        zzcnVar = zzcn.ENUM_FALSE;
                    } else {
                        zzcnVar = zzcn.ENUM_TRUE;
                    }
                    c0008zza.zzc(zzcnVar);
                } else {
                    this.zzabc.zzc(zzcn.ENUM_FAILURE);
                }
            }
        }
    }
}
