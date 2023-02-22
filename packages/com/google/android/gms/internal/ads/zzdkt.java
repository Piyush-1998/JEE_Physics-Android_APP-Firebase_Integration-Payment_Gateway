package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdkt extends AdMetadataListener {
    private final /* synthetic */ zzdkr zzgzx;
    private final /* synthetic */ zzxb zzgzy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkt(zzdkr zzdkrVar, zzxb zzxbVar) {
        this.zzgzx = zzdkrVar;
        this.zzgzy = zzxbVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzchu zzchuVar;
        zzchuVar = this.zzgzx.zzgzw;
        if (zzchuVar != null) {
            try {
                this.zzgzy.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
