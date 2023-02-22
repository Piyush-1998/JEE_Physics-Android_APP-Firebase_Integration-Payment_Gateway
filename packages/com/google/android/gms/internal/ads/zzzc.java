package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzzc extends zzxu {
    private final String description;
    private final String zzckh;

    public zzzc(String str, String str2) {
        this.description = str;
        this.zzckh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final String getDescription() throws RemoteException {
        return this.description;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final String zzqh() throws RemoteException {
        return this.zzckh;
    }
}
