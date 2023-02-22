package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaqc {
    private final boolean zzdna;
    private final boolean zzdnb;
    private final boolean zzdnc;
    private final boolean zzdnd;
    private final boolean zzdne;

    private zzaqc(zzaqe zzaqeVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        z = zzaqeVar.zzdna;
        this.zzdna = z;
        z2 = zzaqeVar.zzdnb;
        this.zzdnb = z2;
        z3 = zzaqeVar.zzdnc;
        this.zzdnc = z3;
        z4 = zzaqeVar.zzdnd;
        this.zzdnd = z4;
        z5 = zzaqeVar.zzdne;
        this.zzdne = z5;
    }

    public final JSONObject zzul() {
        try {
            return new JSONObject().put("sms", this.zzdna).put("tel", this.zzdnb).put("calendar", this.zzdnc).put("storePicture", this.zzdnd).put("inlineVideo", this.zzdne);
        } catch (JSONException e) {
            zzaxy.zzc("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
