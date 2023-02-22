package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcmi {
    private final Executor executor;
    private final zzbbg zzbop;
    private final Context zzcle;
    private final Executor zzfmk;
    private final ScheduledExecutorService zzfnh;
    private final WeakReference<Context> zzggf;
    private final zzcji zzggg;
    private final zzcls zzggh;
    private boolean zzggb = false;
    private boolean zzggc = false;
    private final zzbbq<Boolean> zzgge = new zzbbq<>();
    private Map<String, zzaif> zzggi = new ConcurrentHashMap();
    private boolean enabled = true;
    private final long zzggd = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();

    public zzcmi(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, zzcji zzcjiVar, ScheduledExecutorService scheduledExecutorService, zzcls zzclsVar, zzbbg zzbbgVar) {
        this.zzggg = zzcjiVar;
        this.zzcle = context;
        this.zzggf = weakReference;
        this.executor = executor2;
        this.zzfnh = scheduledExecutorService;
        this.zzfmk = executor;
        this.zzggh = zzclsVar;
        this.zzbop = zzbbgVar;
        zza("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public final void disable() {
        this.enabled = false;
    }

    public final void zzb(final zzaim zzaimVar) {
        this.zzgge.addListener(new Runnable(this, zzaimVar) { // from class: com.google.android.gms.internal.ads.zzcmh
            private final zzcmi zzgfz;
            private final zzaim zzgga;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfz = this;
                this.zzgga = zzaimVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgfz.zzc(this.zzgga);
            }
        }, this.zzfmk);
    }

    public final void zzaox() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpy)).booleanValue() && !zzacp.zzdaz.get().booleanValue()) {
            if (this.zzbop.zzedr >= ((Integer) zzwe.zzpu().zzd(zzaat.zzcpz)).intValue() && this.enabled) {
                if (this.zzggb) {
                    return;
                }
                synchronized (this) {
                    if (this.zzggb) {
                        return;
                    }
                    this.zzggh.zzaou();
                    this.zzgge.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcmk
                        private final zzcmi zzgfz;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgfz = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzgfz.zzapc();
                        }
                    }, this.executor);
                    this.zzggb = true;
                    zzdvt<String> zzaoz = zzaoz();
                    this.zzfnh.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcmm
                        private final zzcmi zzgfz;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgfz = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzgfz.zzapb();
                        }
                    }, ((Long) zzwe.zzpu().zzd(zzaat.zzcqb)).longValue(), TimeUnit.SECONDS);
                    zzdvl.zza(zzaoz, new zzcmp(this), this.executor);
                    return;
                }
            }
        }
        if (this.zzggb) {
            return;
        }
        zza("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zzgge.set(false);
        this.zzggb = true;
    }

    public final List<zzaif> zzaoy() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzggi.keySet()) {
            zzaif zzaifVar = this.zzggi.get(str);
            arrayList.add(new zzaif(str, zzaifVar.zzdff, zzaifVar.zzdfg, zzaifVar.description));
        }
        return arrayList;
    }

    private final synchronized zzdvt<String> zzaoz() {
        String zzwp = com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxe().zzwp();
        if (!TextUtils.isEmpty(zzwp)) {
            return zzdvl.zzaf(zzwp);
        }
        final zzbbq zzbbqVar = new zzbbq();
        com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzb(new Runnable(this, zzbbqVar) { // from class: com.google.android.gms.internal.ads.zzcmj
            private final zzcmi zzgfz;
            private final zzbbq zzggj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfz = this;
                this.zzggj = zzbbqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgfz.zza(this.zzggj);
            }
        });
        return zzbbqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzgl(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final Object obj = new Object();
                final zzbbq zzbbqVar = new zzbbq();
                zzdvt zza = zzdvl.zza(zzbbqVar, ((Long) zzwe.zzpu().zzd(zzaat.zzcqa)).longValue(), TimeUnit.SECONDS, this.zzfnh);
                this.zzggh.zzgj(next);
                final long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
                Iterator<String> it = keys;
                zza.addListener(new Runnable(this, obj, zzbbqVar, next, elapsedRealtime) { // from class: com.google.android.gms.internal.ads.zzcml
                    private final Object zzdij;
                    private final String zzgef;
                    private final zzcmi zzgfz;
                    private final zzbbq zzggk;
                    private final long zzggl;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgfz = this;
                        this.zzdij = obj;
                        this.zzggk = zzbbqVar;
                        this.zzgef = next;
                        this.zzggl = elapsedRealtime;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zzgfz.zza(this.zzdij, this.zzggk, this.zzgef, this.zzggl);
                    }
                }, this.executor);
                arrayList.add(zza);
                final zzcmr zzcmrVar = new zzcmr(this, obj, next, elapsedRealtime, zzbbqVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new zzaip(optString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                zza(next, false, "", 0);
                try {
                    try {
                        final zzdlx zzd = this.zzggg.zzd(next, new JSONObject());
                        this.zzfmk.execute(new Runnable(this, zzd, zzcmrVar, arrayList2, next) { // from class: com.google.android.gms.internal.ads.zzcmn
                            private final String zzeng;
                            private final zzcmi zzgfz;
                            private final zzdlx zzggm;
                            private final zzaih zzggn;
                            private final List zzggo;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.zzgfz = this;
                                this.zzggm = zzd;
                                this.zzggn = zzcmrVar;
                                this.zzggo = arrayList2;
                                this.zzeng = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zzgfz.zza(this.zzggm, this.zzggn, this.zzggo, this.zzeng);
                            }
                        });
                    } catch (zzdlr unused2) {
                        zzcmrVar.onInitializationFailed("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    zzbbd.zzc("", e);
                }
                keys = it;
            }
            zzdvl.zzj(arrayList).zza(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzcmo
                private final zzcmi zzgfz;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgfz = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zzgfz.zzapa();
                }
            }, this.executor);
        } catch (JSONException e2) {
            zzaxy.zza("Malformed CLD response", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(String str, boolean z, String str2, int i) {
        this.zzggi.put(str, new zzaif(str, z, i, str2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdlx zzdlxVar, zzaih zzaihVar, List list, String str) {
        try {
            try {
                Context context = this.zzggf.get();
                if (context == null) {
                    context = this.zzcle;
                }
                zzdlxVar.zza(context, zzaihVar, list);
            } catch (RemoteException e) {
                zzbbd.zzc("", e);
            }
        } catch (zzdlr unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Failed to initialize adapter. ");
            sb.append(str);
            sb.append(" does not implement the initialize() method.");
            zzaihVar.onInitializationFailed(sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzapa() throws Exception {
        this.zzgge.set(true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Object obj, zzbbq zzbbqVar, String str, long j) {
        synchronized (obj) {
            if (!zzbbqVar.isDone()) {
                zza(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - j));
                this.zzggh.zzr(str, "timeout");
                zzbbqVar.set(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapb() {
        synchronized (this) {
            if (this.zzggc) {
                return;
            }
            zza("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - this.zzggd));
            this.zzgge.setException(new Exception());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(final zzbbq zzbbqVar) {
        this.executor.execute(new Runnable(this, zzbbqVar) { // from class: com.google.android.gms.internal.ads.zzcmq
            private final zzcmi zzgfz;
            private final zzbbq zzggj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgfz = this;
                this.zzggj = zzbbqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbbq zzbbqVar2 = this.zzggj;
                String zzwp = com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxe().zzwp();
                if (!TextUtils.isEmpty(zzwp)) {
                    zzbbqVar2.set(zzwp);
                } else {
                    zzbbqVar2.setException(new Exception());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapc() {
        this.zzggh.zzaov();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzaim zzaimVar) {
        try {
            zzaimVar.zze(zzaoy());
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
