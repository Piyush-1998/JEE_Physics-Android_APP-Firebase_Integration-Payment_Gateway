package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zznb implements zzmx, zzna {
    private zznp zzafb;
    private zzna zzbdr;
    public final zzmx[] zzbet;
    private final IdentityHashMap<zznm, Integer> zzbeu = new IdentityHashMap<>();
    private int zzbev;
    private zzmx[] zzbew;
    private zznl zzbex;

    public zznb(zzmx... zzmxVarArr) {
        this.zzbet = zzmxVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zza(zzna zznaVar, long j) {
        this.zzbdr = zznaVar;
        zzmx[] zzmxVarArr = this.zzbet;
        this.zzbev = zzmxVarArr.length;
        for (zzmx zzmxVar : zzmxVarArr) {
            zzmxVar.zza(this, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzhl() throws IOException {
        for (zzmx zzmxVar : this.zzbet) {
            zzmxVar.zzhl();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final zznp zzhm() {
        return this.zzafb;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final long zza(zzob[] zzobVarArr, boolean[] zArr, zznm[] zznmVarArr, boolean[] zArr2, long j) {
        zznm[] zznmVarArr2 = zznmVarArr;
        int[] iArr = new int[zzobVarArr.length];
        int[] iArr2 = new int[zzobVarArr.length];
        for (int i = 0; i < zzobVarArr.length; i++) {
            iArr[i] = zznmVarArr2[i] == null ? -1 : this.zzbeu.get(zznmVarArr2[i]).intValue();
            iArr2[i] = -1;
            if (zzobVarArr[i] != null) {
                zznq zzij = zzobVarArr[i].zzij();
                int i2 = 0;
                while (true) {
                    zzmx[] zzmxVarArr = this.zzbet;
                    if (i2 >= zzmxVarArr.length) {
                        break;
                    } else if (zzmxVarArr[i2].zzhm().zza(zzij) != -1) {
                        iArr2[i] = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        this.zzbeu.clear();
        int length = zzobVarArr.length;
        zznm[] zznmVarArr3 = new zznm[length];
        zznm[] zznmVarArr4 = new zznm[zzobVarArr.length];
        zzob[] zzobVarArr2 = new zzob[zzobVarArr.length];
        ArrayList arrayList = new ArrayList(this.zzbet.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < this.zzbet.length) {
            for (int i4 = 0; i4 < zzobVarArr.length; i4++) {
                zzob zzobVar = null;
                zznmVarArr4[i4] = iArr[i4] == i3 ? zznmVarArr2[i4] : null;
                if (iArr2[i4] == i3) {
                    zzobVar = zzobVarArr[i4];
                }
                zzobVarArr2[i4] = zzobVar;
            }
            int i5 = i3;
            zzob[] zzobVarArr3 = zzobVarArr2;
            ArrayList arrayList2 = arrayList;
            long zza = this.zzbet[i3].zza(zzobVarArr2, zArr, zznmVarArr4, zArr2, j2);
            if (i5 == 0) {
                j2 = zza;
            } else if (zza != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i6 = 0; i6 < zzobVarArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    zzoz.checkState(zznmVarArr4[i6] != null);
                    zznmVarArr3[i6] = zznmVarArr4[i6];
                    this.zzbeu.put(zznmVarArr4[i6], Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    zzoz.checkState(zznmVarArr4[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zzbet[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            zzobVarArr2 = zzobVarArr3;
            zznmVarArr2 = zznmVarArr;
        }
        zznm[] zznmVarArr5 = zznmVarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zznmVarArr3, 0, zznmVarArr5, 0, length);
        zzmx[] zzmxVarArr2 = new zzmx[arrayList3.size()];
        this.zzbew = zzmxVarArr2;
        arrayList3.toArray(zzmxVarArr2);
        this.zzbex = new zzmo(this.zzbew);
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzee(long j) {
        for (zzmx zzmxVar : this.zzbew) {
            zzmxVar.zzee(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx, com.google.android.gms.internal.ads.zznl
    public final boolean zzef(long j) {
        return this.zzbex.zzef(j);
    }

    @Override // com.google.android.gms.internal.ads.zzmx, com.google.android.gms.internal.ads.zznl
    public final long zzhn() {
        return this.zzbex.zzhn();
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final long zzho() {
        zzmx[] zzmxVarArr;
        long zzho = this.zzbet[0].zzho();
        int i = 1;
        while (true) {
            zzmx[] zzmxVarArr2 = this.zzbet;
            if (i >= zzmxVarArr2.length) {
                if (zzho != -9223372036854775807L) {
                    for (zzmx zzmxVar : this.zzbew) {
                        if (zzmxVar != this.zzbet[0] && zzmxVar.zzeg(zzho) != zzho) {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzho;
            } else if (zzmxVarArr2[i].zzho() != -9223372036854775807L) {
                throw new IllegalStateException("Child reported discontinuity");
            } else {
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final long zzhp() {
        long j = Long.MAX_VALUE;
        for (zzmx zzmxVar : this.zzbew) {
            long zzhp = zzmxVar.zzhp();
            if (zzhp != Long.MIN_VALUE) {
                j = Math.min(j, zzhp);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final long zzeg(long j) {
        long zzeg = this.zzbew[0].zzeg(j);
        int i = 1;
        while (true) {
            zzmx[] zzmxVarArr = this.zzbew;
            if (i >= zzmxVarArr.length) {
                return zzeg;
            }
            if (zzmxVarArr[i].zzeg(zzeg) != zzeg) {
                throw new IllegalStateException("Children seeked to different positions");
            }
            i++;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzna
    public final void zza(zzmx zzmxVar) {
        int i = this.zzbev - 1;
        this.zzbev = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (zzmx zzmxVar2 : this.zzbet) {
            i2 += zzmxVar2.zzhm().length;
        }
        zznq[] zznqVarArr = new zznq[i2];
        int i3 = 0;
        for (zzmx zzmxVar3 : this.zzbet) {
            zznp zzhm = zzmxVar3.zzhm();
            int i4 = zzhm.length;
            int i5 = 0;
            while (i5 < i4) {
                zznqVarArr[i3] = zzhm.zzbd(i5);
                i5++;
                i3++;
            }
        }
        this.zzafb = new zznp(zznqVarArr);
        this.zzbdr.zza((zzmx) this);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final /* synthetic */ void zza(zzmx zzmxVar) {
        if (this.zzafb != null) {
            this.zzbdr.zza((zzna) this);
        }
    }
}
