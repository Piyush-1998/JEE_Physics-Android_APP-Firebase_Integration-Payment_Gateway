package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzayd implements zzaya {
    private SharedPreferences zzcld;
    private boolean zzdzm;
    private zzdvt<?> zzdzo;
    private SharedPreferences.Editor zzdzq;
    private String zzdzs;
    private String zzdzt;
    private final Object lock = new Object();
    private final List<Runnable> zzdzn = new ArrayList();
    private zzrk zzdzp = null;
    private boolean zzdzr = false;
    private boolean zzdqd = true;
    private boolean zzdqq = false;
    private String zzdqt = "";
    private long zzdzu = 0;
    private long zzdzv = 0;
    private long zzdzw = 0;
    private int zzdzx = -1;
    private int zzdzy = 0;
    private Set<String> zzdzz = Collections.emptySet();
    private JSONObject zzeaa = new JSONObject();
    private boolean zzdsc = true;
    private boolean zzdso = true;
    private String zzeab = null;
    private int zzeac = -1;

    public final void zza(final Context context, String str, boolean z) {
        final String concat;
        synchronized (this.lock) {
            if (this.zzcld != null) {
                return;
            }
            if (str == null) {
                concat = "admob";
            } else {
                String valueOf = String.valueOf(str);
                concat = valueOf.length() != 0 ? "admob__".concat(valueOf) : new String("admob__");
            }
            this.zzdzo = zzbbi.zzedu.zzf(new Runnable(this, context, concat) { // from class: com.google.android.gms.internal.ads.zzayc
                private final Context zzcjx;
                private final String zzdin;
                private final zzayd zzdzl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdzl = this;
                    this.zzcjx = context;
                    this.zzdin = concat;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzdzl.zzq(this.zzcjx, this.zzdin);
                }
            });
            this.zzdzm = z;
        }
    }

    private final void zzxl() {
        zzdvt<?> zzdvtVar = this.zzdzo;
        if (zzdvtVar == null || zzdvtVar.isDone()) {
            return;
        }
        try {
            this.zzdzo.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            zzaxy.zzd("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            zzaxy.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            zzaxy.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            zzaxy.zzc("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final Bundle zzxm() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.lock) {
            bundle.putBoolean("use_https", this.zzdqd);
            bundle.putBoolean("content_url_opted_out", this.zzdsc);
            bundle.putBoolean("content_vertical_opted_out", this.zzdso);
            bundle.putBoolean("auto_collect_location", this.zzdqq);
            bundle.putInt("version_code", this.zzdzy);
            bundle.putStringArray("never_pool_slots", (String[]) this.zzdzz.toArray(new String[0]));
            bundle.putString("app_settings_json", this.zzdqt);
            bundle.putLong("app_settings_last_update_ms", this.zzdzu);
            bundle.putLong("app_last_background_time_ms", this.zzdzv);
            bundle.putInt("request_in_session_count", this.zzdzx);
            bundle.putLong("first_ad_req_time_ms", this.zzdzw);
            bundle.putString("native_advanced_settings", this.zzeaa.toString());
            bundle.putString("display_cutout", this.zzeab);
            bundle.putInt("app_measurement_npa", this.zzeac);
            if (this.zzdzs != null) {
                bundle.putString("content_url_hashes", this.zzdzs);
            }
            if (this.zzdzt != null) {
                bundle.putString("content_vertical_hashes", this.zzdzt);
            }
        }
        return bundle;
    }

    private final void zzc(Bundle bundle) {
        zzbbi.zzedu.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzayf
            private final zzayd zzdzl;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdzl = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdzl.zzwx();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final zzrk zzwx() {
        if (this.zzdzm) {
            if (!(zzwy() && zzxa()) && zzaci.zzczx.get().booleanValue()) {
                synchronized (this.lock) {
                    if (Looper.getMainLooper() == null) {
                        return null;
                    }
                    if (this.zzdzp == null) {
                        this.zzdzp = new zzrk();
                    }
                    this.zzdzp.zzmg();
                    zzaxy.zzfd("start fetching content...");
                    return this.zzdzp;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzao(boolean z) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdsc == z) {
                return;
            }
            this.zzdsc = z;
            if (this.zzdzq != null) {
                this.zzdzq.putBoolean("content_url_opted_out", z);
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.zzdsc);
            bundle.putBoolean("content_vertical_opted_out", this.zzdso);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzwy() {
        boolean z;
        zzxl();
        synchronized (this.lock) {
            z = this.zzdsc;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzej(String str) {
        zzxl();
        synchronized (this.lock) {
            if (str != null) {
                if (!str.equals(this.zzdzs)) {
                    this.zzdzs = str;
                    if (this.zzdzq != null) {
                        this.zzdzq.putString("content_url_hashes", str);
                        this.zzdzq.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    zzc(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final String zzwz() {
        String str;
        zzxl();
        synchronized (this.lock) {
            str = this.zzdzs;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzap(boolean z) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdso == z) {
                return;
            }
            this.zzdso = z;
            if (this.zzdzq != null) {
                this.zzdzq.putBoolean("content_vertical_opted_out", z);
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.zzdsc);
            bundle.putBoolean("content_vertical_opted_out", this.zzdso);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzxa() {
        boolean z;
        zzxl();
        synchronized (this.lock) {
            z = this.zzdso;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzek(String str) {
        zzxl();
        synchronized (this.lock) {
            if (str != null) {
                if (!str.equals(this.zzdzt)) {
                    this.zzdzt = str;
                    if (this.zzdzq != null) {
                        this.zzdzq.putString("content_vertical_hashes", str);
                        this.zzdzq.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    zzc(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final String zzxb() {
        String str;
        zzxl();
        synchronized (this.lock) {
            str = this.zzdzt;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzaq(boolean z) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdqq == z) {
                return;
            }
            this.zzdqq = z;
            if (this.zzdzq != null) {
                this.zzdzq.putBoolean("auto_collect_location", z);
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final boolean zzxc() {
        boolean z;
        zzxl();
        synchronized (this.lock) {
            z = this.zzdqq;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzdf(int i) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdzy == i) {
                return;
            }
            this.zzdzy = i;
            if (this.zzdzq != null) {
                this.zzdzq.putInt("version_code", i);
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", i);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final int zzxd() {
        int i;
        zzxl();
        synchronized (this.lock) {
            i = this.zzdzy;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzel(String str) {
        zzxl();
        synchronized (this.lock) {
            long currentTimeMillis = com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis();
            this.zzdzu = currentTimeMillis;
            if (str != null && !str.equals(this.zzdqt)) {
                this.zzdqt = str;
                if (this.zzdzq != null) {
                    this.zzdzq.putString("app_settings_json", str);
                    this.zzdzq.putLong("app_settings_last_update_ms", currentTimeMillis);
                    this.zzdzq.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("app_settings_json", str);
                bundle.putLong("app_settings_last_update_ms", currentTimeMillis);
                zzc(bundle);
                for (Runnable runnable : this.zzdzn) {
                    runnable.run();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final zzaxl zzxe() {
        zzaxl zzaxlVar;
        zzxl();
        synchronized (this.lock) {
            zzaxlVar = new zzaxl(this.zzdqt, this.zzdzu);
        }
        return zzaxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzb(Runnable runnable) {
        this.zzdzn.add(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzez(long j) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdzv == j) {
                return;
            }
            this.zzdzv = j;
            if (this.zzdzq != null) {
                this.zzdzq.putLong("app_last_background_time_ms", j);
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final long zzxf() {
        long j;
        zzxl();
        synchronized (this.lock) {
            j = this.zzdzv;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzdg(int i) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdzx == i) {
                return;
            }
            this.zzdzx = i;
            if (this.zzdzq != null) {
                this.zzdzq.putInt("request_in_session_count", i);
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", i);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final int zzxg() {
        int i;
        zzxl();
        synchronized (this.lock) {
            i = this.zzdzx;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzfa(long j) {
        zzxl();
        synchronized (this.lock) {
            if (this.zzdzw == j) {
                return;
            }
            this.zzdzw = j;
            if (this.zzdzq != null) {
                this.zzdzq.putLong("first_ad_req_time_ms", j);
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j);
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final long zzxh() {
        long j;
        zzxl();
        synchronized (this.lock) {
            j = this.zzdzw;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zza(String str, String str2, boolean z) {
        zzxl();
        synchronized (this.lock) {
            JSONArray optJSONArray = this.zzeaa.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = i;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.zzp.zzkw().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzeaa.put(str, optJSONArray);
            } catch (JSONException e) {
                zzaxy.zzd("Could not update native advanced settings", e);
            }
            if (this.zzdzq != null) {
                this.zzdzq.putString("native_advanced_settings", this.zzeaa.toString());
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.zzeaa.toString());
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final JSONObject zzxi() {
        JSONObject jSONObject;
        zzxl();
        synchronized (this.lock) {
            jSONObject = this.zzeaa;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzxj() {
        zzxl();
        synchronized (this.lock) {
            this.zzeaa = new JSONObject();
            if (this.zzdzq != null) {
                this.zzdzq.remove("native_advanced_settings");
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            zzc(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final String zzxk() {
        String str;
        zzxl();
        synchronized (this.lock) {
            str = this.zzeab;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzem(String str) {
        zzxl();
        synchronized (this.lock) {
            if (TextUtils.equals(this.zzeab, str)) {
                return;
            }
            this.zzeab = str;
            if (this.zzdzq != null) {
                this.zzdzq.putString("display_cutout", str);
                this.zzdzq.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("display_cutout", str);
            zzc(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        synchronized (this.lock) {
            this.zzcld = sharedPreferences;
            this.zzdzq = edit;
            if (PlatformVersion.isAtLeastM() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.zzdzr = z;
            this.zzdqd = this.zzcld.getBoolean("use_https", this.zzdqd);
            this.zzdsc = this.zzcld.getBoolean("content_url_opted_out", this.zzdsc);
            this.zzdzs = this.zzcld.getString("content_url_hashes", this.zzdzs);
            this.zzdqq = this.zzcld.getBoolean("auto_collect_location", this.zzdqq);
            this.zzdso = this.zzcld.getBoolean("content_vertical_opted_out", this.zzdso);
            this.zzdzt = this.zzcld.getString("content_vertical_hashes", this.zzdzt);
            this.zzdzy = this.zzcld.getInt("version_code", this.zzdzy);
            this.zzdqt = this.zzcld.getString("app_settings_json", this.zzdqt);
            this.zzdzu = this.zzcld.getLong("app_settings_last_update_ms", this.zzdzu);
            this.zzdzv = this.zzcld.getLong("app_last_background_time_ms", this.zzdzv);
            this.zzdzx = this.zzcld.getInt("request_in_session_count", this.zzdzx);
            this.zzdzw = this.zzcld.getLong("first_ad_req_time_ms", this.zzdzw);
            this.zzdzz = this.zzcld.getStringSet("never_pool_slots", this.zzdzz);
            this.zzeab = this.zzcld.getString("display_cutout", this.zzeab);
            this.zzeac = this.zzcld.getInt("app_measurement_npa", this.zzeac);
            try {
                this.zzeaa = new JSONObject(this.zzcld.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                zzaxy.zzd("Could not convert native advanced settings to json object", e);
            }
            zzc(zzxm());
        }
    }
}
