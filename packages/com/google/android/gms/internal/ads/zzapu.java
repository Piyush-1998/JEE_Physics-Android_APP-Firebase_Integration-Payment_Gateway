package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzapu implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzapr zzdmg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapu(zzapr zzaprVar) {
        this.zzdmg = zzaprVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        Intent createIntent = this.zzdmg.createIntent();
        com.google.android.gms.ads.internal.zzp.zzkp();
        context = this.zzdmg.zzvr;
        zzayh.zza(context, createIntent);
    }
}
