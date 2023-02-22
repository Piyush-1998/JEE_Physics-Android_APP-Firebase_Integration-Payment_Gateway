package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzpc {
    private static final byte[] zzbjn = {0, 0, 0, 1};
    private static final int[] zzbjo = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzbjp = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static Pair<Integer, Integer> zze(byte[] bArr) {
        zzph zzphVar = new zzph(bArr);
        int zza = zza(zzphVar);
        int zzb = zzb(zzphVar);
        int zzbk = zzphVar.zzbk(4);
        if (zza == 5 || zza == 29) {
            zzb = zzb(zzphVar);
            if (zza(zzphVar) == 22) {
                zzbk = zzphVar.zzbk(4);
            }
        }
        int i = zzbjp[zzbk];
        zzoz.checkArgument(i != -1);
        return Pair.create(Integer.valueOf(zzb), Integer.valueOf(i));
    }

    public static byte[] zzc(byte[] bArr, int i, int i2) {
        byte[] bArr2 = zzbjn;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, zzbjn.length, i2);
        return bArr3;
    }

    private static int zza(zzph zzphVar) {
        int zzbk = zzphVar.zzbk(5);
        return zzbk == 31 ? zzphVar.zzbk(6) + 32 : zzbk;
    }

    private static int zzb(zzph zzphVar) {
        int zzbk = zzphVar.zzbk(4);
        if (zzbk == 15) {
            return zzphVar.zzbk(24);
        }
        zzoz.checkArgument(zzbk < 13);
        return zzbjo[zzbk];
    }
}
