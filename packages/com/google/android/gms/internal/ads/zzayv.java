package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzayv extends zzays {
    @Override // com.google.android.gms.internal.ads.zzaym
    public final boolean zza(Activity activity, Configuration configuration) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzctg)).booleanValue()) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcti)).booleanValue()) {
                return activity.isInMultiWindowMode();
            }
            zzwe.zzpq();
            int zzc = zzbat.zzc(activity, configuration.screenHeightDp);
            int zzc2 = zzbat.zzc(activity, configuration.screenWidthDp);
            com.google.android.gms.ads.internal.zzp.zzkp();
            DisplayMetrics zza = zzayh.zza((WindowManager) activity.getApplicationContext().getSystemService("window"));
            int i = zza.heightPixels;
            int i2 = zza.widthPixels;
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
            double d = activity.getResources().getDisplayMetrics().density;
            Double.isNaN(d);
            int round = ((int) Math.round(d + 0.5d)) * ((Integer) zzwe.zzpu().zzd(zzaat.zzctf)).intValue();
            return !(zze(i, zzc + dimensionPixelSize, round) && zze(i2, zzc2, round));
        }
        return false;
    }

    private static boolean zze(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }
}
