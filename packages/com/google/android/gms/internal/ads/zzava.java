package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzava implements zzbbf {
    static final zzbbf zzbxs = new zzava();

    private zzava() {
    }

    @Override // com.google.android.gms.internal.ads.zzbbf
    public final Object apply(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
        if (queryLocalInterface instanceof zzaur) {
            return (zzaur) queryLocalInterface;
        }
        return new zzauq(iBinder);
    }
}
