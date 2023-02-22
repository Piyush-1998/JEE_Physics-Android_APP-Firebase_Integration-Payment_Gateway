package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaqj extends RemoteCreator<zzaqm> {
    public zzaqj() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final zzaql zzc(Activity activity) {
        try {
            IBinder zzae = getRemoteCreatorInstance(activity).zzae(ObjectWrapper.wrap(activity));
            if (zzae == null) {
                return null;
            }
            IInterface queryLocalInterface = zzae.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzaql) {
                return (zzaql) queryLocalInterface;
            }
            return new zzaqn(zzae);
        } catch (RemoteException e) {
            zzbbd.zzd("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            zzbbd.zzd("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ zzaqm getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzaqm) {
            return (zzaqm) queryLocalInterface;
        }
        return new zzaqp(iBinder);
    }
}
