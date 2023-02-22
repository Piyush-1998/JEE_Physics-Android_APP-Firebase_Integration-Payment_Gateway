package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcpj extends zzasf {
    private final Executor zzfmk;
    private final zzatc zzgiy;
    private final zzatd zzgiz;
    private final zzble zzgja;
    private final HashMap<String, zzcpy> zzgjb;
    private final Context zzvr;

    public zzcpj(Context context, Executor executor, zzatc zzatcVar, zzble zzbleVar, zzatd zzatdVar, HashMap<String, zzcpy> hashMap) {
        zzaat.initialize(context);
        this.zzvr = context;
        this.zzfmk = executor;
        this.zzgiy = zzatcVar;
        this.zzgiz = zzatdVar;
        this.zzgja = zzbleVar;
        this.zzgjb = hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final zzary zza(zzarw zzarwVar) throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzarw zzarwVar, zzash zzashVar) throws RemoteException {
    }

    public final zzdvt<InputStream> zzb(zzasp zzaspVar, int i) {
        zzalu zza = com.google.android.gms.ads.internal.zzp.zzlc().zza(this.zzvr, zzbbg.zzyr());
        zzdff zza2 = this.zzgja.zza(zzaspVar, i);
        zzalm zza3 = zza.zza("google.afma.response.normalize", zzcpx.zzgjj, zzalp.zzdht);
        zzcqc zzcqcVar = new zzcqc(this.zzvr, zzaspVar.zzdpq.zzbra, this.zzgiy, zzaspVar.zzdqr, i);
        zzdpf zzafi = zza2.zzafi();
        zzcpy zzcpyVar = null;
        if (!zzacs.zzdbg.get().booleanValue()) {
            if (zzaspVar.zzdth != null && !zzaspVar.zzdth.isEmpty()) {
                zzaxy.zzei("Request contained a PoolKey but split request is disabled.");
            }
        } else if (zzaspVar.zzdth != null && !zzaspVar.zzdth.isEmpty() && (zzcpyVar = this.zzgjb.remove(zzaspVar.zzdth)) == null) {
            zzaxy.zzei("Request contained a PoolKey but no matching parameters were found.");
        }
        if (zzcpyVar == null) {
            final zzdvt<JSONObject> zza4 = zza(zzaspVar, zzafi, zza2);
            final zzdvt<zzasv> zza5 = zza(zza4, zzafi, zza);
            final zzdos zzauz = zzafi.zza((zzdpf) zzdpg.HTTP, zza5, zza4).zzb(new Callable(zza4, zza5) { // from class: com.google.android.gms.internal.ads.zzcpm
                private final zzdvt zzfsi;
                private final zzdvt zzgbt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgbt = zza4;
                    this.zzfsi = zza5;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzcqb((JSONObject) this.zzgbt.get(), (zzasv) this.zzfsi.get());
                }
            }).zzb(zzcqcVar).zzauz();
            return zzafi.zza((zzdpf) zzdpg.PRE_PROCESS, zza4, zza5, zzauz).zzb(new Callable(zzauz, zza4, zza5) { // from class: com.google.android.gms.internal.ads.zzcpl
                private final zzdvt zzfqe;
                private final zzdvt zzfsi;
                private final zzdvt zzgbt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgbt = zzauz;
                    this.zzfsi = zza4;
                    this.zzfqe = zza5;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzcpx((zzcqe) this.zzgbt.get(), (JSONObject) this.zzfsi.get(), (zzasv) this.zzfqe.get());
                }
            }).zza(zza3).zzauz();
        }
        final zzdos zzauz2 = zzafi.zza((zzdpf) zzdpg.HTTP, zzdvl.zzaf(new zzcqb(zzcpyVar.zzgjh, zzcpyVar.zzgji))).zzb(zzcqcVar).zzauz();
        final zzdvt<?> zzaf = zzdvl.zzaf(zzcpyVar);
        return zzafi.zza((zzdpf) zzdpg.PRE_PROCESS, zzauz2, zzaf).zzb(new Callable(zzauz2, zzaf) { // from class: com.google.android.gms.internal.ads.zzcpo
            private final zzdvt zzfsi;
            private final zzdvt zzgbt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbt = zzauz2;
                this.zzfsi = zzaf;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdvt zzdvtVar = this.zzgbt;
                zzdvt zzdvtVar2 = this.zzfsi;
                return new zzcpx((zzcqe) zzdvtVar.get(), ((zzcpy) zzdvtVar2.get()).zzgjh, ((zzcpy) zzdvtVar2.get()).zzgji);
            }
        }).zza(zza3).zzauz();
    }

    private static zzdvt<JSONObject> zza(zzasp zzaspVar, zzdpf zzdpfVar, final zzdff zzdffVar) {
        zzduv zzduvVar = new zzduv(zzdffVar) { // from class: com.google.android.gms.internal.ads.zzcpn
            private final zzdff zzgjc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgjc = zzdffVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgjc.zzafg().zzt(com.google.android.gms.ads.internal.zzp.zzkp().zzd((Bundle) obj));
            }
        };
        return zzdpfVar.zza((zzdpf) zzdpg.GMS_SIGNALS, zzdvl.zzaf(zzaspVar.zzdtd)).zza(zzduvVar).zzb(zzcpq.zzghg).zzauz();
    }

    private static zzdvt<zzasv> zza(zzdvt<JSONObject> zzdvtVar, zzdpf zzdpfVar, zzalu zzaluVar) {
        return zzdpfVar.zza((zzdpf) zzdpg.BUILD_URL, (zzdvt) zzdvtVar).zza(zzaluVar.zza("AFMA_getAdDictionary", zzalp.zzdhs, zzcpp.zzdhu)).zzauz();
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(zzasp zzaspVar, zzasj zzasjVar) {
        zzdvt<InputStream> zzb = zzb(zzaspVar, Binder.getCallingUid());
        zza(zzb, zzasjVar);
        zzb.addListener(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcps
            private final zzcpj zzgjd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgjd = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgjd.zzapm();
            }
        }, this.zzfmk);
    }

    public final zzdvt<InputStream> zzc(zzasp zzaspVar, int i) {
        if (!zzacs.zzdbg.get().booleanValue()) {
            return zzdvl.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        if (zzaspVar.zzdtg == null) {
            return zzdvl.immediateFailedFuture(new Exception("Pool configuration missing from request."));
        }
        if (zzaspVar.zzdtg.zzhej == 0 || zzaspVar.zzdtg.zzhek == 0) {
            return zzdvl.immediateFailedFuture(new Exception("Caching is disabled."));
        }
        zzalu zza = com.google.android.gms.ads.internal.zzp.zzlc().zza(this.zzvr, zzbbg.zzyr());
        zzdff zza2 = this.zzgja.zza(zzaspVar, i);
        zzdpf zzafi = zza2.zzafi();
        final zzdvt<JSONObject> zza3 = zza(zzaspVar, zzafi, zza2);
        final zzdvt<zzasv> zza4 = zza(zza3, zzafi, zza);
        return zzafi.zza((zzdpf) zzdpg.GET_URL_AND_CACHE_KEY, zza3, zza4).zzb(new Callable(this, zza4, zza3) { // from class: com.google.android.gms.internal.ads.zzcpr
            private final zzdvt zzfqe;
            private final zzdvt zzfsi;
            private final zzcpj zzgjd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgjd = this;
                this.zzfsi = zza4;
                this.zzfqe = zza3;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgjd.zza(this.zzfsi, this.zzfqe);
            }
        }).zzauz();
    }

    public final zzdvt<InputStream> zzgn(String str) {
        if (!zzacs.zzdbg.get().booleanValue()) {
            return zzdvl.immediateFailedFuture(new Exception("Split request is disabled."));
        }
        zzcpw zzcpwVar = new zzcpw(this);
        if (this.zzgjb.remove(str) == null) {
            String valueOf = String.valueOf(str);
            return zzdvl.immediateFailedFuture(new Exception(valueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(valueOf) : new String("URL to be removed not found for cache key: ")));
        }
        return zzdvl.zzaf(zzcpwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzc(zzasp zzaspVar, zzasj zzasjVar) {
        zza(zzc(zzaspVar, Binder.getCallingUid()), zzasjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zza(String str, zzasj zzasjVar) {
        zza(zzgn(str), zzasjVar);
    }

    public final zzdvt<InputStream> zzd(zzasp zzaspVar, int i) {
        zzalu zza = com.google.android.gms.ads.internal.zzp.zzlc().zza(this.zzvr, zzbbg.zzyr());
        if (!zzacy.zzdbx.get().booleanValue()) {
            return zzdvl.immediateFailedFuture(new Exception("Signal collection disabled."));
        }
        zzdff zza2 = this.zzgja.zza(zzaspVar, i);
        final zzdem<JSONObject> zzafh = zza2.zzafh();
        return zza2.zzafi().zza((zzdpf) zzdpg.GET_SIGNALS, zzdvl.zzaf(zzaspVar.zzdtd)).zza(new zzduv(zzafh) { // from class: com.google.android.gms.internal.ads.zzcpu
            private final zzdem zzgje;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgje = zzafh;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgje.zzt(com.google.android.gms.ads.internal.zzp.zzkp().zzd((Bundle) obj));
            }
        }).zzw(zzdpg.JS_SIGNALS).zza(zza.zza("google.afma.request.getSignals", zzalp.zzdhs, zzalp.zzdht)).zzauz();
    }

    @Override // com.google.android.gms.internal.ads.zzasc
    public final void zzb(zzasp zzaspVar, zzasj zzasjVar) {
        zza(zzd(zzaspVar, Binder.getCallingUid()), zzasjVar);
    }

    private final void zza(zzdvt<InputStream> zzdvtVar, zzasj zzasjVar) {
        zzdvl.zza(zzdvl.zzb(zzdvtVar, new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzcpt
            private final zzcpj zzgjd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgjd = this;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return zzdvl.zzaf(zzdlz.zzf((InputStream) obj));
            }
        }, zzbbi.zzedu), new zzcpv(this, zzasjVar), zzbbi.zzedz);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zza(zzdvt zzdvtVar, zzdvt zzdvtVar2) throws Exception {
        String zzvj = ((zzasv) zzdvtVar.get()).zzvj();
        this.zzgjb.put(zzvj, new zzcpy((zzasv) zzdvtVar.get(), (JSONObject) zzdvtVar2.get()));
        return new ByteArrayInputStream(zzvj.getBytes(zzdsj.UTF_8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzapm() {
        zzbbm.zza(this.zzgiz.zzvl(), "persistFlags");
    }
}
