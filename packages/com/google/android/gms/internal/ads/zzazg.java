package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzazg implements Runnable {
    final /* synthetic */ Context val$context;
    private final /* synthetic */ String zzebb;
    private final /* synthetic */ boolean zzebc;
    private final /* synthetic */ boolean zzebd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzazg(zzazh zzazhVar, Context context, String str, boolean z, boolean z2) {
        this.val$context = context;
        this.zzebb = str;
        this.zzebc = z;
        this.zzebd = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context);
        builder.setMessage(this.zzebb);
        if (this.zzebc) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.zzebd) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new zzazj(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
