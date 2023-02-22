package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzayx extends zzayu {
    @Override // com.google.android.gms.internal.ads.zzaym
    public final void zzg(final Activity activity) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcon)).booleanValue() && com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxk() == null && !activity.isInMultiWindowMode()) {
            zza(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, activity) { // from class: com.google.android.gms.internal.ads.zzayw
                private final zzayx zzeaq;
                private final Activity zzear;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeaq = this;
                    this.zzear = activity;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzayx.zza(this.zzear, view, windowInsets);
                }
            });
        }
    }

    private static void zza(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = z ? 1 : 2;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ WindowInsets zza(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxk() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzaya zzwj = com.google.android.gms.ads.internal.zzp.zzkt().zzwj();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(format);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                zzwj.zzem(str);
            } else {
                com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzem("");
            }
        }
        zza(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }
}
