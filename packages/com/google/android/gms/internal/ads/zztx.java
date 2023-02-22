package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zztx {
    private final byte[] zzbxv;
    private int zzbxw;
    private int zzbxx;
    private final /* synthetic */ zztt zzbxy;

    private zztx(zztt zzttVar, byte[] bArr) {
        this.zzbxy = zzttVar;
        this.zzbxv = bArr;
    }

    public final synchronized void zzdv() {
        try {
            if (this.zzbxy.zzbxu) {
                this.zzbxy.zzbxt.zzc(this.zzbxv);
                this.zzbxy.zzbxt.zzs(this.zzbxw);
                this.zzbxy.zzbxt.zzt(this.zzbxx);
                this.zzbxy.zzbxt.zza(null);
                this.zzbxy.zzbxt.zzdv();
            }
        } catch (RemoteException e) {
            zzbbd.zzb("Clearcut log failed", e);
        }
    }

    public final zztx zzbx(int i) {
        this.zzbxw = i;
        return this;
    }

    public final zztx zzby(int i) {
        this.zzbxx = i;
        return this;
    }
}
