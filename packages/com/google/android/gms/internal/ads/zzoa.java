package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzoa extends zzog {
    private zznz zzbhp;
    private final SparseArray<Map<zznp, zzoc>> zzbhn = new SparseArray<>();
    private final SparseBooleanArray zzbho = new SparseBooleanArray();
    private int zzaib = 0;

    protected abstract zzob[] zza(zzhw[] zzhwVarArr, zznp[] zznpVarArr, int[][][] iArr) throws zzhd;

    public final void zzf(int i, boolean z) {
        if (this.zzbho.get(i) == z) {
            return;
        }
        this.zzbho.put(i, z);
        invalidate();
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final zzoi zza(zzhw[] zzhwVarArr, zznp zznpVar) throws zzhd {
        int[] iArr;
        int[] iArr2 = new int[zzhwVarArr.length + 1];
        int length = zzhwVarArr.length + 1;
        zznq[][] zznqVarArr = new zznq[length];
        int[][][] iArr3 = new int[zzhwVarArr.length + 1][];
        for (int i = 0; i < length; i++) {
            zznqVarArr[i] = new zznq[zznpVar.length];
            iArr3[i] = new int[zznpVar.length];
        }
        int length2 = zzhwVarArr.length;
        int[] iArr4 = new int[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            iArr4[i2] = zzhwVarArr[i2].zzee();
        }
        for (int i3 = 0; i3 < zznpVar.length; i3++) {
            zznq zzbd = zznpVar.zzbd(i3);
            int length3 = zzhwVarArr.length;
            int i4 = 0;
            for (int i5 = 0; i5 < zzhwVarArr.length; i5++) {
                zzhw zzhwVar = zzhwVarArr[i5];
                for (int i6 = 0; i6 < zzbd.length; i6++) {
                    int zza = zzhwVar.zza(zzbd.zzbe(i6)) & 3;
                    if (zza > i4) {
                        length3 = i5;
                        if (zza == 3) {
                            break;
                        }
                        i4 = zza;
                    }
                }
            }
            if (length3 == zzhwVarArr.length) {
                iArr = new int[zzbd.length];
            } else {
                zzhw zzhwVar2 = zzhwVarArr[length3];
                int[] iArr5 = new int[zzbd.length];
                for (int i7 = 0; i7 < zzbd.length; i7++) {
                    iArr5[i7] = zzhwVar2.zza(zzbd.zzbe(i7));
                }
                iArr = iArr5;
            }
            int i8 = iArr2[length3];
            zznqVarArr[length3][i8] = zzbd;
            iArr3[length3][i8] = iArr;
            iArr2[length3] = iArr2[length3] + 1;
        }
        zznp[] zznpVarArr = new zznp[zzhwVarArr.length];
        int[] iArr6 = new int[zzhwVarArr.length];
        for (int i9 = 0; i9 < zzhwVarArr.length; i9++) {
            int i10 = iArr2[i9];
            zznpVarArr[i9] = new zznp((zznq[]) Arrays.copyOf(zznqVarArr[i9], i10));
            iArr3[i9] = (int[][]) Arrays.copyOf(iArr3[i9], i10);
            iArr6[i9] = zzhwVarArr[i9].getTrackType();
        }
        zznp zznpVar2 = new zznp((zznq[]) Arrays.copyOf(zznqVarArr[zzhwVarArr.length], iArr2[zzhwVarArr.length]));
        zzob[] zza2 = zza(zzhwVarArr, zznpVarArr, iArr3);
        int i11 = 0;
        while (true) {
            if (i11 < zzhwVarArr.length) {
                if (this.zzbho.get(i11)) {
                    zza2[i11] = null;
                } else {
                    zznp zznpVar3 = zznpVarArr[i11];
                    Map<zznp, zzoc> map = this.zzbhn.get(i11);
                    if ((map != null ? map.get(zznpVar3) : null) != null) {
                        throw new NoSuchMethodError();
                    }
                }
                i11++;
            } else {
                zznz zznzVar = new zznz(iArr6, zznpVarArr, iArr4, iArr3, zznpVar2);
                zzhz[] zzhzVarArr = new zzhz[zzhwVarArr.length];
                for (int i12 = 0; i12 < zzhwVarArr.length; i12++) {
                    zzhzVarArr[i12] = zza2[i12] != null ? zzhz.zzaia : null;
                }
                return new zzoi(zznpVar, new zzod(zza2), zznzVar, zzhzVarArr);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final void zzd(Object obj) {
        this.zzbhp = (zznz) obj;
    }
}
