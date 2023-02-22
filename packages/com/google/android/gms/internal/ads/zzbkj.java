package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbkj extends zzxn {
    private final zzbbg zzbpa;
    private final zzawb zzbqm;
    private final zzcji zzfkk;
    private final zzcrf<zzdlx, zzcsn> zzfkl;
    private final zzcwu zzfkm;
    private final zzcmi zzfkn;
    private final zzcjk zzfko;
    private final Context zzvr;
    private boolean zzzh = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkj(Context context, zzbbg zzbbgVar, zzcji zzcjiVar, zzcrf<zzdlx, zzcsn> zzcrfVar, zzcwu zzcwuVar, zzcmi zzcmiVar, zzawb zzawbVar, zzcjk zzcjkVar) {
        this.zzvr = context;
        this.zzbpa = zzbbgVar;
        this.zzfkk = zzcjiVar;
        this.zzfkl = zzcrfVar;
        this.zzfkm = zzcwuVar;
        this.zzfkn = zzcmiVar;
        this.zzbqm = zzawbVar;
        this.zzfko = zzcjkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final synchronized void initialize() {
        if (this.zzzh) {
            zzaxy.zzfe("Mobile ads is initialized already.");
            return;
        }
        zzaat.initialize(this.zzvr);
        com.google.android.gms.ads.internal.zzp.zzkt().zzd(this.zzvr, this.zzbpa);
        com.google.android.gms.ads.internal.zzp.zzkv().initialize(this.zzvr);
        this.zzzh = true;
        this.zzfkn.zzaox();
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcpt)).booleanValue()) {
            this.zzfkm.zzanu();
        }
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcsf)).booleanValue()) {
            this.zzfko.zzanu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final synchronized void setAppVolume(float f) {
        com.google.android.gms.ads.internal.zzp.zzku().setAppVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final synchronized float zzqd() {
        return com.google.android.gms.ads.internal.zzp.zzku().zzqd();
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final synchronized void setAppMuted(boolean z) {
        com.google.android.gms.ads.internal.zzp.zzku().setAppMuted(z);
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final synchronized boolean zzqe() {
        return com.google.android.gms.ads.internal.zzp.zzku().zzqe();
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final synchronized void zzch(String str) {
        zzaat.initialize(this.zzvr);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcse)).booleanValue()) {
                com.google.android.gms.ads.internal.zzp.zzkx().zza(this.zzvr, this.zzbpa, str, (Runnable) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzaxy.zzfc("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzaxy.zzfc("Context is null. Failed to open debug menu.");
            return;
        }
        zzayy zzayyVar = new zzayy(context);
        zzayyVar.setAdUnitId(str);
        zzayyVar.zzae(this.zzbpa.zzbra);
        zzayyVar.showDialog();
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzaat.initialize(this.zzvr);
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcsg)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzkp();
            str2 = zzayh.zzbd(this.zzvr);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean booleanValue = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcse)).booleanValue() | ((Boolean) zzwe.zzpu().zzd(zzaat.zzcoa)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcoa)).booleanValue()) {
            booleanValue = true;
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.zzbkm
                private final zzbkj zzfkp;
                private final Runnable zzfkq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfkp = this;
                    this.zzfkq = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzbbi.zzedy.execute(new Runnable(this.zzfkp, this.zzfkq) { // from class: com.google.android.gms.internal.ads.zzbkl
                        private final zzbkj zzfkp;
                        private final Runnable zzfkq;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfkp = r1;
                            this.zzfkq = r2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzfkp.zzd(this.zzfkq);
                        }
                    });
                }
            };
        }
        if (booleanValue) {
            com.google.android.gms.ads.internal.zzp.zzkx().zza(this.zzvr, this.zzbpa, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final String getVersionString() {
        return this.zzbpa.zzbra;
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzci(String str) {
        this.zzfkm.zzgq(str);
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zza(zzamu zzamuVar) throws RemoteException {
        this.zzfkk.zzb(zzamuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zza(zzaim zzaimVar) throws RemoteException {
        this.zzfkn.zzb(zzaimVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final List<zzaif> zzqf() throws RemoteException {
        return this.zzfkn.zzaoy();
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zza(zzzw zzzwVar) throws RemoteException {
        this.zzbqm.zza(this.zzvr, zzzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxk
    public final void zzqg() {
        this.zzfkn.disable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map<String, zzamp> zzwr = com.google.android.gms.ads.internal.zzp.zzkt().zzwj().zzxe().zzwr();
        if (zzwr == null || zzwr.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzaxy.zzd("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzfkk.zzans()) {
            HashMap hashMap = new HashMap();
            for (zzamp zzampVar : zzwr.values()) {
                for (zzamq zzamqVar : zzampVar.zzdiq) {
                    String str = zzamqVar.zzdjv;
                    for (String str2 : zzamqVar.zzdjn) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzcrg<zzdlx, zzcsn> zzf = this.zzfkl.zzf(str3, jSONObject);
                    if (zzf != null) {
                        zzdlx zzdlxVar = zzf.zzdkn;
                        if (!zzdlxVar.isInitialized() && zzdlxVar.zztt()) {
                            zzdlxVar.zza(this.zzvr, zzf.zzglc, (List) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            zzaxy.zzef(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (zzdlr e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    zzaxy.zzd(sb.toString(), e);
                }
            }
        }
    }
}
