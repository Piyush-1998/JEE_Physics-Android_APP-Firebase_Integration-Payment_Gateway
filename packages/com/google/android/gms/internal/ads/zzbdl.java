package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbdl extends zzbcp implements TextureView.SurfaceTextureListener, zzbei {
    private Surface zzblg;
    private final zzbdh zzeen;
    private final boolean zzeeo;
    private int zzeet;
    private int zzeeu;
    private int zzeew;
    private int zzeex;
    private zzbdc zzeey;
    private final boolean zzeez;
    private zzbcm zzefb;
    private final zzbde zzefm;
    private String[] zzefz;
    private final zzbdf zzeiw;
    private zzbeb zzeix;
    private String zzeiy;
    private boolean zzeiz;
    private int zzeja;
    private boolean zzejb;
    private boolean zzejc;
    private float zzejd;

    public zzbdl(Context context, zzbdh zzbdhVar, zzbde zzbdeVar, boolean z, boolean z2, zzbdf zzbdfVar) {
        super(context);
        this.zzeja = 1;
        this.zzeeo = z2;
        this.zzefm = zzbdeVar;
        this.zzeen = zzbdhVar;
        this.zzeez = z;
        this.zzeiw = zzbdfVar;
        setSurfaceTextureListener(this);
        this.zzeen.zzb(this);
    }

    private final zzbeb zzaab() {
        return new zzbeb(this.zzefm.getContext(), this.zzeiw);
    }

    private final String zzaac() {
        return com.google.android.gms.ads.internal.zzp.zzkp().zzs(this.zzefm.getContext(), this.zzefm.zzzt().zzbra);
    }

    private final boolean zzaad() {
        zzbeb zzbebVar = this.zzeix;
        return (zzbebVar == null || zzbebVar.zzaaq() == null || this.zzeiz) ? false : true;
    }

    private final boolean zzaae() {
        return zzaad() && this.zzeja != 1;
    }

    private final void zzaaf() {
        String str;
        if (this.zzeix != null || (str = this.zzeiy) == null || this.zzblg == null) {
            return;
        }
        if (str.startsWith("cache:")) {
            zzbev zzfj = this.zzefm.zzfj(this.zzeiy);
            if (zzfj instanceof zzbfg) {
                zzbeb zzaav = ((zzbfg) zzfj).zzaav();
                this.zzeix = zzaav;
                if (zzaav.zzaaq() == null) {
                    zzaxy.zzfe("Precached video player has been released.");
                    return;
                }
            } else if (zzfj instanceof zzbfh) {
                zzbfh zzbfhVar = (zzbfh) zzfj;
                String zzaac = zzaac();
                ByteBuffer byteBuffer = zzbfhVar.getByteBuffer();
                boolean zzaaw = zzbfhVar.zzaaw();
                String url = zzbfhVar.getUrl();
                if (url == null) {
                    zzaxy.zzfe("Stream cache URL is null.");
                    return;
                }
                zzbeb zzaab = zzaab();
                this.zzeix = zzaab;
                zzaab.zza(new Uri[]{Uri.parse(url)}, zzaac, byteBuffer, zzaaw);
            } else {
                String valueOf = String.valueOf(this.zzeiy);
                zzaxy.zzfe(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                return;
            }
        } else {
            this.zzeix = zzaab();
            String zzaac2 = zzaac();
            Uri[] uriArr = new Uri[this.zzefz.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzefz;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzeix.zza(uriArr, zzaac2);
        }
        this.zzeix.zza(this);
        zza(this.zzblg, false);
        if (this.zzeix.zzaaq() != null) {
            int playbackState = this.zzeix.zzaaq().getPlaybackState();
            this.zzeja = playbackState;
            if (playbackState == 3) {
                zzaag();
            }
        }
    }

    private final void zza(Surface surface, boolean z) {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zza(surface, z);
        } else {
            zzaxy.zzfe("Trying to set surface before player is initalized.");
        }
    }

    private final void zza(float f, boolean z) {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zzb(f, z);
        } else {
            zzaxy.zzfe("Trying to set volume before player is initalized.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp, com.google.android.gms.internal.ads.zzbdi
    public final void zzyx() {
        zza(this.zzefk.getVolume(), false);
    }

    private final void zzaag() {
        if (this.zzejb) {
            return;
        }
        this.zzejb = true;
        zzayh.zzeaj.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbdk
            private final zzbdl zzeiv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeiv = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeiv.zzaap();
            }
        });
        zzyx();
        this.zzeen.zzez();
        if (this.zzejc) {
            play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final String zzyt() {
        String str = this.zzeez ? " spherical" : "";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zza(zzbcm zzbcmVar) {
        this.zzefb = zzbcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void setVideoPath(String str) {
        if (str != null) {
            this.zzeiy = str;
            this.zzefz = new String[]{str};
            zzaaf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zzb(String str, String[] strArr) {
        if (str != null) {
            if (strArr == null) {
                setVideoPath(str);
            }
            this.zzeiy = str;
            this.zzefz = (String[]) Arrays.copyOf(strArr, strArr.length);
            zzaaf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void play() {
        if (zzaae()) {
            if (this.zzeiw.zzehu) {
                zzaai();
            }
            this.zzeix.zzaaq().zzf(true);
            this.zzeen.zzzy();
            this.zzefk.zzzy();
            this.zzefj.zzyz();
            zzayh.zzeaj.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbdp
                private final zzbdl zzeiv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeiv = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzeiv.zzaan();
                }
            });
            return;
        }
        this.zzejc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void stop() {
        if (zzaad()) {
            this.zzeix.zzaaq().stop();
            if (this.zzeix != null) {
                zza((Surface) null, true);
                zzbeb zzbebVar = this.zzeix;
                if (zzbebVar != null) {
                    zzbebVar.zza((zzbei) null);
                    this.zzeix.release();
                    this.zzeix = null;
                }
                this.zzeja = 1;
                this.zzeiz = false;
                this.zzejb = false;
                this.zzejc = false;
            }
        }
        this.zzeen.zzzz();
        this.zzefk.zzzz();
        this.zzeen.onStop();
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void pause() {
        if (zzaae()) {
            if (this.zzeiw.zzehu) {
                zzaaj();
            }
            this.zzeix.zzaaq().zzf(false);
            this.zzeen.zzzz();
            this.zzefk.zzzz();
            zzayh.zzeaj.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbdo
                private final zzbdl zzeiv;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeiv = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzeiv.zzaam();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void seekTo(int i) {
        if (zzaae()) {
            this.zzeix.zzaaq().seekTo(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zzdl(int i) {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zzaat().zzds(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zzdm(int i) {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zzaat().zzdt(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zzdn(int i) {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zzaat().zzdn(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zzdo(int i) {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zzaat().zzdo(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zzdp(int i) {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zzdp(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final void zza(float f, float f2) {
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzb(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int getCurrentPosition() {
        if (zzaae()) {
            return (int) this.zzeix.zzaaq().zzek();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int getDuration() {
        if (zzaae()) {
            return (int) this.zzeix.zzaaq().getDuration();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int getVideoWidth() {
        return this.zzeet;
    }

    @Override // com.google.android.gms.internal.ads.zzbcp
    public final int getVideoHeight() {
        return this.zzeeu;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzejd;
        if (f != 0.0f && this.zzeey == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            float f4 = this.zzejd;
            if (f4 < f3) {
                measuredWidth = (int) (measuredHeight * f4);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzm(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i4 = this.zzeew;
            if (((i4 > 0 && i4 != measuredWidth) || ((i3 = this.zzeex) > 0 && i3 != measuredHeight)) && this.zzeeo && zzaad()) {
                zzhc zzaaq = this.zzeix.zzaaq();
                if (zzaaq.zzek() > 0 && !zzaaq.zzei()) {
                    zza(0.0f, true);
                    zzaaq.zzf(true);
                    long zzek = zzaaq.zzek();
                    long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
                    while (zzaad() && zzaaq.zzek() == zzek && com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis() - currentTimeMillis <= 250) {
                    }
                    zzaaq.zzf(false);
                    zzyx();
                }
            }
            this.zzeew = measuredWidth;
            this.zzeex = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzeez) {
            zzbdc zzbdcVar = new zzbdc(getContext());
            this.zzeey = zzbdcVar;
            zzbdcVar.zza(surfaceTexture, i, i2);
            this.zzeey.start();
            SurfaceTexture zzzl = this.zzeey.zzzl();
            if (zzzl != null) {
                surfaceTexture = zzzl;
            } else {
                this.zzeey.zzzk();
                this.zzeey = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzblg = surface;
        if (this.zzeix == null) {
            zzaaf();
        } else {
            zza(surface, true);
            if (!this.zzeiw.zzehu) {
                zzaai();
            }
        }
        if (this.zzeet == 0 || this.zzeeu == 0) {
            zzo(i, i2);
        } else {
            zzaah();
        }
        zzayh.zzeaj.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbdr
            private final zzbdl zzeiv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeiv = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeiv.zzaal();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzm(i, i2);
        }
        zzayh.zzeaj.post(new Runnable(this, i, i2) { // from class: com.google.android.gms.internal.ads.zzbdq
            private final int zzeax;
            private final int zzeay;
            private final zzbdl zzeiv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeiv = this;
                this.zzeax = i;
                this.zzeay = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeiv.zzp(this.zzeax, this.zzeay);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzeen.zzc(this);
        this.zzefj.zza(surfaceTexture, this.zzefb);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pause();
        zzbdc zzbdcVar = this.zzeey;
        if (zzbdcVar != null) {
            zzbdcVar.zzzk();
            this.zzeey = null;
        }
        if (this.zzeix != null) {
            zzaaj();
            Surface surface = this.zzblg;
            if (surface != null) {
                surface.release();
            }
            this.zzblg = null;
            zza((Surface) null, true);
        }
        zzayh.zzeaj.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbdt
            private final zzbdl zzeiv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeiv = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeiv.zzaak();
            }
        });
        return true;
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        zzaxy.zzei(sb.toString());
        zzayh.zzeaj.post(new Runnable(this, i) { // from class: com.google.android.gms.internal.ads.zzbds
            private final int zzeax;
            private final zzbdl zzeiv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeiv = this;
                this.zzeax = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeiv.zzdr(this.zzeax);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zzb(final boolean z, final long j) {
        if (this.zzefm != null) {
            zzbbi.zzedy.execute(new Runnable(this, z, j) { // from class: com.google.android.gms.internal.ads.zzbdv
                private final boolean zzegf;
                private final zzbdl zzeiv;
                private final long zzejh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzeiv = this;
                    this.zzegf = z;
                    this.zzejh = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzeiv.zzc(this.zzegf, this.zzejh);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zzdq(int i) {
        if (this.zzeja != i) {
            this.zzeja = i;
            if (i == 3) {
                zzaag();
            } else if (i != 4) {
            } else {
                if (this.zzeiw.zzehu) {
                    zzaaj();
                }
                this.zzeen.zzzz();
                this.zzefk.zzzz();
                zzayh.zzeaj.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbdn
                    private final zzbdl zzeiv;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzeiv = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzeiv.zzaao();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zzn(int i, int i2) {
        this.zzeet = i;
        this.zzeeu = i2;
        zzaah();
    }

    @Override // com.google.android.gms.internal.ads.zzbei
    public final void zza(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(canonicalName).length() + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        final String sb2 = sb.toString();
        String valueOf = String.valueOf(sb2);
        zzaxy.zzfe(valueOf.length() != 0 ? "ExoPlayerAdapter error: ".concat(valueOf) : new String("ExoPlayerAdapter error: "));
        this.zzeiz = true;
        if (this.zzeiw.zzehu) {
            zzaaj();
        }
        zzayh.zzeaj.post(new Runnable(this, sb2) { // from class: com.google.android.gms.internal.ads.zzbdm
            private final String zzdft;
            private final zzbdl zzeiv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzeiv = this;
                this.zzdft = sb2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzeiv.zzfk(this.zzdft);
            }
        });
    }

    private final void zzaah() {
        zzo(this.zzeet, this.zzeeu);
    }

    private final void zzo(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzejd != f) {
            this.zzejd = f;
            requestLayout();
        }
    }

    private final void zzaai() {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zzaw(true);
        }
    }

    private final void zzaaj() {
        zzbeb zzbebVar = this.zzeix;
        if (zzbebVar != null) {
            zzbebVar.zzaw(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(boolean z, long j) {
        this.zzefm.zza(z, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdr(int i) {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.onWindowVisibilityChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaak() {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.zzzb();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(int i, int i2) {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.zzk(i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaal() {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.zzyy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaam() {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.onPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaan() {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.zzyz();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzfk(String str) {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.zzm("ExoPlayerAdapter error", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaao() {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.zzza();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzaap() {
        zzbcm zzbcmVar = this.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar.zzez();
        }
    }
}
