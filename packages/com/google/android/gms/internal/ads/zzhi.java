package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzhi extends Handler {
    private final /* synthetic */ zzhj zzaek;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhi(zzhj zzhjVar, Looper looper) {
        super(looper);
        this.zzaek = zzhjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zzaek.zza(message);
    }
}
