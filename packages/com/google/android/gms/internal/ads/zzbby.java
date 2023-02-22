package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbby {
    public static void zza(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        new zzbcb(view, onGlobalLayoutListener).attach();
    }

    public static void zza(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        new zzbca(view, onScrollChangedListener).attach();
    }
}
