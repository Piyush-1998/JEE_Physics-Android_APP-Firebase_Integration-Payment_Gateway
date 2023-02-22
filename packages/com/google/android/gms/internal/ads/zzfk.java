package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfk extends BroadcastReceiver {
    private final /* synthetic */ zzfi zzaag;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfk(zzfi zzfiVar) {
        this.zzaag = zzfiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzaag.zzcv();
    }
}
