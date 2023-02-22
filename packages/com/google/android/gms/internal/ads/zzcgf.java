package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcgf {
    private final Executor zzfmk;
    private final zzbyr zzfvy;
    private final zzbmj zzgca;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgf(Executor executor, zzbmj zzbmjVar, zzbyr zzbyrVar) {
        this.zzfmk = executor;
        this.zzfvy = zzbyrVar;
        this.zzgca = zzbmjVar;
    }

    public final void zzl(final zzbfq zzbfqVar) {
        if (zzbfqVar == null) {
            return;
        }
        this.zzfvy.zzv(zzbfqVar.getView());
        this.zzfvy.zza(new zzqu(zzbfqVar) { // from class: com.google.android.gms.internal.ads.zzcgi
            private final zzbfq zzepi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzepi = zzbfqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzqu
            public final void zza(zzqr zzqrVar) {
                this.zzepi.zzabe().zza(zzqrVar.zzbrq.left, zzqrVar.zzbrq.top, false);
            }
        }, this.zzfmk);
        this.zzfvy.zza(new zzqu(zzbfqVar) { // from class: com.google.android.gms.internal.ads.zzcgh
            private final zzbfq zzepi;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzepi = zzbfqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzqu
            public final void zza(zzqr zzqrVar) {
                zzbfq zzbfqVar2 = this.zzepi;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", zzqrVar.zzbrk ? "1" : "0");
                zzbfqVar2.zza("onAdVisibilityChanged", hashMap);
            }
        }, this.zzfmk);
        this.zzfvy.zza(this.zzgca, this.zzfmk);
        this.zzgca.zzg(zzbfqVar);
        zzbfqVar.zza("/trackActiveViewUnit", new zzahf(this) { // from class: com.google.android.gms.internal.ads.zzcgk
            private final zzcgf zzgcb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcb = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgcb.zzg((zzbfq) obj, map);
            }
        });
        zzbfqVar.zza("/untrackActiveViewUnit", new zzahf(this) { // from class: com.google.android.gms.internal.ads.zzcgj
            private final zzcgf zzgcb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgcb = this;
            }

            @Override // com.google.android.gms.internal.ads.zzahf
            public final void zza(Object obj, Map map) {
                this.zzgcb.zzf((zzbfq) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzbfq zzbfqVar, Map map) {
        this.zzgca.disable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzbfq zzbfqVar, Map map) {
        this.zzgca.enable();
    }
}
