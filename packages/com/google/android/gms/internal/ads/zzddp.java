package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddp implements zzden<zzddm> {
    private final ScheduledExecutorService zzflf;
    private final zzdln zzfqn;
    private final zzdvw zzgay;
    private final zzcws zzgoe;
    private String zzgrv;
    private final zzcwu zzgum;
    private final Context zzvr;

    public zzddp(zzdvw zzdvwVar, ScheduledExecutorService scheduledExecutorService, String str, zzcwu zzcwuVar, Context context, zzdln zzdlnVar, zzcws zzcwsVar) {
        this.zzgay = zzdvwVar;
        this.zzflf = scheduledExecutorService;
        this.zzgrv = str;
        this.zzgum = zzcwuVar;
        this.zzvr = context;
        this.zzfqn = zzdlnVar;
        this.zzgoe = zzcwsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzddm> zzaqs() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcps)).booleanValue()) {
            return zzdvl.zza(new zzdut(this) { // from class: com.google.android.gms.internal.ads.zzddo
                private final zzddp zzgul;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgul = this;
                }

                @Override // com.google.android.gms.internal.ads.zzdut
                public final zzdvt zzard() {
                    return this.zzgul.zzare();
                }
            }, this.zzgay);
        }
        return zzdvl.zzaf(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(String str, List list, Bundle bundle) throws Exception {
        zzbbq zzbbqVar = new zzbbq();
        this.zzgoe.zzgo(str);
        zzapa zzgp = this.zzgoe.zzgp(str);
        if (zzgp == null) {
            throw null;
        }
        zzgp.zza(ObjectWrapper.wrap(this.zzvr), this.zzgrv, bundle, (Bundle) list.get(0), this.zzfqn.zzbpb, new zzcxa(str, zzgp, zzbbqVar));
        return zzbbqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzare() {
        Map<String, List<Bundle>> zzs = this.zzgum.zzs(this.zzgrv, this.zzfqn.zzhbv);
        final ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : zzs.entrySet()) {
            final String key = entry.getKey();
            final List<Bundle> value = entry.getValue();
            final Bundle bundle = this.zzfqn.zzhbu.zzchc != null ? this.zzfqn.zzhbu.zzchc.getBundle(key) : null;
            arrayList.add(zzdvc.zzg(zzdvl.zza(new zzdut(this, key, value, bundle) { // from class: com.google.android.gms.internal.ads.zzddr
                private final String zzdft;
                private final zzddp zzgul;
                private final List zzgun;
                private final Bundle zzguo;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgul = this;
                    this.zzdft = key;
                    this.zzgun = value;
                    this.zzguo = bundle;
                }

                @Override // com.google.android.gms.internal.ads.zzdut
                public final zzdvt zzard() {
                    return this.zzgul.zza(this.zzdft, this.zzgun, this.zzguo);
                }
            }, this.zzgay)).zza(((Long) zzwe.zzpu().zzd(zzaat.zzcpr)).longValue(), TimeUnit.MILLISECONDS, this.zzflf).zza(Throwable.class, new zzdsl(key) { // from class: com.google.android.gms.internal.ads.zzddq
                private final String zzdgb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzdgb = key;
                }

                @Override // com.google.android.gms.internal.ads.zzdsl
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    String valueOf = String.valueOf(this.zzdgb);
                    zzaxy.zzfc(valueOf.length() != 0 ? "Error calling adapter: ".concat(valueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.zzgay));
        }
        return zzdvl.zzk(arrayList).zza(new Callable(arrayList) { // from class: com.google.android.gms.internal.ads.zzddt
            private final List zzgup;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgup = arrayList;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzdvt> list = this.zzgup;
                JSONArray jSONArray = new JSONArray();
                for (zzdvt zzdvtVar : list) {
                    if (((JSONObject) zzdvtVar.get()) != null) {
                        jSONArray.put(zzdvtVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzddm(jSONArray.toString());
            }
        }, this.zzgay);
    }
}
