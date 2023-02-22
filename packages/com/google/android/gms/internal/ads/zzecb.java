package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzecb extends zzegp<zzecb, zza> implements zzeib {
    private static volatile zzeim<zzecb> zzel;
    private static final zzecb zzhww;
    private int zzhwu;
    private zzeha<zzb> zzhwv = zzbfo();

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzegp<zzb, zza> implements zzeib {
        private static volatile zzeim<zzb> zzel;
        private static final zzb zzhxa;
        private int zzhwn;
        private zzebt zzhwx;
        private int zzhwy;
        private int zzhwz;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zzb, zza> implements zzeib {
            private zza() {
                super(zzb.zzhxa);
            }

            /* synthetic */ zza(zzecc zzeccVar) {
                this();
            }
        }

        public final boolean zzbbp() {
            return this.zzhwx != null;
        }

        public final zzebt zzbbq() {
            zzebt zzebtVar = this.zzhwx;
            return zzebtVar == null ? zzebt.zzbbc() : zzebtVar;
        }

        public final zzebu zzaya() {
            zzebu zzff = zzebu.zzff(this.zzhwy);
            return zzff == null ? zzebu.UNRECOGNIZED : zzff;
        }

        public final int zzbbr() {
            return this.zzhwz;
        }

        public final zzecn zzayb() {
            zzecn zzfm = zzecn.zzfm(this.zzhwn);
            return zzfm == null ? zzecn.UNRECOGNIZED : zzfm;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzecc.zzdv[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzhxa, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhwx", "zzhwy", "zzhwz", "zzhwn"});
                case 4:
                    return zzhxa;
                case 5:
                    zzeim<zzb> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zzb.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzhxa);
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
            zzb zzbVar = new zzb();
            zzhxa = zzbVar;
            zzegp.zza(zzb.class, zzbVar);
        }
    }

    private zzecb() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzecb, zza> implements zzeib {
        private zza() {
            super(zzecb.zzhww);
        }

        /* synthetic */ zza(zzecc zzeccVar) {
            this();
        }
    }

    public final int zzbbl() {
        return this.zzhwu;
    }

    public final List<zzb> zzbbm() {
        return this.zzhwv;
    }

    public final int zzbbn() {
        return this.zzhwv.size();
    }

    public static zzecb zzc(byte[] bArr, zzegc zzegcVar) throws zzegz {
        return (zzecb) zzegp.zza(zzhww, bArr, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecc.zzdv[i - 1]) {
            case 1:
                return new zzecb();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhww, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhwu", "zzhwv", zzb.class});
            case 4:
                return zzhww;
            case 5:
                zzeim<zzecb> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzecb.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhww);
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
        zzecb zzecbVar = new zzecb();
        zzhww = zzecbVar;
        zzegp.zza(zzecb.class, zzecbVar);
    }
}
