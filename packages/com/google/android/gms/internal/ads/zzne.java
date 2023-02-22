package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzne implements zzmz {
    private final zzmz[] zzbfa;
    private final ArrayList<zzmz> zzbfb;
    private zznc zzbfc;
    private zzhy zzbfd;
    private Object zzbfe;
    private zzng zzbfg;
    private final zzid zzaer = new zzid();
    private int zzbff = -1;

    public zzne(zzmz... zzmzVarArr) {
        this.zzbfa = zzmzVarArr;
        this.zzbfb = new ArrayList<>(Arrays.asList(zzmzVarArr));
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zza(zzhc zzhcVar, boolean z, zznc zzncVar) {
        this.zzbfc = zzncVar;
        int i = 0;
        while (true) {
            zzmz[] zzmzVarArr = this.zzbfa;
            if (i >= zzmzVarArr.length) {
                return;
            }
            zzmzVarArr[i].zza(zzhcVar, false, new zznd(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzhx() throws IOException {
        zzng zzngVar = this.zzbfg;
        if (zzngVar != null) {
            throw zzngVar;
        }
        for (zzmz zzmzVar : this.zzbfa) {
            zzmzVar.zzhx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final zzmx zza(int i, zzok zzokVar) {
        int length = this.zzbfa.length;
        zzmx[] zzmxVarArr = new zzmx[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzmxVarArr[i2] = this.zzbfa[i2].zza(i, zzokVar);
        }
        return new zznb(zzmxVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzb(zzmx zzmxVar) {
        zznb zznbVar = (zznb) zzmxVar;
        int i = 0;
        while (true) {
            zzmz[] zzmzVarArr = this.zzbfa;
            if (i >= zzmzVarArr.length) {
                return;
            }
            zzmzVarArr[i].zzb(zznbVar.zzbet[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmz
    public final void zzhy() {
        for (zzmz zzmzVar : this.zzbfa) {
            zzmzVar.zzhy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(int i, zzhy zzhyVar, Object obj) {
        zzng zzngVar;
        if (this.zzbfg == null) {
            int zzfd = zzhyVar.zzfd();
            int i2 = 0;
            while (true) {
                if (i2 < zzfd) {
                    if (zzhyVar.zza(i2, this.zzaer, false).zzaip) {
                        zzngVar = new zzng(0);
                        break;
                    }
                    i2++;
                } else {
                    if (this.zzbff == -1) {
                        this.zzbff = zzhyVar.zzfe();
                    } else if (zzhyVar.zzfe() != this.zzbff) {
                        zzngVar = new zzng(1);
                    }
                    zzngVar = null;
                }
            }
            this.zzbfg = zzngVar;
        }
        if (this.zzbfg != null) {
            return;
        }
        this.zzbfb.remove(this.zzbfa[i]);
        if (i == 0) {
            this.zzbfd = zzhyVar;
            this.zzbfe = obj;
        }
        if (this.zzbfb.isEmpty()) {
            this.zzbfc.zzb(this.zzbfd, this.zzbfe);
        }
    }
}
