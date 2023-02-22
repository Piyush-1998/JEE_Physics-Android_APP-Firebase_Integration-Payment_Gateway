package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzceh {
    private final zzchc zzfzs;
    private final zzcih zzfzy;
    private ViewTreeObserver.OnScrollChangedListener zzgab = null;

    public zzceh(zzcih zzcihVar, zzchc zzchcVar) {
        this.zzfzy = zzcihVar;
        this.zzfzs = zzchcVar;
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzbgc {
        zzbfq zza = this.zzfzy.zza(zzvj.zzpi(), false);
        zza.getView().setVisibility(4);
        zza.getView().setContentDescription("policy_validator");
        zza.zza("/sendMessageToSdk", new zzahf(this) { // from class: com.google.android.gms.internal.ads.zzcek
            private final zzceh zzgae;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgae = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgae.zze((zzbfq) obj, map);
            }
        });
        zza.zza("/hideValidatorOverlay", new zzahf(this, windowManager, view) { // from class: com.google.android.gms.internal.ads.zzcej
            private final zzceh zzgae;
            private final WindowManager zzgaf;
            private final View zzgag;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgae = this;
                this.zzgaf = windowManager;
                this.zzgag = view;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgae.zza(this.zzgaf, this.zzgag, (zzbfq) obj, map);
            }
        });
        zza.zza("/open", new zzahj(null, null));
        this.zzfzs.zza(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzahf(this, view, windowManager) { // from class: com.google.android.gms.internal.ads.zzcem
            private final zzceh zzgae;
            private final View zzgah;
            private final WindowManager zzgai;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgae = this;
                this.zzgah = view;
                this.zzgai = windowManager;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgae.zza(this.zzgah, this.zzgai, (zzbfq) obj, map);
            }
        });
        this.zzfzs.zza(new WeakReference(zza), "/showValidatorOverlay", zzcel.zzdeq);
        return zza.getView();
    }

    private static int zza(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzwe.zzpq();
        return zzbat.zzc(context, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(final View view, final WindowManager windowManager, final zzbfq zzbfqVar, final Map map) {
        int i;
        zzbfqVar.zzabe().zza(new zzbhf(this, map) { // from class: com.google.android.gms.internal.ads.zzcen
            private final Map zzedp;
            private final zzceh zzgae;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgae = this;
                this.zzedp = map;
            }

            @Override // com.google.android.gms.internal.ads.zzbhf
            public final void zzak(boolean z) {
                this.zzgae.zzb(this.zzedp, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zza = zza(context, (String) map.get("validator_width"), ((Integer) zzwe.zzpu().zzd(zzaat.zzcxl)).intValue());
        int zza2 = zza(context, (String) map.get("validator_height"), ((Integer) zzwe.zzpu().zzd(zzaat.zzcxm)).intValue());
        int zza3 = zza(context, (String) map.get("validator_x"), 0);
        int zza4 = zza(context, (String) map.get("validator_y"), 0);
        zzbfqVar.zza(zzbhj.zzq(zza, zza2));
        try {
            zzbfqVar.getWebView().getSettings().setUseWideViewPort(((Boolean) zzwe.zzpu().zzd(zzaat.zzcxn)).booleanValue());
            zzbfqVar.getWebView().getSettings().setLoadWithOverviewMode(((Boolean) zzwe.zzpu().zzd(zzaat.zzcxo)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzyg = zzbah.zzyg();
        zzyg.x = zza3;
        zzyg.y = zza4;
        windowManager.updateViewLayout(zzbfqVar.getView(), zzyg);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if ("1".equals(str) || "2".equals(str)) {
                i = rect.bottom;
            } else {
                i = rect.top;
            }
            final int i2 = i - zza4;
            this.zzgab = new ViewTreeObserver.OnScrollChangedListener(view, zzbfqVar, str, zzyg, i2, windowManager) { // from class: com.google.android.gms.internal.ads.zzceo
                private final String zzdin;
                private final View zzgaj;
                private final zzbfq zzgak;
                private final WindowManager.LayoutParams zzgal;
                private final int zzgam;
                private final WindowManager zzgan;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgaj = view;
                    this.zzgak = zzbfqVar;
                    this.zzdin = str;
                    this.zzgal = zzyg;
                    this.zzgam = i2;
                    this.zzgan = windowManager;
                }

                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = this.zzgaj;
                    zzbfq zzbfqVar2 = this.zzgak;
                    String str2 = this.zzdin;
                    WindowManager.LayoutParams layoutParams = this.zzgal;
                    int i3 = this.zzgam;
                    WindowManager windowManager2 = this.zzgan;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || zzbfqVar2.getView().getWindowToken() == null) {
                        return;
                    }
                    if ("1".equals(str2) || "2".equals(str2)) {
                        layoutParams.y = rect2.bottom - i3;
                    } else {
                        layoutParams.y = rect2.top - i3;
                    }
                    windowManager2.updateViewLayout(zzbfqVar2.getView(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzgab);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzbfqVar.loadUrl(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzfzs.zza("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(WindowManager windowManager, View view, zzbfq zzbfqVar, Map map) {
        zzaxy.zzef("Hide native ad policy validator overlay.");
        zzbfqVar.getView().setVisibility(8);
        if (zzbfqVar.getView().getWindowToken() != null) {
            windowManager.removeView(zzbfqVar.getView());
        }
        zzbfqVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzgab == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzgab);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzbfq zzbfqVar, Map map) {
        this.zzfzs.zza("sendMessageToNativeJs", map);
    }
}
