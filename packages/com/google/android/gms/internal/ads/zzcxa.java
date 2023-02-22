package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxa extends zzape {
    private final String zzdfe;
    private final zzapa zzgpn;
    private zzbbq<JSONObject> zzgpo;
    private final JSONObject zzgpp;
    private boolean zzgpq;

    public zzcxa(String str, zzapa zzapaVar, zzbbq<JSONObject> zzbbqVar) {
        JSONObject jSONObject = new JSONObject();
        this.zzgpp = jSONObject;
        this.zzgpq = false;
        this.zzgpo = zzbbqVar;
        this.zzdfe = str;
        this.zzgpn = zzapaVar;
        try {
            jSONObject.put("adapter_version", zzapaVar.zztw().toString());
            this.zzgpp.put("sdk_version", this.zzgpn.zztx().toString());
            this.zzgpp.put(AppMeasurementSdk.ConditionalUserProperty.NAME, this.zzdfe);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final synchronized void zzds(String str) throws RemoteException {
        if (this.zzgpq) {
            return;
        }
        if (str == null) {
            onFailure("Adapter returned null signals");
            return;
        }
        try {
            this.zzgpp.put("signals", str);
        } catch (JSONException unused) {
        }
        this.zzgpo.set(this.zzgpp);
        this.zzgpq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final synchronized void onFailure(String str) throws RemoteException {
        if (this.zzgpq) {
            return;
        }
        try {
            this.zzgpp.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.zzgpo.set(this.zzgpp);
        this.zzgpq = true;
    }
}
