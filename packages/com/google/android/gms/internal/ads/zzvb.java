package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzvb extends RemoteCreator<zzws> {
    public zzvb() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final zzwr zza(Context context, String str, zzamu zzamuVar) {
        try {
            IBinder zzc = getRemoteCreatorInstance(context).zzc(ObjectWrapper.wrap(context), str, zzamuVar, 202006000);
            if (zzc == null) {
                return null;
            }
            IInterface queryLocalInterface = zzc.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzwr) {
                return (zzwr) queryLocalInterface;
            }
            return new zzwt(zzc);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbbd.zzd("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzws getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof zzws) {
            return (zzws) queryLocalInterface;
        }
        return new zzwv(iBinder);
    }
}
