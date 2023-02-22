package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbow implements zzbtm, zzbuj {
    private final zzbbg zzbpa;
    private final zzbfq zzdgc;
    private final zzdkx zzfpf;
    private IObjectWrapper zzfpg;
    private boolean zzfph;
    private final Context zzvr;

    public zzbow(Context context, zzbfq zzbfqVar, zzdkx zzdkxVar, zzbbg zzbbgVar) {
        this.zzvr = context;
        this.zzdgc = zzbfqVar;
        this.zzfpf = zzdkxVar;
        this.zzbpa = zzbbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final synchronized void onAdLoaded() {
        if (this.zzfph) {
            return;
        }
        zzaii();
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final synchronized void onAdImpression() {
        if (!this.zzfph) {
            zzaii();
        }
        if (this.zzfpf.zzdsr && this.zzfpg != null && this.zzdgc != null) {
            this.zzdgc.zza("onSdkImpression", new ArrayMap());
        }
    }

    private final synchronized void zzaii() {
        if (this.zzfpf.zzdsr) {
            if (this.zzdgc == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzp.zzle().zzp(this.zzvr)) {
                int i = this.zzbpa.zzedq;
                int i2 = this.zzbpa.zzedr;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                this.zzfpg = com.google.android.gms.ads.internal.zzp.zzle().zza(sb.toString(), this.zzdgc.getWebView(), "", "javascript", this.zzfpf.zzhay.getVideoEventsOwner());
                View view = this.zzdgc.getView();
                if (this.zzfpg != null && view != null) {
                    com.google.android.gms.ads.internal.zzp.zzle().zza(this.zzfpg, view);
                    this.zzdgc.zzap(this.zzfpg);
                    com.google.android.gms.ads.internal.zzp.zzle().zzab(this.zzfpg);
                    this.zzfph = true;
                }
            }
        }
    }
}
