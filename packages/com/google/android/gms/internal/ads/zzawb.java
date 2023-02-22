package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzawb {
    private final AtomicReference<ThreadPoolExecutor> zzdwt = new AtomicReference<>(null);
    private final Object zzdwu = new Object();
    private String zzdwv = null;
    private String zzdww = null;
    private final AtomicBoolean zzdwx = new AtomicBoolean(false);
    private final AtomicInteger zzdwy = new AtomicInteger(-1);
    private final AtomicReference<Object> zzdwz = new AtomicReference<>(null);
    private final AtomicReference<Object> zzdxa = new AtomicReference<>(null);
    private final ConcurrentMap<String, Method> zzdxb = new ConcurrentHashMap(9);
    private final AtomicReference<zzbib> zzdxc = new AtomicReference<>(null);
    private final BlockingQueue<FutureTask<?>> zzdxd = new ArrayBlockingQueue(20);
    private final Object zzdxe = new Object();

    public final boolean zzac(Context context) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnb)).booleanValue() && !this.zzdwx.get()) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnl)).booleanValue()) {
                return true;
            }
            if (this.zzdwy.get() == -1) {
                zzwe.zzpq();
                if (!zzbat.zzd(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    zzwe.zzpq();
                    if (zzbat.zzbo(context)) {
                        zzaxy.zzfe("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        this.zzdwy.set(0);
                    }
                }
                this.zzdwy.set(1);
            }
            if (this.zzdwy.get() == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzad(Context context) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcni)).booleanValue()) {
            if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzwe.zzpu().zzd(zzaat.zzcnj)).intValue()) {
                return false;
            }
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnk)).booleanValue()) {
                try {
                    context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    return false;
                } catch (ClassNotFoundException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void zza(Context context, zzzw zzzwVar) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcno)).booleanValue() && zzac(context) && zzad(context)) {
            synchronized (this.zzdxe) {
            }
        }
    }

    public final void zza(Context context, zzvc zzvcVar) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcno)).booleanValue() && zzac(context) && zzad(context)) {
            synchronized (this.zzdxe) {
            }
        }
    }

    public final void zzf(Context context, final String str) {
        if (zzac(context)) {
            if (zzad(context)) {
                zza("beginAdUnitExposure", new zzawr(str) { // from class: com.google.android.gms.internal.ads.zzawa
                    private final String zzdgb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdgb = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzawr
                    public final void zza(zzbib zzbibVar) {
                        zzbibVar.beginAdUnitExposure(this.zzdgb);
                    }
                });
            } else {
                zza(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void zzg(Context context, final String str) {
        if (zzac(context)) {
            if (zzad(context)) {
                zza("endAdUnitExposure", new zzawr(str) { // from class: com.google.android.gms.internal.ads.zzawh
                    private final String zzdgb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdgb = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzawr
                    public final void zza(zzbib zzbibVar) {
                        zzbibVar.endAdUnitExposure(this.zzdgb);
                    }
                });
            } else {
                zza(context, str, "endAdUnitExposure");
            }
        }
    }

    public final String zzae(Context context) {
        if (zzac(context)) {
            if (zzad(context)) {
                return (String) zza("getCurrentScreenNameOrScreenClass", "", zzawg.zzdxg);
            }
            if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdwz, true)) {
                try {
                    String str = (String) zzn(context, "getCurrentScreenName").invoke(this.zzdwz.get(), new Object[0]);
                    if (str == null) {
                        str = (String) zzn(context, "getCurrentScreenClass").invoke(this.zzdwz.get(), new Object[0]);
                    }
                    return str != null ? str : "";
                } catch (Exception e) {
                    zza(e, "getCurrentScreenName", false);
                    return "";
                }
            }
            return "";
        }
        return "";
    }

    public final void zzh(final Context context, final String str) {
        if (zzac(context) && (context instanceof Activity)) {
            if (zzad(context)) {
                zza("setScreenName", new zzawr(context, str) { // from class: com.google.android.gms.internal.ads.zzawj
                    private final Context zzcxz;
                    private final String zzdft;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzcxz = context;
                        this.zzdft = str;
                    }

                    @Override // com.google.android.gms.internal.ads.zzawr
                    public final void zza(zzbib zzbibVar) {
                        Context context2 = this.zzcxz;
                        zzbibVar.zzb(ObjectWrapper.wrap(context2), this.zzdft, context2.getPackageName());
                    }
                });
            } else if (zza(context, "com.google.firebase.analytics.FirebaseAnalytics", this.zzdxa, false)) {
                try {
                    zzo(context, "setCurrentScreen").invoke(this.zzdxa.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception e) {
                    zza(e, "setCurrentScreen", false);
                }
            }
        }
    }

    public final String zzaf(Context context) {
        if (zzac(context)) {
            synchronized (this.zzdwu) {
                if (this.zzdwv != null) {
                    return this.zzdwv;
                }
                if (zzad(context)) {
                    this.zzdwv = (String) zza("getGmpAppId", this.zzdwv, zzawi.zzdxg);
                } else {
                    this.zzdwv = (String) zza("getGmpAppId", context);
                }
                return this.zzdwv;
            }
        }
        return null;
    }

    public final String zzag(final Context context) {
        if (zzac(context)) {
            long longValue = ((Long) zzwe.zzpu().zzd(zzaat.zzcng)).longValue();
            if (zzad(context)) {
                try {
                    if (longValue < 0) {
                        return (String) zza("getAppInstanceId", (String) null, zzawl.zzdxg);
                    }
                    return (String) zzvu().submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzawk
                        private final zzawb zzdxh;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdxh = this;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzdxh.zzvv();
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused) {
                    return "TIME_OUT";
                } catch (Exception unused2) {
                    return null;
                }
            } else if (longValue < 0) {
                return (String) zza("getAppInstanceId", context);
            } else {
                try {
                    return (String) zzvu().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.zzawn
                        private final Context zzcjx;
                        private final zzawb zzdxh;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzdxh = this;
                            this.zzcjx = context;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zzdxh.zzak(this.zzcjx);
                        }
                    }).get(longValue, TimeUnit.MILLISECONDS);
                } catch (TimeoutException unused3) {
                    return "TIME_OUT";
                } catch (Exception unused4) {
                    return null;
                }
            }
        }
        return null;
    }

    public final String zzah(Context context) {
        if (zzac(context)) {
            if (zzad(context)) {
                Long l = (Long) zza("getAdEventId", (String) null, zzawm.zzdxg);
                if (l != null) {
                    return Long.toString(l.longValue());
                }
                return null;
            }
            Object zza = zza("generateEventId", context);
            if (zza != null) {
                return zza.toString();
            }
            return null;
        }
        return null;
    }

    public final String zzai(Context context) {
        if (zzac(context)) {
            synchronized (this.zzdwu) {
                if (this.zzdww != null) {
                    return this.zzdww;
                }
                if (zzad(context)) {
                    this.zzdww = (String) zza("getAppIdOrigin", this.zzdww, zzawd.zzdxg);
                } else {
                    this.zzdww = "fa";
                }
                return this.zzdww;
            }
        }
        return null;
    }

    public final void zzi(Context context, String str) {
        zza(context, "_ac", str, (Bundle) null);
    }

    public final void zzj(Context context, String str) {
        zza(context, "_ai", str, (Bundle) null);
    }

    public final void zzk(Context context, String str) {
        zza(context, "_aq", str, (Bundle) null);
    }

    public final void zzl(Context context, String str) {
        zza(context, "_aa", str, (Bundle) null);
    }

    public final void zza(Context context, String str, String str2, String str3, int i) {
        if (zzac(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zza(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            zzaxy.zzei(sb.toString());
        }
    }

    private final void zza(Context context, final String str, String str2, Bundle bundle) {
        if (zzac(context)) {
            final Bundle zzl = zzl(str2, str);
            if (bundle != null) {
                zzl.putAll(bundle);
            }
            if (zzad(context)) {
                zza("logEventInternal", new zzawr(str, zzl) { // from class: com.google.android.gms.internal.ads.zzawc
                    private final String zzdgb;
                    private final Bundle zzdxf;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdgb = str;
                        this.zzdxf = zzl;
                    }

                    @Override // com.google.android.gms.internal.ads.zzawr
                    public final void zza(zzbib zzbibVar) {
                        zzbibVar.logEvent("am", this.zzdgb, this.zzdxf);
                    }
                });
            } else if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdwz, true)) {
                try {
                    zzaj(context).invoke(this.zzdwz.get(), "am", str, zzl);
                } catch (Exception e) {
                    zza(e, "logEventInternal", true);
                }
            }
        }
    }

    private static Bundle zzl(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String valueOf = String.valueOf(str);
            zzaxy.zzc(valueOf.length() != 0 ? "Invalid event ID: ".concat(valueOf) : new String("Invalid event ID: "), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final Method zzaj(Context context) {
        Method method = this.zzdxb.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.zzdxb.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, "logEventInternal", true);
            return null;
        }
    }

    private final Method zzm(Context context, String str) {
        Method method = this.zzdxb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.zzdxb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzn(Context context, String str) {
        Method method = this.zzdxb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.zzdxb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final Method zzo(Context context, String str) {
        Method method = this.zzdxb.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.zzdxb.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e) {
            zza(e, str, false);
            return null;
        }
    }

    private final void zza(Context context, String str, String str2) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdwz, true)) {
            try {
                zzm(context, str2).invoke(this.zzdwz.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                zzaxy.zzei(sb.toString());
            } catch (Exception e) {
                zza(e, str2, false);
            }
        }
    }

    private final Object zza(String str, Context context) {
        if (zza(context, "com.google.android.gms.measurement.AppMeasurement", this.zzdwz, true)) {
            try {
                return zzn(context, str).invoke(this.zzdwz.get(), new Object[0]);
            } catch (Exception e) {
                zza(e, str, true);
                return null;
            }
        }
        return null;
    }

    private final void zza(Exception exc, String str, boolean z) {
        if (this.zzdwx.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        zzaxy.zzfe(sb.toString());
        if (z) {
            zzaxy.zzfe("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.zzdwx.set(true);
        }
    }

    private final ThreadPoolExecutor zzvu() {
        if (this.zzdwt.get() == null) {
            this.zzdwt.compareAndSet(null, new ThreadPoolExecutor(((Integer) zzwe.zzpu().zzd(zzaat.zzcnh)).intValue(), ((Integer) zzwe.zzpu().zzd(zzaat.zzcnh)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzawp(this)));
        }
        return this.zzdwt.get();
    }

    private final boolean zza(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception e) {
                zza(e, "getInstance", z);
                return false;
            }
        }
        return true;
    }

    private final void zza(final String str, final zzawr zzawrVar) {
        synchronized (this.zzdxc) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, zzawrVar, str) { // from class: com.google.android.gms.internal.ads.zzawf
                private final String zzdin;
                private final zzawb zzdxh;
                private final zzawr zzdxi;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdxh = this;
                    this.zzdxi = zzawrVar;
                    this.zzdin = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdxh.zza(this.zzdxi, this.zzdin);
                }
            }, null);
            if (this.zzdxc.get() != null) {
                futureTask.run();
            } else {
                this.zzdxd.offer(futureTask);
            }
        }
    }

    private final <T> T zza(String str, T t, zzawo<T> zzawoVar) {
        synchronized (this.zzdxc) {
            if (this.zzdxc.get() != null) {
                try {
                    return zzawoVar.zzb(this.zzdxc.get());
                } catch (Exception e) {
                    zza(e, str, false);
                }
            }
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzawr zzawrVar, String str) {
        if (this.zzdxc.get() != null) {
            try {
                zzawrVar.zza(this.zzdxc.get());
            } catch (Exception e) {
                zza(e, str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzak(Context context) throws Exception {
        return (String) zza("getAppInstanceId", context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzvv() throws Exception {
        return (String) zza("getAppInstanceId", (String) null, zzawe.zzdxg);
    }
}
