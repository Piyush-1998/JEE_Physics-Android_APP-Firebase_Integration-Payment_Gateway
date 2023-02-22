package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzgh extends zzgm {
    private final View zzaat;

    public zzgh(zzex zzexVar, String str, String str2, zzcf.zza.C0008zza c0008zza, int i, int i2, View view) {
        super(zzexVar, str, str2, c0008zza, i, 57);
        this.zzaat = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgm
    protected final void zzcw() throws IllegalAccessException, InvocationTargetException {
        if (this.zzaat != null) {
            Boolean bool = (Boolean) zzwe.zzpu().zzd(zzaat.zzcrb);
            zzff zzffVar = new zzff((String) this.zzabm.invoke(null, this.zzaat, this.zzwg.getContext().getResources().getDisplayMetrics(), bool));
            zzcf.zza.zzf.C0010zza zzax = zzcf.zza.zzf.zzax();
            zzax.zzcy(zzffVar.zzaab.longValue()).zzcz(zzffVar.zzaac.longValue()).zzda(zzffVar.zzaad.longValue());
            if (bool.booleanValue()) {
                zzax.zzdb(zzffVar.zzaae.longValue());
            }
            this.zzabc.zza((zzcf.zza.zzf) ((zzegp) zzax.zzbfx()));
        }
    }
}
