package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccw extends zzyj {
    private final Object lock = new Object();
    @Nullable
    private zzyg zzfyf;
    @Nullable
    private final zzanj zzfyg;

    public zzccw(@Nullable zzyg zzygVar, @Nullable zzanj zzanjVar) {
        this.zzfyf = zzygVar;
        this.zzfyg = zzanjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void play() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void pause() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void stop() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void mute(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final boolean isMuted() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final int getPlaybackState() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final float getDuration() throws RemoteException {
        zzanj zzanjVar = this.zzfyg;
        if (zzanjVar != null) {
            return zzanjVar.getVideoDuration();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final float getCurrentTime() throws RemoteException {
        zzanj zzanjVar = this.zzfyg;
        if (zzanjVar != null) {
            return zzanjVar.getVideoCurrentTime();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void zza(zzyl zzylVar) throws RemoteException {
        synchronized (this.lock) {
            if (this.zzfyf != null) {
                this.zzfyf.zza(zzylVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final zzyl zzqj() throws RemoteException {
        synchronized (this.lock) {
            if (this.zzfyf != null) {
                return this.zzfyf.zzqj();
            }
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final float getAspectRatio() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final boolean isCustomControlsEnabled() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final boolean isClickToExpandEnabled() throws RemoteException {
        throw new RemoteException();
    }
}
