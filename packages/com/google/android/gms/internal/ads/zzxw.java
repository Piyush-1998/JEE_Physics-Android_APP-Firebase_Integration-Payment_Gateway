package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzxw implements MuteThisAdReason {
    private final String description;
    private zzxv zzcja;

    public zzxw(zzxv zzxvVar) {
        String str;
        this.zzcja = zzxvVar;
        try {
            str = zzxvVar.getDescription();
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
            str = null;
        }
        this.description = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.description;
    }

    public final zzxv zzqi() {
        return this.zzcja;
    }

    public final String toString() {
        return this.description;
    }
}
