package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdz {
    private final zzcdd zzfwx;
    private final zzchc zzfzs;
    private final zzcih zzfzy;
    private final zzbmj zzfzz;

    public zzcdz(zzcih zzcihVar, zzchc zzchcVar, zzbmj zzbmjVar, zzcdd zzcddVar) {
        this.zzfzy = zzcihVar;
        this.zzfzs = zzchcVar;
        this.zzfzz = zzbmjVar;
        this.zzfwx = zzcddVar;
    }

    public final View zzamy() throws zzbgc {
        zzbfq zza = this.zzfzy.zza(zzvj.zzpi(), false);
        zza.getView().setVisibility(8);
        zza.zza("/sendMessageToSdk", new zzahf(this) { // from class: com.google.android.gms.internal.ads.zzcec
            private final zzcdz zzgaa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgaa = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgaa.zzd((zzbfq) obj, map);
            }
        });
        zza.zza("/adMuted", new zzahf(this) { // from class: com.google.android.gms.internal.ads.zzceb
            private final zzcdz zzgaa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgaa = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgaa.zzc((zzbfq) obj, map);
            }
        });
        this.zzfzs.zza(new WeakReference(zza), "/loadHtml", new zzahf(this) { // from class: com.google.android.gms.internal.ads.zzcee
            private final zzcdz zzgaa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgaa = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, final Map map) {
                final zzcdz zzcdzVar = this.zzgaa;
                zzbfq zzbfqVar = (zzbfq) obj;
                zzbfqVar.zzabe().zza(new zzbhf(zzcdzVar, map) { // from class: com.google.android.gms.internal.ads.zzcef
                    private final Map zzedp;
                    private final zzcdz zzgaa;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzgaa = zzcdzVar;
                        this.zzedp = map;
                    }

                    @Override // com.google.android.gms.internal.ads.zzbhf
                    public final void zzak(boolean z) {
                        this.zzgaa.zza(this.zzedp, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzbfqVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzbfqVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzfzs.zza(new WeakReference(zza), "/showOverlay", new zzahf(this) { // from class: com.google.android.gms.internal.ads.zzced
            private final zzcdz zzgaa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgaa = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgaa.zzb((zzbfq) obj, map);
            }
        });
        this.zzfzs.zza(new WeakReference(zza), "/hideOverlay", new zzahf(this) { // from class: com.google.android.gms.internal.ads.zzceg
            private final zzcdz zzgaa;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgaa = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgaa.zza((zzbfq) obj, map);
            }
        });
        return zza.getView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbfq zzbfqVar, Map map) {
        zzaxy.zzfd("Hiding native ads overlay.");
        zzbfqVar.getView().setVisibility(8);
        this.zzfzz.zzbf(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzbfq zzbfqVar, Map map) {
        zzaxy.zzfd("Showing native ads overlay.");
        zzbfqVar.getView().setVisibility(0);
        this.zzfzz.zzbf(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzfzs.zza("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzbfq zzbfqVar, Map map) {
        this.zzfwx.zzald();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzbfq zzbfqVar, Map map) {
        this.zzfzs.zza("sendMessageToNativeJs", map);
    }
}
