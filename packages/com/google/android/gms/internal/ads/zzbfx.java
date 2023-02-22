package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbfx implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzavu zzemm;
    private final /* synthetic */ zzbft zzemo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfx(zzbft zzbftVar, zzavu zzavuVar) {
        this.zzemo = zzbftVar;
        this.zzemm = zzavuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzemo.zza(view, this.zzemm, 10);
    }
}
