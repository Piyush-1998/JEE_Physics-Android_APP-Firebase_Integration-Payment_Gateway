package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzva extends RemoteCreator<zzwz> {
    public zzva() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final zzwu zza(Context context, zzvj zzvjVar, String str, zzamu zzamuVar, int i) {
        try {
            IBinder zza = getRemoteCreatorInstance(context).zza(ObjectWrapper.wrap(context), zzvjVar, str, zzamuVar, 202006000, i);
            if (zza == null) {
                return null;
            }
            IInterface queryLocalInterface = zza.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzwu) {
                return (zzwu) queryLocalInterface;
            }
            return new zzww(zza);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzbbd.zzb("Could not create remote AdManager.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzwz getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzwz) {
            return (zzwz) queryLocalInterface;
        }
        return new zzwy(iBinder);
    }
}
