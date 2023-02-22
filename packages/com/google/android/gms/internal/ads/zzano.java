package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzano extends zzyj {
    private final Object lock = new Object();
    private volatile zzyl zzdkl;

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
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final float getCurrentTime() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final void zza(zzyl zzylVar) throws RemoteException {
        synchronized (this.lock) {
            this.zzdkl = zzylVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyg
    public final zzyl zzqj() throws RemoteException {
        zzyl zzylVar;
        synchronized (this.lock) {
            zzylVar = this.zzdkl;
        }
        return zzylVar;
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
