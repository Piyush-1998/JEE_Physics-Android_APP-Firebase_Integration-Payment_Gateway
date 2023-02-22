package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzavb {
    public static zzaul zzd(Context context, String str, zzamu zzamuVar) {
        try {
            IBinder zzd = ((zzaur) zzbbc.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzava.zzbxs)).zzd(ObjectWrapper.wrap(context), str, zzamuVar, 202006000);
            if (zzd == null) {
                return null;
            }
            IInterface queryLocalInterface = zzd.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzaul) {
                return (zzaul) queryLocalInterface;
            }
            return new zzaun(zzd);
        } catch (RemoteException | zzbbe e) {
            zzbbd.zze("#007 Could not call remote method.", e);
            return null;
        }
    }
}
