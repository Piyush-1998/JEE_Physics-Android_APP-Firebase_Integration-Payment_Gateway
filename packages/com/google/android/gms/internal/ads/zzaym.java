package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzaym {
    public String getDefaultUserAgent(Context context) {
        return "";
    }

    public boolean isAttachedToWindow(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    public boolean zza(Activity activity, Configuration configuration) {
        return false;
    }

    public void zzbf(Context context) {
    }

    public void zzg(Activity activity) {
    }

    public int zzxs() {
        return 5;
    }

    public int zzxv() {
        return 1;
    }

    public long zzxw() {
        return -1L;
    }

    public boolean zza(final Context context, final WebSettings webSettings) {
        zzbal.zza(context, new Callable(context, webSettings) { // from class: com.google.android.gms.internal.ads.zzayp
            private final Context zzcxz;
            private final WebSettings zzeap;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzcxz = context;
                this.zzeap = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.zzcxz;
                WebSettings webSettings2 = this.zzeap;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                webSettings2.setAllowContentAccess(false);
                return true;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        return true;
    }

    public static boolean zza(zzbfq zzbfqVar) {
        if (zzbfqVar == null) {
            return false;
        }
        zzbfqVar.onPause();
        return true;
    }

    public static boolean zzb(zzbfq zzbfqVar) {
        if (zzbfqVar == null) {
            return false;
        }
        zzbfqVar.onResume();
        return true;
    }

    public zzbft zza(zzbfq zzbfqVar, zzto zztoVar, boolean z) {
        return new zzbgv(zzbfqVar, zztoVar, z);
    }

    public ViewGroup.LayoutParams zzxt() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    public Drawable zza(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    public static boolean zzxu() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public CookieManager zzbg(Context context) {
        if (zzxu()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzaxy.zzc("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzp.zzkt().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public zzug zza(Context context, TelephonyManager telephonyManager) {
        return zzug.ENUM_UNKNOWN;
    }

    public int zza(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "wifi_on", 0);
    }

    public int zzb(ContentResolver contentResolver) {
        return Settings.System.getInt(contentResolver, "airplane_mode_on", 0);
    }

    public WebResourceResponse zza(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    private zzaym() {
    }

    public static zzaym zzdh(int i) {
        if (i >= 28) {
            return new zzayx();
        }
        if (i >= 26) {
            return new zzayu();
        }
        if (i >= 24) {
            return new zzayv();
        }
        if (i >= 21) {
            return new zzays();
        }
        if (i >= 19) {
            return new zzayt();
        }
        if (i >= 18) {
            return new zzayq();
        }
        if (i >= 17) {
            return new zzayr();
        }
        return new zzaym();
    }
}
