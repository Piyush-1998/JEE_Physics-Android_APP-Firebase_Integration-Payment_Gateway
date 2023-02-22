package com.google.android.gms.internal.ads;

import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsp extends zzye {
    private final String zzfso;
    private final String zzfsp;

    public zzbsp(zzdkx zzdkxVar, String str) {
        this.zzfsp = zzdkxVar == null ? null : zzdkxVar.zzfsp;
        String zzc = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) ? zzc(zzdkxVar) : null;
        this.zzfso = zzc != null ? zzc : str;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final String getMediationAdapterClassName() {
        return this.zzfso;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final String getResponseId() {
        return this.zzfsp;
    }

    private static String zzc(zzdkx zzdkxVar) {
        try {
            return zzdkxVar.zzhar.getString("class_name");
        } catch (JSONException unused) {
            return null;
        }
    }
}
