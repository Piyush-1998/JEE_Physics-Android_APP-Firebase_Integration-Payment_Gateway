package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzazj implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzazg zzebi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazj(zzazg zzazgVar) {
        this.zzebi = zzazgVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzp.zzkp();
        zzayh.zza(this.zzebi.val$context, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
