package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfy extends zzgm {
    private long zzabe;

    public zzfy(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 12);
        this.zzabe = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzabc.zzi(-1L);
        this.zzabc.zzi(((Long) this.zzabm.invoke(null, this.zzwg.getContext())).longValue());
    }
}
