package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbcc extends zzbcp implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map<Integer, String> zzeem = new HashMap();
    private final zzbdh zzeen;
    private final boolean zzeeo;
    private int zzeep;
    private int zzeeq;
    private MediaPlayer zzeer;
    private Uri zzees;
    private int zzeet;
    private int zzeeu;
    private int zzeev;
    private int zzeew;
    private int zzeex;
    private zzbdc zzeey;
    private boolean zzeez;
    private int zzefa;
    private zzbcm zzefb;

    public zzbcc(Context context, boolean z, boolean z2, zzbdf zzbdfVar, zzbdh zzbdhVar) {
        super(context);
        this.zzeep = 0;
        this.zzeeq = 0;
        setSurfaceTextureListener(this);
        this.zzeen = zzbdhVar;
        this.zzeez = z;
        this.zzeeo = z2;
        zzbdhVar.zzb(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final String zzyt() {
        String str = this.zzeez ? " spherical" : "";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zza(zzbcm zzbcmVar) {
        this.zzefb = zzbcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzta zzd = zzta.zzd(parse);
        if (zzd == null || zzd.url != null) {
            if (zzd != null) {
                parse = Uri.parse(zzd.url);
            }
            this.zzees = parse;
            this.zzefa = 0;
            zzyu();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void stop() {
        zzaxy.zzei("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzeer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzeer.release();
            this.zzeer = null;
            zzdj(0);
            this.zzeeq = 0;
        }
        this.zzeen.onStop();
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        zzaxy.zzei(sb.toString());
        this.zzeet = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.zzeeu = videoHeight;
        if (this.zzeet == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzaxy.zzei("AdMediaPlayerView prepared");
        zzdj(2);
        this.zzeen.zzez();
        zzayh.zzeaj.post(new zzbce(this));
        this.zzeet = mediaPlayer.getVideoWidth();
        this.zzeeu = mediaPlayer.getVideoHeight();
        int i = this.zzefa;
        if (i != 0) {
            seekTo(i);
        }
        zzyv();
        int i2 = this.zzeet;
        int i3 = this.zzeeu;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzaxy.zzfd(sb.toString());
        if (this.zzeeq == 3) {
            play();
        }
        zzyx();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzaxy.zzei("AdMediaPlayerView completion");
        zzdj(5);
        this.zzeeq = 5;
        zzayh.zzeaj.post(new zzbch(this));
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzeem.get(Integer.valueOf(i));
        String str2 = zzeem.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzaxy.zzei(sb.toString());
        return true;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = zzeem.get(Integer.valueOf(i));
        String str2 = zzeem.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzaxy.zzfe(sb.toString());
        zzdj(-1);
        this.zzeeq = -1;
        zzayh.zzeaj.post(new zzbcg(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzeev = i;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaxy.zzei("AdMediaPlayerView surface created");
        zzyu();
        zzayh.zzeaj.post(new zzbcj(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzaxy.zzei("AdMediaPlayerView surface changed");
        boolean z = true;
        boolean z2 = this.zzeeq == 3;
        z = (this.zzeet == i && this.zzeeu == i2) ? false : false;
        if (this.zzeer != null && z2 && z) {
            int i3 = this.zzefa;
            if (i3 != 0) {
                seekTo(i3);
            }
            play();
        }
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzm(i, i2);
        }
        zzayh.zzeaj.post(new zzbci(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzaxy.zzei("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzeer;
        if (mediaPlayer != null && this.zzefa == 0) {
            this.zzefa = mediaPlayer.getCurrentPosition();
        }
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzzk();
        }
        zzayh.zzeaj.post(new zzbcl(this));
        zzat(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzeen.zzc(this);
        this.zzefj.zza(surfaceTexture, this.zzefb);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        zzaxy.zzei(sb.toString());
        zzayh.zzeaj.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzbcf
            private final int zzeax;
            private final zzbcc zzefe;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzefe = this;
                this.zzeax = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzefe.zzdk(this.zzeax);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = getDefaultSize(this.zzeet, i);
        int defaultSize2 = getDefaultSize(this.zzeeu, i2);
        if (this.zzeet > 0 && this.zzeeu > 0 && this.zzeey == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.zzeet;
                int i5 = i4 * size2;
                int i6 = this.zzeeu;
                if (i5 < size * i6) {
                    defaultSize = (i4 * size2) / i6;
                    defaultSize2 = size2;
                } else {
                    if (i4 * size2 > size * i6) {
                        defaultSize2 = (i6 * size) / i4;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                }
            } else if (mode == 1073741824) {
                int i7 = (this.zzeeu * size) / this.zzeet;
                if (mode2 != Integer.MIN_VALUE || i7 <= size2) {
                    defaultSize2 = i7;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else if (mode2 == 1073741824) {
                int i8 = (this.zzeet * size2) / this.zzeeu;
                if (mode != Integer.MIN_VALUE || i8 <= size) {
                    defaultSize = i8;
                    defaultSize2 = size2;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                int i9 = this.zzeet;
                int i10 = this.zzeeu;
                if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                    defaultSize2 = i10;
                } else {
                    i9 = (i9 * size2) / i10;
                    defaultSize2 = size2;
                }
                if (mode != Integer.MIN_VALUE || i9 <= size) {
                    defaultSize = i9;
                } else {
                    defaultSize2 = (this.zzeeu * size) / this.zzeet;
                    defaultSize = size;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzm(defaultSize, defaultSize2);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i11 = this.zzeew;
            if ((i11 > 0 && i11 != defaultSize) || ((i3 = this.zzeex) > 0 && i3 != defaultSize2)) {
                zzyv();
            }
            this.zzeew = defaultSize;
            this.zzeex = defaultSize2;
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = getClass().getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    private final void zzyu() {
        zzaxy.zzei("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.zzees == null || surfaceTexture == null) {
            return;
        }
        zzat(false);
        try {
            com.google.android.gms.ads.internal.zzp.zzlf();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.zzeer = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.zzeer.setOnCompletionListener(this);
            this.zzeer.setOnErrorListener(this);
            this.zzeer.setOnInfoListener(this);
            this.zzeer.setOnPreparedListener(this);
            this.zzeer.setOnVideoSizeChangedListener(this);
            this.zzeev = 0;
            if (this.zzeez) {
                zzbdc zzbdcVar = new zzbdc(getContext());
                this.zzeey = zzbdcVar;
                zzbdcVar.zza(surfaceTexture, getWidth(), getHeight());
                this.zzeey.start();
                SurfaceTexture zzzl = this.zzeey.zzzl();
                if (zzzl != null) {
                    surfaceTexture = zzzl;
                } else {
                    this.zzeey.zzzk();
                    this.zzeey = null;
                }
            }
            this.zzeer.setDataSource(getContext(), this.zzees);
            com.google.android.gms.ads.internal.zzp.zzlg();
            this.zzeer.setSurface(new Surface(surfaceTexture));
            this.zzeer.setAudioStreamType(3);
            this.zzeer.setScreenOnWhilePlaying(true);
            this.zzeer.prepareAsync();
            zzdj(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String valueOf = String.valueOf(this.zzees);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(valueOf);
            zzaxy.zzd(sb.toString(), e);
            onError(this.zzeer, 1, 0);
        }
    }

    private final void zzyv() {
        if (this.zzeeo && zzyw() && this.zzeer.getCurrentPosition() > 0 && this.zzeeq != 3) {
            zzaxy.zzei("AdMediaPlayerView nudging MediaPlayer");
            zzd(0.0f);
            this.zzeer.start();
            int currentPosition = this.zzeer.getCurrentPosition();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
            while (zzyw() && this.zzeer.getCurrentPosition() == currentPosition && com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis() - currentTimeMillis <= 250) {
            }
            this.zzeer.pause();
            zzyx();
        }
    }

    private final void zzat(boolean z) {
        zzaxy.zzei("AdMediaPlayerView release");
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzzk();
            this.zzeey = null;
        }
        MediaPlayer mediaPlayer = this.zzeer;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzeer.release();
            this.zzeer = null;
            zzdj(0);
            if (z) {
                this.zzeeq = 0;
                this.zzeeq = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void play() {
        zzaxy.zzei("AdMediaPlayerView play");
        if (zzyw()) {
            this.zzeer.start();
            zzdj(3);
            this.zzefj.zzyz();
            zzayh.zzeaj.post(new zzbck(this));
        }
        this.zzeeq = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void pause() {
        zzaxy.zzei("AdMediaPlayerView pause");
        if (zzyw() && this.zzeer.isPlaying()) {
            this.zzeer.pause();
            zzdj(4);
            zzayh.zzeaj.post(new zzbcn(this));
        }
        this.zzeeq = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int getDuration() {
        if (zzyw()) {
            return this.zzeer.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int getCurrentPosition() {
        if (zzyw()) {
            return this.zzeer.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void seekTo(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        zzaxy.zzei(sb.toString());
        if (zzyw()) {
            this.zzeer.seekTo(i);
            this.zzefa = 0;
            return;
        }
        this.zzefa = i;
    }

    private final boolean zzyw() {
        int i;
        return (this.zzeer == null || (i = this.zzeep) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zza(float f, float f2) {
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.zzeer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.zzeer;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp, com.google.android.gms.internal.ads.zzbdi
    public final void zzyx() {
        zzd(this.zzefk.getVolume());
    }

    private final void zzd(float f) {
        MediaPlayer mediaPlayer = this.zzeer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        zzaxy.zzfe("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private final void zzdj(int i) {
        if (i == 3) {
            this.zzeen.zzzy();
            this.zzefk.zzzy();
        } else if (this.zzeep == 3) {
            this.zzeen.zzzz();
            this.zzefk.zzzz();
        }
        this.zzeep = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdk(int i) {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.onWindowVisibilityChanged(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            zzeem.put(-1004, "MEDIA_ERROR_IO");
            zzeem.put(-1007, "MEDIA_ERROR_MALFORMED");
            zzeem.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            zzeem.put(-110, "MEDIA_ERROR_TIMED_OUT");
            zzeem.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzeem.put(100, "MEDIA_ERROR_SERVER_DIED");
        zzeem.put(1, "MEDIA_ERROR_UNKNOWN");
        zzeem.put(1, "MEDIA_INFO_UNKNOWN");
        zzeem.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzeem.put(701, "MEDIA_INFO_BUFFERING_START");
        zzeem.put(702, "MEDIA_INFO_BUFFERING_END");
        zzeem.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        zzeem.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        zzeem.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (Build.VERSION.SDK_INT >= 19) {
            zzeem.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzeem.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }
}
