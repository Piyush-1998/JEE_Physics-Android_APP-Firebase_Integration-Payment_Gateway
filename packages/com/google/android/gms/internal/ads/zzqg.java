package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzqg {
    private final Handler handler;
    private final zzqd zzbmu;

    public zzqg(Handler handler, zzqd zzqdVar) {
        this.handler = zzqdVar != null ? (Handler) zzoz.checkNotNull(handler) : null;
        this.zzbmu = zzqdVar;
    }

    public final void zzc(zzjl zzjlVar) {
        if (this.zzbmu != null) {
            this.handler.post(new zzqf(this, zzjlVar));
        }
    }

    public final void zzb(String str, long j, long j2) {
        if (this.zzbmu != null) {
            this.handler.post(new zzqi(this, str, j, j2));
        }
    }

    public final void zzc(zzho zzhoVar) {
        if (this.zzbmu != null) {
            this.handler.post(new zzqh(this, zzhoVar));
        }
    }

    public final void zzf(int i, long j) {
        if (this.zzbmu != null) {
            this.handler.post(new zzqk(this, i, j));
        }
    }

    public final void zzb(int i, int i2, int i3, float f) {
        if (this.zzbmu != null) {
            this.handler.post(new zzqj(this, i, i2, i3, f));
        }
    }

    public final void zzb(Surface surface) {
        if (this.zzbmu != null) {
            this.handler.post(new zzqm(this, surface));
        }
    }

    public final void zzd(zzjl zzjlVar) {
        if (this.zzbmu != null) {
            this.handler.post(new zzql(this, zzjlVar));
        }
    }
}
