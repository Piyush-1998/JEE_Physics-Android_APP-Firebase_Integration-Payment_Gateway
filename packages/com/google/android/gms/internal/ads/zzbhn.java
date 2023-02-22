package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbhn implements View.OnAttachStateChangeListener {
    private final /* synthetic */ zzavu zzemm;
    private final /* synthetic */ zzbhi zzepq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbhn(zzbhi zzbhiVar, zzavu zzavuVar) {
        this.zzepq = zzbhiVar;
        this.zzemm = zzavuVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzepq.zza(view, this.zzemm, 10);
    }
}
