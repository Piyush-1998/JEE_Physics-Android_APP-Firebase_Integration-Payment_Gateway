package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzgg extends zzgm {
    private long zzaar;
    private final zzfi zzxn;

    public zzgg(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2, zzfi zzfiVar) {
        super(zzexVar, str, str2, c0008zza, i, 53);
        this.zzxn = zzfiVar;
        if (zzfiVar != null) {
            this.zzaar = zzfiVar.zzcu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (this.zzxn != null) {
            this.zzabc.zzae(((Long) this.zzabm.invoke(null, Long.valueOf(this.zzaar))).longValue());
        }
    }
}
