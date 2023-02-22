package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.PlatformVersion;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcix {
    private PopupWindow zzgdr;
    private Context zzvr;

    public final void zzc(Context context, View view) {
        if (!PlatformVersion.isAtLeastKitKat() || PlatformVersion.isAtLeastLollipop()) {
            return;
        }
        PopupWindow zzd = zzd(context, view);
        this.zzgdr = zzd;
        if (zzd == null) {
            context = null;
        }
        this.zzvr = context;
    }

    public final void zzanp() {
        Context context = this.zzvr;
        if (context == null || this.zzgdr == null) {
            return;
        }
        if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
            this.zzvr = null;
            this.zzgdr = null;
            return;
        }
        if (this.zzgdr.isShowing()) {
            this.zzgdr.dismiss();
        }
        this.zzvr = null;
        this.zzgdr = null;
    }

    private static PopupWindow zzd(Context context, View view) {
        Window window = context instanceof Activity ? ((Activity) context).getWindow() : null;
        if (window == null || window.getDecorView() == null || ((Activity) context).isDestroyed()) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(view, -1, -1);
        PopupWindow popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        zzaxy.zzef("Displaying the 1x1 popup off the screen.");
        try {
            popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
            return popupWindow;
        } catch (Exception unused) {
            return null;
        }
    }
}
