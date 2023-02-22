package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzebe extends zzegp<zzebe, zza> implements zzeib {
    private static volatile zzeim<zzebe> zzel;
    private static final zzebe zzhuy;
    private int zzhtf;
    private zzeba zzhuo;
    private zzeff zzhuw = zzeff.zzibd;
    private zzeff zzhux = zzeff.zzibd;

    private zzebe() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzebe, zza> implements zzeib {
        private zza() {
            super(zzebe.zzhuy);
        }

        public final zza zzfa(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebe) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzc(zzeba zzebaVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebe) this.zzift).zzb(zzebaVar);
            return this;
        }

        public final zza zzab(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebe) this.zzift).zzy(zzeffVar);
            return this;
        }

        public final zza zzac(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebe) this.zzift).zzz(zzeffVar);
            return this;
        }

        /* synthetic */ zza(zzebf zzebfVar) {
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

    public final zzeba zzazv() {
        zzeba zzebaVar = this.zzhuo;
        return zzebaVar == null ? zzeba.zzbaa() : zzebaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzeba zzebaVar) {
        zzebaVar.getClass();
        this.zzhuo = zzebaVar;
    }

    public final zzeff zzbaf() {
        return this.zzhuw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzy(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhuw = zzeffVar;
    }

    public final zzeff zzbag() {
        return this.zzhux;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzz(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhux = zzeffVar;
    }

    public static zzebe zzq(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzebe) zzegp.zza(zzhuy, zzeffVar, zzegcVar);
    }

    public static zza zzbah() {
        return zzhuy.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebf.zzdv[i - 1]) {
            case 1:
                return new zzebe();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhuy, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzhtf", "zzhuo", "zzhuw", "zzhux"});
            case 4:
                return zzhuy;
            case 5:
                zzeim<zzebe> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzebe.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhuy);
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

    public static zzebe zzbai() {
        return zzhuy;
    }

    static {
        zzebe zzebeVar = new zzebe();
        zzhuy = zzebeVar;
        zzegp.zza(zzebe.class, zzebeVar);
    }
}
