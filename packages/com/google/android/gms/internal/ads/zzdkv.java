package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdkv {
    private final Clock zzbpw;
    private final Object lock = new Object();
    private volatile int zzhad = zzdku.zzgzz;
    private volatile long zzdyt = 0;

    public zzdkv(Clock clock) {
        this.zzbpw = clock;
    }

    private final void zzr(int i, int i2) {
        zzasj();
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzhad != i) {
                return;
            }
            this.zzhad = i2;
            if (this.zzhad == zzdku.zzhab) {
                this.zzdyt = currentTimeMillis;
            }
        }
    }

    private final void zzasj() {
        long currentTimeMillis = this.zzbpw.currentTimeMillis();
        synchronized (this.lock) {
            if (this.zzhad == zzdku.zzhab) {
                if (this.zzdyt + ((Long) zzwe.zzpu().zzd(zzaat.zzcvk)).longValue() <= currentTimeMillis) {
                    this.zzhad = zzdku.zzgzz;
                }
            }
        }
    }

    public final void zzbn(boolean z) {
        if (z) {
            zzr(zzdku.zzgzz, zzdku.zzhaa);
        } else {
            zzr(zzdku.zzhaa, zzdku.zzgzz);
        }
    }

    public final boolean zzask() {
        boolean z;
        synchronized (this.lock) {
            zzasj();
            z = this.zzhad == zzdku.zzhaa;
        }
        return z;
    }

    public final boolean zzasl() {
        boolean z;
        synchronized (this.lock) {
            zzasj();
            z = this.zzhad == zzdku.zzhab;
        }
        return z;
    }

    public final void zzwf() {
        zzr(zzdku.zzhaa, zzdku.zzhab);
    }
}
