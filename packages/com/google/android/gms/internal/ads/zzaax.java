package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaax {
    private String zzbra;
    private String zzcya = zzach.zzczu.get();
    private Map<String, String> zzcyb;
    private Context zzvr;

    public zzaax(Context context, String str) {
        String packageName;
        this.zzvr = null;
        this.zzbra = null;
        this.zzvr = context;
        this.zzbra = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzcyb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzcyb.put("v", "3");
        this.zzcyb.put("os", Build.VERSION.RELEASE);
        this.zzcyb.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.zzcyb;
        com.google.android.gms.ads.internal.zzp.zzkp();
        map.put("device", zzayh.zzxp());
        Map<String, String> map2 = this.zzcyb;
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        map2.put("app", packageName);
        Map<String, String> map3 = this.zzcyb;
        com.google.android.gms.ads.internal.zzp.zzkp();
        map3.put("is_lite_sdk", zzayh.zzaz(context) ? "1" : "0");
        Future<zzasu> zzu = com.google.android.gms.ads.internal.zzp.zzla().zzu(this.zzvr);
        try {
            this.zzcyb.put("network_coarse", Integer.toString(zzu.get().zzdtx));
            this.zzcyb.put("network_fine", Integer.toString(zzu.get().zzdty));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzp.zzkt().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzrh() {
        return this.zzcya;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context getContext() {
        return this.zzvr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzls() {
        return this.zzbra;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> zzri() {
        return this.zzcyb;
    }
}
