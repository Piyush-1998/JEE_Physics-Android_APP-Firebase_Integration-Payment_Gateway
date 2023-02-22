package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzrg {
    private final Object zzbsv = new Object();
    private zzrf zzbsw = null;
    private boolean zzbsx = false;

    public final void initialize(Context context) {
        synchronized (this.zzbsv) {
            if (!this.zzbsx) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzaxy.zzfe("Can not cast Context to Application");
                    return;
                }
                if (this.zzbsw == null) {
                    this.zzbsw = new zzrf();
                }
                this.zzbsw.zza(application, context);
                this.zzbsx = true;
            }
        }
    }

    public final void zza(zzrh zzrhVar) {
        synchronized (this.zzbsv) {
            if (this.zzbsw == null) {
                this.zzbsw = new zzrf();
            }
            this.zzbsw.zza(zzrhVar);
        }
    }

    public final void zzb(zzrh zzrhVar) {
        synchronized (this.zzbsv) {
            if (this.zzbsw == null) {
                return;
            }
            this.zzbsw.zzb(zzrhVar);
        }
    }

    public final Activity getActivity() {
        synchronized (this.zzbsv) {
            if (this.zzbsw != null) {
                return this.zzbsw.getActivity();
            }
            return null;
        }
    }

    public final Context getContext() {
        synchronized (this.zzbsv) {
            if (this.zzbsw != null) {
                return this.zzbsw.getContext();
            }
            return null;
        }
    }
}
