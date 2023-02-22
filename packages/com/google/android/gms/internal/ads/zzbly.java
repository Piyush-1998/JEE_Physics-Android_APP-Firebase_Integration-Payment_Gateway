package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.firebase.database.core.ServerValues;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbly implements zzaln<zzbmc> {
    private final PowerManager zzaaj;
    private final zzqo zzfme;
    private final Context zzvr;

    public zzbly(Context context, zzqo zzqoVar) {
        this.zzvr = context;
        this.zzfme = zzqoVar;
        this.zzaaj = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzaln
    /* renamed from: zza */
    public final JSONObject zzj(zzbmc zzbmcVar) throws JSONException {
        boolean isScreenOn;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        if (zzbmcVar.zzfmw == null) {
            jSONObject = new JSONObject();
        } else {
            zzqr zzqrVar = zzbmcVar.zzfmw;
            if (this.zzfme.zzlt() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzqrVar.zzbro;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzfme.zzls()).put("activeViewJSON", this.zzfme.zzlt()).put(ServerValues.NAME_OP_TIMESTAMP, zzbmcVar.timestamp).put("adFormat", this.zzfme.zzlr()).put("hashCode", this.zzfme.getUniqueId()).put("isMraid", false).put("isStopped", false).put("isPaused", zzbmcVar.zzfmt).put("isNative", this.zzfme.isNative());
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.zzaaj.isInteractive();
            } else {
                isScreenOn = this.zzaaj.isScreenOn();
            }
            put.put("isScreenOn", isScreenOn).put("appMuted", com.google.android.gms.ads.internal.zzp.zzku().zzqe()).put("appVolume", com.google.android.gms.ads.internal.zzp.zzku().zzqd()).put("deviceVolume", zzayz.zzbh(this.zzvr.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zzvr.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzqrVar.zzaaq).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzqrVar.zzbrp.top).put("bottom", zzqrVar.zzbrp.bottom).put("left", zzqrVar.zzbrp.left).put("right", zzqrVar.zzbrp.right)).put("adBox", new JSONObject().put("top", zzqrVar.zzbrq.top).put("bottom", zzqrVar.zzbrq.bottom).put("left", zzqrVar.zzbrq.left).put("right", zzqrVar.zzbrq.right)).put("globalVisibleBox", new JSONObject().put("top", zzqrVar.zzbrr.top).put("bottom", zzqrVar.zzbrr.bottom).put("left", zzqrVar.zzbrr.left).put("right", zzqrVar.zzbrr.right)).put("globalVisibleBoxVisible", zzqrVar.zzbrs).put("localVisibleBox", new JSONObject().put("top", zzqrVar.zzbrt.top).put("bottom", zzqrVar.zzbrt.bottom).put("left", zzqrVar.zzbrt.left).put("right", zzqrVar.zzbrt.right)).put("localVisibleBoxVisible", zzqrVar.zzbru).put("hitBox", new JSONObject().put("top", zzqrVar.zzbrv.top).put("bottom", zzqrVar.zzbrv.bottom).put("left", zzqrVar.zzbrv.left).put("right", zzqrVar.zzbrv.right)).put("screenDensity", this.zzvr.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzbmcVar.zzbrk);
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpn)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                if (zzqrVar.zzbrx != null) {
                    for (Rect rect2 : zzqrVar.zzbrx) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzbmcVar.zzfmv)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
