package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzmc;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzkw {
    private static final int zzawp = zzpq.zzbl("vide");
    private static final int zzawq = zzpq.zzbl("soun");
    private static final int zzawr = zzpq.zzbl("text");
    private static final int zzaws = zzpq.zzbl("sbtl");
    private static final int zzawt = zzpq.zzbl("subt");
    private static final int zzawu = zzpq.zzbl("clcp");
    private static final int zzawv = zzpq.zzbl("cenc");
    private static final int zzavp = zzpq.zzbl("meta");

    /* JADX WARN: Removed duplicated region for block: B:200:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0820 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzln zza(com.google.android.gms.internal.ads.zzku r49, com.google.android.gms.internal.ads.zzkt r50, long r51, com.google.android.gms.internal.ads.zzjn r53, boolean r54) throws com.google.android.gms.internal.ads.zzhv {
        /*
            Method dump skipped, instructions count: 2138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzkw.zza(com.google.android.gms.internal.ads.zzku, com.google.android.gms.internal.ads.zzkt, long, com.google.android.gms.internal.ads.zzjn, boolean):com.google.android.gms.internal.ads.zzln");
    }

    public static zzls zza(zzln zzlnVar, zzku zzkuVar, zzjz zzjzVar) throws zzhv {
        zzky zzkzVar;
        boolean z;
        int i;
        int i2;
        zzln zzlnVar2;
        int i3;
        long[] jArr;
        int[] iArr;
        int i4;
        long[] jArr2;
        int[] iArr2;
        long j;
        boolean z2;
        long[] jArr3;
        int[] iArr3;
        int i5;
        long[] jArr4;
        int[] iArr4;
        int i6;
        int i7;
        int i8;
        int i9;
        zzkt zzau = zzkuVar.zzau(zzkr.zzave);
        if (zzau != null) {
            zzkzVar = new zzla(zzau);
        } else {
            zzkt zzau2 = zzkuVar.zzau(zzkr.zzavf);
            if (zzau2 == null) {
                throw new zzhv("Track has no sample table size information");
            }
            zzkzVar = new zzkz(zzau2);
        }
        int zzgw = zzkzVar.zzgw();
        if (zzgw == 0) {
            return new zzls(new long[0], new int[0], 0, new long[0], new int[0]);
        }
        zzkt zzau3 = zzkuVar.zzau(zzkr.zzavg);
        if (zzau3 == null) {
            zzau3 = zzkuVar.zzau(zzkr.zzavh);
            z = true;
        } else {
            z = false;
        }
        zzpk zzpkVar = zzau3.zzawe;
        zzpk zzpkVar2 = zzkuVar.zzau(zzkr.zzavd).zzawe;
        zzpk zzpkVar3 = zzkuVar.zzau(zzkr.zzava).zzawe;
        zzkt zzau4 = zzkuVar.zzau(zzkr.zzavb);
        zzpk zzpkVar4 = null;
        zzpk zzpkVar5 = zzau4 != null ? zzau4.zzawe : null;
        zzkt zzau5 = zzkuVar.zzau(zzkr.zzavc);
        zzpk zzpkVar6 = zzau5 != null ? zzau5.zzawe : null;
        zzkv zzkvVar = new zzkv(zzpkVar2, zzpkVar, z);
        zzpkVar3.zzbo(12);
        int zzjd = zzpkVar3.zzjd() - 1;
        int zzjd2 = zzpkVar3.zzjd();
        int zzjd3 = zzpkVar3.zzjd();
        if (zzpkVar6 != null) {
            zzpkVar6.zzbo(12);
            i = zzpkVar6.zzjd();
        } else {
            i = 0;
        }
        int i10 = -1;
        if (zzpkVar5 != null) {
            zzpkVar5.zzbo(12);
            i2 = zzpkVar5.zzjd();
            if (i2 > 0) {
                i10 = zzpkVar5.zzjd() - 1;
                zzpkVar4 = zzpkVar5;
            }
        } else {
            zzpkVar4 = zzpkVar5;
            i2 = 0;
        }
        long j2 = 0;
        if (!(zzkzVar.zzgy() && "audio/raw".equals(zzlnVar.zzaht.zzagy) && zzjd == 0 && i == 0 && i2 == 0)) {
            long[] jArr5 = new long[zzgw];
            iArr = new int[zzgw];
            jArr2 = new long[zzgw];
            int i11 = i2;
            iArr2 = new int[zzgw];
            int i12 = i10;
            long j3 = 0;
            j = 0;
            int i13 = 0;
            i4 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = i;
            int i18 = zzjd3;
            int i19 = zzjd2;
            int i20 = zzjd;
            int i21 = i11;
            while (i13 < zzgw) {
                while (i15 == 0) {
                    zzoz.checkState(zzkvVar.zzgv());
                    j3 = zzkvVar.zzawj;
                    i15 = zzkvVar.zzawi;
                    i18 = i18;
                    i19 = i19;
                }
                int i22 = i19;
                int i23 = i18;
                if (zzpkVar6 != null) {
                    while (i14 == 0 && i17 > 0) {
                        i14 = zzpkVar6.zzjd();
                        i16 = zzpkVar6.readInt();
                        i17--;
                    }
                    i14--;
                }
                int i24 = i16;
                jArr5[i13] = j3;
                iArr[i13] = zzkzVar.zzgx();
                if (iArr[i13] > i4) {
                    i4 = iArr[i13];
                }
                int i25 = zzgw;
                zzky zzkyVar = zzkzVar;
                jArr2[i13] = j + i24;
                iArr2[i13] = zzpkVar4 == null ? 1 : 0;
                if (i13 == i12) {
                    iArr2[i13] = 1;
                    i21--;
                    if (i21 > 0) {
                        i12 = zzpkVar4.zzjd() - 1;
                    }
                }
                long[] jArr6 = jArr5;
                j += i23;
                int i26 = i22 - 1;
                if (i26 != 0 || i20 <= 0) {
                    i8 = i23;
                    i9 = i26;
                } else {
                    i9 = zzpkVar3.zzjd();
                    i8 = zzpkVar3.zzjd();
                    i20--;
                }
                int i27 = i9;
                j3 += iArr[i13];
                i15--;
                i13++;
                zzgw = i25;
                jArr5 = jArr6;
                i12 = i12;
                i16 = i24;
                i19 = i27;
                i18 = i8;
                zzkzVar = zzkyVar;
            }
            i3 = zzgw;
            long[] jArr7 = jArr5;
            int i28 = i19;
            zzoz.checkArgument(i14 == 0);
            while (i17 > 0) {
                zzoz.checkArgument(zzpkVar6.zzjd() == 0);
                zzpkVar6.readInt();
                i17--;
            }
            if (i21 == 0 && i28 == 0) {
                i7 = i15;
                if (i7 == 0 && i20 == 0) {
                    zzlnVar2 = zzlnVar;
                    jArr = jArr7;
                }
            } else {
                i7 = i15;
            }
            zzlnVar2 = zzlnVar;
            int i29 = zzlnVar2.id;
            StringBuilder sb = new StringBuilder(215);
            sb.append("Inconsistent stbl box for track ");
            sb.append(i29);
            sb.append(": remainingSynchronizationSamples ");
            sb.append(i21);
            sb.append(", remainingSamplesAtTimestampDelta ");
            sb.append(i28);
            sb.append(", remainingSamplesInChunk ");
            sb.append(i7);
            sb.append(", remainingTimestampDeltaChanges ");
            sb.append(i20);
            Log.w("AtomParsers", sb.toString());
            jArr = jArr7;
        } else {
            zzlnVar2 = zzlnVar;
            i3 = zzgw;
            zzky zzkyVar2 = zzkzVar;
            long[] jArr8 = new long[zzkvVar.length];
            int i30 = zzkvVar.length;
            int[] iArr5 = new int[i30];
            while (zzkvVar.zzgv()) {
                jArr8[zzkvVar.index] = zzkvVar.zzawj;
                iArr5[zzkvVar.index] = zzkvVar.zzawi;
            }
            int zzgx = zzkyVar2.zzgx();
            long j4 = zzjd3;
            int i31 = 8192 / zzgx;
            int i32 = 0;
            for (int i33 = 0; i33 < i30; i33++) {
                i32 += zzpq.zzf(iArr5[i33], i31);
            }
            long[] jArr9 = new long[i32];
            int[] iArr6 = new int[i32];
            long[] jArr10 = new long[i32];
            int[] iArr7 = new int[i32];
            int i34 = 0;
            int i35 = 0;
            int i36 = 0;
            int i37 = 0;
            while (i34 < i30) {
                int i38 = iArr5[i34];
                long j5 = jArr8[i34];
                long[] jArr11 = jArr8;
                int i39 = i38;
                while (i39 > 0) {
                    int min = Math.min(i31, i39);
                    jArr9[i36] = j5;
                    iArr6[i36] = zzgx * min;
                    i37 = Math.max(i37, iArr6[i36]);
                    jArr10[i36] = i35 * j4;
                    iArr7[i36] = 1;
                    j5 += iArr6[i36];
                    i35 += min;
                    i39 -= min;
                    i36++;
                    i30 = i30;
                    iArr5 = iArr5;
                }
                i34++;
                jArr8 = jArr11;
            }
            zzld zzldVar = new zzld(jArr9, iArr6, i37, jArr10, iArr7);
            jArr = zzldVar.zzaok;
            iArr = zzldVar.zzaoj;
            i4 = zzldVar.zzaxe;
            jArr2 = zzldVar.zzaxf;
            iArr2 = zzldVar.zzaxg;
            j = 0;
        }
        if (zzlnVar2.zzbac == null || zzjzVar.zzgq()) {
            zzpq.zza(jArr2, 1000000L, zzlnVar2.zzdg);
            return new zzls(jArr, iArr, i4, jArr2, iArr2);
        }
        if (zzlnVar2.zzbac.length == 1 && zzlnVar2.type == 1 && jArr2.length >= 2) {
            long j6 = zzlnVar2.zzbad[0];
            long zza = zzpq.zza(zzlnVar2.zzbac[0], zzlnVar2.zzdg, zzlnVar2.zzazz) + j6;
            if (jArr2[0] <= j6 && j6 < jArr2[1] && jArr2[jArr2.length - 1] < zza && zza <= j) {
                long j7 = j - zza;
                long zza2 = zzpq.zza(j6 - jArr2[0], zzlnVar2.zzaht.zzahj, zzlnVar2.zzdg);
                long zza3 = zzpq.zza(j7, zzlnVar2.zzaht.zzahj, zzlnVar2.zzdg);
                if ((zza2 != 0 || zza3 != 0) && zza2 <= 2147483647L && zza3 <= 2147483647L) {
                    zzjzVar.zzahl = (int) zza2;
                    zzjzVar.zzahm = (int) zza3;
                    zzpq.zza(jArr2, 1000000L, zzlnVar2.zzdg);
                    return new zzls(jArr, iArr, i4, jArr2, iArr2);
                }
            }
        }
        if (zzlnVar2.zzbac.length == 1) {
            char c = 0;
            if (zzlnVar2.zzbac[0] == 0) {
                int i40 = 0;
                while (i40 < jArr2.length) {
                    jArr2[i40] = zzpq.zza(jArr2[i40] - zzlnVar2.zzbad[c], 1000000L, zzlnVar2.zzdg);
                    i40++;
                    c = 0;
                }
                return new zzls(jArr, iArr, i4, jArr2, iArr2);
            }
        }
        boolean z3 = zzlnVar2.type == 1;
        boolean z4 = false;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        while (i42 < zzlnVar2.zzbac.length) {
            long j8 = zzlnVar2.zzbad[i42];
            if (j8 != -1) {
                i6 = i4;
                long zza4 = zzpq.zza(zzlnVar2.zzbac[i42], zzlnVar2.zzdg, zzlnVar2.zzazz);
                int zzb = zzpq.zzb(jArr2, j8, true, true);
                int zzb2 = zzpq.zzb(jArr2, j8 + zza4, z3, false);
                i41 += zzb2 - zzb;
                z4 |= i43 != zzb;
                i43 = zzb2;
            } else {
                i6 = i4;
            }
            i42++;
            i4 = i6;
        }
        int i44 = i4;
        boolean z5 = z4 | (i41 != i3);
        long[] jArr12 = z5 ? new long[i41] : jArr;
        int[] iArr8 = z5 ? new int[i41] : iArr;
        int i45 = z5 ? 0 : i44;
        int[] iArr9 = z5 ? new int[i41] : iArr2;
        long[] jArr13 = new long[i41];
        int i46 = i45;
        int i47 = 0;
        int i48 = 0;
        while (i47 < zzlnVar2.zzbac.length) {
            long j9 = zzlnVar2.zzbad[i47];
            long j10 = zzlnVar2.zzbac[i47];
            if (j9 != -1) {
                int[] iArr10 = iArr9;
                i5 = i47;
                long[] jArr14 = jArr12;
                long[] jArr15 = jArr;
                int zzb3 = zzpq.zzb(jArr2, j9, true, true);
                int zzb4 = zzpq.zzb(jArr2, zzpq.zza(j10, zzlnVar2.zzdg, zzlnVar2.zzazz) + j9, z3, false);
                if (z5) {
                    int i49 = zzb4 - zzb3;
                    jArr3 = jArr14;
                    jArr4 = jArr15;
                    System.arraycopy(jArr4, zzb3, jArr3, i48, i49);
                    System.arraycopy(iArr, zzb3, iArr8, i48, i49);
                    z2 = z3;
                    iArr4 = iArr10;
                    System.arraycopy(iArr2, zzb3, iArr4, i48, i49);
                } else {
                    jArr3 = jArr14;
                    z2 = z3;
                    iArr4 = iArr10;
                    jArr4 = jArr15;
                }
                int i50 = i46;
                while (zzb3 < zzb4) {
                    int[] iArr11 = iArr4;
                    int i51 = zzb4;
                    long j11 = j9;
                    jArr13[i48] = zzpq.zza(j2, 1000000L, zzlnVar2.zzazz) + zzpq.zza(jArr2[zzb3] - j9, 1000000L, zzlnVar2.zzdg);
                    if (z5 && iArr8[i48] > i50) {
                        i50 = iArr[zzb3];
                    }
                    i48++;
                    zzb3++;
                    j9 = j11;
                    zzb4 = i51;
                    iArr4 = iArr11;
                }
                iArr3 = iArr4;
                i46 = i50;
            } else {
                z2 = z3;
                jArr3 = jArr12;
                iArr3 = iArr9;
                i5 = i47;
                jArr4 = jArr;
            }
            j2 += j10;
            i47 = i5 + 1;
            jArr = jArr4;
            jArr12 = jArr3;
            z3 = z2;
            iArr9 = iArr3;
        }
        long[] jArr16 = jArr12;
        int[] iArr12 = iArr9;
        boolean z6 = false;
        for (int i52 = 0; i52 < iArr12.length && !z6; i52++) {
            z6 |= (iArr12[i52] & 1) != 0;
        }
        if (!z6) {
            throw new zzhv("The edited sample sequence does not contain a sync sample.");
        }
        return new zzls(jArr16, iArr8, i46, jArr13, iArr12);
    }

    public static zzmc zza(zzkt zzktVar, boolean z) {
        if (z) {
            return null;
        }
        zzpk zzpkVar = zzktVar.zzawe;
        zzpkVar.zzbo(8);
        while (zzpkVar.zziy() >= 8) {
            int position = zzpkVar.getPosition();
            int readInt = zzpkVar.readInt();
            if (zzpkVar.readInt() == zzkr.zzavp) {
                zzpkVar.zzbo(position);
                int i = position + readInt;
                zzpkVar.zzbp(12);
                while (true) {
                    if (zzpkVar.getPosition() >= i) {
                        break;
                    }
                    int position2 = zzpkVar.getPosition();
                    int readInt2 = zzpkVar.readInt();
                    if (zzpkVar.readInt() == zzkr.zzavq) {
                        zzpkVar.zzbo(position2);
                        int i2 = position2 + readInt2;
                        zzpkVar.zzbp(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzpkVar.getPosition() < i2) {
                            zzmc.zza zzd = zzlk.zzd(zzpkVar);
                            if (zzd != null) {
                                arrayList.add(zzd);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new zzmc(arrayList);
                        }
                    } else {
                        zzpkVar.zzbp(readInt2 - 8);
                    }
                }
                return null;
            }
            zzpkVar.zzbp(readInt - 8);
        }
        return null;
    }

    private static Pair<String, byte[]> zzb(zzpk zzpkVar, int i) {
        zzpkVar.zzbo(i + 8 + 4);
        zzpkVar.zzbp(1);
        zzc(zzpkVar);
        zzpkVar.zzbp(2);
        int readUnsignedByte = zzpkVar.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            zzpkVar.zzbp(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            zzpkVar.zzbp(zzpkVar.readUnsignedShort());
        }
        if ((readUnsignedByte & 32) != 0) {
            zzpkVar.zzbp(2);
        }
        zzpkVar.zzbp(1);
        zzc(zzpkVar);
        int readUnsignedByte2 = zzpkVar.readUnsignedByte();
        String str = null;
        if (readUnsignedByte2 == 32) {
            str = "video/mp4v-es";
        } else if (readUnsignedByte2 == 33) {
            str = "video/avc";
        } else if (readUnsignedByte2 != 35) {
            if (readUnsignedByte2 != 64) {
                if (readUnsignedByte2 == 107) {
                    return Pair.create("audio/mpeg", null);
                }
                if (readUnsignedByte2 == 165) {
                    str = "audio/ac3";
                } else if (readUnsignedByte2 != 166) {
                    switch (readUnsignedByte2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (readUnsignedByte2) {
                                case 169:
                                case 172:
                                    return Pair.create("audio/vnd.dts", null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        zzpkVar.zzbp(12);
        zzpkVar.zzbp(1);
        int zzc = zzc(zzpkVar);
        byte[] bArr = new byte[zzc];
        zzpkVar.zze(bArr, 0, zzc);
        return Pair.create(str, bArr);
    }

    private static int zza(zzpk zzpkVar, int i, int i2, zzkx zzkxVar, int i3) {
        int position = zzpkVar.getPosition();
        while (true) {
            if (position - i >= i2) {
                return 0;
            }
            zzpkVar.zzbo(position);
            int readInt = zzpkVar.readInt();
            zzoz.checkArgument(readInt > 0, "childAtomSize should be positive");
            if (zzpkVar.readInt() == zzkr.zzauj) {
                int i4 = position + 8;
                Pair pair = null;
                Integer num = null;
                zzlq zzlqVar = null;
                boolean z = false;
                while (i4 - position < readInt) {
                    zzpkVar.zzbo(i4);
                    int readInt2 = zzpkVar.readInt();
                    int readInt3 = zzpkVar.readInt();
                    if (readInt3 == zzkr.zzaup) {
                        num = Integer.valueOf(zzpkVar.readInt());
                    } else if (readInt3 == zzkr.zzauk) {
                        zzpkVar.zzbp(4);
                        z = zzpkVar.readInt() == zzawv;
                    } else if (readInt3 == zzkr.zzaul) {
                        int i5 = i4 + 8;
                        while (true) {
                            if (i5 - i4 >= readInt2) {
                                zzlqVar = null;
                                break;
                            }
                            zzpkVar.zzbo(i5);
                            int readInt4 = zzpkVar.readInt();
                            if (zzpkVar.readInt() == zzkr.zzaum) {
                                zzpkVar.zzbp(6);
                                boolean z2 = zzpkVar.readUnsignedByte() == 1;
                                int readUnsignedByte = zzpkVar.readUnsignedByte();
                                byte[] bArr = new byte[16];
                                zzpkVar.zze(bArr, 0, 16);
                                zzlqVar = new zzlq(z2, readUnsignedByte, bArr);
                            } else {
                                i5 += readInt4;
                            }
                        }
                    }
                    i4 += readInt2;
                }
                if (z) {
                    zzoz.checkArgument(num != null, "frma atom is mandatory");
                    zzoz.checkArgument(zzlqVar != null, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, zzlqVar);
                }
                if (pair != null) {
                    zzkxVar.zzaww[i3] = (zzlq) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            position += readInt;
        }
    }

    private static int zzc(zzpk zzpkVar) {
        int readUnsignedByte = zzpkVar.readUnsignedByte();
        int i = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = zzpkVar.readUnsignedByte();
            i = (i << 7) | (readUnsignedByte & 127);
        }
        return i;
    }
}
