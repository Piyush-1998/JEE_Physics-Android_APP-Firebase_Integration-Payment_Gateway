package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Stack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzki implements zzkj {
    private final byte[] zzaox = new byte[8];
    private final Stack<zzkk> zzaoy = new Stack<>();
    private final zzks zzaoz = new zzks();
    private zzkm zzapa;
    private int zzapb;
    private int zzapc;
    private long zzapd;

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void zza(zzkm zzkmVar) {
        this.zzapa = zzkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final void reset() {
        this.zzapb = 0;
        this.zzaoy.clear();
        this.zzaoz.reset();
    }

    @Override // com.google.android.gms.internal.ads.zzkj
    public final boolean zzb(zzjy zzjyVar) throws IOException, InterruptedException {
        String str;
        double longBitsToDouble;
        int zzat;
        int zza;
        long j;
        int i;
        zzoz.checkState(this.zzapa != null);
        while (true) {
            if (!this.zzaoy.isEmpty()) {
                long position = zzjyVar.getPosition();
                j = this.zzaoy.peek().zzape;
                if (position >= j) {
                    zzkm zzkmVar = this.zzapa;
                    i = this.zzaoy.pop().zzapc;
                    zzkmVar.zzap(i);
                    return true;
                }
            }
            if (this.zzapb == 0) {
                long zza2 = this.zzaoz.zza(zzjyVar, true, false, 4);
                if (zza2 == -2) {
                    zzjyVar.zzgo();
                    while (true) {
                        zzjyVar.zza(this.zzaox, 0, 4);
                        zzat = zzks.zzat(this.zzaox[0]);
                        if (zzat != -1 && zzat <= 4) {
                            zza = (int) zzks.zza(this.zzaox, zzat, false);
                            if (this.zzapa.zzao(zza)) {
                                break;
                            }
                        }
                        zzjyVar.zzai(1);
                    }
                    zzjyVar.zzai(zzat);
                    zza2 = zza;
                }
                if (zza2 == -1) {
                    return false;
                }
                this.zzapc = (int) zza2;
                this.zzapb = 1;
            }
            if (this.zzapb == 1) {
                this.zzapd = this.zzaoz.zza(zzjyVar, false, true, 8);
                this.zzapb = 2;
            }
            int zzan = this.zzapa.zzan(this.zzapc);
            if (zzan != 0) {
                if (zzan == 1) {
                    long position2 = zzjyVar.getPosition();
                    this.zzaoy.add(new zzkk(this.zzapc, this.zzapd + position2));
                    this.zzapa.zzd(this.zzapc, position2, this.zzapd);
                    this.zzapb = 0;
                    return true;
                } else if (zzan == 2) {
                    long j2 = this.zzapd;
                    if (j2 > 8) {
                        long j3 = this.zzapd;
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Invalid integer size: ");
                        sb.append(j3);
                        throw new zzhv(sb.toString());
                    }
                    this.zzapa.zzc(this.zzapc, zza(zzjyVar, (int) j2));
                    this.zzapb = 0;
                    return true;
                } else if (zzan == 3) {
                    long j4 = this.zzapd;
                    if (j4 > 2147483647L) {
                        long j5 = this.zzapd;
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("String element size: ");
                        sb2.append(j5);
                        throw new zzhv(sb2.toString());
                    }
                    zzkm zzkmVar2 = this.zzapa;
                    int i2 = this.zzapc;
                    int i3 = (int) j4;
                    if (i3 == 0) {
                        str = "";
                    } else {
                        byte[] bArr = new byte[i3];
                        zzjyVar.readFully(bArr, 0, i3);
                        str = new String(bArr);
                    }
                    zzkmVar2.zza(i2, str);
                    this.zzapb = 0;
                    return true;
                } else if (zzan == 4) {
                    this.zzapa.zza(this.zzapc, (int) this.zzapd, zzjyVar);
                    this.zzapb = 0;
                    return true;
                } else if (zzan == 5) {
                    long j6 = this.zzapd;
                    if (j6 != 4 && j6 != 8) {
                        long j7 = this.zzapd;
                        StringBuilder sb3 = new StringBuilder(40);
                        sb3.append("Invalid float size: ");
                        sb3.append(j7);
                        throw new zzhv(sb3.toString());
                    }
                    zzkm zzkmVar3 = this.zzapa;
                    int i4 = this.zzapc;
                    int i5 = (int) this.zzapd;
                    long zza3 = zza(zzjyVar, i5);
                    if (i5 == 4) {
                        longBitsToDouble = Float.intBitsToFloat((int) zza3);
                    } else {
                        longBitsToDouble = Double.longBitsToDouble(zza3);
                    }
                    zzkmVar3.zza(i4, longBitsToDouble);
                    this.zzapb = 0;
                    return true;
                } else {
                    StringBuilder sb4 = new StringBuilder(32);
                    sb4.append("Invalid element type ");
                    sb4.append(zzan);
                    throw new zzhv(sb4.toString());
                }
            }
            zzjyVar.zzai((int) this.zzapd);
            this.zzapb = 0;
        }
    }

    private final long zza(zzjy zzjyVar, int i) throws IOException, InterruptedException {
        zzjyVar.readFully(this.zzaox, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zzaox[i2] & 255);
        }
        return j;
    }
}
