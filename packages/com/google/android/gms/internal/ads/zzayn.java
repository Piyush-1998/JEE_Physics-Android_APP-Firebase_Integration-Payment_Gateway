package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzayn extends BroadcastReceiver {
    private final /* synthetic */ zzayh zzean;

    private zzayn(zzayh zzayhVar) {
        this.zzean = zzayhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzayh.zza(this.zzean, true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzayh.zza(this.zzean, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzayn(zzayh zzayhVar, zzayj zzayjVar) {
        this(zzayhVar);
    }
}
