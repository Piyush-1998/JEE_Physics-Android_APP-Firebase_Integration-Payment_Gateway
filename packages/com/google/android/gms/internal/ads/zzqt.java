package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzqt implements Application.ActivityLifecycleCallbacks {
    private final Application zzyh;
    private final WeakReference<Application.ActivityLifecycleCallbacks> zzyi;
    private boolean zzyj = false;

    public zzqt(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzyi = new WeakReference<>(activityLifecycleCallbacks);
        this.zzyh = application;
    }

    private final void zza(zzrb zzrbVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.zzyi.get();
            if (activityLifecycleCallbacks != null) {
                zzrbVar.zza(activityLifecycleCallbacks);
            } else if (this.zzyj) {
            } else {
                this.zzyh.unregisterActivityLifecycleCallbacks(this);
                this.zzyj = true;
            }
        } catch (Exception e) {
            zzaxy.zzc("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzqw(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(new zzqv(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(new zzqy(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(new zzqx(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(new zzra(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzqz(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(new zzrc(this, activity));
    }
}
