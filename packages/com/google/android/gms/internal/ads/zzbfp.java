package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbfp implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzels;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfp(JsPromptResult jsPromptResult) {
        this.zzels = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzels.cancel();
    }
}
