package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.ads.reward.AdMetadataListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbvi extends AdMetadataListener implements AppEventListener, zzbsu, zzbti, zzbtm, zzbuo, zzbuy, zzut {
    private final zzbwh zzftg = new zzbwh(this);
    @Nullable
    private zzcxm zzfth;
    @Nullable
    private zzcxj zzfti;
    @Nullable
    private zzcxl zzftj;
    @Nullable
    private zzcxh zzftk;
    @Nullable
    private zzdht zzftl;
    @Nullable
    private zzdje zzftm;

    public final zzbwh zzaio() {
        return this.zzftg;
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdOpened() {
        zza(this.zzfth, zzbvl.zzftn);
        zza(this.zzftm, zzbvk.zzftn);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdClosed() {
        zza(this.zzfth, zzbvx.zzftn);
        zza(this.zzftm, zzbvz.zzftn);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onAdLeftApplication() {
        zza(this.zzfth, zzbvy.zzftn);
        zza(this.zzftm, zzbwb.zzftn);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoStarted() {
        zza(this.zzfth, zzbwa.zzftn);
        zza(this.zzftm, zzbwd.zzftn);
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void zzb(final zzatj zzatjVar, final String str, final String str2) {
        zza(this.zzfth, new zzbwg(zzatjVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzbwc
            private final String zzdft;
            private final String zzdin;
            private final zzatj zzfsy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsy = zzatjVar;
                this.zzdft = str;
                this.zzdin = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbwg
            public final void zzq(Object obj) {
                zzcxm zzcxmVar = (zzcxm) obj;
            }
        });
        zza(this.zzftm, new zzbwg(zzatjVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzbwf
            private final String zzdft;
            private final String zzdin;
            private final zzatj zzfsy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsy = zzatjVar;
                this.zzdft = str;
                this.zzdin = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbwg
            public final void zzq(Object obj) {
                ((zzdje) obj).zzb(this.zzfsy, this.zzdft, this.zzdin);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsu
    public final void onRewardedVideoCompleted() {
        zza(this.zzfth, zzbvn.zzftn);
        zza(this.zzftm, zzbvm.zzftn);
    }

    @Override // com.google.android.gms.internal.ads.zzut
    public final void onAdClicked() {
        zza(this.zzfth, zzbvp.zzftn);
        zza(this.zzfti, zzbvo.zzftn);
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zza(this.zzftj, new zzbwg(str, str2) { // from class: com.google.android.gms.internal.ads.zzbvr
            private final String zzdft;
            private final String zzdgb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdgb = str;
                this.zzdft = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzbwg
            public final void zzq(Object obj) {
                ((zzcxl) obj).onAppEvent(this.zzdgb, this.zzdft);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbuy
    public final void zzb(final zzvl zzvlVar) {
        zza(this.zzftk, new zzbwg(zzvlVar) { // from class: com.google.android.gms.internal.ads.zzbvq
            private final zzvl zzfto;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfto = zzvlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwg
            public final void zzq(Object obj) {
                ((zzcxh) obj).zzb(this.zzfto);
            }
        });
        zza(this.zzftm, new zzbwg(zzvlVar) { // from class: com.google.android.gms.internal.ads.zzbvt
            private final zzvl zzfto;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfto = zzvlVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwg
            public final void zzq(Object obj) {
                ((zzdje) obj).zzb(this.zzfto);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void onAdImpression() {
        zza(this.zzfth, zzbvs.zzftn);
    }

    @Override // com.google.android.gms.internal.ads.zzbuo
    public final void zzajl() {
        zza(this.zzftl, zzbvv.zzftn);
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zza(this.zzftm, zzbvu.zzftn);
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzf(final zzuw zzuwVar) {
        zza(this.zzftm, new zzbwg(zzuwVar) { // from class: com.google.android.gms.internal.ads.zzbvw
            private final zzuw zzfsu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfsu = zzuwVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbwg
            public final void zzq(Object obj) {
                ((zzdje) obj).zzf(this.zzfsu);
            }
        });
    }

    private static <T> void zza(T t, zzbwg<T> zzbwgVar) {
        if (t != null) {
            zzbwgVar.zzq(t);
        }
    }
}
