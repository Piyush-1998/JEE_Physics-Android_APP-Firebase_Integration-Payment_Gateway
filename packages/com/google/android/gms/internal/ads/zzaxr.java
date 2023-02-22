package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxr {
    private final String zzdyz;
    private final zzaya zzdza;
    private long zzdyu = -1;
    private long zzdyv = -1;
    private int zzdyw = -1;
    int zzdyx = -1;
    private long zzdyy = 0;
    private final Object lock = new Object();
    private int zzdzb = 0;
    private int zzdzc = 0;

    public zzaxr(String str, zzaya zzayaVar) {
        this.zzdyz = str;
        this.zzdza = zzayaVar;
    }

    public final void zzwa() {
        synchronized (this.lock) {
            this.zzdzb++;
        }
    }

    public final void zzvz() {
        synchronized (this.lock) {
            this.zzdzc++;
        }
    }

    public final void zza(zzvc zzvcVar, long j) {
        synchronized (this.lock) {
            long zzxf = this.zzdza.zzxf();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
            if (this.zzdyv == -1) {
                if (currentTimeMillis - zzxf > ((Long) zzwe.zzpu().zzd(zzaat.zzcof)).longValue()) {
                    this.zzdyx = -1;
                } else {
                    this.zzdyx = this.zzdza.zzxg();
                }
                this.zzdyv = j;
                this.zzdyu = j;
            } else {
                this.zzdyu = j;
            }
            if (zzvcVar == null || zzvcVar.extras == null || zzvcVar.extras.getInt("gw", 2) != 1) {
                this.zzdyw++;
                int i = this.zzdyx + 1;
                this.zzdyx = i;
                if (i == 0) {
                    this.zzdyy = 0L;
                    this.zzdza.zzfa(currentTimeMillis);
                } else {
                    this.zzdyy = currentTimeMillis - this.zzdza.zzxh();
                }
            }
        }
    }

    public final Bundle zzp(Context context, String str) {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("session_id", this.zzdyz);
            bundle.putLong("basets", this.zzdyv);
            bundle.putLong("currts", this.zzdyu);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzdyw);
            bundle.putInt("preqs_in_session", this.zzdyx);
            bundle.putLong("time_in_session", this.zzdyy);
            bundle.putInt("pclick", this.zzdzb);
            bundle.putInt("pimp", this.zzdzc);
            bundle.putBoolean("support_transparent_background", zzan(context));
        }
        return bundle;
    }

    private static boolean zzan(Context context) {
        Context zzab = zzatg.zzab(context);
        int identifier = zzab.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            zzaxy.zzfd("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == zzab.getPackageManager().getActivityInfo(new ComponentName(zzab.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                return true;
            }
            zzaxy.zzfd("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            zzaxy.zzfe("Fail to fetch AdActivity theme");
            zzaxy.zzfd("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
