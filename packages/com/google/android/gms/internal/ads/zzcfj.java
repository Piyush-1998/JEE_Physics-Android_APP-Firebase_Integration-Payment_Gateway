package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcfj {
    private final Executor executor;
    private final zzbbg zzbpa;
    private final zzadm zzdla;
    private final zzto zzelx;
    private final zzeg zzenn;
    private final ScheduledExecutorService zzflf;
    private final zzcfe zzgbl;
    private final com.google.android.gms.ads.internal.zzb zzgbm;
    private final zzcga zzgbn;
    private final Context zzvr;

    public zzcfj(Context context, zzcfe zzcfeVar, zzeg zzegVar, zzbbg zzbbgVar, com.google.android.gms.ads.internal.zzb zzbVar, zzto zztoVar, Executor executor, zzdln zzdlnVar, zzcga zzcgaVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzvr = context;
        this.zzgbl = zzcfeVar;
        this.zzenn = zzegVar;
        this.zzbpa = zzbbgVar;
        this.zzgbm = zzbVar;
        this.zzelx = zztoVar;
        this.executor = executor;
        this.zzdla = zzdlnVar.zzdla;
        this.zzgbn = zzcgaVar;
        this.zzflf = scheduledExecutorService;
    }

    public static List<zzzc> zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return Collections.emptyList();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzzc zzl = zzl(optJSONArray.optJSONObject(i));
            if (zzl != null) {
                arrayList.add(zzl);
            }
        }
        return arrayList;
    }

    public static zzzc zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzl(optJSONObject);
    }

    private static zzzc zzl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzzc(optString, optString2);
    }

    public final zzdvt<zzadi> zzc(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONObject(str), this.zzdla.zzdcs);
    }

    public final zzdvt<List<zzadi>> zzd(JSONObject jSONObject, String str) {
        return zza(jSONObject.optJSONArray(str), this.zzdla.zzdcs, this.zzdla.zzbnl);
    }

    private final zzdvt<List<zzadi>> zza(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzdvl.zzaf(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zza(jSONArray.optJSONObject(i), z));
        }
        return zzdvl.zzb(zzdvl.zzi(arrayList), zzcfm.zzdwg, this.executor);
    }

    private final zzdvt<zzadi> zza(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzdvl.zzaf(null);
        }
        final String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzdvl.zzaf(null);
        }
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        final int optInt = jSONObject.optInt("width", -1);
        final int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzdvl.zzaf(new zzadi(null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zza(jSONObject.optBoolean("require"), zzdvl.zzb(this.zzgbl.zza(optString, optDouble, optBoolean), new zzdsl(optString, optDouble, optInt, optInt2) { // from class: com.google.android.gms.internal.ads.zzcfl
            private final String zzdgb;
            private final int zzeay;
            private final int zzeaz;
            private final double zzgbq;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = optString;
                this.zzgbq = optDouble;
                this.zzeay = optInt;
                this.zzeaz = optInt2;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                String str = this.zzdgb;
                return new zzadi(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.zzgbq, this.zzeay, this.zzeaz);
            }
        }, this.executor), (Object) null);
    }

    public final zzdvt<zzadd> zze(JSONObject jSONObject, String str) {
        final JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return zzdvl.zzaf(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zza(optJSONObject.optBoolean("require"), zzdvl.zzb(zza(optJSONArray, false, true), new zzdsl(this, optJSONObject) { // from class: com.google.android.gms.internal.ads.zzcfo
            private final JSONObject zzfmf;
            private final zzcfj zzgbr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbr = this;
                this.zzfmf = optJSONObject;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                return this.zzgbr.zza(this.zzfmf, (List) obj);
            }
        }, this.executor), (Object) null);
    }

    private static Integer zzf(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    public final zzdvt<zzbfq> zzm(JSONObject jSONObject) {
        JSONObject zza = zzbab.zza(jSONObject, "html_containers", "instream");
        if (zza == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("video");
            if (optJSONObject == null) {
                return zzdvl.zzaf(null);
            }
            if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
                zzaxy.zzfe("Required field 'vast_xml' is missing");
                return zzdvl.zzaf(null);
            }
            return zza(zzdvl.zza(this.zzgbn.zzn(optJSONObject), ((Integer) zzwe.zzpu().zzd(zzaat.zzcrn)).intValue(), TimeUnit.SECONDS, this.zzflf), (Object) null);
        }
        final zzdvt<zzbfq> zzo = this.zzgbn.zzo(zza.optString("base_url"), zza.optString("html"));
        return zzdvl.zzb(zzo, new zzduv(zzo) { // from class: com.google.android.gms.internal.ads.zzcfq
            private final zzdvt zzgbt;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbt = zzo;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                zzdvt zzdvtVar = this.zzgbt;
                zzbfq zzbfqVar = (zzbfq) obj;
                if (zzbfqVar == null || zzbfqVar.zzzo() == null) {
                    throw new zzcuh(zzdmd.zzhco, "Retrieve video view in instream ad response failed.");
                }
                return zzdvtVar;
            }
        }, zzbbi.zzedz);
    }

    private static <T> zzdvt<T> zza(zzdvt<T> zzdvtVar, T t) {
        return zzdvl.zzb(zzdvtVar, Exception.class, new zzduv(null) { // from class: com.google.android.gms.internal.ads.zzcfp
            private final Object zzgbs;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgbs = r1;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                Object obj2 = this.zzgbs;
                zzaxy.zza("Error during loading assets.", (Exception) obj);
                return zzdvl.zzaf(obj2);
            }
        }, zzbbi.zzedz);
    }

    private static <T> zzdvt<T> zza(boolean z, final zzdvt<T> zzdvtVar, T t) {
        if (z) {
            return zzdvl.zzb(zzdvtVar, new zzduv(zzdvtVar) { // from class: com.google.android.gms.internal.ads.zzcfs
                private final zzdvt zzgbt;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgbt = zzdvtVar;
                }

                @Override // com.google.android.gms.internal.ads.zzduv
                public final zzdvt zzf(Object obj) {
                    return obj != null ? this.zzgbt : zzdvl.immediateFailedFuture(new zzcuh(zzdmd.zzhco, "Retrieve required value in native ad response failed."));
                }
            }, zzbbi.zzedz);
        }
        return zza(zzdvtVar, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzb(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzp.zzkq();
        zzbfq zza = zzbfy.zza(this.zzvr, zzbhj.zzacu(), "native-omid", false, false, this.zzenn, null, this.zzbpa, null, null, this.zzgbm, this.zzelx, null, false);
        final zzbbr zzl = zzbbr.zzl(zza);
        zza.zzabe().zza(new zzbhf(zzl) { // from class: com.google.android.gms.internal.ads.zzcfr
            private final zzbbr zzenh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzenh = zzl;
            }

            @Override // com.google.android.gms.internal.ads.zzbhf
            public final void zzak(boolean z) {
                this.zzenh.zzys();
            }
        });
        zza.loadData(str, "text/html", "UTF-8");
        return zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzadd zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzf = zzf(jSONObject, "bg_color");
        Integer zzf2 = zzf(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzadd(optString, list, zzf, zzf2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzdla.zzbnm, optBoolean);
    }
}
