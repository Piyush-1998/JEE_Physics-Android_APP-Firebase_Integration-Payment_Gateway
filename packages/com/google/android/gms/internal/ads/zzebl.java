package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzebl extends zzegp<zzebl, zza> implements zzeib {
    private static volatile zzeim<zzebl> zzel;
    private static final zzebl zzhvs;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzebq zzhvr;

    private zzebl() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzebl, zza> implements zzeib {
        private zza() {
            super(zzebl.zzhvs);
        }

        public final zza zzfd(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebl) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzd(zzebq zzebqVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebl) this.zzift).zzc(zzebqVar);
            return this;
        }

        public final zza zzad(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebl) this.zzift).zzs(zzeffVar);
            return this;
        }

        /* synthetic */ zza(zzebn zzebnVar) {
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

    public final zzebq zzbap() {
        zzebq zzebqVar = this.zzhvr;
        return zzebqVar == null ? zzebq.zzbaw() : zzebqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzebq zzebqVar) {
        zzebqVar.getClass();
        this.zzhvr = zzebqVar;
    }

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhtg = zzeffVar;
    }

    public static zzebl zzr(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzebl) zzegp.zza(zzhvs, zzeffVar, zzegcVar);
    }

    public static zza zzbaq() {
        return zzhvs.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebn.zzdv[i - 1]) {
            case 1:
                return new zzebl();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhvs, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhtf", "zzhvr", "zzhtg"});
            case 4:
                return zzhvs;
            case 5:
                zzeim<zzebl> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzebl.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhvs);
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

    public static zzebl zzbar() {
        return zzhvs;
    }

    static {
        zzebl zzeblVar = new zzebl();
        zzhvs = zzeblVar;
        zzegp.zza(zzebl.class, zzeblVar);
    }
}
