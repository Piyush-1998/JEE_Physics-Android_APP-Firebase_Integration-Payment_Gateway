package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzapz implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapx zzdmx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapz(zzapx zzapxVar) {
        this.zzdmx = zzapxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdmx.zzdx("User canceled the download.");
    }
}
