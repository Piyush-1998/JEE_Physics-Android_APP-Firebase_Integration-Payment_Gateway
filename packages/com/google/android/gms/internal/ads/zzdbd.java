package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbd implements zzden<zzdba> {
    private final zzdvw zzgay;
    private final Context zzvr;

    public zzdbd(zzdvw zzdvwVar, Context context) {
        this.zzgay = zzdvwVar;
        this.zzvr = context;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdba> zzaqs() {
        return this.zzgay.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdbc
            private final zzdbd zzgtj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgtj = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgtj.zzaqx();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdba zzaqx() throws Exception {
        double d;
        Intent registerReceiver = this.zzvr.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            Double.isNaN(intExtra2);
            Double.isNaN(intExtra3);
            d = intExtra2 / intExtra3;
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzdba(d, z);
    }
}
