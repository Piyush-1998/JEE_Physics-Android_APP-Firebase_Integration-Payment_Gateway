package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzavh extends zzauj {
    private final String type;
    private final int zzdva;

    public zzavh(zzaue zzaueVar) {
        this(zzaueVar != null ? zzaueVar.type : "", zzaueVar != null ? zzaueVar.zzdva : 1);
    }

    public zzavh(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    public zzavh(String str, int i) {
        this.type = str;
        this.zzdva = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final String getType() throws RemoteException {
        return this.type;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final int getAmount() throws RemoteException {
        return this.zzdva;
    }
}
