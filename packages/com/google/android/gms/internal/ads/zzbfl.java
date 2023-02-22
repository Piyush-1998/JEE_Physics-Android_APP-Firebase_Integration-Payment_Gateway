package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbfl implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsResult zzelr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfl(JsResult jsResult) {
        this.zzelr = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzelr.cancel();
    }
}
