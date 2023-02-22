package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzso extends AppOpenAd {
    private final zzsd zzbur;

    public zzso(zzsd zzsdVar) {
        this.zzbur = zzsdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final zzwu zzdu() {
        try {
            return this.zzbur.zzdu();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void zza(zzsj zzsjVar) {
        try {
            this.zzbur.zza(zzsjVar);
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
    }
}
