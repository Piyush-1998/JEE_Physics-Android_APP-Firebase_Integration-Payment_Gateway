package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaxk {
    private zzbbg zzbpa;
    private zzqn zzdxx;
    private zzdvt<ArrayList<String>> zzdye;
    private Context zzvr;
    private final Object lock = new Object();
    private final zzayd zzdxy = new zzayd();
    private final zzaxv zzdxp = new zzaxv(zzwe.zzpv(), this.zzdxy);
    private boolean zzzh = false;
    private zzaba zzdxz = null;
    private Boolean zzdya = null;
    private final AtomicInteger zzdyb = new AtomicInteger(0);
    private final zzaxp zzdyc = new zzaxp(null);
    private final Object zzdyd = new Object();

    public final zzaba zzwd() {
        zzaba zzabaVar;
        synchronized (this.lock) {
            zzabaVar = this.zzdxz;
        }
        return zzabaVar;
    }

    public final void zza(Boolean bool) {
        synchronized (this.lock) {
            this.zzdya = bool;
        }
    }

    public final Boolean zzwe() {
        Boolean bool;
        synchronized (this.lock) {
            bool = this.zzdya;
        }
        return bool;
    }

    public final void zzwf() {
        this.zzdyc.zzwf();
    }

    public final void zzd(Context context, zzbbg zzbbgVar) {
        synchronized (this.lock) {
            if (!this.zzzh) {
                this.zzvr = context.getApplicationContext();
                this.zzbpa = zzbbgVar;
                com.google.android.gms.ads.internal.zzp.zzks().zza(this.zzdxp);
                zzaba zzabaVar = null;
                this.zzdxy.zza(this.zzvr, (String) null, true);
                zzaro.zzc(this.zzvr, this.zzbpa);
                this.zzdxx = new zzqn(context.getApplicationContext(), this.zzbpa);
                com.google.android.gms.ads.internal.zzp.zzky();
                if (!zzach.zzczv.get().booleanValue()) {
                    zzaxy.zzei("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                } else {
                    zzabaVar = new zzaba();
                }
                this.zzdxz = zzabaVar;
                if (zzabaVar != null) {
                    zzbbm.zza(new zzaxm(this).zzwv(), "AppState.registerCsiReporter");
                }
                this.zzzh = true;
                zzwk();
            }
        }
        com.google.android.gms.ads.internal.zzp.zzkp().zzs(context, zzbbgVar.zzbra);
    }

    public final Resources getResources() {
        if (this.zzbpa.zzeds) {
            return this.zzvr.getResources();
        }
        try {
            zzbbc.zzbt(this.zzvr).getResources();
            return null;
        } catch (zzbbe e) {
            zzaxy.zzd("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zza(Throwable th, String str) {
        zzaro.zzc(this.zzvr, this.zzbpa).zza(th, str);
    }

    public final void zzb(Throwable th, String str) {
        zzaro.zzc(this.zzvr, this.zzbpa).zza(th, str, zzact.zzdbn.get().floatValue());
    }

    public final void zzwg() {
        this.zzdyb.incrementAndGet();
    }

    public final void zzwh() {
        this.zzdyb.decrementAndGet();
    }

    public final int zzwi() {
        return this.zzdyb.get();
    }

    public final zzaya zzwj() {
        zzayd zzaydVar;
        synchronized (this.lock) {
            zzaydVar = this.zzdxy;
        }
        return zzaydVar;
    }

    public final Context getApplicationContext() {
        return this.zzvr;
    }

    public final zzdvt<ArrayList<String>> zzwk() {
        if (PlatformVersion.isAtLeastJellyBean() && this.zzvr != null) {
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcqq)).booleanValue()) {
                synchronized (this.zzdyd) {
                    if (this.zzdye != null) {
                        return this.zzdye;
                    }
                    zzdvt<ArrayList<String>> zze = zzbbi.zzedu.zze(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzaxn
                        private final zzaxk zzdyn;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdyn = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzdyn.zzwm();
                        }
                    });
                    this.zzdye = zze;
                    return zze;
                }
            }
        }
        return zzdvl.zzaf(new ArrayList());
    }

    private static ArrayList<String> zzam(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(context.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final zzaxv zzwl() {
        return this.zzdxp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzwm() throws Exception {
        return zzam(zzatg.zzab(this.zzvr));
    }
}
