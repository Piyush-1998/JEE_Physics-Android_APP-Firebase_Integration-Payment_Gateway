package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzatx extends RemoteCreator<zzatr> {
    public zzatx() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    public final zzatm zzb(Context context, zzamu zzamuVar) {
        try {
            IBinder zzc = getRemoteCreatorInstance(context).zzc(ObjectWrapper.wrap(context), zzamuVar, 202006000);
            if (zzc == null) {
                return null;
            }
            IInterface queryLocalInterface = zzc.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            if (queryLocalInterface instanceof zzatm) {
                return (zzatm) queryLocalInterface;
            }
            return new zzato(zzc);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbbd.zzd("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzatr getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof zzatr) {
            return (zzatr) queryLocalInterface;
        }
        return new zzatq(iBinder);
    }
}
