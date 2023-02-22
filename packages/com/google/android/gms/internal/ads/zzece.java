package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzece extends zzegp<zzece, zzb> implements zzeib {
    private static volatile zzeim<zzece> zzel;
    private static final zzece zzhxc;
    private int zzhwu;
    private zzeha<zza> zzhxb = zzbfo();

    private zzece() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp<zza, C0011zza> implements zzeib {
        private static volatile zzeim<zza> zzel;
        private static final zza zzhxd;
        private String zzhvw = "";
        private int zzhwn;
        private int zzhwy;
        private int zzhwz;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzece$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0011zza extends zzegp.zzb<zza, C0011zza> implements zzeib {
            private C0011zza() {
                super(zza.zzhxd);
            }

            public final C0011zza zzhr(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzhp(str);
                return this;
            }

            public final C0011zza zzb(zzebu zzebuVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zza(zzebuVar);
                return this;
            }

            public final C0011zza zzfj(int i) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzfh(i);
                return this;
            }

            public final C0011zza zzb(zzecn zzecnVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zza(zzecnVar);
                return this;
            }

            /* synthetic */ C0011zza(zzecd zzecdVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzhp(String str) {
            str.getClass();
            this.zzhvw = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzebu zzebuVar) {
            this.zzhwy = zzebuVar.zzv();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzfh(int i) {
            this.zzhwz = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzecn zzecnVar) {
            this.zzhwn = zzecnVar.zzv();
        }

        public static C0011zza zzbbv() {
            return zzhxd.zzbfj();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzecd.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0011zza(null);
                case 3:
                    return zza(zzhxd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhvw", "zzhwy", "zzhwz", "zzhwn"});
                case 4:
                    return zzhxd;
                case 5:
                    zzeim<zza> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zza.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzhxd);
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
            zza zzaVar = new zza();
            zzhxd = zzaVar;
            zzegp.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzegp.zzb<zzece, zzb> implements zzeib {
        private zzb() {
            super(zzece.zzhxc);
        }

        public final zzb zzfi(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzece) this.zzift).zzfg(i);
            return this;
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzece) this.zzift).zza(zzaVar);
            return this;
        }

        /* synthetic */ zzb(zzecd zzecdVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfg(int i) {
        this.zzhwu = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzeha<zza> zzehaVar = this.zzhxb;
        if (!zzehaVar.zzbdf()) {
            this.zzhxb = zzegp.zza(zzehaVar);
        }
        this.zzhxb.add(zzaVar);
    }

    public static zzb zzbbt() {
        return zzhxc.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecd.zzdv[i - 1]) {
            case 1:
                return new zzece();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzhxc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzhwu", "zzhxb", zza.class});
            case 4:
                return zzhxc;
            case 5:
                zzeim<zzece> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzece.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhxc);
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
        zzece zzeceVar = new zzece();
        zzhxc = zzeceVar;
        zzegp.zza(zzece.class, zzeceVar);
    }
}
