package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgo extends zzaiw implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzadf {
    private zzyg zzfxs;
    private View zzfxx;
    private zzcco zzfyz;
    private boolean zzeoa = false;
    private boolean zzgce = false;

    public zzcgo(zzcco zzccoVar, zzccv zzccvVar) {
        this.zzfxx = zzccvVar.zzalr();
        this.zzfxs = zzccvVar.getVideoController();
        this.zzfyz = zzccoVar;
        if (zzccvVar.zzals() != null) {
            zzccvVar.zzals().zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zza(IObjectWrapper iObjectWrapper, zzaiy zzaiyVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzeoa) {
            zzaxy.zzfc("Instream ad can not be shown after destroy().");
            zza(zzaiyVar, 2);
        } else if (this.zzfxx == null || this.zzfxs == null) {
            String str = this.zzfxx == null ? "can not get video view." : "can not get video controller.";
            zzaxy.zzfc(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            zza(zzaiyVar, 0);
        } else if (this.zzgce) {
            zzaxy.zzfc("Instream ad should not be used again.");
            zza(zzaiyVar, 1);
        } else {
            this.zzgce = true;
            zzanc();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zzfxx, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzp.zzlm();
            zzbby.zza(this.zzfxx, (ViewTreeObserver.OnGlobalLayoutListener) this);
            com.google.android.gms.ads.internal.zzp.zzlm();
            zzbby.zza(this.zzfxx, (ViewTreeObserver.OnScrollChangedListener) this);
            zzand();
            try {
                zzaiyVar.zzsy();
            } catch (RemoteException e) {
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zza(iObjectWrapper, new zzcgq(this));
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final zzyg getVideoController() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzeoa) {
            zzaxy.zzfc("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzfxs;
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final zzadr zzss() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzeoa) {
            zzaxy.zzfc("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzcco zzccoVar = this.zzfyz;
        if (zzccoVar == null || zzccoVar.zzalk() == null) {
            return null;
        }
        return this.zzfyz.zzalk().zzss();
    }

    @Override // com.google.android.gms.internal.ads.zzait
    public final void destroy() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzanc();
        zzcco zzccoVar = this.zzfyz;
        if (zzccoVar != null) {
            zzccoVar.destroy();
        }
        this.zzfyz = null;
        this.zzfxx = null;
        this.zzfxs = null;
        this.zzeoa = true;
    }

    private final void zzanc() {
        View view = this.zzfxx;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zzfxx);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzand();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzand();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzsc() {
        zzayh.zzeaj.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcgn
            private final zzcgo zzgcd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcd = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgcd.zzane();
            }
        });
    }

    private final void zzand() {
        View view;
        zzcco zzccoVar = this.zzfyz;
        if (zzccoVar == null || (view = this.zzfxx) == null) {
            return;
        }
        zzccoVar.zzb(view, Collections.emptyMap(), Collections.emptyMap(), zzcco.zzz(this.zzfxx));
    }

    private static void zza(zzaiy zzaiyVar, int i) {
        try {
            zzaiyVar.zzdc(i);
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzane() {
        try {
            destroy();
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
        }
    }
}
