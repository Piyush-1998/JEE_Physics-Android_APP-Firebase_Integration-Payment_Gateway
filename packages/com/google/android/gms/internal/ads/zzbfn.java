package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbfn implements DialogInterface.OnClickListener {
    private final /* synthetic */ JsResult zzelr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbfn(JsResult jsResult) {
        this.zzelr = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzelr.confirm();
    }
}
