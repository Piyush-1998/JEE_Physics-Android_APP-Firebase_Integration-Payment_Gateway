package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzayz {
    private boolean zzdqs = false;
    private float zzdqm = 1.0f;

    public final synchronized void setAppVolume(float f) {
        this.zzdqm = f;
    }

    public final synchronized float zzqd() {
        if (zzya()) {
            return this.zzdqm;
        }
        return 1.0f;
    }

    public final synchronized void setAppMuted(boolean z) {
        this.zzdqs = z;
    }

    public final synchronized boolean zzqe() {
        return this.zzdqs;
    }

    private final synchronized boolean zzya() {
        return this.zzdqm >= 0.0f;
    }

    public static float zzbh(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return 0.0f;
        }
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        int streamVolume = audioManager.getStreamVolume(3);
        if (streamMaxVolume == 0) {
            return 0.0f;
        }
        return streamVolume / streamMaxVolume;
    }
}
