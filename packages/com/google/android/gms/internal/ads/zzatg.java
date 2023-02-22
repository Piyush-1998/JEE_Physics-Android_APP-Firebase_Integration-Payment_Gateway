package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzatg extends ContextWrapper {
    private Context zzduy;
    private WeakReference<Activity> zzduz;

    private zzatg(Context context) {
        super(context);
        this.zzduz = new WeakReference<>(null);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this;
    }

    public final synchronized void setAppPackageName(String str) throws PackageManager.NameNotFoundException {
        this.zzduy = super.createPackageContext(str, 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized ApplicationInfo getApplicationInfo() {
        if (this.zzduy != null) {
            return this.zzduy.getApplicationInfo();
        }
        return super.getApplicationInfo();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageName() {
        if (this.zzduy != null) {
            return this.zzduy.getPackageName();
        }
        return super.getPackageName();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized String getPackageResourcePath() {
        if (this.zzduy != null) {
            return this.zzduy.getPackageResourcePath();
        }
        return super.getPackageResourcePath();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final synchronized void startActivity(Intent intent) {
        zze(zzd(intent));
    }

    private final synchronized Intent zzd(Intent intent) {
        if (this.zzduy != null && intent.getComponent() != null && intent.getComponent().getPackageName().equals(this.zzduy.getPackageName())) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setClassName(super.getPackageName(), intent.getComponent().getClassName());
            return intent2;
        }
        return intent;
    }

    private final synchronized void zze(Intent intent) {
        Activity activity = this.zzduz.get();
        if (activity == null) {
            intent.addFlags(268435456);
            super.startActivity(intent);
            return;
        }
        Intent intent2 = (Intent) intent.clone();
        intent2.setFlags(intent.getFlags() & (-268435457));
        activity.startActivity(intent2);
    }

    public static zzatg zzaa(Context context) {
        return new zzatg(zzl(context));
    }

    public static Context zzab(Context context) {
        if (context instanceof zzatg) {
            return ((zzatg) context).getBaseContext();
        }
        return zzl(context);
    }

    private static Context zzl(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }
}
