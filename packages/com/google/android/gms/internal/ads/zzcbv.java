package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.firebase.database.core.ServerValues;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcbv implements zzcdd {
    private final zzbbg zzbpa;
    private final Clock zzbpw;
    private final zzeg zzenn;
    private final zzdps zzfli;
    private final zzcdg zzfod;
    private final zzdkx zzfpf;
    private final zzdln zzfqn;
    private final JSONObject zzfvr;
    private final zzchc zzfvs;
    private final zzccv zzfvt;
    private final zzbtl zzfvu;
    private final zzbst zzfvv;
    private final zzbma zzfvw;
    private final zzcdy zzfvx;
    private final zzbyr zzfvy;
    private boolean zzfwa;
    private zzxr zzfwh;
    private final Context zzvr;
    private boolean zzfvz = false;
    private boolean zzfwb = false;
    private boolean zzfwc = false;
    private Point zzfwd = new Point();
    private Point zzfwe = new Point();
    private long zzfwf = 0;
    private long zzfwg = 0;

    public zzcbv(Context context, zzcdg zzcdgVar, JSONObject jSONObject, zzchc zzchcVar, zzccv zzccvVar, zzeg zzegVar, zzbtl zzbtlVar, zzbst zzbstVar, zzdkx zzdkxVar, zzbbg zzbbgVar, zzdln zzdlnVar, zzbma zzbmaVar, zzcdy zzcdyVar, Clock clock, zzbyr zzbyrVar, zzdps zzdpsVar) {
        this.zzvr = context;
        this.zzfod = zzcdgVar;
        this.zzfvr = jSONObject;
        this.zzfvs = zzchcVar;
        this.zzfvt = zzccvVar;
        this.zzenn = zzegVar;
        this.zzfvu = zzbtlVar;
        this.zzfvv = zzbstVar;
        this.zzfpf = zzdkxVar;
        this.zzbpa = zzbbgVar;
        this.zzfqn = zzdlnVar;
        this.zzfvw = zzbmaVar;
        this.zzfvx = zzcdyVar;
        this.zzbpw = clock;
        this.zzfvy = zzbyrVar;
        this.zzfli = zzdpsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzfwd = new Point();
        this.zzfwe = new Point();
        if (!this.zzfwa) {
            this.zzfvy.zzv(view);
            this.zzfwa = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzfvw.zzo(this);
        boolean zzdi = zzbah.zzdi(this.zzbpa.zzedr);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    if (zzdi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                View view3 = entry2.getValue().get();
                if (view3 != null) {
                    if (zzdi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, Map<String, WeakReference<View>> map) {
        this.zzfwd = new Point();
        this.zzfwe = new Point();
        this.zzfvy.zzw(view);
        this.zzfwa = false;
    }

    private final boolean zzfy(String str) {
        JSONObject optJSONObject = this.zzfvr.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        JSONObject zza = zzbah.zza(this.zzvr, map, map2, view2);
        JSONObject zza2 = zzbah.zza(this.zzvr, view2);
        JSONObject zzt = zzbah.zzt(view2);
        JSONObject zzb = zzbah.zzb(this.zzvr, view2);
        String zzb2 = zzb(view, map);
        zza(((Boolean) zzwe.zzpu().zzd(zzaat.zzcrf)).booleanValue() ? view2 : view, zza2, zza, zzt, zzb, zzb2, zzbah.zza(zzb2, this.zzvr, this.zzfwe, this.zzfwd), null, z, false);
    }

    private final String zzb(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int zzaln = this.zzfvt.zzaln();
        if (zzaln != 1) {
            if (zzaln != 2) {
                if (zzaln != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzfz(String str) {
        zza(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(Bundle bundle) {
        if (bundle == null) {
            zzaxy.zzef("Click data is null. No click is reported.");
        } else if (!zzfy("click_reporting")) {
            zzaxy.zzfc("The ad slot cannot handle external click events. You must be whitelisted to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zza(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.zzp.zzkp().zza(bundle, (JSONObject) null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (!this.zzfwc) {
            zzaxy.zzef("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!zzalb()) {
            zzaxy.zzef("Custom click reporting failed. Ad unit id not whitelisted.");
        } else {
            JSONObject zza = zzbah.zza(this.zzvr, map, map2, view);
            JSONObject zza2 = zzbah.zza(this.zzvr, view);
            JSONObject zzt = zzbah.zzt(view);
            JSONObject zzb = zzbah.zzb(this.zzvr, view);
            String zzb2 = zzb(null, map);
            zza(view, zza2, zza, zzt, zzb, zzb2, zzbah.zza(zzb2, this.zzvr, this.zzfwe, this.zzfwd), null, z, true);
        }
    }

    private final boolean zzalb() {
        return this.zzfvr.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzsr() {
        this.zzfwc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final boolean isCustomClickGestureEnabled() {
        return zzalb();
    }

    private final void zza(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzfvr);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzfod.zzge(this.zzfvt.getCustomTemplateId()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zzfvt.zzaln());
            jSONObject8.put("view_aware_api_used", z);
            jSONObject8.put("custom_mute_requested", this.zzfqn.zzdla != null && this.zzfqn.zzdla.zzbno);
            jSONObject8.put("custom_mute_enabled", (this.zzfvt.getMuteThisAdReasons().isEmpty() || this.zzfvt.zzalq() == null) ? false : true);
            if (this.zzfvx.zzamw() != null && this.zzfvr.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put(ServerValues.NAME_OP_TIMESTAMP, this.zzbpw.currentTimeMillis());
            if (this.zzfwc && zzalb()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzfod.zzge(this.zzfvt.getCustomTemplateId()) != null);
            jSONObject8.put("click_signals", zzx(view));
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzbpw.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzfwf);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzfwg);
            jSONObject7.put("touch_signal", jSONObject9);
            zzbbm.zza(this.zzfvs.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e) {
            zzaxy.zzc("Unable to create click JSON.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, MotionEvent motionEvent, View view2) {
        this.zzfwd = zzbah.zza(motionEvent, view2);
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        this.zzfwg = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzfwf = currentTimeMillis;
            this.zzfwe = this.zzfwd;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(this.zzfwd.x, this.zzfwd.y);
        this.zzenn.zza(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(Bundle bundle) {
        if (bundle == null) {
            zzaxy.zzef("Touch event data is null. No touch event is reported.");
        } else if (!zzfy("touch_reporting")) {
            zzaxy.zzfc("The ad slot cannot handle external touch events. You must be whitelisted to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.zzenn.zzca().zza((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzalc() {
        zza(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void setClickConfirmingView(View view) {
        if (!this.zzfvr.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzaxy.zzfe("setClickConfirmingView: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzcdy zzcdyVar = this.zzfvx;
        if (view != null) {
            view.setOnClickListener(zzcdyVar);
            view.setClickable(true);
            zzcdyVar.zzfzx = new WeakReference<>(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(zzafr zzafrVar) {
        if (!this.zzfvr.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzaxy.zzfe("setUnconfirmedClickListener: Your account need to be whitelisted to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzfvx.zza(zzafrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void cancelUnconfirmedClick() {
        if (this.zzfvr.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzfvx.cancelUnconfirmedClick();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(zzxv zzxvVar) {
        try {
            if (this.zzfwb) {
                return;
            }
            if (zzxvVar == null && this.zzfvt.zzalq() != null) {
                this.zzfwb = true;
                this.zzfli.zzes(this.zzfvt.zzalq().zzqh());
                zzald();
                return;
            }
            this.zzfwb = true;
            this.zzfli.zzes(zzxvVar.zzqh());
            zzald();
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(zzxr zzxrVar) {
        this.zzfwh = zzxrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzald() {
        try {
            if (this.zzfwh != null) {
                this.zzfwh.onAdMuted();
            }
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zza(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        zza(zzbah.zza(this.zzvr, view), zzbah.zza(this.zzvr, map, map2, view), zzbah.zzt(view), zzbah.zzb(this.zzvr, view), zzy(view), null, zzbah.zza(this.zzfpf));
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzale() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzfvr);
            zzbbm.zza(this.zzfvs.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzbbd.zzc("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final boolean zzi(Bundle bundle) {
        if (!zzfy("impression_reporting")) {
            zzaxy.zzfc("The ad slot cannot handle external impression events. You must be whitelisted to whitelisted to be able to report your impression events.");
            return false;
        }
        return zza(null, null, null, null, null, com.google.android.gms.ads.internal.zzp.zzkp().zza(bundle, (JSONObject) null), false);
    }

    private final boolean zza(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzfvr);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcre)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            jSONObject6.put("screen", zzbah.zzbl(this.zzvr));
            this.zzfvs.zza("/logScionEvent", new zzcbx(this));
            this.zzfvs.zza("/nativeImpression", new zzcca(this));
            zzbbm.zza(this.zzfvs.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzfvz || this.zzfpf.zzhat == null) {
                return true;
            }
            this.zzfvz |= com.google.android.gms.ads.internal.zzp.zzkz().zzb(this.zzvr, this.zzbpa.zzbra, this.zzfpf.zzhat.toString(), this.zzfqn.zzhbv);
            return true;
        } catch (JSONException e) {
            zzaxy.zzc("Unable to create impression JSON.", e);
            return false;
        }
    }

    private final String zzx(View view) {
        try {
            JSONObject optJSONObject = this.zzfvr.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return this.zzenn.zzca().zza(this.zzvr, optJSONObject.optString("click_string"), view);
        } catch (Exception e) {
            zzaxy.zzc("Exception obtaining click signals", e);
            return null;
        }
    }

    private final String zzy(View view) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcre)).booleanValue()) {
            try {
                return this.zzenn.zzca().zza(this.zzvr, view, (Activity) null);
            } catch (Exception unused) {
                zzaxy.zzfc("Exception getting data.");
                return null;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void destroy() {
        this.zzfvs.destroy();
    }
}
