package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcjk {
    private final Executor executor;
    private final Map<String, Map<String, JSONObject>> zzgea = new ConcurrentHashMap();
    private JSONObject zzgeb;
    private boolean zzxi;

    public zzcjk(Executor executor) {
        this.executor = executor;
    }

    public final void zzanu() {
        com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzb(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjj
            private final zzcjk zzgdz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdz = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgdz.zzanx();
            }
        });
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjm
            private final zzcjk zzgdz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdz = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgdz.zzanw();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzanv */
    public final synchronized void zzany() {
        Map<String, JSONObject> map;
        this.zzxi = true;
        zzaxl zzxe = com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxe();
        if (zzxe == null) {
            return;
        }
        JSONObject zzws = zzxe.zzws();
        if (zzws == null) {
            return;
        }
        this.zzgeb = zzws.optJSONObject("ad_unit_patterns");
        JSONArray optJSONArray = zzws.optJSONArray("ad_unit_id_settings");
        if (optJSONArray == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("ad_unit_id");
                String optString2 = optJSONObject.optString("format");
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                if (optString != null && optJSONObject2 != null && optString2 != null) {
                    if (this.zzgea.containsKey(optString2)) {
                        map = this.zzgea.get(optString2);
                    } else {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        this.zzgea.put(optString2, concurrentHashMap);
                        map = concurrentHashMap;
                    }
                    map.put(optString, optJSONObject2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzanx() {
        this.executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcjl
            private final zzcjk zzgdz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgdz = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgdz.zzany();
            }
        });
    }
}
