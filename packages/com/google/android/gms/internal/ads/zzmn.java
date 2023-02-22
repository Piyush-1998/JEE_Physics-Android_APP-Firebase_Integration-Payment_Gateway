package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzmn implements zzjx, zzmx, zznj, zzow<zzmu> {
    private final Uri uri;
    private final Handler zzaeo;
    private boolean zzafq;
    private boolean zzage;
    private long zzaid;
    private final zzom zzaoo;
    private final int zzbdf;
    private final zzmy zzbdg;
    private final zznc zzbdh;
    private final zzok zzbdi;
    private final String zzbdj;
    private final long zzbdk;
    private final zzmt zzbdm;
    private zzna zzbdr;
    private zzke zzbds;
    private boolean zzbdt;
    private boolean zzbdu;
    private boolean zzbdv;
    private int zzbdw;
    private zznp zzbdx;
    private boolean[] zzbdy;
    private boolean[] zzbdz;
    private boolean zzbea;
    private long zzbeb;
    private int zzbed;
    private boolean zzbee;
    private final zzot zzbdl = new zzot("Loader:ExtractorMediaPeriod");
    private final zzpb zzbdn = new zzpb();
    private final Runnable zzbdo = new zzmq(this);
    private final Runnable zzbdp = new zzmp(this);
    private final Handler handler = new Handler();
    private long zzbec = -9223372036854775807L;
    private final SparseArray<zznh> zzbdq = new SparseArray<>();
    private long zzcp = -1;

    public zzmn(Uri uri, zzom zzomVar, zzjv[] zzjvVarArr, int i, Handler handler, zzmy zzmyVar, zznc zzncVar, zzok zzokVar, String str, int i2) {
        this.uri = uri;
        this.zzaoo = zzomVar;
        this.zzbdf = i;
        this.zzaeo = handler;
        this.zzbdg = zzmyVar;
        this.zzbdh = zzncVar;
        this.zzbdi = zzokVar;
        this.zzbdj = str;
        this.zzbdk = i2;
        this.zzbdm = new zzmt(zzjvVarArr, this);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzee(long j) {
    }

    public final void release() {
        this.zzbdl.zza(new zzms(this, this.zzbdm));
        this.handler.removeCallbacksAndMessages(null);
        this.zzage = true;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zza(zzna zznaVar, long j) {
        this.zzbdr = zznaVar;
        this.zzbdn.open();
        startLoading();
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final void zzhl() throws IOException {
        this.zzbdl.zzbj(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final zznp zzhm() {
        return this.zzbdx;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final long zza(zzob[] zzobVarArr, boolean[] zArr, zznm[] zznmVarArr, boolean[] zArr2, long j) {
        int i;
        zzoz.checkState(this.zzafq);
        for (int i2 = 0; i2 < zzobVarArr.length; i2++) {
            if (zznmVarArr[i2] != null && (zzobVarArr[i2] == null || !zArr[i2])) {
                i = ((zzmw) zznmVarArr[i2]).track;
                zzoz.checkState(this.zzbdy[i]);
                this.zzbdw--;
                this.zzbdy[i] = false;
                this.zzbdq.valueAt(i).disable();
                zznmVarArr[i2] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < zzobVarArr.length; i3++) {
            if (zznmVarArr[i3] == null && zzobVarArr[i3] != null) {
                zzob zzobVar = zzobVarArr[i3];
                zzoz.checkState(zzobVar.length() == 1);
                zzoz.checkState(zzobVar.zzbf(0) == 0);
                int zza = this.zzbdx.zza(zzobVar.zzij());
                zzoz.checkState(!this.zzbdy[zza]);
                this.zzbdw++;
                this.zzbdy[zza] = true;
                zznmVarArr[i3] = new zzmw(this, zza);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.zzbdu) {
            int size = this.zzbdq.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.zzbdy[i4]) {
                    this.zzbdq.valueAt(i4).disable();
                }
            }
        }
        if (this.zzbdw == 0) {
            this.zzbdv = false;
            if (this.zzbdl.isLoading()) {
                this.zzbdl.zziq();
            }
        } else if (!this.zzbdu ? j != 0 : z) {
            j = zzeg(j);
            for (int i5 = 0; i5 < zznmVarArr.length; i5++) {
                if (zznmVarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.zzbdu = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzmx, com.google.android.gms.internal.ads.zznl
    public final boolean zzef(long j) {
        if (this.zzbee) {
            return false;
        }
        if (this.zzafq && this.zzbdw == 0) {
            return false;
        }
        boolean open = this.zzbdn.open();
        if (this.zzbdl.isLoading()) {
            return open;
        }
        startLoading();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzmx, com.google.android.gms.internal.ads.zznl
    public final long zzhn() {
        if (this.zzbdw == 0) {
            return Long.MIN_VALUE;
        }
        return zzhp();
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final long zzho() {
        if (this.zzbdv) {
            this.zzbdv = false;
            return this.zzbeb;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final long zzhp() {
        long zzht;
        if (this.zzbee) {
            return Long.MIN_VALUE;
        }
        if (zzhu()) {
            return this.zzbec;
        }
        if (this.zzbea) {
            zzht = Long.MAX_VALUE;
            int size = this.zzbdq.size();
            for (int i = 0; i < size; i++) {
                if (this.zzbdz[i]) {
                    zzht = Math.min(zzht, this.zzbdq.valueAt(i).zzht());
                }
            }
        } else {
            zzht = zzht();
        }
        return zzht == Long.MIN_VALUE ? this.zzbeb : zzht;
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public final long zzeg(long j) {
        if (!this.zzbds.isSeekable()) {
            j = 0;
        }
        this.zzbeb = j;
        int size = this.zzbdq.size();
        boolean z = !zzhu();
        for (int i = 0; z && i < size; i++) {
            if (this.zzbdy[i]) {
                z = this.zzbdq.valueAt(i).zze(j, false);
            }
        }
        if (!z) {
            this.zzbec = j;
            this.zzbee = false;
            if (this.zzbdl.isLoading()) {
                this.zzbdl.zziq();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    this.zzbdq.valueAt(i2).zzk(this.zzbdy[i2]);
                }
            }
        }
        this.zzbdv = false;
        return j;
    }

    public final boolean zzbb(int i) {
        if (this.zzbee) {
            return true;
        }
        return !zzhu() && this.zzbdq.valueAt(i).zzic();
    }

    public final void zzhq() throws IOException {
        this.zzbdl.zzbj(Integer.MIN_VALUE);
    }

    public final int zza(int i, zzhq zzhqVar, zzjk zzjkVar, boolean z) {
        if (this.zzbdv || zzhu()) {
            return -3;
        }
        return this.zzbdq.valueAt(i).zza(zzhqVar, zzjkVar, z, this.zzbee, this.zzbeb);
    }

    public final void zzd(int i, long j) {
        zznh valueAt = this.zzbdq.valueAt(i);
        if (this.zzbee && j > valueAt.zzht()) {
            valueAt.zzif();
        } else {
            valueAt.zze(j, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final zzkg zzc(int i, int i2) {
        zznh zznhVar = this.zzbdq.get(i);
        if (zznhVar == null) {
            zznh zznhVar2 = new zznh(this.zzbdi);
            zznhVar2.zza(this);
            this.zzbdq.put(i, zznhVar2);
            return zznhVar2;
        }
        return zznhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zzgp() {
        this.zzbdt = true;
        this.handler.post(this.zzbdo);
    }

    @Override // com.google.android.gms.internal.ads.zzjx
    public final void zza(zzke zzkeVar) {
        this.zzbds = zzkeVar;
        this.handler.post(this.zzbdo);
    }

    @Override // com.google.android.gms.internal.ads.zznj
    public final void zzf(zzho zzhoVar) {
        this.handler.post(this.zzbdo);
    }

    public final void zzhr() {
        if (this.zzage || this.zzafq || this.zzbds == null || !this.zzbdt) {
            return;
        }
        int size = this.zzbdq.size();
        for (int i = 0; i < size; i++) {
            if (this.zzbdq.valueAt(i).zzid() == null) {
                return;
            }
        }
        this.zzbdn.zzis();
        zznq[] zznqVarArr = new zznq[size];
        this.zzbdz = new boolean[size];
        this.zzbdy = new boolean[size];
        this.zzaid = this.zzbds.getDurationUs();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < size) {
                zzho zzid = this.zzbdq.valueAt(i2).zzid();
                zznqVarArr[i2] = new zznq(zzid);
                String str = zzid.zzagy;
                if (!zzpg.zzbg(str) && !zzpg.zzbf(str)) {
                    z = false;
                }
                this.zzbdz[i2] = z;
                this.zzbea = z | this.zzbea;
                i2++;
            } else {
                this.zzbdx = new zznp(zznqVarArr);
                this.zzafq = true;
                this.zzbdh.zzb(new zznn(this.zzaid, this.zzbds.isSeekable()), null);
                this.zzbdr.zza((zzmx) this);
                return;
            }
        }
    }

    private final void zza(zzmu zzmuVar) {
        long j;
        if (this.zzcp == -1) {
            j = zzmuVar.zzcp;
            this.zzcp = j;
        }
    }

    private final void startLoading() {
        zzke zzkeVar;
        zzmu zzmuVar = new zzmu(this, this.uri, this.zzaoo, this.zzbdm, this.zzbdn);
        if (this.zzafq) {
            zzoz.checkState(zzhu());
            long j = this.zzaid;
            if (j != -9223372036854775807L && this.zzbec >= j) {
                this.zzbee = true;
                this.zzbec = -9223372036854775807L;
                return;
            }
            zzmuVar.zze(this.zzbds.zzdz(this.zzbec), this.zzbec);
            this.zzbec = -9223372036854775807L;
        }
        this.zzbed = zzhs();
        int i = this.zzbdf;
        if (i == -1) {
            i = (this.zzafq && this.zzcp == -1 && ((zzkeVar = this.zzbds) == null || zzkeVar.getDurationUs() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzbdl.zza(zzmuVar, this, i);
    }

    private final int zzhs() {
        int size = this.zzbdq.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.zzbdq.valueAt(i2).zzib();
        }
        return i;
    }

    private final long zzht() {
        int size = this.zzbdq.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, this.zzbdq.valueAt(i).zzht());
        }
        return j;
    }

    private final boolean zzhu() {
        return this.zzbec != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final /* synthetic */ int zza(zzmu zzmuVar, long j, long j2, IOException iOException) {
        zzke zzkeVar;
        zzmu zzmuVar2 = zzmuVar;
        zza(zzmuVar2);
        Handler handler = this.zzaeo;
        if (handler != null && this.zzbdg != null) {
            handler.post(new zzmr(this, iOException));
        }
        if (iOException instanceof zzns) {
            return 3;
        }
        boolean z = zzhs() > this.zzbed;
        if (this.zzcp == -1 && ((zzkeVar = this.zzbds) == null || zzkeVar.getDurationUs() == -9223372036854775807L)) {
            this.zzbeb = 0L;
            this.zzbdv = this.zzafq;
            int size = this.zzbdq.size();
            for (int i = 0; i < size; i++) {
                this.zzbdq.valueAt(i).zzk(!this.zzafq || this.zzbdy[i]);
            }
            zzmuVar2.zze(0L, 0L);
        }
        this.zzbed = zzhs();
        return z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final /* synthetic */ void zza(zzmu zzmuVar, long j, long j2, boolean z) {
        zza(zzmuVar);
        if (z || this.zzbdw <= 0) {
            return;
        }
        int size = this.zzbdq.size();
        for (int i = 0; i < size; i++) {
            this.zzbdq.valueAt(i).zzk(this.zzbdy[i]);
        }
        this.zzbdr.zza((zzna) this);
    }

    @Override // com.google.android.gms.internal.ads.zzow
    public final /* synthetic */ void zza(zzmu zzmuVar, long j, long j2) {
        zza(zzmuVar);
        this.zzbee = true;
        if (this.zzaid == -9223372036854775807L) {
            long zzht = zzht();
            this.zzaid = zzht == Long.MIN_VALUE ? 0L : zzht + 10000;
            this.zzbdh.zzb(new zznn(this.zzaid, this.zzbds.isSeekable()), null);
        }
        this.zzbdr.zza((zzna) this);
    }
}
