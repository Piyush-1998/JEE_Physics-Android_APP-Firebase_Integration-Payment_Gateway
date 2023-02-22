package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzcvw extends zzamz {
    private final zzbue zzfpt;
    private final zzbtu zzfqj;
    private final zzbtb zzfuw;
    private final zzbur zzfvb;
    private final zzbtl zzfvu;
    private final zzbst zzfvv;
    private final zzbws zzgct;
    private final zzbwp zzgof;
    private final zzbzh zzgoq;

    public zzcvw(zzbst zzbstVar, zzbtl zzbtlVar, zzbtu zzbtuVar, zzbue zzbueVar, zzbws zzbwsVar, zzbur zzburVar, zzbzh zzbzhVar, zzbwp zzbwpVar, zzbtb zzbtbVar) {
        this.zzfvv = zzbstVar;
        this.zzfvu = zzbtlVar;
        this.zzfqj = zzbtuVar;
        this.zzfpt = zzbueVar;
        this.zzgct = zzbwsVar;
        this.zzfvb = zzburVar;
        this.zzgoq = zzbzhVar;
        this.zzgof = zzbwpVar;
        this.zzfuw = zzbtbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdFailedToLoad(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zza(zzaes zzaesVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zza(zzanb zzanbVar) {
    }

    public void zza(zzaug zzaugVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzb(Bundle bundle) throws RemoteException {
    }

    public void zzb(zzaue zzaueVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzb(zzuw zzuwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzc(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzdn(String str) {
    }

    public void zztz() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdClicked() {
        this.zzfvv.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdClosed() {
        this.zzfvb.zzui();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdLeftApplication() {
        this.zzfqj.onAdLeftApplication();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdOpened() {
        this.zzfvb.zzuj();
        this.zzgof.zzaja();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAppEvent(String str, String str2) {
        this.zzgct.onAppEvent(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdLoaded() {
        this.zzfpt.onAdLoaded();
    }

    public void onAdImpression() {
        this.zzfvu.onAdImpression();
        this.zzgof.zzaiy();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onVideoPause() {
        this.zzgoq.onVideoPause();
    }

    public void zzty() {
        this.zzgoq.onVideoStart();
    }

    public void onVideoEnd() {
        this.zzgoq.onVideoEnd();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onVideoPlay() throws RemoteException {
        this.zzgoq.onVideoPlay();
    }

    @Override // com.google.android.gms.internal.ads.zzana
    @Deprecated
    public final void zzdd(int i) throws RemoteException {
        this.zzfuw.zzh(zzdmb.zza(zzdmd.zzhcv, new zzuw(i, "", AdError.UNDEFINED_DOMAIN, null)));
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzdo(String str) {
        this.zzfuw.zzh(zzdmb.zza(zzdmd.zzhcv, new zzuw(0, str, AdError.UNDEFINED_DOMAIN, null)));
    }
}
