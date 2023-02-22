package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzapt implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapr zzdmg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapt(zzapr zzaprVar) {
        this.zzdmg = zzaprVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdmg.zzdx("Operation denied by user.");
    }
}
