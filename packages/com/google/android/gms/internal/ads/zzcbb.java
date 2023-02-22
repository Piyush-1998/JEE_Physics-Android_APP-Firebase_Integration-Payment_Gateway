package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zztw;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbb implements com.google.android.gms.ads.internal.overlay.zzo, zzbuj {
    private final zzbbg zzbpa;
    private final zzbfq zzdgc;
    private final zzdkx zzfpf;
    private IObjectWrapper zzfpg;
    private final zztw.zza.EnumC0020zza zzfvf;
    private final Context zzvr;

    public zzcbb(Context context, zzbfq zzbfqVar, zzdkx zzdkxVar, zzbbg zzbbgVar, zztw.zza.EnumC0020zza enumC0020zza) {
        this.zzvr = context;
        this.zzdgc = zzbfqVar;
        this.zzfpf = zzdkxVar;
        this.zzbpa = zzbbgVar;
        this.zzfvf = enumC0020zza;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void onAdLoaded() {
        if ((this.zzfvf == zztw.zza.EnumC0020zza.REWARD_BASED_VIDEO_AD || this.zzfvf == zztw.zza.EnumC0020zza.INTERSTITIAL) && this.zzfpf.zzdsr && this.zzdgc != null && com.google.android.gms.ads.internal.zzp.zzle().zzp(this.zzvr)) {
            int i = this.zzbpa.zzedq;
            int i2 = this.zzbpa.zzedr;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            IObjectWrapper zza = com.google.android.gms.ads.internal.zzp.zzle().zza(sb.toString(), this.zzdgc.getWebView(), "", "javascript", this.zzfpf.zzhay.getVideoEventsOwner());
            this.zzfpg = zza;
            if (zza == null || this.zzdgc.getView() == null) {
                return;
            }
            com.google.android.gms.ads.internal.zzp.zzle().zza(this.zzfpg, this.zzdgc.getView());
            this.zzdgc.zzap(this.zzfpg);
            com.google.android.gms.ads.internal.zzp.zzle().zzab(this.zzfpg);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzui() {
        this.zzfpg = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzuj() {
        zzbfq zzbfqVar;
        if (this.zzfpg == null || (zzbfqVar = this.zzdgc) == null) {
            return;
        }
        zzbfqVar.zza("onSdkImpression", new HashMap());
    }
}
