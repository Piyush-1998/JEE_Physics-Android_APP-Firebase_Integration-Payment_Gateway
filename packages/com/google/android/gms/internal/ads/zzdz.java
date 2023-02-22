package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdz implements Runnable {
    private final /* synthetic */ Context zzxp;
    private final /* synthetic */ View zzxq;
    private final /* synthetic */ Activity zzxr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdz(zzdy zzdyVar, Context context, View view, Activity activity) {
        this.zzxp = context;
        this.zzxq = view;
        this.zzxr = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdpy zzdpyVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdy.zzxe;
            zzdpVar.zza(this.zzxp, this.zzxq, this.zzxr);
        } catch (Exception e) {
            zzdpyVar = zzdy.zzxg;
            zzdpyVar.zza(2020, -1L, e);
        }
    }
}
