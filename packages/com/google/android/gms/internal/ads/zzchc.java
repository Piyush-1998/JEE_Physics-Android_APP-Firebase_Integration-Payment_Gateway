package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchc {
    private final zzbfy zzbpp;
    private final zzbbg zzdpq;
    private final zzeg zzenn;
    private final Executor zzfmk;
    private final com.google.android.gms.ads.internal.zzb zzgbm;
    private final zzchh zzgck = new zzchh(null);
    private final zzahl zzgcl = new zzahl();
    private zzdvt<zzbfq> zzgcm;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchc(zzchm zzchmVar) {
        this.zzvr = zzchm.zza(zzchmVar);
        this.zzfmk = zzchm.zzb(zzchmVar);
        this.zzenn = zzchm.zzc(zzchmVar);
        this.zzdpq = zzchm.zzd(zzchmVar);
        this.zzgbm = zzchm.zze(zzchmVar);
        this.zzbpp = zzchm.zzf(zzchmVar);
    }

    public final synchronized void zzang() {
        zzdvt<zzbfq> zzb = zzdvl.zzb(zzbfy.zza(this.zzvr, this.zzdpq, (String) zzwe.zzpu().zzd(zzaat.zzcrk), this.zzenn, this.zzgbm), new zzdsl(this) { // from class: com.google.android.gms.internal.ads.zzchb
            private final zzchc zzgcj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcj = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                return this.zzgcj.zzm((zzbfq) obj);
            }
        }, this.zzfmk);
        this.zzgcm = zzb;
        zzbbm.zza(zzb, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void destroy() {
        if (this.zzgcm == null) {
            return;
        }
        zzdvl.zza(this.zzgcm, new zzchd(this), this.zzfmk);
        this.zzgcm = null;
    }

    public final synchronized zzdvt<JSONObject> zzc(final String str, final JSONObject jSONObject) {
        if (this.zzgcm == null) {
            return zzdvl.zzaf(null);
        }
        return zzdvl.zzb(this.zzgcm, new zzduv(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.zzche
            private final String zzdft;
            private final zzchc zzgcj;
            private final JSONObject zzgcn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcj = this;
                this.zzdft = str;
                this.zzgcn = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgcj.zza(this.zzdft, this.zzgcn, (zzbfq) obj);
            }
        }, this.zzfmk);
    }

    public final synchronized void zza(String str, zzahf<Object> zzahfVar) {
        if (this.zzgcm == null) {
            return;
        }
        zzdvl.zza(this.zzgcm, new zzchg(this, str, zzahfVar), this.zzfmk);
    }

    public final synchronized void zzb(String str, zzahf<Object> zzahfVar) {
        if (this.zzgcm == null) {
            return;
        }
        zzdvl.zza(this.zzgcm, new zzchf(this, str, zzahfVar), this.zzfmk);
    }

    public final synchronized void zza(String str, Map<String, ?> map) {
        if (this.zzgcm == null) {
            return;
        }
        zzdvl.zza(this.zzgcm, new zzchi(this, str, map), this.zzfmk);
    }

    public final <T> void zza(WeakReference<T> weakReference, String str, zzahf<T> zzahfVar) {
        zza(str, new zzchl(this, weakReference, str, zzahfVar, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(String str, JSONObject jSONObject, zzbfq zzbfqVar) throws Exception {
        return this.zzgcl.zza(zzbfqVar, str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbfq zzm(zzbfq zzbfqVar) {
        zzbfqVar.zza("/result", this.zzgcl);
        zzbhc zzabe = zzbfqVar.zzabe();
        zzchh zzchhVar = this.zzgck;
        zzabe.zza(null, zzchhVar, zzchhVar, zzchhVar, zzchhVar, false, null, new com.google.android.gms.ads.internal.zza(this.zzvr, null, null), null, null);
        return zzbfqVar;
    }
}
