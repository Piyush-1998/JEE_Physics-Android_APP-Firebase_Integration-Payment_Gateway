package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbcr extends FrameLayout implements zzbcm {
    private final zzbde zzefm;
    private final FrameLayout zzefn;
    private final zzabk zzefo;
    private final zzbdg zzefp;
    private final long zzefq;
    private zzbcp zzefr;
    private boolean zzefs;
    private boolean zzeft;
    private boolean zzefu;
    private boolean zzefv;
    private long zzefw;
    private long zzefx;
    private String zzefy;
    private String[] zzefz;
    private Bitmap zzega;
    private ImageView zzegb;
    private boolean zzegc;

    public static void zzb(zzbde zzbdeVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
        zzbdeVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzbde zzbdeVar, Map<String, List<Map<String, Object>>> map) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("mimeTypes", map);
        zzbdeVar.zza("onVideoEvent", hashMap);
    }

    public static void zza(zzbde zzbdeVar, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
        hashMap.put("error", str);
        zzbdeVar.zza("onVideoEvent", hashMap);
    }

    public zzbcr(Context context, zzbde zzbdeVar, int i, boolean z, zzabk zzabkVar, zzbdf zzbdfVar) {
        super(context);
        this.zzefm = zzbdeVar;
        this.zzefo = zzabkVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzefn = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzbdeVar.zzzr());
        zzbcp zza = zzbdeVar.zzzr().zzbof.zza(context, zzbdeVar, i, z, zzabkVar, zzbdfVar);
        this.zzefr = zza;
        if (zza != null) {
            this.zzefn.addView(zza, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcme)).booleanValue()) {
                zzzf();
            }
        }
        this.zzegb = new ImageView(context);
        this.zzefq = ((Long) zzwe.zzpu().zzd(zzaat.zzcmi)).longValue();
        boolean booleanValue = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcmg)).booleanValue();
        this.zzefv = booleanValue;
        zzabk zzabkVar2 = this.zzefo;
        if (zzabkVar2 != null) {
            zzabkVar2.zzh("spinner_used", booleanValue ? "1" : "0");
        }
        this.zzefp = new zzbdg(this);
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar != null) {
            zzbcpVar.zza(this);
        }
        if (this.zzefr == null) {
            zzm("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    public final void zzd(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzefn.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzc(String str, String[] strArr) {
        this.zzefy = str;
        this.zzefz = strArr;
    }

    public final void zza(float f, float f2) {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar != null) {
            zzbcpVar.zza(f, f2);
        }
    }

    public final void zzhw() {
        if (this.zzefr == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzefy)) {
            this.zzefr.zzb(this.zzefy, this.zzefz);
        } else {
            zzd("no_src", new String[0]);
        }
    }

    public final void pause() {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        zzbcpVar.pause();
    }

    public final void play() {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        zzbcpVar.play();
    }

    public final void seekTo(int i) {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        zzbcpVar.seekTo(i);
    }

    public final void zzzd() {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        zzbcpVar.zzefk.setMuted(true);
        zzbcpVar.zzyx();
    }

    public final void zzze() {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        zzbcpVar.zzefk.setMuted(false);
        zzbcpVar.zzyx();
    }

    public final void setVolume(float f) {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        zzbcpVar.zzefk.setVolume(f);
        zzbcpVar.zzyx();
    }

    public final void zzdl(int i) {
        this.zzefr.zzdl(i);
    }

    public final void zzdm(int i) {
        this.zzefr.zzdm(i);
    }

    public final void zzdn(int i) {
        this.zzefr.zzdn(i);
    }

    public final void zzdo(int i) {
        this.zzefr.zzdo(i);
    }

    public final void zzdp(int i) {
        this.zzefr.zzdp(i);
    }

    public final void zze(MotionEvent motionEvent) {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        zzbcpVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzzf() {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        TextView textView = new TextView(zzbcpVar.getContext());
        String valueOf = String.valueOf(this.zzefr.zzyt());
        textView.setText(valueOf.length() != 0 ? "AdMob - ".concat(valueOf) : new String("AdMob - "));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzefn.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzefn.bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzyy() {
        this.zzefp.resume();
        zzayh.zzeaj.post(new zzbcs(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzez() {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar != null && this.zzefx == 0) {
            zzd("canplaythrough", "duration", String.valueOf(zzbcpVar.getDuration() / 1000.0f), "videoWidth", String.valueOf(this.zzefr.getVideoWidth()), "videoHeight", String.valueOf(this.zzefr.getVideoHeight()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzyz() {
        if (this.zzefm.zzzq() != null && !this.zzeft) {
            boolean z = (this.zzefm.zzzq().getWindow().getAttributes().flags & 128) != 0;
            this.zzefu = z;
            if (!z) {
                this.zzefm.zzzq().getWindow().addFlags(128);
                this.zzeft = true;
            }
        }
        this.zzefs = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void onPaused() {
        zzd("pause", new String[0]);
        zzzi();
        this.zzefs = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzza() {
        zzd("ended", new String[0]);
        zzzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzm(String str, String str2) {
        zzd("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzzb() {
        if (this.zzegc && this.zzega != null && !zzzh()) {
            this.zzegb.setImageBitmap(this.zzega);
            this.zzegb.invalidate();
            this.zzefn.addView(this.zzegb, new FrameLayout.LayoutParams(-1, -1));
            this.zzefn.bringChildToFront(this.zzegb);
        }
        this.zzefp.pause();
        this.zzefx = this.zzefw;
        zzayh.zzeaj.post(new zzbcv(this));
    }

    public final void destroy() {
        this.zzefp.pause();
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar != null) {
            zzbcpVar.stop();
        }
        zzzi();
    }

    public final void finalize() throws Throwable {
        try {
            this.zzefp.pause();
            if (this.zzefr != null) {
                zzbcp zzbcpVar = this.zzefr;
                zzdvw zzdvwVar = zzbbi.zzedy;
                zzbcpVar.getClass();
                zzdvwVar.execute(zzbcq.zza(zzbcpVar));
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzzg() {
        zzbcp zzbcpVar = this.zzefr;
        if (zzbcpVar == null) {
            return;
        }
        long currentPosition = zzbcpVar.getCurrentPosition();
        if (this.zzefw == currentPosition || currentPosition <= 0) {
            return;
        }
        zzd("timeupdate", "time", String.valueOf(((float) currentPosition) / 1000.0f));
        this.zzefw = currentPosition;
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzzc() {
        if (this.zzefs && zzzh()) {
            this.zzefn.removeView(this.zzegb);
        }
        if (this.zzega != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
            if (this.zzefr.getBitmap(this.zzega) != null) {
                this.zzegc = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - elapsedRealtime;
            if (zzaxy.zzww()) {
                StringBuilder sb = new StringBuilder(46);
                sb.append("Spinner frame grab took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                zzaxy.zzei(sb.toString());
            }
            if (elapsedRealtime2 > this.zzefq) {
                zzaxy.zzfe("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzefv = false;
                this.zzega = null;
                zzabk zzabkVar = this.zzefo;
                if (zzabkVar != null) {
                    zzabkVar.zzh("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbcm
    public final void zzk(int i, int i2) {
        if (this.zzefv) {
            int max = Math.max(i / ((Integer) zzwe.zzpu().zzd(zzaat.zzcmh)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) zzwe.zzpu().zzd(zzaat.zzcmh)).intValue(), 1);
            Bitmap bitmap = this.zzega;
            if (bitmap != null && bitmap.getWidth() == max && this.zzega.getHeight() == max2) {
                return;
            }
            this.zzega = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzegc = false;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zzefp.resume();
        } else {
            this.zzefp.pause();
            this.zzefx = this.zzefw;
        }
        zzayh.zzeaj.post(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.zzbct
            private final zzbcr zzege;
            private final boolean zzegf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzege = this;
                this.zzegf = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzege.zzau(this.zzegf);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzbcm
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zzefp.resume();
            z = true;
        } else {
            this.zzefp.pause();
            this.zzefx = this.zzefw;
            z = false;
        }
        zzayh.zzeaj.post(new zzbcu(this, z));
    }

    private final boolean zzzh() {
        return this.zzegb.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzefm.zza("onVideoEvent", hashMap);
    }

    private final void zzzi() {
        if (this.zzefm.zzzq() == null || !this.zzeft || this.zzefu) {
            return;
        }
        this.zzefm.zzzq().getWindow().clearFlags(128);
        this.zzeft = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzau(boolean z) {
        zzd("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }
}
