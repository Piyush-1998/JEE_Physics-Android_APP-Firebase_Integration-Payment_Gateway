package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzgc extends zzgm {
    private List<Long> zzabg;

    public zzgc(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2) {
        super(zzexVar, str, str2, c0008zza, i, 31);
        this.zzabg = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        this.zzabc.zzq(-1L);
        this.zzabc.zzr(-1L);
        if (this.zzabg == null) {
            this.zzabg = (List) this.zzabm.invoke(null, this.zzwg.getContext());
        }
        List<Long> list = this.zzabg;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzabc) {
            this.zzabc.zzq(this.zzabg.get(0).longValue());
            this.zzabc.zzr(this.zzabg.get(1).longValue());
        }
    }
}
