package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzebd extends zzegp<zzebd, zza> implements zzeib {
    private static volatile zzeim<zzebd> zzel;
    private static final zzebd zzhuv;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzebe zzhuu;

    private zzebd() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzebd, zza> implements zzeib {
        private zza() {
            super(zzebd.zzhuv);
        }

        public final zza zzez(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebd) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzb(zzebe zzebeVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebd) this.zzift).zza(zzebeVar);
            return this;
        }

        public final zza zzaa(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebd) this.zzift).zzs(zzeffVar);
            return this;
        }

        /* synthetic */ zza(zzebc zzebcVar) {
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

    public final zzebe zzbac() {
        zzebe zzebeVar = this.zzhuu;
        return zzebeVar == null ? zzebe.zzbai() : zzebeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzebe zzebeVar) {
        zzebeVar.getClass();
        this.zzhuu = zzebeVar;
    }

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhtg = zzeffVar;
    }

    public static zzebd zzp(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzebd) zzegp.zza(zzhuv, zzeffVar, zzegcVar);
    }

    public static zza zzbad() {
        return zzhuv.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebc.zzdv[i - 1]) {
            case 1:
                return new zzebd();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhuv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhtf", "zzhuu", "zzhtg"});
            case 4:
                return zzhuv;
            case 5:
                zzeim<zzebd> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzebd.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhuv);
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
        zzebd zzebdVar = new zzebd();
        zzhuv = zzebdVar;
        zzegp.zza(zzebd.class, zzebdVar);
    }
}
