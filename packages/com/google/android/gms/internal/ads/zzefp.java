package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class zzefp extends zzefm {
    protected final byte[] zzibo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzefp(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.zzibo = bArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int zzbdq() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public byte zzfu(int i) {
        return this.zzibo[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeff
    public byte zzfv(int i) {
        return this.zzibo[i];
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public int size() {
        return this.zzibo.length;
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final zzeff zzz(int i, int i2) {
        int zzi = zzi(i, i2, size());
        if (zzi == 0) {
            return zzeff.zzibd;
        }
        return new zzefi(this.zzibo, zzbdq() + i, zzi);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeff
    public void zzb(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzibo, i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final void zza(zzefc zzefcVar) throws IOException {
        zzefcVar.zzh(this.zzibo, zzbdq(), size());
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    protected final String zza(Charset charset) {
        return new String(this.zzibo, zzbdq(), size(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final boolean zzbdk() {
        int zzbdq = zzbdq();
        return zzejw.zzm(this.zzibo, zzbdq, size() + zzbdq);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final int zzg(int i, int i2, int i3) {
        int zzbdq = zzbdq() + i2;
        return zzejw.zzb(i, this.zzibo, zzbdq, i3 + zzbdq);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzeff) && size() == ((zzeff) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (obj instanceof zzefp) {
                zzefp zzefpVar = (zzefp) obj;
                int zzbdp = zzbdp();
                int zzbdp2 = zzefpVar.zzbdp();
                if (zzbdp == 0 || zzbdp2 == 0 || zzbdp == zzbdp2) {
                    return zza(zzefpVar, 0, size());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzefm
    final boolean zza(zzeff zzeffVar, int i, int i2) {
        if (i2 > zzeffVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 > zzeffVar.size()) {
            int size2 = zzeffVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (zzeffVar instanceof zzefp) {
            zzefp zzefpVar = (zzefp) zzeffVar;
            byte[] bArr = this.zzibo;
            byte[] bArr2 = zzefpVar.zzibo;
            int zzbdq = zzbdq() + i2;
            int zzbdq2 = zzbdq();
            int zzbdq3 = zzefpVar.zzbdq() + i;
            while (zzbdq2 < zzbdq) {
                if (bArr[zzbdq2] != bArr2[zzbdq3]) {
                    return false;
                }
                zzbdq2++;
                zzbdq3++;
            }
            return true;
        } else {
            return zzeffVar.zzz(i, i3).equals(zzz(0, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final int zzh(int i, int i2, int i3) {
        return zzegr.zza(i, this.zzibo, zzbdq() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final zzefq zzbdl() {
        return zzefq.zzb(this.zzibo, zzbdq(), size(), true);
    }
}
