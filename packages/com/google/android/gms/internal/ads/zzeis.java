package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeis extends zzeff {
    static final int[] zzija = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzijb;
    private final zzeff zzijc;
    private final zzeff zzijd;
    private final int zzije;
    private final int zzijf;

    private zzeis(zzeff zzeffVar, zzeff zzeffVar2) {
        this.zzijc = zzeffVar;
        this.zzijd = zzeffVar2;
        int size = zzeffVar.size();
        this.zzije = size;
        this.zzijb = size + zzeffVar2.size();
        this.zzijf = Math.max(zzeffVar.zzbdn(), zzeffVar2.zzbdn()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeff zza(zzeff zzeffVar, zzeff zzeffVar2) {
        if (zzeffVar2.size() == 0) {
            return zzeffVar;
        }
        if (zzeffVar.size() == 0) {
            return zzeffVar2;
        }
        int size = zzeffVar.size() + zzeffVar2.size();
        if (size < 128) {
            return zzb(zzeffVar, zzeffVar2);
        }
        if (zzeffVar instanceof zzeis) {
            zzeis zzeisVar = (zzeis) zzeffVar;
            if (zzeisVar.zzijd.size() + zzeffVar2.size() < 128) {
                return new zzeis(zzeisVar.zzijc, zzb(zzeisVar.zzijd, zzeffVar2));
            } else if (zzeisVar.zzijc.zzbdn() > zzeisVar.zzijd.zzbdn() && zzeisVar.zzbdn() > zzeffVar2.zzbdn()) {
                return new zzeis(zzeisVar.zzijc, new zzeis(zzeisVar.zzijd, zzeffVar2));
            }
        }
        if (size >= zzhm(Math.max(zzeffVar.zzbdn(), zzeffVar2.zzbdn()) + 1)) {
            return new zzeis(zzeffVar, zzeffVar2);
        }
        return zzeiu.zza(new zzeiu(null), zzeffVar, zzeffVar2);
    }

    private static zzeff zzb(zzeff zzeffVar, zzeff zzeffVar2) {
        int size = zzeffVar.size();
        int size2 = zzeffVar2.size();
        byte[] bArr = new byte[size + size2];
        zzeffVar.zza(bArr, 0, 0, size);
        zzeffVar2.zza(bArr, 0, size, size2);
        return zzeff.zzv(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzhm(int i) {
        int[] iArr = zzija;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final byte zzfu(int i) {
        zzaa(i, this.zzijb);
        return zzfv(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final byte zzfv(int i) {
        int i2 = this.zzije;
        if (i < i2) {
            return this.zzijc.zzfv(i);
        }
        return this.zzijd.zzfv(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final int size() {
        return this.zzijb;
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final zzefk zzbdi() {
        return new zzeir(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final int zzbdn() {
        return this.zzijf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final boolean zzbdo() {
        return this.zzijb >= zzhm(this.zzijf);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final zzeff zzz(int i, int i2) {
        int zzi = zzi(i, i2, this.zzijb);
        if (zzi == 0) {
            return zzeff.zzibd;
        }
        if (zzi == this.zzijb) {
            return this;
        }
        int i3 = this.zzije;
        if (i2 <= i3) {
            return this.zzijc.zzz(i, i2);
        }
        if (i >= i3) {
            return this.zzijd.zzz(i - i3, i2 - i3);
        }
        zzeff zzeffVar = this.zzijc;
        return new zzeis(zzeffVar.zzz(i, zzeffVar.size()), this.zzijd.zzz(0, i2 - this.zzije));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final void zzb(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzije;
        if (i4 <= i5) {
            this.zzijc.zzb(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zzijd.zzb(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzijc.zzb(bArr, i, i2, i6);
            this.zzijd.zzb(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final void zza(zzefc zzefcVar) throws IOException {
        this.zzijc.zza(zzefcVar);
        this.zzijd.zza(zzefcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    protected final String zza(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final boolean zzbdk() {
        int zzg = this.zzijc.zzg(0, 0, this.zzije);
        zzeff zzeffVar = this.zzijd;
        return zzeffVar.zzg(zzg, 0, zzeffVar.size()) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final int zzg(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzije;
        if (i4 <= i5) {
            return this.zzijc.zzg(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzijd.zzg(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzijd.zzg(this.zzijc.zzg(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final boolean equals(Object obj) {
        boolean zza;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeff)) {
            return false;
        }
        zzeff zzeffVar = (zzeff) obj;
        if (this.zzijb != zzeffVar.size()) {
            return false;
        }
        if (this.zzijb == 0) {
            return true;
        }
        int zzbdp = zzbdp();
        int zzbdp2 = zzeffVar.zzbdp();
        if (zzbdp != 0 && zzbdp2 != 0 && zzbdp != zzbdp2) {
            return false;
        }
        zzeit zzeitVar = new zzeit(this, null);
        zzefm next = zzeitVar.next();
        zzeit zzeitVar2 = new zzeit(zzeffVar, null);
        zzefm next2 = zzeitVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                zza = next.zza(next2, i2, min);
            } else {
                zza = next2.zza(next, i, min);
            }
            if (!zza) {
                return false;
            }
            i3 += min;
            int i4 = this.zzijb;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = zzeitVar.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                next2 = zzeitVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzeff
    public final int zzh(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzije;
        if (i4 <= i5) {
            return this.zzijc.zzh(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zzijd.zzh(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zzijd.zzh(this.zzijc.zzh(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzeff
    public final zzefq zzbdl() {
        return new zzefv(new zzeiw(this));
    }

    @Override // com.google.android.gms.internal.ads.zzeff, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeis(zzeff zzeffVar, zzeff zzeffVar2, zzeir zzeirVar) {
        this(zzeffVar, zzeffVar2);
    }
}
