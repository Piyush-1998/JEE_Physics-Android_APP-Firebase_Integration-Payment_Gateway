package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zztw;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbf implements zzbsu, zzbyh {
    private final View view;
    private final zzawb zzbqm;
    private final zzavy zzfpr;
    private final zztw.zza.EnumC0020zza zzfvf;
    private String zzfvh;
    private final Context zzvr;

    public zzcbf(zzavy zzavyVar, Context context, zzawb zzawbVar, View view, zztw.zza.EnumC0020zza enumC0020zza) {
        this.zzfpr = zzavyVar;
        this.zzvr = context;
        this.zzbqm = zzawbVar;
        this.view = view;
        this.zzfvf = enumC0020zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzaix() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdOpened() {
        View view = this.view;
        if (view != null && this.zzfvh != null) {
            this.zzbqm.zzh(view.getContext(), this.zzfvh);
        }
        this.zzfpr.zzam(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdClosed() {
        this.zzfpr.zzam(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyh
    public final void zzaiz() {
        String zzae = this.zzbqm.zzae(this.zzvr);
        this.zzfvh = zzae;
        String valueOf = String.valueOf(zzae);
        String str = this.zzfvf == zztw.zza.EnumC0020zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.zzfvh = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    @ParametersAreNonnullByDefault
    public final void zzb(zzatj zzatjVar, String str, String str2) {
        if (this.zzbqm.zzac(this.zzvr)) {
            try {
                this.zzbqm.zza(this.zzvr, this.zzbqm.zzah(this.zzvr), this.zzfpr.getAdUnitId(), zzatjVar.getType(), zzatjVar.getAmount());
            } catch (RemoteException e) {
                zzaxy.zzd("Remote Exception to get reward item.", e);
            }
        }
    }
}
