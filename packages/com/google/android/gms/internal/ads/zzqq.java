package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzqq implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long zzbre = ((Long) zzwe.zzpu().zzd(zzaat.zzcpk)).longValue();
    private final Context zzaai;
    private final PowerManager zzaaj;
    private final KeyguardManager zzaak;
    private WeakReference<ViewTreeObserver> zzaam;
    private final WindowManager zzbrf;
    private BroadcastReceiver zzbrg;
    private WeakReference<View> zzbrh;
    private zzqt zzbri;
    private final Rect zzbrm;
    private final DisplayMetrics zzxd;
    private Application zzyh;
    private zzbaj zzbrj = new zzbaj(zzbre);
    private boolean zzbrk = false;
    private int zzaaq = -1;
    private final HashSet<zzqu> zzbrl = new HashSet<>();

    public zzqq(Context context, View view) {
        this.zzaai = context.getApplicationContext();
        this.zzbrf = (WindowManager) context.getSystemService("window");
        this.zzaaj = (PowerManager) this.zzaai.getSystemService("power");
        this.zzaak = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.zzaai;
        if (context2 instanceof Application) {
            this.zzyh = (Application) context2;
            this.zzbri = new zzqt((Application) this.zzaai, this);
        }
        this.zzxd = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzbrm = rect;
        rect.right = this.zzbrf.getDefaultDisplay().getWidth();
        this.zzbrm.bottom = this.zzbrf.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.zzbrh;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzg(view2);
        }
        this.zzbrh = new WeakReference<>(view);
        if (view != null) {
            if (com.google.android.gms.ads.internal.zzp.zzkr().isAttachedToWindow(view)) {
                zzf(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final void zza(zzqu zzquVar) {
        this.zzbrl.add(zzquVar);
        zzbu(3);
    }

    public final void zzb(zzqu zzquVar) {
        this.zzbrl.remove(zzquVar);
    }

    private final void zzct() {
        zzayh.zzeaj.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzqp
            private final zzqq zzbrd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzbrd = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzbrd.zzlv();
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzaaq = -1;
        zzf(view);
        zzbu(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzaaq = -1;
        zzbu(3);
        zzct();
        zzg(view);
    }

    private final void zza(Activity activity, int i) {
        Window window;
        if (this.zzbrh == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = this.zzbrh.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.zzaaq = i;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(activity, 0);
        zzbu(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(activity, 0);
        zzbu(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zza(activity, 0);
        zzbu(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zza(activity, 4);
        zzbu(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzbu(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzbu(3);
        zzct();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzbu(3);
        zzct();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzbu(2);
        zzct();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzbu(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzbu(int i) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        List<Rect> emptyList;
        if (this.zzbrl.size() == 0 || (weakReference = this.zzbrh) == null) {
            return;
        }
        View view = weakReference.get();
        boolean z3 = i == 1;
        boolean z4 = view == null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view.getLocalVisibleRect(rect3);
            view.getHitRect(rect4);
            try {
                view.getLocationOnScreen(iArr);
                view.getLocationInWindow(iArr2);
            } catch (Exception e) {
                zzaxy.zzc("Failure getting view location.", e);
            }
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = rect.left + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            z = false;
            z2 = false;
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpn)).booleanValue() && view != null) {
            emptyList = zzi(view);
        } else {
            emptyList = Collections.emptyList();
        }
        List<Rect> list = emptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i2 = this.zzaaq;
        if (i2 != -1) {
            windowVisibility = i2;
        }
        boolean z5 = !z4 && com.google.android.gms.ads.internal.zzp.zzkp().zza(view, this.zzaaj, this.zzaak) && z && z2 && windowVisibility == 0;
        if (z3 && !this.zzbrj.tryAcquire() && z5 == this.zzbrk) {
            return;
        }
        if (z5 || this.zzbrk || i != 1) {
            zzqr zzqrVar = new zzqr(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime(), this.zzaaj.isScreenOn(), view != null && com.google.android.gms.ads.internal.zzp.zzkr().isAttachedToWindow(view), view != null ? view.getWindowVisibility() : 8, zza(this.zzbrm), zza(rect), zza(rect2), z, zza(rect3), z2, zza(rect4), this.zzxd.density, z5, list);
            Iterator<zzqu> it = this.zzbrl.iterator();
            while (it.hasNext()) {
                it.next().zza(zzqrVar);
            }
            this.zzbrk = z5;
        }
    }

    private final Rect zza(Rect rect) {
        return new Rect(zzbv(rect.left), zzbv(rect.top), zzbv(rect.right), zzbv(rect.bottom));
    }

    private final int zzbv(int i) {
        return (int) (i / this.zzxd.density);
    }

    private final List<Rect> zzi(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(zza(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    private final void zzf(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzaam = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zzbrg == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zzbrg = new zzqs(this);
            com.google.android.gms.ads.internal.zzp.zzlk().zza(this.zzaai, this.zzbrg, intentFilter);
        }
        Application application = this.zzyh;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzbri);
            } catch (Exception e) {
                zzaxy.zzc("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzg(View view) {
        try {
            if (this.zzaam != null) {
                ViewTreeObserver viewTreeObserver = this.zzaam.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzaam = null;
            }
        } catch (Exception e) {
            zzaxy.zzc("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            zzaxy.zzc("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zzbrg != null) {
            try {
                com.google.android.gms.ads.internal.zzp.zzlk().zza(this.zzaai, this.zzbrg);
            } catch (IllegalStateException e3) {
                zzaxy.zzc("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzp.zzkt().zza(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zzbrg = null;
        }
        Application application = this.zzyh;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzbri);
            } catch (Exception e5) {
                zzaxy.zzc("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    public final void zzen(long j) {
        this.zzbrj.zzfb(j);
    }

    public final void zzlu() {
        this.zzbrj.zzfb(zzbre);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzlv() {
        zzbu(3);
    }
}
