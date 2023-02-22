package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbcz {
    private long zzegl;
    private final long zzegk = TimeUnit.MILLISECONDS.toNanos(((Long) zzwe.zzpu().zzd(zzaat.zzcmf)).longValue());
    private boolean zzegm = true;

    public final void zzyz() {
        this.zzegm = true;
    }

    public final void zza(SurfaceTexture surfaceTexture, zzbcm zzbcmVar) {
        if (zzbcmVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzegm || Math.abs(timestamp - this.zzegl) >= this.zzegk) {
            this.zzegm = false;
            this.zzegl = timestamp;
            zzayh.zzeaj.post(new zzbcy(this, zzbcmVar));
        }
    }
}
