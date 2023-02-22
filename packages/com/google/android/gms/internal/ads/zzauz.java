package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzauz implements RewardItem {
    private final zzaug zzdvj;

    public zzauz(zzaug zzaugVar) {
        this.zzdvj = zzaugVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzaug zzaugVar = this.zzdvj;
        if (zzaugVar == null) {
            return null;
        }
        try {
            return zzaugVar.getType();
        } catch (RemoteException e) {
            zzbbd.zzd("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzaug zzaugVar = this.zzdvj;
        if (zzaugVar == null) {
            return 0;
        }
        try {
            return zzaugVar.getAmount();
        } catch (RemoteException e) {
            zzbbd.zzd("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
