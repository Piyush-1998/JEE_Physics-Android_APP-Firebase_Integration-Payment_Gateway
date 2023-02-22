package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzayb extends zzdsf {
    public zzayb(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "AdMobHandler.handleMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdsf
    public final void zzb(Message message) {
        try {
            super.zzb(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzkp();
            zzayh.zza(com.google.android.gms.ads.internal.zzp.zzkt().getApplicationContext(), th);
            throw th;
        }
    }
}
