package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaqz extends zzgt implements zzaqw {
    public static zzaqw zzai(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        if (queryLocalInterface instanceof zzaqw) {
            return (zzaqw) queryLocalInterface;
        }
        return new zzaqy(iBinder);
    }
}
