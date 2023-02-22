package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.AdMetadataListener;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdkk extends AdMetadataListener {
    private final /* synthetic */ zzxz zzgzs;
    private final /* synthetic */ zzdkl zzgzt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkk(zzdkl zzdklVar, zzxz zzxzVar) {
        this.zzgzt = zzdklVar;
        this.zzgzs = zzxzVar;
    }

    @Override // com.google.android.gms.ads.reward.AdMetadataListener
    public final void onAdMetadataChanged() {
        zzchu zzchuVar;
        zzchuVar = this.zzgzt.zzgzw;
        if (zzchuVar != null) {
            try {
                this.zzgzs.onAdMetadataChanged();
            } catch (RemoteException e) {
                zzaxy.zze("#007 Could not call remote method.", e);
            }
        }
    }
}
