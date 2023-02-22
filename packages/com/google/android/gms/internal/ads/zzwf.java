package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzwf<T> {
    private static final zzxh zzcix = zzpz();

    protected abstract T zza(zzxh zzxhVar) throws RemoteException;

    protected abstract T zzpn();

    protected abstract T zzpo() throws RemoteException;

    private static zzxh zzpz() {
        try {
            Object newInstance = zzvr.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (!(newInstance instanceof IBinder)) {
                zzbbd.zzfe("ClientApi class is not an instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
            if (queryLocalInterface instanceof zzxh) {
                return (zzxh) queryLocalInterface;
            }
            return new zzxj(iBinder);
        } catch (Exception unused) {
            zzbbd.zzfe("Failed to instantiate ClientApi class.");
            return null;
        }
    }

    private final T zzqa() {
        zzxh zzxhVar = zzcix;
        if (zzxhVar == null) {
            zzbbd.zzfe("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zza(zzxhVar);
        } catch (RemoteException e) {
            zzbbd.zzd("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    private final T zzqb() {
        try {
            return zzpo();
        } catch (RemoteException e) {
            zzbbd.zzd("Cannot invoke remote loader.", e);
            return null;
        }
    }

    public final T zzd(Context context, boolean z) {
        T zzqa;
        boolean z2 = z;
        if (!z2) {
            zzwe.zzpq();
            if (!zzbat.zzd(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                zzbbd.zzef("Google Play Services is not available.");
                z2 = true;
            }
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID)) {
            z2 = true;
        }
        zzaat.initialize(context);
        if (zzack.zzdae.get().booleanValue()) {
            z2 = false;
        }
        if (z2) {
            zzqa = zzqa();
            if (zzqa == null) {
                zzqa = zzqb();
            }
        } else {
            T zzqb = zzqb();
            int i = zzqb == null ? 1 : 0;
            if (i != 0) {
                if (zzwe.zzpx().nextInt(zzact.zzdbh.get().intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", i);
                    zzwe.zzpq().zza(context, zzwe.zzpw().zzbra, "gmob-apps", bundle, true);
                }
            }
            zzqa = zzqb == null ? zzqa() : zzqb;
        }
        return zzqa == null ? zzpn() : zzqa;
    }
}
