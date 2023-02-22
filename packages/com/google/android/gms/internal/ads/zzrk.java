package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzrk extends Thread {
    private final Object lock;
    private boolean started;
    private final int zzbsb;
    private final int zzbsd;
    private final boolean zzbse;
    private boolean zzbtb;
    private boolean zzbtc;
    private final zzrd zzbtd;
    private final int zzbte;
    private final int zzbtf;
    private final int zzbtg;
    private final int zzbth;
    private final int zzbti;
    private final int zzbtj;
    private final String zzbtk;
    private final boolean zzbtl;
    private final boolean zzbtm;

    public zzrk() {
        this(new zzrd());
    }

    private zzrk(zzrd zzrdVar) {
        this.started = false;
        this.zzbtb = false;
        this.zzbtc = false;
        this.zzbtd = zzrdVar;
        this.lock = new Object();
        this.zzbsb = zzaci.zzczz.get().intValue();
        this.zzbtf = zzaci.zzczw.get().intValue();
        this.zzbsd = zzaci.zzdaa.get().intValue();
        this.zzbtg = zzaci.zzczy.get().intValue();
        this.zzbth = ((Integer) zzwe.zzpu().zzd(zzaat.zzcmt)).intValue();
        this.zzbti = ((Integer) zzwe.zzpu().zzd(zzaat.zzcmu)).intValue();
        this.zzbtj = ((Integer) zzwe.zzpu().zzd(zzaat.zzcmv)).intValue();
        this.zzbte = zzaci.zzdab.get().intValue();
        this.zzbtk = (String) zzwe.zzpu().zzd(zzaat.zzcmx);
        this.zzbtl = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcmy)).booleanValue();
        this.zzbse = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcmz)).booleanValue();
        this.zzbtm = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcna)).booleanValue();
        setName("ContentFetchTask");
    }

    public final void zzmg() {
        synchronized (this.lock) {
            if (this.started) {
                zzaxy.zzef("Content hash thread already started, quiting...");
                return;
            }
            this.started = true;
            start();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                if (zzmh()) {
                    Activity activity = com.google.android.gms.ads.internal.zzp.zzks().getActivity();
                    if (activity == null) {
                        zzaxy.zzef("ContentFetchThread: no activity. Sleeping.");
                        zzmj();
                    } else if (activity != null) {
                        View view = null;
                        try {
                            if (activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
                                view = activity.getWindow().getDecorView().findViewById(16908290);
                            }
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "ContentFetchTask.extractContent");
                            zzaxy.zzef("Failed getting root view of activity. Content not extracted.");
                        }
                        if (view != null && view != null) {
                            view.post(new zzrj(this, view));
                        }
                    }
                } else {
                    zzaxy.zzef("ContentFetchTask: sleeping");
                    zzmj();
                }
                Thread.sleep(this.zzbte * 1000);
            } catch (InterruptedException e2) {
                zzaxy.zzc("Error in ContentFetchTask", e2);
            } catch (Exception e3) {
                zzaxy.zzc("Error in ContentFetchTask", e3);
                com.google.android.gms.ads.internal.zzp.zzkt().zza(e3, "ContentFetchTask.run");
            }
            synchronized (this.lock) {
                while (this.zzbtb) {
                    try {
                        zzaxy.zzef("ContentFetchTask: waiting");
                        this.lock.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzj(View view) {
        try {
            zzre zzreVar = new zzre(this.zzbsb, this.zzbtf, this.zzbsd, this.zzbtg, this.zzbth, this.zzbti, this.zzbtj, this.zzbse);
            Context context = com.google.android.gms.ads.internal.zzp.zzks().getContext();
            if (context != null && !TextUtils.isEmpty(this.zzbtk)) {
                String str = (String) view.getTag(context.getResources().getIdentifier((String) zzwe.zzpu().zzd(zzaat.zzcmw), "id", context.getPackageName()));
                if (str != null && str.equals(this.zzbtk)) {
                    return;
                }
            }
            zzro zza = zza(view, zzreVar);
            zzreVar.zzme();
            if (zza.zzbtt == 0 && zza.zzbtu == 0) {
                return;
            }
            if (zza.zzbtu == 0 && zzreVar.zzmf() == 0) {
                return;
            }
            if (zza.zzbtu == 0 && this.zzbtd.zza(zzreVar)) {
                return;
            }
            this.zzbtd.zzc(zzreVar);
        } catch (Exception e) {
            zzaxy.zzc("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "ContentFetchTask.fetchContent");
        }
    }

    private static boolean zzmh() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            Context context = com.google.android.gms.ads.internal.zzp.zzks().getContext();
            if (context == null) {
                return false;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                        return false;
                    }
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    return powerManager == null ? false : powerManager.isScreenOn();
                }
            }
            return false;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(th, "ContentFetchTask.isInForeground");
            return false;
        }
    }

    private final zzro zza(View view, zzre zzreVar) {
        boolean z;
        if (view == null) {
            return new zzro(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (!TextUtils.isEmpty(text)) {
                zzreVar.zzb(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                return new zzro(this, 1, 0);
            }
            return new zzro(this, 0, 0);
        } else if ((view instanceof WebView) && !(view instanceof zzbfq)) {
            WebView webView = (WebView) view;
            if (PlatformVersion.isAtLeastKitKat()) {
                zzreVar.zzmc();
                webView.post(new zzrm(this, zzreVar, webView, globalVisibleRect));
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new zzro(this, 0, 1);
            }
            return new zzro(this, 0, 0);
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                zzro zza = zza(viewGroup.getChildAt(i3), zzreVar);
                i += zza.zzbtt;
                i2 += zza.zzbtu;
            }
            return new zzro(this, i, i2);
        } else {
            return new zzro(this, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzre zzreVar, WebView webView, String str, boolean z) {
        zzreVar.zzmb();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("text");
                if (!this.zzbtl && !TextUtils.isEmpty(webView.getTitle())) {
                    String title = webView.getTitle();
                    StringBuilder sb = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(optString).length());
                    sb.append(title);
                    sb.append("\n");
                    sb.append(optString);
                    zzreVar.zza(sb.toString(), z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzreVar.zza(optString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzreVar.zzlw()) {
                this.zzbtd.zzb(zzreVar);
            }
        } catch (JSONException unused) {
            zzaxy.zzef("Json string may be malformed.");
        } catch (Throwable th) {
            zzaxy.zzb("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzp.zzkt().zza(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final zzre zzmi() {
        return this.zzbtd.zzo(this.zzbtm);
    }

    public final void wakeup() {
        synchronized (this.lock) {
            this.zzbtb = false;
            this.lock.notifyAll();
            zzaxy.zzef("ContentFetchThread: wakeup");
        }
    }

    private final void zzmj() {
        synchronized (this.lock) {
            this.zzbtb = true;
            StringBuilder sb = new StringBuilder(42);
            sb.append("ContentFetchThread: paused, mPause = ");
            sb.append(true);
            zzaxy.zzef(sb.toString());
        }
    }

    public final boolean zzmk() {
        return this.zzbtb;
    }
}
