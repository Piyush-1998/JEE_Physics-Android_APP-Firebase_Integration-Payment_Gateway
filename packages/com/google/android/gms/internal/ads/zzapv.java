package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzapv implements View.OnClickListener {
    private final /* synthetic */ zzapw zzdmh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapv(zzapw zzapwVar) {
        this.zzdmh = zzapwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zzdmh.zzac(true);
    }
}
