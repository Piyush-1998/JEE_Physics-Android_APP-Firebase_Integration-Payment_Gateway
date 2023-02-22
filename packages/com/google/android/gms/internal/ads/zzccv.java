package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccv {
    private Bundle extras;
    private zzado zzdcu;
    private List<?> zzeqk;
    private double zzeqp;
    private float zzera;
    private IObjectWrapper zzfpg;
    private int zzfxr;
    private zzyg zzfxs;
    private View zzfxt;
    private zzzc zzfxu;
    private zzbfq zzfxv;
    private zzbfq zzfxw;
    private View zzfxx;
    private IObjectWrapper zzfxy;
    private zzadw zzfxz;
    private zzadw zzfya;
    private String zzfyb;
    private String zzfye;
    private SimpleArrayMap<String, zzadi> zzfyc = new SimpleArrayMap<>();
    private SimpleArrayMap<String, String> zzfyd = new SimpleArrayMap<>();
    private List<zzzc> zzddi = Collections.emptyList();

    public final synchronized void zzdy(int i) {
        this.zzfxr = i;
    }

    public final synchronized void zzb(zzyg zzygVar) {
        this.zzfxs = zzygVar;
    }

    public final synchronized void zza(zzado zzadoVar) {
        this.zzdcu = zzadoVar;
    }

    public final synchronized void setImages(List<zzadi> list) {
        this.zzeqk = list;
    }

    public final synchronized void zzh(List<zzzc> list) {
        this.zzddi = list;
    }

    public final synchronized void zza(zzzc zzzcVar) {
        this.zzfxu = zzzcVar;
    }

    public final synchronized void zzac(View view) {
        this.zzfxx = view;
    }

    public final synchronized void setStarRating(double d) {
        this.zzeqp = d;
    }

    public final synchronized void zza(zzadw zzadwVar) {
        this.zzfxz = zzadwVar;
    }

    public final synchronized void zzb(zzadw zzadwVar) {
        this.zzfya = zzadwVar;
    }

    public final synchronized void zzga(String str) {
        this.zzfyb = str;
    }

    public final synchronized void zzi(zzbfq zzbfqVar) {
        this.zzfxv = zzbfqVar;
    }

    public final synchronized void zzj(zzbfq zzbfqVar) {
        this.zzfxw = zzbfqVar;
    }

    public final synchronized void zzas(IObjectWrapper iObjectWrapper) {
        this.zzfpg = iObjectWrapper;
    }

    public final synchronized void zzn(String str, String str2) {
        if (str2 == null) {
            this.zzfyd.remove(str);
        } else {
            this.zzfyd.put(str, str2);
        }
    }

    public final synchronized void zza(String str, zzadi zzadiVar) {
        if (zzadiVar == null) {
            this.zzfyc.remove(str);
        } else {
            this.zzfyc.put(str, zzadiVar);
        }
    }

    private final synchronized void setMediaContentAspectRatio(float f) {
        this.zzera = f;
    }

    public final synchronized void zzgb(String str) {
        this.zzfye = str;
    }

    private final synchronized String zzgc(String str) {
        return this.zzfyd.get(str);
    }

    public final synchronized int zzaln() {
        return this.zzfxr;
    }

    public final synchronized zzyg getVideoController() {
        return this.zzfxs;
    }

    public final synchronized zzado zzsi() {
        return this.zzdcu;
    }

    public final synchronized View zzalo() {
        return this.zzfxt;
    }

    public final synchronized String getHeadline() {
        return zzgc("headline");
    }

    public final synchronized List<?> getImages() {
        return this.zzeqk;
    }

    public final zzadw zzalp() {
        List<?> list = this.zzeqk;
        if (list != null && list.size() != 0) {
            Object obj = this.zzeqk.get(0);
            if (obj instanceof IBinder) {
                return zzadv.zzo((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized List<zzzc> getMuteThisAdReasons() {
        return this.zzddi;
    }

    public final synchronized zzzc zzalq() {
        return this.zzfxu;
    }

    public final synchronized String getBody() {
        return zzgc("body");
    }

    public final synchronized Bundle getExtras() {
        if (this.extras == null) {
            this.extras = new Bundle();
        }
        return this.extras;
    }

    public final synchronized String getCallToAction() {
        return zzgc("call_to_action");
    }

    public final synchronized View zzalr() {
        return this.zzfxx;
    }

    public final synchronized IObjectWrapper zzsj() {
        return this.zzfxy;
    }

    public final synchronized String getStore() {
        return zzgc("store");
    }

    public final synchronized String getPrice() {
        return zzgc("price");
    }

    public final synchronized double getStarRating() {
        return this.zzeqp;
    }

    public final synchronized zzadw zzsh() {
        return this.zzfxz;
    }

    public final synchronized String getAdvertiser() {
        return zzgc("advertiser");
    }

    public final synchronized zzadw zzsk() {
        return this.zzfya;
    }

    public final synchronized String getCustomTemplateId() {
        return this.zzfyb;
    }

    public final synchronized zzbfq zzals() {
        return this.zzfxv;
    }

    public final synchronized zzbfq zzalt() {
        return this.zzfxw;
    }

    public final synchronized IObjectWrapper zzalu() {
        return this.zzfpg;
    }

    public final synchronized SimpleArrayMap<String, zzadi> zzalv() {
        return this.zzfyc;
    }

    public final synchronized float getMediaContentAspectRatio() {
        return this.zzera;
    }

    public final synchronized String zzalw() {
        return this.zzfye;
    }

    public final synchronized SimpleArrayMap<String, String> zzalx() {
        return this.zzfyd;
    }

    public final synchronized void destroy() {
        if (this.zzfxv != null) {
            this.zzfxv.destroy();
            this.zzfxv = null;
        }
        if (this.zzfxw != null) {
            this.zzfxw.destroy();
            this.zzfxw = null;
        }
        this.zzfpg = null;
        this.zzfyc.clear();
        this.zzfyd.clear();
        this.zzfxs = null;
        this.zzdcu = null;
        this.zzfxt = null;
        this.zzeqk = null;
        this.extras = null;
        this.zzfxx = null;
        this.zzfxy = null;
        this.zzfxz = null;
        this.zzfya = null;
        this.zzfyb = null;
    }

    public static zzccv zza(zzani zzaniVar) {
        try {
            zzccw zza = zza(zzaniVar.getVideoController(), (zzanj) null);
            zzado zzsi = zzaniVar.zzsi();
            String headline = zzaniVar.getHeadline();
            List<?> images = zzaniVar.getImages();
            String body = zzaniVar.getBody();
            Bundle extras = zzaniVar.getExtras();
            String callToAction = zzaniVar.getCallToAction();
            IObjectWrapper zzsj = zzaniVar.zzsj();
            String advertiser = zzaniVar.getAdvertiser();
            zzadw zzsk = zzaniVar.zzsk();
            zzccv zzccvVar = new zzccv();
            zzccvVar.zzfxr = 1;
            zzccvVar.zzfxs = zza;
            zzccvVar.zzdcu = zzsi;
            zzccvVar.zzfxt = (View) zzat(zzaniVar.zzua());
            zzccvVar.zzn("headline", headline);
            zzccvVar.zzeqk = images;
            zzccvVar.zzn("body", body);
            zzccvVar.extras = extras;
            zzccvVar.zzn("call_to_action", callToAction);
            zzccvVar.zzfxx = (View) zzat(zzaniVar.zzub());
            zzccvVar.zzfxy = zzsj;
            zzccvVar.zzn("advertiser", advertiser);
            zzccvVar.zzfya = zzsk;
            return zzccvVar;
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzccv zza(zzand zzandVar) {
        try {
            zzccw zza = zza(zzandVar.getVideoController(), (zzanj) null);
            zzado zzsi = zzandVar.zzsi();
            String headline = zzandVar.getHeadline();
            List<?> images = zzandVar.getImages();
            String body = zzandVar.getBody();
            Bundle extras = zzandVar.getExtras();
            String callToAction = zzandVar.getCallToAction();
            IObjectWrapper zzsj = zzandVar.zzsj();
            String store = zzandVar.getStore();
            String price = zzandVar.getPrice();
            double starRating = zzandVar.getStarRating();
            zzadw zzsh = zzandVar.zzsh();
            zzccv zzccvVar = new zzccv();
            zzccvVar.zzfxr = 2;
            zzccvVar.zzfxs = zza;
            zzccvVar.zzdcu = zzsi;
            zzccvVar.zzfxt = (View) zzat(zzandVar.zzua());
            zzccvVar.zzn("headline", headline);
            zzccvVar.zzeqk = images;
            zzccvVar.zzn("body", body);
            zzccvVar.extras = extras;
            zzccvVar.zzn("call_to_action", callToAction);
            zzccvVar.zzfxx = (View) zzat(zzandVar.zzub());
            zzccvVar.zzfxy = zzsj;
            zzccvVar.zzn("store", store);
            zzccvVar.zzn("price", price);
            zzccvVar.zzeqp = starRating;
            zzccvVar.zzfxz = zzsh;
            return zzccvVar;
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzccv zzb(zzanj zzanjVar) {
        try {
            return zza(zza(zzanjVar.getVideoController(), zzanjVar), zzanjVar.zzsi(), (View) zzat(zzanjVar.zzua()), zzanjVar.getHeadline(), zzanjVar.getImages(), zzanjVar.getBody(), zzanjVar.getExtras(), zzanjVar.getCallToAction(), (View) zzat(zzanjVar.zzub()), zzanjVar.zzsj(), zzanjVar.getStore(), zzanjVar.getPrice(), zzanjVar.getStarRating(), zzanjVar.zzsh(), zzanjVar.getAdvertiser(), zzanjVar.getMediaContentAspectRatio());
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public static zzccv zzb(zzand zzandVar) {
        try {
            return zza(zza(zzandVar.getVideoController(), (zzanj) null), zzandVar.zzsi(), (View) zzat(zzandVar.zzua()), zzandVar.getHeadline(), zzandVar.getImages(), zzandVar.getBody(), zzandVar.getExtras(), zzandVar.getCallToAction(), (View) zzat(zzandVar.zzub()), zzandVar.zzsj(), zzandVar.getStore(), zzandVar.getPrice(), zzandVar.getStarRating(), zzandVar.zzsh(), null, 0.0f);
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzccv zzb(zzani zzaniVar) {
        try {
            return zza(zza(zzaniVar.getVideoController(), (zzanj) null), zzaniVar.zzsi(), (View) zzat(zzaniVar.zzua()), zzaniVar.getHeadline(), zzaniVar.getImages(), zzaniVar.getBody(), zzaniVar.getExtras(), zzaniVar.getCallToAction(), (View) zzat(zzaniVar.zzub()), zzaniVar.zzsj(), null, null, -1.0d, zzaniVar.zzsk(), zzaniVar.getAdvertiser(), 0.0f);
        } catch (RemoteException e) {
            zzaxy.zzd("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzccv zza(zzyg zzygVar, zzado zzadoVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzadw zzadwVar, String str6, float f) {
        zzccv zzccvVar = new zzccv();
        zzccvVar.zzfxr = 6;
        zzccvVar.zzfxs = zzygVar;
        zzccvVar.zzdcu = zzadoVar;
        zzccvVar.zzfxt = view;
        zzccvVar.zzn("headline", str);
        zzccvVar.zzeqk = list;
        zzccvVar.zzn("body", str2);
        zzccvVar.extras = bundle;
        zzccvVar.zzn("call_to_action", str3);
        zzccvVar.zzfxx = view2;
        zzccvVar.zzfxy = iObjectWrapper;
        zzccvVar.zzn("store", str4);
        zzccvVar.zzn("price", str5);
        zzccvVar.zzeqp = d;
        zzccvVar.zzfxz = zzadwVar;
        zzccvVar.zzn("advertiser", str6);
        zzccvVar.setMediaContentAspectRatio(f);
        return zzccvVar;
    }

    private static <T> T zzat(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return (T) ObjectWrapper.unwrap(iObjectWrapper);
    }

    private static zzccw zza(zzyg zzygVar, zzanj zzanjVar) {
        if (zzygVar == null) {
            return null;
        }
        return new zzccw(zzygVar, zzanjVar);
    }
}
