package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzyg;
import com.google.android.gms.internal.ads.zzzz;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object lock = new Object();
    private zzyg zzado;
    private VideoLifecycleCallbacks zzadp;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final void zza(zzyg zzygVar) {
        synchronized (this.lock) {
            this.zzado = zzygVar;
            if (this.zzadp != null) {
                setVideoLifecycleCallbacks(this.zzadp);
            }
        }
    }

    public final zzyg zzdt() {
        zzyg zzygVar;
        synchronized (this.lock) {
            zzygVar = this.zzado;
        }
        return zzygVar;
    }

    public final void play() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return;
            }
            try {
                this.zzado.play();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call play on video controller.", e);
            }
        }
    }

    public final void pause() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return;
            }
            try {
                this.zzado.pause();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call pause on video controller.", e);
            }
        }
    }

    public final void stop() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return;
            }
            try {
                this.zzado.stop();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call stop on video controller.", e);
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return;
            }
            try {
                this.zzado.mute(z);
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call mute on video controller.", e);
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return true;
            }
            try {
                return this.zzado.isMuted();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public final int getPlaybackState() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return 0;
            }
            try {
                return this.zzado.getPlaybackState();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return false;
            }
            try {
                return this.zzado.isCustomControlsEnabled();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return false;
            }
            try {
                return this.zzado.isClickToExpandEnabled();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public final float getVideoDuration() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return 0.0f;
            }
            try {
                return this.zzado.getDuration();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call getDuration on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final float getVideoCurrentTime() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return 0.0f;
            }
            try {
                return this.zzado.getCurrentTime();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call getCurrentTime on video controller.", e);
                return 0.0f;
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.checkNotNull(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.lock) {
            this.zzadp = videoLifecycleCallbacks;
            if (this.zzado == null) {
                return;
            }
            try {
                this.zzado.zza(new zzzz(videoLifecycleCallbacks));
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.lock) {
            videoLifecycleCallbacks = this.zzadp;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzado != null;
        }
        return z;
    }

    @Deprecated
    public final float getAspectRatio() {
        synchronized (this.lock) {
            if (this.zzado == null) {
                return 0.0f;
            }
            try {
                return this.zzado.getAspectRatio();
            } catch (RemoteException e) {
                zzbbd.zzc("Unable to call getAspectRatio on video controller.", e);
                return 0.0f;
            }
        }
    }
}
