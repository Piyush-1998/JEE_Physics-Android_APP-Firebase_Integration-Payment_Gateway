package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcti implements zzctf<zzcco> {
    private final zzdvw zzgay;
    private final zzcbn zzgmp;
    private final zzcff zzgmq;
    private final zzdma<zzchc> zzgmr;

    public zzcti(zzcbn zzcbnVar, zzdvw zzdvwVar, zzcff zzcffVar, zzdma<zzchc> zzdmaVar) {
        this.zzgmp = zzcbnVar;
        this.zzgay = zzdvwVar;
        this.zzgmq = zzcffVar;
        this.zzgmr = zzdmaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return (zzdkxVar.zzhao == null || zzdkxVar.zzhao.zzfvr == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<List<zzdvt<zzcco>>> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar) {
        return zzdvl.zzb(zzdvl.zzb(this.zzgmr.zzasz(), new zzduv(this, zzdkxVar) { // from class: com.google.android.gms.internal.ads.zzcth
            private final zzdkx zzgmf;
            private final zzcti zzgmo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmo = this;
                this.zzgmf = zzdkxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgmo.zza(this.zzgmf, (zzchc) obj);
            }
        }, this.zzgay), new zzduv(this, zzdljVar, zzdkxVar) { // from class: com.google.android.gms.internal.ads.zzctk
            private final zzdkx zzfoo;
            private final zzdlj zzgbj;
            private final zzcti zzgmo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmo = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgmo.zza(this.zzgbj, this.zzfoo, (JSONArray) obj);
            }
        }, this.zzgay);
    }

    private final zzdvt<zzcco> zzb(final zzdlj zzdljVar, final zzdkx zzdkxVar, final JSONObject jSONObject) {
        final zzdvt<zzchc> zzasz = this.zzgmr.zzasz();
        final zzdvt<zzccv> zza = this.zzgmq.zza(zzdljVar, zzdkxVar, jSONObject);
        return zzdvl.zzb(zzasz, zza).zza(new Callable(this, zza, zzasz, zzdljVar, zzdkxVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzctl
            private final zzdvt zzfqe;
            private final zzdvt zzfsi;
            private final zzdlj zzgmh;
            private final zzcti zzgmo;
            private final zzdkx zzgmt;
            private final JSONObject zzgmu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmo = this;
                this.zzfsi = zza;
                this.zzfqe = zzasz;
                this.zzgmh = zzdljVar;
                this.zzgmt = zzdkxVar;
                this.zzgmu = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgmo.zza(this.zzfsi, this.zzfqe, this.zzgmh, this.zzgmt, this.zzgmu);
            }
        }, this.zzgay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcco zza(zzdvt zzdvtVar, zzdvt zzdvtVar2, zzdlj zzdljVar, zzdkx zzdkxVar, JSONObject jSONObject) throws Exception {
        zzccv zzccvVar = (zzccv) zzdvtVar.get();
        zzchc zzchcVar = (zzchc) zzdvtVar2.get();
        zzccx zza = this.zzgmp.zza(new zzbpt(zzdljVar, zzdkxVar, null), new zzcdh(zzccvVar), new zzccc(jSONObject, zzchcVar));
        zza.zzaeu().zzanf();
        zza.zzaev().zzb(zzchcVar);
        zza.zzaew().zzl(zzccvVar.zzals());
        return zza.zzaet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzchc zzchcVar, JSONObject jSONObject) throws Exception {
        this.zzgmr.zzd(zzdvl.zzaf(zzchcVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzalj("process json failed");
        }
        return zzdvl.zzaf(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdlj zzdljVar, zzdkx zzdkxVar, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcq));
        }
        if (zzdljVar.zzhbp.zzfqn.zzgra > 1) {
            int length = jSONArray.length();
            this.zzgmr.zzed(Math.min(length, zzdljVar.zzhbp.zzfqn.zzgra));
            ArrayList arrayList = new ArrayList(zzdljVar.zzhbp.zzfqn.zzgra);
            for (int i = 0; i < zzdljVar.zzhbp.zzfqn.zzgra; i++) {
                if (i < length) {
                    arrayList.add(zzb(zzdljVar, zzdkxVar, jSONArray.getJSONObject(i)));
                } else {
                    arrayList.add(zzdvl.immediateFailedFuture(new zzcmt(zzdmd.zzhcq)));
                }
            }
            return zzdvl.zzaf(arrayList);
        }
        return zzdvl.zzb(zzb(zzdljVar, zzdkxVar, jSONArray.getJSONObject(0)), zzctm.zzdwg, this.zzgay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdkx zzdkxVar, final zzchc zzchcVar) throws Exception {
        JSONObject zza = zzbab.zza("isNonagon", (Object) true);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("response", zzdkxVar.zzhao.zzfvr);
        jSONObject.put("sdk_params", zza);
        return zzdvl.zzb(zzchcVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject), new zzduv(this, zzchcVar) { // from class: com.google.android.gms.internal.ads.zzctj
            private final zzcti zzgmo;
            private final zzchc zzgms;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgmo = this;
                this.zzgms = zzchcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgmo.zza(this.zzgms, (JSONObject) obj);
            }
        }, this.zzgay);
    }
}
