package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbao extends BroadcastReceiver {
    private final /* synthetic */ zzbap zzecr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbao(zzbap zzbapVar) {
        this.zzecr = zzbapVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzecr.zzc(context, intent);
    }
}
