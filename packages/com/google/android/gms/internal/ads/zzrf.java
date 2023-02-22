package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzrf implements Application.ActivityLifecycleCallbacks {
    private Activity zzaas;
    private Runnable zzbst;
    private long zzbsu;
    private Context zzvr;
    private final Object lock = new Object();
    private boolean foreground = true;
    private boolean zzbsq = false;
    private final List<zzrh> zzbsr = new ArrayList();
    private final List<zzrw> zzbss = new ArrayList();
    private boolean zzzh = false;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzzh) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            setActivity((Activity) context);
        }
        this.zzvr = application;
        this.zzbsu = ((Long) zzwe.zzpu().zzd(zzaat.zzcoe)).longValue();
        this.zzzh = true;
    }

    public final void zza(zzrh zzrhVar) {
        synchronized (this.lock) {
            this.zzbsr.add(zzrhVar);
        }
    }

    public final void zzb(zzrh zzrhVar) {
        synchronized (this.lock) {
            this.zzbsr.remove(zzrhVar);
        }
    }

    public final Activity getActivity() {
        return this.zzaas;
    }

    public final Context getContext() {
        return this.zzvr;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        setActivity(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        setActivity(activity);
        this.zzbsq = false;
        boolean z = !this.foreground;
        this.foreground = true;
        if (this.zzbst != null) {
            zzayh.zzeaj.removeCallbacks(this.zzbst);
        }
        synchronized (this.lock) {
            for (zzrw zzrwVar : this.zzbss) {
                try {
                    zzrwVar.onActivityResumed(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbbd.zzc("", e);
                }
            }
            if (z) {
                for (zzrh zzrhVar : this.zzbsr) {
                    try {
                        zzrhVar.zzp(true);
                    } catch (Exception e2) {
                        zzbbd.zzc("", e2);
                    }
                }
            } else {
                zzaxy.zzef("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        setActivity(activity);
        synchronized (this.lock) {
            for (zzrw zzrwVar : this.zzbss) {
                try {
                    zzrwVar.onActivityPaused(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbbd.zzc("", e);
                }
            }
        }
        this.zzbsq = true;
        if (this.zzbst != null) {
            zzayh.zzeaj.removeCallbacks(this.zzbst);
        }
        zzdsf zzdsfVar = zzayh.zzeaj;
        zzri zzriVar = new zzri(this);
        this.zzbst = zzriVar;
        zzdsfVar.postDelayed(zzriVar, this.zzbsu);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.lock) {
            if (this.zzaas == null) {
                return;
            }
            if (this.zzaas.equals(activity)) {
                this.zzaas = null;
            }
            Iterator<zzrw> it = this.zzbss.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().zza(activity)) {
                        it.remove();
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    zzbbd.zzc("", e);
                }
            }
        }
    }

    private final void setActivity(Activity activity) {
        synchronized (this.lock) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zzaas = activity;
            }
        }
    }
}
