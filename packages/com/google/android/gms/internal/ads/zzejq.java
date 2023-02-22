package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzejq {
    private static final zzejq zzikg = new zzejq(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzias;
    private int zzifp;
    private Object[] zziib;
    private int[] zzikh;

    public static zzejq zzbhz() {
        return zzikg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzejq zzbia() {
        return new zzejq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzejq zza(zzejq zzejqVar, zzejq zzejqVar2) {
        int i = zzejqVar.count + zzejqVar2.count;
        int[] copyOf = Arrays.copyOf(zzejqVar.zzikh, i);
        System.arraycopy(zzejqVar2.zzikh, 0, copyOf, zzejqVar.count, zzejqVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzejqVar.zziib, i);
        System.arraycopy(zzejqVar2.zziib, 0, copyOf2, zzejqVar.count, zzejqVar2.count);
        return new zzejq(i, copyOf, copyOf2, true);
    }

    private zzejq() {
        this(0, new int[8], new Object[8], true);
    }

    private zzejq(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzifp = -1;
        this.count = i;
        this.zzikh = iArr;
        this.zziib = objArr;
        this.zzias = z;
    }

    public final void zzbdg() {
        this.zzias = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzekk zzekkVar) throws IOException {
        if (zzekkVar.zzbew() == zzegp.zze.zzigi) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzekkVar.zzc(this.zzikh[i] >>> 3, this.zziib[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzekkVar.zzc(this.zzikh[i2] >>> 3, this.zziib[i2]);
        }
    }

    public final void zzb(zzekk zzekkVar) throws IOException {
        if (this.count == 0) {
            return;
        }
        if (zzekkVar.zzbew() == zzegp.zze.zzigh) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzikh[i], this.zziib[i], zzekkVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzikh[i2], this.zziib[i2], zzekkVar);
        }
    }

    private static void zzb(int i, Object obj, zzekk zzekkVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzekkVar.zzp(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            zzekkVar.zzj(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            zzekkVar.zza(i2, (zzeff) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                zzekkVar.zzae(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzegz.zzbgg());
        } else if (zzekkVar.zzbew() == zzegp.zze.zzigh) {
            zzekkVar.zzgz(i2);
            ((zzejq) obj).zzb(zzekkVar);
            zzekkVar.zzha(i2);
        } else {
            zzekkVar.zzha(i2);
            ((zzejq) obj).zzb(zzekkVar);
            zzekkVar.zzgz(i2);
        }
    }

    public final int zzbib() {
        int i = this.zzifp;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzefz.zzd(this.zzikh[i3] >>> 3, (zzeff) this.zziib[i3]);
        }
        this.zzifp = i2;
        return i2;
    }

    public final int zzbfl() {
        int zzl;
        int i = this.zzifp;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzikh[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zzl = zzefz.zzl(i5, ((Long) this.zziib[i3]).longValue());
            } else if (i6 == 1) {
                zzl = zzefz.zzn(i5, ((Long) this.zziib[i3]).longValue());
            } else if (i6 == 2) {
                zzl = zzefz.zzc(i5, (zzeff) this.zziib[i3]);
            } else if (i6 == 3) {
                zzl = (zzefz.zzgq(i5) << 1) + ((zzejq) this.zziib[i3]).zzbfl();
            } else if (i6 == 5) {
                zzl = zzefz.zzai(i5, ((Integer) this.zziib[i3]).intValue());
            } else {
                throw new IllegalStateException(zzegz.zzbgg());
            }
            i2 += zzl;
        }
        this.zzifp = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof zzejq)) {
            zzejq zzejqVar = (zzejq) obj;
            int i = this.count;
            if (i == zzejqVar.count) {
                int[] iArr = this.zzikh;
                int[] iArr2 = zzejqVar.zzikh;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.zziib;
                    Object[] objArr2 = zzejqVar.zziib;
                    int i3 = this.count;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzikh;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zziib;
        int i7 = this.count;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzeie.zza(sb, i, String.valueOf(this.zzikh[i2] >>> 3), this.zziib[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzd(int i, Object obj) {
        if (!this.zzias) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.count;
        if (i2 == this.zzikh.length) {
            int i3 = this.count + (i2 < 4 ? 8 : i2 >> 1);
            this.zzikh = Arrays.copyOf(this.zzikh, i3);
            this.zziib = Arrays.copyOf(this.zziib, i3);
        }
        int[] iArr = this.zzikh;
        int i4 = this.count;
        iArr[i4] = i;
        this.zziib[i4] = obj;
        this.count = i4 + 1;
    }
}
