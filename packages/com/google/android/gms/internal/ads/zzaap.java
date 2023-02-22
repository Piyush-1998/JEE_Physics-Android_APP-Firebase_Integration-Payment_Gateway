package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzaap implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzcle;
    private final Object lock = new Object();
    private final ConditionVariable zzclb = new ConditionVariable();
    private volatile boolean zzzh = false;
    private volatile boolean zzclc = false;
    private SharedPreferences zzcld = null;
    private Bundle metaData = new Bundle();
    private JSONObject zzclf = new JSONObject();

    public final void initialize(Context context) {
        if (this.zzzh) {
            return;
        }
        synchronized (this.lock) {
            if (this.zzzh) {
                return;
            }
            if (!this.zzclc) {
                this.zzclc = true;
            }
            Context applicationContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            this.zzcle = applicationContext;
            try {
                this.metaData = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzcle.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null && context != null) {
                Context applicationContext2 = context.getApplicationContext();
                if (applicationContext2 != null) {
                    context = applicationContext2;
                }
                remoteContext = context;
            }
            if (remoteContext == null) {
                this.zzclc = false;
                this.zzclb.open();
                return;
            }
            zzwe.zzps();
            SharedPreferences sharedPreferences = remoteContext.getSharedPreferences("google_ads_flags", 0);
            this.zzcld = sharedPreferences;
            if (sharedPreferences != null) {
                sharedPreferences.registerOnSharedPreferenceChangeListener(this);
            }
            zzadb.zza(new zzaau(this));
            zzrf();
            this.zzzh = true;
            this.zzclc = false;
            this.zzclb.open();
        }
    }

    public final <T> T zzd(final zzaai<T> zzaaiVar) {
        if (!this.zzclb.block(5000L)) {
            synchronized (this.lock) {
                if (!this.zzclc) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzzh || this.zzcld == null) {
            synchronized (this.lock) {
                if (this.zzzh && this.zzcld != null) {
                }
                return zzaaiVar.zzrc();
            }
        }
        if (zzaaiVar.getSource() == 2) {
            Bundle bundle = this.metaData;
            if (bundle == null) {
                return zzaaiVar.zzrc();
            }
            return zzaaiVar.zza(bundle);
        } else if (zzaaiVar.getSource() == 1 && this.zzclf.has(zzaaiVar.getKey())) {
            return zzaaiVar.zzb(this.zzclf);
        } else {
            return (T) zzbal.zza(new zzdsz(this, zzaaiVar) { // from class: com.google.android.gms.internal.ads.zzaas
                private final zzaap zzclg;
                private final zzaai zzclh;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzclg = this;
                    this.zzclh = zzaaiVar;
                }

                @Override // com.google.android.gms.internal.ads.zzdsz
                public final Object get() {
                    return this.zzclg.zze(this.zzclh);
                }
            });
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzrf();
        }
    }

    private final void zzrf() {
        if (this.zzcld == null) {
            return;
        }
        try {
            this.zzclf = new JSONObject((String) zzbal.zza(new zzdsz(this) { // from class: com.google.android.gms.internal.ads.zzaar
                private final zzaap zzclg;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzclg = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdsz
                public final Object get() {
                    return this.zzclg.zzrg();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzrg() {
        return this.zzcld.getString("flag_configuration", "{}");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zze(zzaai zzaaiVar) {
        return zzaaiVar.zza(this.zzcld);
    }
}
