package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdt implements Runnable {
    private final /* synthetic */ zzdu zzwf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdt(zzdu zzduVar) {
        this.zzwf = zzduVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzex zzexVar;
        ConditionVariable conditionVariable2;
        if (this.zzwf.zzwj != null) {
            return;
        }
        conditionVariable = zzdu.zzwh;
        synchronized (conditionVariable) {
            if (this.zzwf.zzwj != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = zzaat.zzcqi.get().booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzexVar = this.zzwf.zzwg;
                    zzdu.zzwi = new zztt(zzexVar.zzvr, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zzwf.zzwj = Boolean.valueOf(z2);
            conditionVariable2 = zzdu.zzwh;
            conditionVariable2.open();
        }
    }
}
