package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzoq implements zzok {
    private final boolean zzbir;
    private final int zzbis;
    private final byte[] zzbit;
    private final zzoh[] zzbiu;
    private int zzbiv;
    private int zzbiw;
    private int zzbix;
    private zzoh[] zzbiy;

    public zzoq(boolean z, int i) {
        this(true, 65536, 0);
    }

    private zzoq(boolean z, int i, int i2) {
        zzoz.checkArgument(true);
        zzoz.checkArgument(true);
        this.zzbir = true;
        this.zzbis = 65536;
        this.zzbix = 0;
        this.zzbiy = new zzoh[100];
        this.zzbit = null;
        this.zzbiu = new zzoh[1];
    }

    public final synchronized void reset() {
        if (this.zzbir) {
            zzbi(0);
        }
    }

    public final synchronized void zzbi(int i) {
        boolean z = i < this.zzbiv;
        this.zzbiv = i;
        if (z) {
            zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized zzoh zzil() {
        zzoh zzohVar;
        this.zzbiw++;
        if (this.zzbix > 0) {
            zzoh[] zzohVarArr = this.zzbiy;
            int i = this.zzbix - 1;
            this.zzbix = i;
            zzohVar = zzohVarArr[i];
            this.zzbiy[i] = null;
        } else {
            zzohVar = new zzoh(new byte[this.zzbis], 0);
        }
        return zzohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zza(zzoh zzohVar) {
        this.zzbiu[0] = zzohVar;
        zza(this.zzbiu);
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zza(zzoh[] zzohVarArr) {
        boolean z;
        if (this.zzbix + zzohVarArr.length >= this.zzbiy.length) {
            this.zzbiy = (zzoh[]) Arrays.copyOf(this.zzbiy, Math.max(this.zzbiy.length << 1, this.zzbix + zzohVarArr.length));
        }
        for (zzoh zzohVar : zzohVarArr) {
            if (zzohVar.data != null && zzohVar.data.length != this.zzbis) {
                z = false;
                zzoz.checkArgument(z);
                zzoh[] zzohVarArr2 = this.zzbiy;
                int i = this.zzbix;
                this.zzbix = i + 1;
                zzohVarArr2[i] = zzohVar;
            }
            z = true;
            zzoz.checkArgument(z);
            zzoh[] zzohVarArr22 = this.zzbiy;
            int i2 = this.zzbix;
            this.zzbix = i2 + 1;
            zzohVarArr22[i2] = zzohVar;
        }
        this.zzbiw -= zzohVarArr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final synchronized void zzn() {
        int max = Math.max(0, zzpq.zzf(this.zzbiv, this.zzbis) - this.zzbiw);
        if (max >= this.zzbix) {
            return;
        }
        Arrays.fill(this.zzbiy, max, this.zzbix, (Object) null);
        this.zzbix = max;
    }

    public final synchronized int zzip() {
        return this.zzbiw * this.zzbis;
    }

    @Override // com.google.android.gms.internal.ads.zzok
    public final int zzim() {
        return this.zzbis;
    }
}
