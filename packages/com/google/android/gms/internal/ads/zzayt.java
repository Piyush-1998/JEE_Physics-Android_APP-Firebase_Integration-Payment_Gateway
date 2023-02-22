package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzayt extends zzayq {
    @Override // com.google.android.gms.internal.ads.zzayq, com.google.android.gms.internal.ads.zzaym
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    @Override // com.google.android.gms.internal.ads.zzaym
    public final ViewGroup.LayoutParams zzxt() {
        return new ViewGroup.LayoutParams(-1, -1);
    }
}
