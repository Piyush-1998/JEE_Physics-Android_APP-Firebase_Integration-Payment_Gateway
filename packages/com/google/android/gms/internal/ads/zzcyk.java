package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbxj;
import com.google.android.gms.internal.ads.zzcyx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcyk extends zzawx {
    private static final List<String> zzgrl = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    private static final List<String> zzgrm = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    private static final List<String> zzgrn = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    private static final List<String> zzgro = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    private zzbbg zzbop;
    private final ScheduledExecutorService zzflf;
    private zzeg zzflj;
    private Point zzfwd = new Point();
    private Point zzfwe = new Point();
    private final zzdvw zzgay;
    private zzdma<zzchc> zzgmr;
    private zzbii zzgrp;
    private zzarn zzgrq;
    private Context zzvr;

    public zzcyk(zzbii zzbiiVar, Context context, zzeg zzegVar, zzbbg zzbbgVar, zzdma<zzchc> zzdmaVar, zzdvw zzdvwVar, ScheduledExecutorService scheduledExecutorService) {
        this.zzgrp = zzbiiVar;
        this.zzvr = context;
        this.zzflj = zzegVar;
        this.zzbop = zzbbgVar;
        this.zzgmr = zzdmaVar;
        this.zzgay = zzdvwVar;
        this.zzflf = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    public final IObjectWrapper zzao(IObjectWrapper iObjectWrapper) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    public final void zza(IObjectWrapper iObjectWrapper, zzaxa zzaxaVar, zzawt zzawtVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzvr = context;
        String str = zzaxaVar.zzbuo;
        String str2 = zzaxaVar.zzbqx;
        zzvj zzvjVar = zzaxaVar.zzdxj;
        zzvc zzvcVar = zzaxaVar.zzdxk;
        zzcyh zzadx = this.zzgrp.zzadx();
        zzbsg.zza zzcd = new zzbsg.zza().zzcd(context);
        zzdlp zzdlpVar = new zzdlp();
        if (str == null) {
            str = "adUnitId";
        }
        zzdlp zzgt = zzdlpVar.zzgt(str);
        if (zzvcVar == null) {
            zzvcVar = new zzvf().zzph();
        }
        zzdlp zzh = zzgt.zzh(zzvcVar);
        if (zzvjVar == null) {
            zzvjVar = new zzvj();
        }
        zzdvl.zza(zzadx.zzf(zzcd.zza(zzh.zze(zzvjVar).zzasu()).zzajj()).zza(new zzcyx(new zzcyx.zza().zzgs(str2))).zzf(new zzbxj.zza().zzake()).zzagm().zzagl(), new zzcyt(this, zzawtVar), this.zzgrp.zzadj());
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    public final void zzan(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcxc)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzarn zzarnVar = this.zzgrq;
            this.zzfwd = zzbah.zza(motionEvent, zzarnVar == null ? null : zzarnVar.zzaat);
            if (motionEvent.getAction() == 0) {
                this.zzfwe = this.zzfwd;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setLocation(this.zzfwd.x, this.zzfwd.y);
            this.zzflj.zza(obtain);
            obtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    public final void zza(zzarn zzarnVar) {
        this.zzgrq = zzarnVar;
        this.zzgmr.zzed(1);
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    public final void zza(final List<Uri> list, final IObjectWrapper iObjectWrapper, zzarc zzarcVar) {
        if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxc)).booleanValue()) {
            try {
                zzarcVar.onError("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                zzbbd.zzc("", e);
                return;
            }
        }
        zzdvt zze = this.zzgay.zze(new Callable(this, list, iObjectWrapper) { // from class: com.google.android.gms.internal.ads.zzcyj
            private final zzcyk zzgri;
            private final List zzgrj;
            private final IObjectWrapper zzgrk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgri = this;
                this.zzgrj = list;
                this.zzgrk = iObjectWrapper;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zzgri.zza(this.zzgrj, this.zzgrk);
            }
        });
        if (zzaqo()) {
            zze = zzdvl.zzb(zze, new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzcym
                private final zzcyk zzgri;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgri = this;
                }

                @Override // com.google.android.gms.internal.ads.zzduv
                public final zzdvt zzf(Object obj) {
                    return this.zzgri.zzb((ArrayList) obj);
                }
            }, this.zzgay);
        } else {
            zzaxy.zzfd("Asset view map is empty.");
        }
        zzdvl.zza(zze, new zzcyw(this, zzarcVar), this.zzgrp.zzadj());
    }

    @Override // com.google.android.gms.internal.ads.zzawu
    public final void zzb(List<Uri> list, final IObjectWrapper iObjectWrapper, zzarc zzarcVar) {
        try {
            if (!((Boolean) zzwe.zzpu().zzd(zzaat.zzcxc)).booleanValue()) {
                zzarcVar.onError("The updating URL feature is not enabled.");
            } else if (list.size() != 1) {
                zzarcVar.onError("There should be only 1 click URL.");
            } else {
                final Uri uri = list.get(0);
                if (!zza(uri, zzgrl, zzgrm)) {
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Not a Google URL: ");
                    sb.append(valueOf);
                    zzaxy.zzfe(sb.toString());
                    zzarcVar.onSuccess(list);
                    return;
                }
                zzdvt zze = this.zzgay.zze(new Callable(this, uri, iObjectWrapper) { // from class: com.google.android.gms.internal.ads.zzcyl
                    private final Uri zzeag;
                    private final zzcyk zzgri;
                    private final IObjectWrapper zzgrk;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgri = this;
                        this.zzeag = uri;
                        this.zzgrk = iObjectWrapper;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zzgri.zzb(this.zzeag, this.zzgrk);
                    }
                });
                if (zzaqo()) {
                    zze = zzdvl.zzb(zze, new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzcyo
                        private final zzcyk zzgri;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgri = this;
                        }

                        @Override // com.google.android.gms.internal.ads.zzduv
                        public final zzdvt zzf(Object obj) {
                            return this.zzgri.zzl((Uri) obj);
                        }
                    }, this.zzgay);
                } else {
                    zzaxy.zzfd("Asset view map is empty.");
                }
                zzdvl.zza(zze, new zzcyv(this, zzarcVar), this.zzgrp.zzadj());
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }

    private static boolean zzk(Uri uri) {
        return zza(uri, zzgrn, zzgro);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zza */
    public final Uri zzb(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzflj.zza(uri, this.zzvr, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzef e) {
            zzbbd.zzd("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    private static boolean zza(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            for (String str : list) {
                if (path.contains(str)) {
                    for (String str2 : list2) {
                        if (host.endsWith(str2)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    private final zzdvt<String> zzgr(final String str) {
        final zzchc[] zzchcVarArr = new zzchc[1];
        zzdvt zzb = zzdvl.zzb(this.zzgmr.zzasz(), new zzduv(this, zzchcVarArr, str) { // from class: com.google.android.gms.internal.ads.zzcyr
            private final String zzdin;
            private final zzcyk zzgri;
            private final zzchc[] zzgrr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgri = this;
                this.zzgrr = zzchcVarArr;
                this.zzdin = str;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgri.zza(this.zzgrr, this.zzdin, (zzchc) obj);
            }
        }, this.zzgay);
        zzb.addListener(new Runnable(this, zzchcVarArr) { // from class: com.google.android.gms.internal.ads.zzcyu
            private final zzcyk zzgri;
            private final zzchc[] zzgrr;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgri = this;
                this.zzgrr = zzchcVarArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzgri.zza(this.zzgrr);
            }
        }, this.zzgay);
        return zzdvc.zzg(zzb).zza(((Integer) zzwe.zzpu().zzd(zzaat.zzcxd)).intValue(), TimeUnit.MILLISECONDS, this.zzflf).zza(zzcyp.zzdwg, this.zzgay).zza(Exception.class, zzcys.zzdwg, this.zzgay);
    }

    private static Uri zza(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i = indexOf + 1;
            return Uri.parse(uri2.substring(0, i) + str + "=" + str2 + "&" + uri2.substring(i));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private final boolean zzaqo() {
        zzarn zzarnVar = this.zzgrq;
        return (zzarnVar == null || zzarnVar.zzdpj == null || this.zzgrq.zzdpj.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzchc[] zzchcVarArr) {
        if (zzchcVarArr[0] != null) {
            this.zzgmr.zzd(zzdvl.zzaf(zzchcVarArr[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzchc[] zzchcVarArr, String str, zzchc zzchcVar) throws Exception {
        zzchcVarArr[0] = zzchcVar;
        JSONObject zza = zzbah.zza(this.zzvr, this.zzgrq.zzdpj, this.zzgrq.zzdpj, this.zzgrq.zzaat);
        JSONObject zza2 = zzbah.zza(this.zzvr, this.zzgrq.zzaat);
        JSONObject zzt = zzbah.zzt(this.zzgrq.zzaat);
        JSONObject zzb = zzbah.zzb(this.zzvr, this.zzgrq.zzaat);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zza);
        jSONObject.put("ad_view_signal", zza2);
        jSONObject.put("scroll_view_signal", zzt);
        jSONObject.put("lock_screen_signal", zzb);
        if (str == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject.put("click_signal", zzbah.zza((String) null, this.zzvr, this.zzfwe, this.zzfwd));
        }
        return zzchcVar.zzc(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Uri zzc(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zza(uri, "nas", str) : uri;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ ArrayList zza(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzk(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zza(uri, "nas", str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzl(final Uri uri) throws Exception {
        return zzdvl.zzb(zzgr("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzdsl(this, uri) { // from class: com.google.android.gms.internal.ads.zzcyq
            private final Uri zzeag;
            private final zzcyk zzgri;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgri = this;
                this.zzeag = uri;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                return zzcyk.zzc(this.zzeag, (String) obj);
            }
        }, this.zzgay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzb(final ArrayList arrayList) throws Exception {
        return zzdvl.zzb(zzgr("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzdsl(this, arrayList) { // from class: com.google.android.gms.internal.ads.zzcyn
            private final zzcyk zzgri;
            private final List zzgrj;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgri = this;
                this.zzgrj = arrayList;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                return zzcyk.zza(this.zzgrj, (String) obj);
            }
        }, this.zzgay);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zza(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String zza = this.zzflj.zzca() != null ? this.zzflj.zzca().zza(this.zzvr, (View) ObjectWrapper.unwrap(iObjectWrapper), (Activity) null) : "";
        if (TextUtils.isEmpty(zza)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzk(uri)) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Not a Google URL: ");
                sb.append(valueOf);
                zzaxy.zzfe(sb.toString());
                arrayList.add(uri);
            } else {
                arrayList.add(zza(uri, "ms", zza));
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }
}
