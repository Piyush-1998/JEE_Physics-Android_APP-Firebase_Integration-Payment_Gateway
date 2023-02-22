package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeah extends zzegp<zzeah, zza> implements zzeib {
    private static volatile zzeim<zzeah> zzel;
    private static final zzeah zzhtz;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzeal zzhty;

    private zzeah() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeah, zza> implements zzeib {
        private zza() {
            super(zzeah.zzhtz);
        }

        public final zza zzev(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeah) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzb(zzeal zzealVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeah) this.zzift).zza(zzealVar);
            return this;
        }

        public final zza zzv(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeah) this.zzift).zzs(zzeffVar);
            return this;
        }

        /* synthetic */ zza(zzeag zzeagVar) {
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

    public final zzeal zzazg() {
        zzeal zzealVar = this.zzhty;
        return zzealVar == null ? zzeal.zzazk() : zzealVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzeal zzealVar) {
        zzealVar.getClass();
        this.zzhty = zzealVar;
    }

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhtg = zzeffVar;
    }

    public static zzeah zzi(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeah) zzegp.zza(zzhtz, zzeffVar, zzegcVar);
    }

    public static zza zzazh() {
        return zzhtz.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeag.zzdv[i - 1]) {
            case 1:
                return new zzeah();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhtz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhtf", "zzhty", "zzhtg"});
            case 4:
                return zzhtz;
            case 5:
                zzeim<zzeah> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeah.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhtz);
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
        zzeah zzeahVar = new zzeah();
        zzhtz = zzeahVar;
        zzegp.zza(zzeah.class, zzeahVar);
    }
}
