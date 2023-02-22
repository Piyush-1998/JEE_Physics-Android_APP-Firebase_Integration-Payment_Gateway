package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbfo implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsPromptResult zzels;
    private final /* synthetic */ EditText zzelt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfo(JsPromptResult jsPromptResult, EditText editText) {
        this.zzels = jsPromptResult;
        this.zzelt = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzels.confirm(this.zzelt.getText().toString());
    }
}
