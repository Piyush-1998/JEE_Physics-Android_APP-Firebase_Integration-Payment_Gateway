package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzlj implements zzjv, zzke {
    private static final zzka zzapf = new zzlm();
    private static final int zzayq = zzpq.zzbl("qt  ");
    private long zzaid;
    private int zzarb;
    private int zzarc;
    private zzjx zzarf;
    private int zzaxt;
    private int zzaxu;
    private long zzaxv;
    private int zzaxw;
    private zzpk zzaxx;
    private zzll[] zzayr;
    private boolean zzays;
    private final zzpk zzaxp = new zzpk(16);
    private final Stack<zzku> zzaxr = new Stack<>();
    private final zzpk zzapm = new zzpk(zzpf.zzbjn);
    private final zzpk zzapn = new zzpk(4);

    @Override // com.google.android.gms.internal.ads.zzke
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void release() {
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final boolean zza(zzjy zzjyVar) throws IOException, InterruptedException {
        return zzlo.zze(zzjyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zza(zzjx zzjxVar) {
        this.zzarf = zzjxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjv
    public final void zzc(long j, long j2) {
        this.zzaxr.clear();
        this.zzaxw = 0;
        this.zzarc = 0;
        this.zzarb = 0;
        if (j == 0) {
            zzgz();
            return;
        }
        zzll[] zzllVarArr = this.zzayr;
        if (zzllVarArr != null) {
            for (zzll zzllVar : zzllVarArr) {
                zzls zzlsVar = zzllVar.zzazx;
                int zzec = zzlsVar.zzec(j2);
                if (zzec == -1) {
                    zzec = zzlsVar.zzed(j2);
                }
                zzllVar.zzaxa = zzec;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzjv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzjy r24, com.google.android.gms.internal.ads.zzkb r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlj.zza(com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzkb):int");
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long getDurationUs() {
        return this.zzaid;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final long zzdz(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzll zzllVar : this.zzayr) {
            zzls zzlsVar = zzllVar.zzazx;
            int zzec = zzlsVar.zzec(j);
            if (zzec == -1) {
                zzec = zzlsVar.zzed(j);
            }
            long j3 = zzlsVar.zzaok[zzec];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    private final void zzgz() {
        this.zzaxt = 0;
        this.zzaxw = 0;
    }

    private final void zzeb(long j) throws zzhv {
        zzmc zzmcVar;
        zzjz zzjzVar;
        zzln zza;
        while (!this.zzaxr.isEmpty() && this.zzaxr.peek().zzawf == j) {
            zzku pop = this.zzaxr.pop();
            if (pop.type == zzkr.zzatp) {
                long j2 = -9223372036854775807L;
                ArrayList arrayList = new ArrayList();
                long j3 = Long.MAX_VALUE;
                zzmc zzmcVar2 = null;
                zzjz zzjzVar2 = new zzjz();
                zzkt zzau = pop.zzau(zzkr.zzavo);
                if (zzau != null && (zzmcVar2 = zzkw.zza(zzau, this.zzays)) != null) {
                    zzjzVar2.zzb(zzmcVar2);
                }
                int i = 0;
                while (i < pop.zzawh.size()) {
                    zzku zzkuVar = pop.zzawh.get(i);
                    if (zzkuVar.type == zzkr.zzatr && (zza = zzkw.zza(zzkuVar, pop.zzau(zzkr.zzatq), -9223372036854775807L, (zzjn) null, this.zzays)) != null) {
                        zzls zza2 = zzkw.zza(zza, zzkuVar.zzav(zzkr.zzats).zzav(zzkr.zzatt).zzav(zzkr.zzatu), zzjzVar2);
                        if (zza2.zzawy != 0) {
                            zzll zzllVar = new zzll(zza, zza2, this.zzarf.zzc(i, zza.type));
                            zzho zzv = zza.zzaht.zzv(zza2.zzaxe + 30);
                            if (zza.type == 1) {
                                if (zzjzVar2.zzgq()) {
                                    zzv = zzv.zzb(zzjzVar2.zzahl, zzjzVar2.zzahm);
                                }
                                if (zzmcVar2 != null) {
                                    zzv = zzv.zza(zzmcVar2);
                                }
                            }
                            zzllVar.zzazy.zze(zzv);
                            zzmcVar = zzmcVar2;
                            zzjzVar = zzjzVar2;
                            j2 = Math.max(j2, zza.zzaid);
                            arrayList.add(zzllVar);
                            long j4 = zza2.zzaok[0];
                            if (j4 < j3) {
                                j3 = j4;
                            }
                            i++;
                            zzjzVar2 = zzjzVar;
                            zzmcVar2 = zzmcVar;
                        }
                    }
                    zzmcVar = zzmcVar2;
                    zzjzVar = zzjzVar2;
                    i++;
                    zzjzVar2 = zzjzVar;
                    zzmcVar2 = zzmcVar;
                }
                this.zzaid = j2;
                this.zzayr = (zzll[]) arrayList.toArray(new zzll[arrayList.size()]);
                this.zzarf.zzgp();
                this.zzarf.zza(this);
                this.zzaxr.clear();
                this.zzaxt = 2;
            } else if (!this.zzaxr.isEmpty()) {
                this.zzaxr.peek().zza(pop);
            }
        }
        if (this.zzaxt != 2) {
            zzgz();
        }
    }
}
