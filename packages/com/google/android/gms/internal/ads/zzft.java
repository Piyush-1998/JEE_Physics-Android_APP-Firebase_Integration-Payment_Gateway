package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzft extends zzgm {
    private static final Object zzaba = new Object();
    private static volatile Long zzabb;

    public zzft(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (zzabb == null) {
            synchronized (zzaba) {
                if (zzabb == null) {
                    zzabb = (Long) this.zzabm.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zzabc) {
            this.zzabc.zzo(zzabb.longValue());
        }
    }
}
