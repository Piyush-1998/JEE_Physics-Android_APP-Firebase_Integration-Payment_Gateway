package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcff {
    private final zzdvw zzgay;
    private final zzcfj zzgaz;
    private final zzcft zzgba;

    public zzcff(zzdvw zzdvwVar, zzcfj zzcfjVar, zzcft zzcftVar) {
        this.zzgay = zzdvwVar;
        this.zzgaz = zzcfjVar;
        this.zzgba = zzcftVar;
    }

    public final zzdvt<zzccv> zza(final zzdlj zzdljVar, final zzdkx zzdkxVar, final JSONObject jSONObject) {
        zzdvt zzb;
        final zzdvt zze = this.zzgay.zze(new Callable(this, zzdljVar, zzdkxVar, jSONObject) { // from class: com.google.android.gms.internal.ads.zzcfi
            private final zzdkx zzfoo;
            private final zzcff zzgbb;
            private final zzdlj zzgbj;
            private final JSONObject zzgbk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbb = this;
                this.zzgbj = zzdljVar;
                this.zzfoo = zzdkxVar;
                this.zzgbk = jSONObject;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdlj zzdljVar2 = this.zzgbj;
                zzdkx zzdkxVar2 = this.zzfoo;
                JSONObject jSONObject2 = this.zzgbk;
                zzccv zzccvVar = new zzccv();
                zzccvVar.zzdy(jSONObject2.optInt("template_id", -1));
                zzccvVar.zzga(jSONObject2.optString("custom_template_id"));
                JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
                zzccvVar.zzgb(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
                zzdln zzdlnVar = zzdljVar2.zzhbp.zzfqn;
                if (!zzdlnVar.zzhbw.contains(Integer.toString(zzccvVar.zzaln()))) {
                    int i = zzdmd.zzhco;
                    int zzaln = zzccvVar.zzaln();
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("Invalid template ID: ");
                    sb.append(zzaln);
                    throw new zzcuh(i, sb.toString());
                }
                if (zzccvVar.zzaln() == 3) {
                    if (zzccvVar.getCustomTemplateId() == null) {
                        throw new zzcuh(zzdmd.zzhco, "No custom template id for custom template ad response.");
                    }
                    if (!zzdlnVar.zzhbx.contains(zzccvVar.getCustomTemplateId())) {
                        throw new zzcuh(zzdmd.zzhco, "Unexpected custom template id in the response.");
                    }
                }
                zzccvVar.setStarRating(jSONObject2.optDouble("rating", -1.0d));
                String optString = jSONObject2.optString("headline", null);
                if (zzdkxVar2.zzduo) {
                    com.google.android.gms.ads.internal.zzp.zzkp();
                    String zzxr = zzayh.zzxr();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzxr).length() + 3 + String.valueOf(optString).length());
                    sb2.append(zzxr);
                    sb2.append(" : ");
                    sb2.append(optString);
                    optString = sb2.toString();
                }
                zzccvVar.zzn("headline", optString);
                zzccvVar.zzn("body", jSONObject2.optString("body", null));
                zzccvVar.zzn("call_to_action", jSONObject2.optString("call_to_action", null));
                zzccvVar.zzn("store", jSONObject2.optString("store", null));
                zzccvVar.zzn("price", jSONObject2.optString("price", null));
                zzccvVar.zzn("advertiser", jSONObject2.optString("advertiser", null));
                return zzccvVar;
            }
        });
        final zzdvt<List<zzadi>> zzd = this.zzgaz.zzd(jSONObject, "images");
        final zzdvt<zzadi> zzc = this.zzgaz.zzc(jSONObject, "secondary_image");
        final zzdvt<zzadi> zzc2 = this.zzgaz.zzc(jSONObject, "app_icon");
        final zzdvt<zzadd> zze2 = this.zzgaz.zze(jSONObject, "attribution");
        final zzdvt<zzbfq> zzm = this.zzgaz.zzm(jSONObject);
        final zzcfj zzcfjVar = this.zzgaz;
        if (!jSONObject.optBoolean("enable_omid")) {
            zzb = zzdvl.zzaf(null);
        } else {
            JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzb = zzdvl.zzaf(null);
            } else {
                final String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzb = zzdvl.zzaf(null);
                } else {
                    zzb = zzdvl.zzb(zzdvl.zzaf(null), new zzduv(zzcfjVar, optString) { // from class: com.google.android.gms.internal.ads.zzcfn
                        private final String zzdft;
                        private final zzcfj zzgbr;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgbr = zzcfjVar;
                            this.zzdft = optString;
                        }

                        @Override // com.google.android.gms.internal.ads.zzduv
                        public final zzdvt zzf(Object obj) {
                            return this.zzgbr.zzb(this.zzdft, obj);
                        }
                    }, zzbbi.zzedy);
                }
            }
        }
        final zzdvt zzdvtVar = zzb;
        final zzdvt<List<zzcfy>> zzg = this.zzgba.zzg(jSONObject, "custom_assets");
        return zzdvl.zza(zze, zzd, zzc, zzc2, zze2, zzm, zzdvtVar, zzg).zza(new Callable(this, zze, zzd, zzc2, zzc, zze2, jSONObject, zzm, zzdvtVar, zzg) { // from class: com.google.android.gms.internal.ads.zzcfh
            private final zzdvt zzfqe;
            private final zzdvt zzfsi;
            private final zzcff zzgbb;
            private final zzdvt zzgbc;
            private final zzdvt zzgbd;
            private final zzdvt zzgbe;
            private final JSONObject zzgbf;
            private final zzdvt zzgbg;
            private final zzdvt zzgbh;
            private final zzdvt zzgbi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbb = this;
                this.zzfsi = zze;
                this.zzfqe = zzd;
                this.zzgbc = zzc2;
                this.zzgbd = zzc;
                this.zzgbe = zze2;
                this.zzgbf = jSONObject;
                this.zzgbg = zzm;
                this.zzgbh = zzdvtVar;
                this.zzgbi = zzg;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzdvt zzdvtVar2 = this.zzfsi;
                zzdvt zzdvtVar3 = this.zzfqe;
                zzdvt zzdvtVar4 = this.zzgbc;
                zzdvt zzdvtVar5 = this.zzgbd;
                zzdvt zzdvtVar6 = this.zzgbe;
                JSONObject jSONObject2 = this.zzgbf;
                zzdvt zzdvtVar7 = this.zzgbg;
                zzdvt zzdvtVar8 = this.zzgbh;
                zzdvt zzdvtVar9 = this.zzgbi;
                zzccv zzccvVar = (zzccv) zzdvtVar2.get();
                zzccvVar.setImages((List) zzdvtVar3.get());
                zzccvVar.zza((zzadw) zzdvtVar4.get());
                zzccvVar.zzb((zzadw) zzdvtVar5.get());
                zzccvVar.zza((zzado) zzdvtVar6.get());
                zzccvVar.zzh(zzcfj.zzj(jSONObject2));
                zzccvVar.zza(zzcfj.zzk(jSONObject2));
                zzbfq zzbfqVar = (zzbfq) zzdvtVar7.get();
                if (zzbfqVar != null) {
                    zzccvVar.zzi(zzbfqVar);
                    zzccvVar.zzac(zzbfqVar.getView());
                    zzccvVar.zzb(zzbfqVar.zzzo());
                }
                zzbfq zzbfqVar2 = (zzbfq) zzdvtVar8.get();
                if (zzbfqVar2 != null) {
                    zzccvVar.zzj(zzbfqVar2);
                }
                for (zzcfy zzcfyVar : (List) zzdvtVar9.get()) {
                    int i = zzcfyVar.type;
                    if (i == 1) {
                        zzccvVar.zzn(zzcfyVar.zzcn, zzcfyVar.zzgbw);
                    } else if (i == 2) {
                        zzccvVar.zza(zzcfyVar.zzcn, zzcfyVar.zzgbx);
                    }
                }
                return zzccvVar;
            }
        }, this.zzgay);
    }
}
