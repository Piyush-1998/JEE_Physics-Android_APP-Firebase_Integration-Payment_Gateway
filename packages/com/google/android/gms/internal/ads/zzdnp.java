package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdnp<AdT extends zzbpd> {
    private final zzdna zzgyr;
    private final zzdmt zzhfn;
    private zzdnv zzhfo;
    private zzdwe<zzdnh<AdT>> zzhfp;
    private zzdvt<zzdnh<AdT>> zzhfq;
    private final zzdnw<AdT> zzhfs;
    private int zzhfr = zzdnf.zzhez;
    private final zzdvi<zzdnh<AdT>> zzhfu = new zzdnu(this);
    private final LinkedList<zzdnv> zzhft = new LinkedList<>();

    public zzdnp(zzdna zzdnaVar, zzdmt zzdmtVar, zzdnw<AdT> zzdnwVar) {
        this.zzgyr = zzdnaVar;
        this.zzhfn = zzdmtVar;
        this.zzhfs = zzdnwVar;
        this.zzhfn.zza(new zzdmw(this) { // from class: com.google.android.gms.internal.ads.zzdnr
            private final zzdnp zzhfw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzhfw = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdmw
            public final void execute() {
                this.zzhfw.zzatz();
            }
        });
    }

    public final void zzb(zzdnv zzdnvVar) {
        this.zzhft.add(zzdnvVar);
    }

    public final synchronized zzdvt<zzdnt<AdT>> zzc(zzdnv zzdnvVar) {
        if (zzaty()) {
            return null;
        }
        this.zzhfr = zzdnf.zzhfb;
        if (this.zzhfo.zzasd() != null && zzdnvVar.zzasd() != null && this.zzhfo.zzasd().equals(zzdnvVar.zzasd())) {
            this.zzhfr = zzdnf.zzhfa;
            return zzdvl.zzb(this.zzhfp, new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzdns
                private final zzdnp zzhfw;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzhfw = this;
                }

                @Override // com.google.android.gms.internal.ads.zzduv
                public final zzdvt zzf(Object obj) {
                    return this.zzhfw.zzc((zzdnh) obj);
                }
            }, zzdnvVar.getExecutor());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(zzdnv zzdnvVar) {
        while (zzaty()) {
            if (zzdnvVar == null && this.zzhft.isEmpty()) {
                return;
            }
            if (zzdnvVar == null) {
                zzdnvVar = this.zzhft.remove();
            }
            if (zzdnvVar.zzasd() != null && this.zzgyr.zzb(zzdnvVar.zzasd())) {
                this.zzhfo = zzdnvVar.zzase();
                this.zzhfp = zzdwe.zzaxn();
                zzdvt<zzdnh<AdT>> zza = this.zzhfs.zza(this.zzhfo);
                this.zzhfq = zza;
                zzdvl.zza(zza, this.zzhfu, zzdnvVar.getExecutor());
                return;
            }
            zzdnvVar = null;
        }
        if (zzdnvVar != null) {
            this.zzhft.add(zzdnvVar);
        }
    }

    private final boolean zzaty() {
        zzdvt<zzdnh<AdT>> zzdvtVar = this.zzhfq;
        return zzdvtVar == null || zzdvtVar.isDone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzatz() {
        synchronized (this) {
            zzd(this.zzhfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzc(zzdnh zzdnhVar) throws Exception {
        zzdvt zzaf;
        synchronized (this) {
            zzaf = zzdvl.zzaf(new zzdnt(zzdnhVar, this.zzhfo));
        }
        return zzaf;
    }
}
