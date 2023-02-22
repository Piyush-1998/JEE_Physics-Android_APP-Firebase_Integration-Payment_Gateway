package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcln {
    private final Executor executor;
    private final String packageName;
    private final String zzbra;
    private final zzbbh zzeck;
    private final boolean zzgfm;
    private final Context zzvr;
    private final String zzcya = zzach.zzczu.get();
    private final Map<String, String> zzgff = new HashMap();

    public zzcln(Executor executor, zzbbh zzbbhVar, Context context, zzbbg zzbbgVar) {
        this.executor = executor;
        this.zzeck = zzbbhVar;
        this.zzvr = context;
        this.packageName = context.getPackageName();
        this.zzgfm = ((double) zzwe.zzpx().nextFloat()) <= zzach.zzczt.get().doubleValue();
        this.zzbra = zzbbgVar.zzbra;
        this.zzgff.put("s", "gmob_sdk");
        this.zzgff.put("v", "3");
        this.zzgff.put("os", Build.VERSION.RELEASE);
        this.zzgff.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.zzgff;
        com.google.android.gms.ads.internal.zzp.zzkp();
        map.put("device", zzayh.zzxp());
        this.zzgff.put("app", this.packageName);
        Map<String, String> map2 = this.zzgff;
        com.google.android.gms.ads.internal.zzp.zzkp();
        map2.put("is_lite_sdk", zzayh.zzaz(this.zzvr) ? "1" : "0");
        this.zzgff.put("e", TextUtils.join(",", zzaat.zzre()));
        this.zzgff.put("sdkVersion", this.zzbra);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzn(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.zzcya).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        final String uri = buildUpon.build().toString();
        if (this.zzgfm) {
            this.executor.execute(new Runnable(this, uri) { // from class: com.google.android.gms.internal.ads.zzclq
                private final String zzdft;
                private final zzcln zzgfp;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgfp = this;
                    this.zzdft = uri;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzgfp.zzgi(this.zzdft);
                }
            });
        }
        zzaxy.zzei(uri);
    }

    public final Map<String, String> zzaos() {
        return new HashMap(this.zzgff);
    }

    public final ConcurrentHashMap<String, String> zzaot() {
        return new ConcurrentHashMap<>(this.zzgff);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzgi(String str) {
        this.zzeck.zzes(str);
    }
}
