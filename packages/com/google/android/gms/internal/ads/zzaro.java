package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaro implements zzars {
    private static final Object lock = new Object();
    private static zzars zzdpm = null;
    private static zzars zzdpn = null;
    private final Context zzcle;
    private final Object zzdpo;
    private final WeakHashMap<Thread, Boolean> zzdpp;
    private final zzbbg zzdpq;
    private final ExecutorService zzyu;

    public static zzars zzt(Context context) {
        synchronized (lock) {
            if (zzdpm == null) {
                if (zzact.zzdbl.get().booleanValue()) {
                    if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxf)).booleanValue()) {
                        zzdpm = new zzaro(context);
                    }
                }
                zzdpm = new zzarv();
            }
        }
        return zzdpm;
    }

    public static zzars zzc(Context context, zzbbg zzbbgVar) {
        synchronized (lock) {
            if (zzdpn == null) {
                if (zzact.zzdbl.get().booleanValue()) {
                    if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxf)).booleanValue()) {
                        zzaro zzaroVar = new zzaro(context, zzbbgVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzaroVar.zzdpo) {
                                zzaroVar.zzdpp.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzart(zzaroVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzarq(zzaroVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzdpn = zzaroVar;
                    }
                }
                zzdpn = new zzarv();
            }
        }
        return zzdpn;
    }

    private zzaro(Context context) {
        this(context, zzbbg.zzyr());
    }

    private zzaro(Context context, zzbbg zzbbgVar) {
        this.zzdpo = new Object();
        this.zzdpp = new WeakHashMap<>();
        this.zzyu = zzdsb.zzawj().zzej(zzdsg.zzhll);
        this.zzcle = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzdpq = zzbbgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r3 == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L3e
            r1 = r11
            r2 = 0
            r3 = 0
        L7:
            if (r1 == 0) goto L39
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        Lf:
            if (r6 >= r5) goto L34
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.zzbat.zzey(r8)
            if (r8 == 0) goto L1e
            r2 = 1
        L1e:
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L31
            r3 = 1
        L31:
            int r6 = r6 + 1
            goto Lf
        L34:
            java.lang.Throwable r1 = r1.getCause()
            goto L7
        L39:
            if (r2 == 0) goto L3e
            if (r3 != 0) goto L3e
            goto L3f
        L3e:
            r10 = 0
        L3f:
            if (r10 == 0) goto L48
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.zza(r11, r0, r10)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaro.zza(java.lang.Thread, java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzars
    public final void zza(Throwable th, String str) {
        zza(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzars
    public final void zza(Throwable th, String str, float f) {
        if (zzbat.zzd(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        zzeeo.zza(th, new PrintWriter(stringWriter));
        String stringWriter2 = stringWriter.toString();
        int i = 0;
        boolean z = Math.random() < ((double) f);
        int i2 = f > 0.0f ? (int) (1.0f / f) : 1;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(zza(name, stringWriter2, str, i2).toString());
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                final String str2 = (String) obj;
                final zzbbh zzbbhVar = new zzbbh();
                this.zzyu.execute(new Runnable(zzbbhVar, str2) { // from class: com.google.android.gms.internal.ads.zzarr
                    private final String zzdft;
                    private final zzbbh zzdpt;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdpt = zzbbhVar;
                        this.zzdft = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzdpt.zzes(this.zzdft);
                    }
                });
            }
        }
    }

    private final Uri.Builder zza(String str, String str2, String str3, int i) {
        boolean z;
        String str4;
        try {
            z = Wrappers.packageManager(this.zzcle).isCallerInstantApp();
        } catch (Throwable th) {
            zzbbd.zzc("Error fetching instant app info", th);
            z = false;
        }
        try {
            str4 = this.zzcle.getPackageName();
        } catch (Throwable unused) {
            zzbbd.zzfe("Cannot obtain package name, proceeding.");
            str4 = EnvironmentCompat.MEDIA_UNKNOWN;
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (!str6.startsWith(str5)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 1 + String.valueOf(str6).length());
            sb.append(str5);
            sb.append(" ");
            sb.append(str6);
            str6 = sb.toString();
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str6).appendQueryParameter("js", this.zzdpq.zzbra).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", zzaat.zzrd())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "317778048").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", zzwe.zzpv()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzact.zzdbj.get()));
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpp)).booleanValue()) {
            appendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzcle))).appendQueryParameter("lite", this.zzdpq.zzedt ? "1" : "0");
        }
        return appendQueryParameter2;
    }
}
