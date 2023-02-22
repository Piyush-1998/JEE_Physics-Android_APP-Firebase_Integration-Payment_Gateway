package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbfm implements DialogInterface.OnCancelListener {
    private final /* synthetic */ JsPromptResult zzels;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfm(JsPromptResult jsPromptResult) {
        this.zzels = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzels.cancel();
    }
}
