package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzga extends zzgm {
    public zzga(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        zzek zzekVar = new zzek((String) this.zzabm.invoke(null, this.zzwg.getContext(), Boolean.valueOf(((Boolean) zzwe.zzpu().zzd(zzaat.zzcqp)).booleanValue())));
        synchronized (this.zzabc) {
            this.zzabc.zze(zzekVar.zzyk);
            this.zzabc.zzag(zzekVar.zzyl);
        }
    }
}
