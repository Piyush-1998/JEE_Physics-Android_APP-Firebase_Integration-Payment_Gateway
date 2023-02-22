package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdip {
    public static <T> void zza(AtomicReference<T> atomicReference, zzdio<T> zzdioVar) {
        T t = atomicReference.get();
        if (t == null) {
            return;
        }
        try {
            zzdioVar.zzq(t);
        } catch (RemoteException e) {
            zzaxy.zze("#007 Could not call remote method.", e);
        }
    }
}
