package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzec implements Runnable {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Context zzxp;
    private final /* synthetic */ View zzxq;
    private final /* synthetic */ String zzxt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(zzdy zzdyVar, Context context, String str, View view, Activity activity) {
        this.zzxp = context;
        this.zzxt = str;
        this.zzxq = view;
        this.val$activity = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdpy zzdpyVar;
        zzdp zzdpVar;
        try {
            zzdpVar = zzdy.zzxe;
            zzdpVar.zza(this.zzxp, this.zzxt, this.zzxq, this.val$activity);
        } catch (Exception e) {
            zzdpyVar = zzdy.zzxg;
            zzdpyVar.zza(2021, -1L, e);
        }
    }
}
