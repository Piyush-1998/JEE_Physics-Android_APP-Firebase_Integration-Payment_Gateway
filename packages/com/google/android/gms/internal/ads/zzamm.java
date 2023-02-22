package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzamm {
    private static zzamm zzdio;
    private AtomicBoolean zzdip = new AtomicBoolean(false);

    public static zzamm zztn() {
        if (zzdio == null) {
            zzdio = new zzamm();
        }
        return zzdio;
    }

    zzamm() {
    }

    public final Thread zzd(final Context context, final String str) {
        if (this.zzdip.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable(this, context, str) { // from class: com.google.android.gms.internal.ads.zzaml
                private final Context zzcjx;
                private final zzamm zzdim;
                private final String zzdin;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdim = this;
                    this.zzcjx = context;
                    this.zzdin = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzamm.zze(this.zzcjx, this.zzdin);
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }

    public final Thread zzm(final Context context) {
        if (this.zzdip.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable(this, context) { // from class: com.google.android.gms.internal.ads.zzamo
                private final Context zzcjx;
                private final zzamm zzdim;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdim = this;
                    this.zzcjx = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzamm.zzo(this.zzcjx);
                }
            });
            thread.start();
            return thread;
        }
        return null;
    }

    private static void zza(Context context, AppMeasurementSdk appMeasurementSdk) {
        try {
            ((zzbid) zzbbc.zza(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzamn.zzbxs)).zza(ObjectWrapper.wrap(context), new zzamj(appMeasurementSdk));
        } catch (RemoteException | zzbbe | NullPointerException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    private static boolean zzn(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzo(Context context) {
        zzaat.initialize(context);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnn)).booleanValue() && zzn(context)) {
            zza(context, AppMeasurementSdk.getInstance(context));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(Context context, String str) {
        zzaat.initialize(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzwe.zzpu().zzd(zzaat.zzcni)).booleanValue());
        zza(context, AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle));
    }
}
