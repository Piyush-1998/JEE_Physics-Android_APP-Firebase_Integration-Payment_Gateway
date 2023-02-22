package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzatu implements RewardItem {
    private final zzatj zzdvb;

    public zzatu(zzatj zzatjVar) {
        this.zzdvb = zzatjVar;
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final String getType() {
        zzatj zzatjVar = this.zzdvb;
        if (zzatjVar == null) {
            return null;
        }
        try {
            return zzatjVar.getType();
        } catch (RemoteException e) {
            zzbbd.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardItem
    public final int getAmount() {
        zzatj zzatjVar = this.zzdvb;
        if (zzatjVar == null) {
            return 0;
        }
        try {
            return zzatjVar.getAmount();
        } catch (RemoteException e) {
            zzbbd.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
