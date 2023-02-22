package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzpl implements zzpd {
    private boolean started;
    private zzhu zzafd = zzhu.zzahv;
    private long zzbkf;
    private long zzbkg;

    public final void start() {
        if (this.started) {
            return;
        }
        this.zzbkg = SystemClock.elapsedRealtime();
        this.started = true;
    }

    public final void stop() {
        if (this.started) {
            zzel(zzfx());
            this.started = false;
        }
    }

    public final void zzel(long j) {
        this.zzbkf = j;
        if (this.started) {
            this.zzbkg = SystemClock.elapsedRealtime();
        }
    }

    public final void zza(zzpd zzpdVar) {
        zzel(zzpdVar.zzfx());
        this.zzafd = zzpdVar.zzfq();
    }

    @Override // com.google.android.gms.internal.ads.zzpd
    public final long zzfx() {
        long zzdu;
        long j = this.zzbkf;
        if (this.started) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzbkg;
            if (this.zzafd.zzahw == 1.0f) {
                zzdu = zzha.zzdn(elapsedRealtime);
            } else {
                zzdu = this.zzafd.zzdu(elapsedRealtime);
            }
            return j + zzdu;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzpd
    public final zzhu zzb(zzhu zzhuVar) {
        if (this.started) {
            zzel(zzfx());
        }
        this.zzafd = zzhuVar;
        return zzhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpd
    public final zzhu zzfq() {
        return this.zzafd;
    }
}
