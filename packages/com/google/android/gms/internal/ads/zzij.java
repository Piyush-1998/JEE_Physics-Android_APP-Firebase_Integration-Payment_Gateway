package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzij {
    private final Handler handler;
    private final zzig zzaja;

    public zzij(Handler handler, zzig zzigVar) {
        this.handler = zzigVar != null ? (Handler) zzoz.checkNotNull(handler) : null;
        this.zzaja = zzigVar;
    }

    public final void zzc(zzjl zzjlVar) {
        if (this.zzaja != null) {
            this.handler.post(new zzii(this, zzjlVar));
        }
    }

    public final void zzb(String str, long j, long j2) {
        if (this.zzaja != null) {
            this.handler.post(new zzil(this, str, j, j2));
        }
    }

    public final void zzc(zzho zzhoVar) {
        if (this.zzaja != null) {
            this.handler.post(new zzik(this, zzhoVar));
        }
    }

    public final void zzb(int i, long j, long j2) {
        if (this.zzaja != null) {
            this.handler.post(new zzin(this, i, j, j2));
        }
    }

    public final void zzd(zzjl zzjlVar) {
        if (this.zzaja != null) {
            this.handler.post(new zzim(this, zzjlVar));
        }
    }

    public final void zzy(int i) {
        if (this.zzaja != null) {
            this.handler.post(new zzip(this, i));
        }
    }
}
