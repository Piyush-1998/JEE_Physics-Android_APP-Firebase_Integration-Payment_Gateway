package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbaq {
    private final View view;
    private boolean zzbro;
    private boolean zzbvt;
    private Activity zzecv;
    private boolean zzecw;
    private ViewTreeObserver.OnGlobalLayoutListener zzecx;
    private ViewTreeObserver.OnScrollChangedListener zzecy = null;

    public zzbaq(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzecv = activity;
        this.view = view;
        this.zzecx = onGlobalLayoutListener;
    }

    public final void zzh(Activity activity) {
        this.zzecv = activity;
    }

    public final void zzyi() {
        this.zzbvt = true;
        if (this.zzbro) {
            zzyk();
        }
    }

    public final void zzyj() {
        this.zzbvt = false;
        zzyl();
    }

    public final void onAttachedToWindow() {
        this.zzbro = true;
        if (this.zzbvt) {
            zzyk();
        }
    }

    public final void onDetachedFromWindow() {
        this.zzbro = false;
        zzyl();
    }

    private final void zzyk() {
        ViewTreeObserver zzi;
        if (this.zzecw) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzecx;
        if (onGlobalLayoutListener != null) {
            Activity activity = this.zzecv;
            if (activity != null && (zzi = zzi(activity)) != null) {
                zzi.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            com.google.android.gms.ads.internal.zzp.zzlm();
            zzbby.zza(this.view, this.zzecx);
        }
        this.zzecw = true;
    }

    private final void zzyl() {
        ViewTreeObserver zzi;
        Activity activity = this.zzecv;
        if (activity != null && this.zzecw) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzecx;
            if (onGlobalLayoutListener != null && (zzi = zzi(activity)) != null) {
                com.google.android.gms.ads.internal.zzp.zzkr();
                zzi.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzecw = false;
        }
    }

    private static ViewTreeObserver zzi(Activity activity) {
        Window window;
        View decorView;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }
}
