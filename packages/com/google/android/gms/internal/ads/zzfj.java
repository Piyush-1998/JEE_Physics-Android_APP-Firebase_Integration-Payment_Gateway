package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfj extends zzgm {
    private final Activity zzaas;
    private final View zzaat;

    public zzfj(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2, View view, Activity activity) {
        super(zzexVar, str, str2, c0008zza, i, 62);
        this.zzaat = view;
        this.zzaas = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (this.zzaat == null) {
            return;
        }
        boolean booleanValue = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcqm)).booleanValue();
        Object[] objArr = (Object[]) this.zzabm.invoke(null, this.zzaat, this.zzaas, Boolean.valueOf(booleanValue));
        synchronized (this.zzabc) {
            this.zzabc.zzai(((Long) objArr[0]).longValue());
            this.zzabc.zzaj(((Long) objArr[1]).longValue());
            if (booleanValue) {
                this.zzabc.zzab((String) objArr[2]);
            }
        }
    }
}
