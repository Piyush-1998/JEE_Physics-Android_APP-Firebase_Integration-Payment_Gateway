package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdzw extends zzegp<zzdzw, zza> implements zzeib {
    private static volatile zzeim<zzdzw> zzel;
    private static final zzdzw zzhtp;
    private int zzhtf;
    private zzeaa zzhtn;
    private zzebl zzhto;

    private zzdzw() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzdzw, zza> implements zzeib {
        private zza() {
            super(zzdzw.zzhtp);
        }

        public final zza zzet(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzw) this.zzift).setVersion(i);
            return this;
        }

        public final zza zzb(zzeaa zzeaaVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzw) this.zzift).zza(zzeaaVar);
            return this;
        }

        public final zza zzb(zzebl zzeblVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzw) this.zzift).zza(zzeblVar);
            return this;
        }

        /* synthetic */ zza(zzdzx zzdzxVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzhtf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzhtf = i;
    }

    public final zzeaa zzayq() {
        zzeaa zzeaaVar = this.zzhtn;
        return zzeaaVar == null ? zzeaa.zzayz() : zzeaaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzeaa zzeaaVar) {
        zzeaaVar.getClass();
        this.zzhtn = zzeaaVar;
    }

    public final zzebl zzayr() {
        zzebl zzeblVar = this.zzhto;
        return zzeblVar == null ? zzebl.zzbar() : zzeblVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzebl zzeblVar) {
        zzeblVar.getClass();
        this.zzhto = zzeblVar;
    }

    public static zzdzw zze(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzdzw) zzegp.zza(zzhtp, zzeffVar, zzegcVar);
    }

    public static zza zzays() {
        return zzhtp.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzx.zzdv[i - 1]) {
            case 1:
                return new zzdzw();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhtp, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhtf", "zzhtn", "zzhto"});
            case 4:
                return zzhtp;
            case 5:
                zzeim<zzdzw> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzdzw.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhtp);
                            zzel = zzeimVar;
                        }
                    }
                }
                return zzeimVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zzdzw zzdzwVar = new zzdzw();
        zzhtp = zzdzwVar;
        zzegp.zza(zzdzw.class, zzdzwVar);
    }
}
