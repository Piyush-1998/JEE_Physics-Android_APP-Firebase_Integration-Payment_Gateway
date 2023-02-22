package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzanu extends zzamz {
    private final zzaua zzdkp;
    private final Adapter zzdkz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanu(Adapter adapter, zzaua zzauaVar) {
        this.zzdkz = adapter;
        this.zzdkp = zzauaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdImpression() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdLeftApplication() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAppEvent(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onVideoEnd() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onVideoPause() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onVideoPlay() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zza(zzaes zzaesVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zza(zzanb zzanbVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzb(Bundle bundle) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzb(zzaue zzaueVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzb(zzuw zzuwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzc(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzdd(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzdn(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzdo(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdLoaded() throws RemoteException {
        zzaua zzauaVar = this.zzdkp;
        if (zzauaVar != null) {
            zzauaVar.zzag(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdOpened() throws RemoteException {
        zzaua zzauaVar = this.zzdkp;
        if (zzauaVar != null) {
            zzauaVar.zzah(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdClosed() throws RemoteException {
        zzaua zzauaVar = this.zzdkp;
        if (zzauaVar != null) {
            zzauaVar.zzaj(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zza(zzaug zzaugVar) throws RemoteException {
        zzaua zzauaVar = this.zzdkp;
        if (zzauaVar != null) {
            zzauaVar.zza(ObjectWrapper.wrap(this.zzdkz), new zzaue(zzaugVar.getType(), zzaugVar.getAmount()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zzty() throws RemoteException {
        zzaua zzauaVar = this.zzdkp;
        if (zzauaVar != null) {
            zzauaVar.zzai(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void zztz() throws RemoteException {
        zzaua zzauaVar = this.zzdkp;
        if (zzauaVar != null) {
            zzauaVar.zzam(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdClicked() throws RemoteException {
        zzaua zzauaVar = this.zzdkp;
        if (zzauaVar != null) {
            zzauaVar.zzak(ObjectWrapper.wrap(this.zzdkz));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzana
    public final void onAdFailedToLoad(int i) throws RemoteException {
        zzaua zzauaVar = this.zzdkp;
        if (zzauaVar != null) {
            zzauaVar.zze(ObjectWrapper.wrap(this.zzdkz), i);
        }
    }
}
