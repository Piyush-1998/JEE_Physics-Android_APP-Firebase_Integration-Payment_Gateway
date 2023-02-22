package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcf {

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp<zza, C0008zza> implements zzeib {
        private static volatile zzeim<zza> zzel;
        private static final zza zzik;
        private int zzdw;
        private int zzfn;
        private int zzfo;
        private long zzfq;
        private long zzfr;
        private long zzfs;
        private long zzft;
        private long zzfu;
        private long zzfv;
        private long zzfw;
        private long zzfx;
        private long zzfy;
        private long zzfz;
        private long zzgb;
        private long zzgc;
        private long zzgd;
        private long zzge;
        private long zzgf;
        private long zzgg;
        private long zzgh;
        private long zzgi;
        private long zzgj;
        private long zzgm;
        private long zzgn;
        private long zzgo;
        private long zzgp;
        private zzb zzgs;
        private zze zzhi;
        private zzf zzhk;
        private int zzhv;
        private int zzhw;
        private int zzhx;
        private zze zzhy;
        private long zzid;
        private boolean zzig;
        private long zzii;
        private zzd zzij;
        private String zzfp = "";
        private String zzeg = "";
        private String zzga = "";
        private String zzfg = "";
        private String zzgk = "D";
        private String zzgl = "";
        private String zzfi = "";
        private long zzgq = -1;
        private long zzgr = -1;
        private long zzgt = -1;
        private long zzgu = -1;
        private long zzgv = -1;
        private long zzgw = -1;
        private long zzgx = -1;
        private long zzgy = -1;
        private String zzfj = "D";
        private String zzfk = "D";
        private long zzgz = -1;
        private int zzha = 1000;
        private int zzhb = 1000;
        private long zzhc = -1;
        private long zzhd = -1;
        private long zzhe = -1;
        private long zzhf = -1;
        private long zzhg = -1;
        private int zzhh = 1000;
        private zzeha<zze> zzhj = zzbfo();
        private long zzhl = -1;
        private long zzhm = -1;
        private long zzhn = -1;
        private long zzho = -1;
        private long zzhp = -1;
        private long zzhq = -1;
        private long zzhr = -1;
        private long zzhs = -1;
        private String zzht = "D";
        private long zzhu = -1;
        private long zzhz = -1;
        private int zzia = 1000;
        private int zzib = 1000;
        private String zzic = "D";
        private String zzie = "";
        private int zzif = 2;
        private String zzih = "";

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public enum zzb implements zzegu {
            DEBUGGER_STATE_UNSPECIFIED(0),
            DEBUGGER_STATE_NOT_INSTALLED(1),
            DEBUGGER_STATE_INSTALLED(2),
            DEBUGGER_STATE_ACTIVE(3),
            DEBUGGER_STATE_ENVVAR(4),
            DEBUGGER_STATE_MACHPORT(5),
            DEBUGGER_STATE_ENVVAR_MACHPORT(6);
            
            private static final zzegt<zzb> zzes = new zzcg();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzegu
            public final int zzv() {
                return this.value;
            }

            public static zzb zzk(int i) {
                switch (i) {
                    case 0:
                        return DEBUGGER_STATE_UNSPECIFIED;
                    case 1:
                        return DEBUGGER_STATE_NOT_INSTALLED;
                    case 2:
                        return DEBUGGER_STATE_INSTALLED;
                    case 3:
                        return DEBUGGER_STATE_ACTIVE;
                    case 4:
                        return DEBUGGER_STATE_ENVVAR;
                    case 5:
                        return DEBUGGER_STATE_MACHPORT;
                    case 6:
                        return DEBUGGER_STATE_ENVVAR_MACHPORT;
                    default:
                        return null;
                }
            }

            public static zzegw zzw() {
                return zzch.zzeu;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzb(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzegu {
            DEVICE_IDENTIFIER_NO_ID(0),
            DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
            DEVICE_IDENTIFIER_GLOBAL_ID(2),
            DEVICE_IDENTIFIER_ADVERTISER_ID(3),
            DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
            DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
            DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6);
            
            private static final zzegt<zzc> zzes = new zzcj();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzegu
            public final int zzv() {
                return this.value;
            }

            public static zzc zzl(int i) {
                switch (i) {
                    case 0:
                        return DEVICE_IDENTIFIER_NO_ID;
                    case 1:
                        return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                    case 2:
                        return DEVICE_IDENTIFIER_GLOBAL_ID;
                    case 3:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID;
                    case 4:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                    case 5:
                        return DEVICE_IDENTIFIER_ANDROID_AD_ID;
                    case 6:
                        return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                    default:
                        return null;
                }
            }

            public static zzegw zzw() {
                return zzci.zzeu;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public enum zzd implements zzegu {
            ERROR_ENCODE_SIZE_FAIL(1),
            ERROR_UNKNOWN(3),
            ERROR_NO_SIGNALS(5),
            ERROR_ENCRYPTION(7),
            ERROR_MEMORY(9),
            ERROR_SIMULATOR(11),
            ERROR_SERVICE(13),
            ERROR_THREAD(15),
            PSN_WEB64_FAIL(2),
            PSN_DECRYPT_SIZE_FAIL(4),
            PSN_MD5_CHECK_FAIL(8),
            PSN_MD5_SIZE_FAIL(16),
            PSN_MD5_FAIL(32),
            PSN_DECODE_FAIL(64),
            PSN_SALT_FAIL(128),
            PSN_BITSLICER_FAIL(256),
            PSN_REQUEST_TYPE_FAIL(512),
            PSN_INVALID_ERROR_CODE(1024),
            PSN_TIMESTAMP_EXPIRED(2048),
            PSN_ENCODE_SIZE_FAIL(4096),
            PSN_BLANK_VALUE(8192),
            PSN_INITIALIZATION_FAIL(16384),
            PSN_GASS_CLIENT_FAIL(32768),
            PSN_SIGNALS_TIMEOUT(65536),
            PSN_TINK_FAIL(131072);
            
            private static final zzegt<zzd> zzes = new zzck();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzegu
            public final int zzv() {
                return this.value;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzd(int i) {
                this.value = i;
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zze extends zzegp<zze, C0009zza> implements zzeib {
            private static volatile zzeim<zze> zzel;
            private static final zze zzku;
            private int zzdw;
            private long zzko;
            private long zzkp;
            private long zzgb = -1;
            private long zzgc = -1;
            private long zzkb = -1;
            private long zzkc = -1;
            private long zzkd = -1;
            private long zzke = -1;
            private int zzkf = 1000;
            private long zzkg = -1;
            private long zzkh = -1;
            private long zzki = -1;
            private int zzkj = 1000;
            private long zzkk = -1;
            private long zzkl = -1;
            private long zzkm = -1;
            private long zzkn = -1;
            private long zzkq = -1;
            private long zzkr = -1;
            private long zzks = -1;
            private long zzkt = -1;

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzcf$zza$zze$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0009zza extends zzegp.zzb<zze, C0009zza> implements zzeib {
                private C0009zza() {
                    super(zze.zzku);
                }

                public final C0009zza zzbs(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzaq(j);
                    return this;
                }

                public final C0009zza zzbt(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzar(j);
                    return this;
                }

                public final C0009zza zzbu(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcj(j);
                    return this;
                }

                public final C0009zza zzbv(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzck(j);
                    return this;
                }

                public final C0009zza zzat() {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzau();
                    return this;
                }

                public final C0009zza zzbw(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcl(j);
                    return this;
                }

                public final C0009zza zzbx(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcm(j);
                    return this;
                }

                public final C0009zza zzk(zzcn zzcnVar) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzm(zzcnVar);
                    return this;
                }

                public final C0009zza zzby(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcn(j);
                    return this;
                }

                public final C0009zza zzbz(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzco(j);
                    return this;
                }

                public final C0009zza zzca(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcp(j);
                    return this;
                }

                public final C0009zza zzl(zzcn zzcnVar) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzn(zzcnVar);
                    return this;
                }

                public final C0009zza zzcb(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcq(j);
                    return this;
                }

                public final C0009zza zzcc(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcr(j);
                    return this;
                }

                public final C0009zza zzcd(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcs(j);
                    return this;
                }

                public final C0009zza zzce(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzct(j);
                    return this;
                }

                public final C0009zza zzcf(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcu(j);
                    return this;
                }

                public final C0009zza zzcg(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcv(j);
                    return this;
                }

                public final C0009zza zzch(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcw(j);
                    return this;
                }

                public final C0009zza zzci(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zze) this.zzift).zzcx(j);
                    return this;
                }

                /* synthetic */ C0009zza(zzce zzceVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzaq(long j) {
                this.zzdw |= 1;
                this.zzgb = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzar(long j) {
                this.zzdw |= 2;
                this.zzgc = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcj(long j) {
                this.zzdw |= 4;
                this.zzkb = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzck(long j) {
                this.zzdw |= 8;
                this.zzkc = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzau() {
                this.zzdw &= -9;
                this.zzkc = -1L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcl(long j) {
                this.zzdw |= 16;
                this.zzkd = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcm(long j) {
                this.zzdw |= 32;
                this.zzke = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzm(zzcn zzcnVar) {
                this.zzkf = zzcnVar.zzv();
                this.zzdw |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcn(long j) {
                this.zzdw |= 128;
                this.zzkg = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzco(long j) {
                this.zzdw |= 256;
                this.zzkh = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcp(long j) {
                this.zzdw |= 512;
                this.zzki = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzn(zzcn zzcnVar) {
                this.zzkj = zzcnVar.zzv();
                this.zzdw |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcq(long j) {
                this.zzdw |= 2048;
                this.zzkk = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcr(long j) {
                this.zzdw |= 4096;
                this.zzkl = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcs(long j) {
                this.zzdw |= 8192;
                this.zzkm = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzct(long j) {
                this.zzdw |= 16384;
                this.zzkn = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcu(long j) {
                this.zzdw |= 32768;
                this.zzko = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcv(long j) {
                this.zzdw |= 65536;
                this.zzkp = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcw(long j) {
                this.zzdw |= 131072;
                this.zzkq = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzcx(long j) {
                this.zzdw |= 262144;
                this.zzkr = j;
            }

            public static C0009zza zzav() {
                return zzku.zzbfj();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzce.zzdv[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new C0009zza(null);
                    case 3:
                        return zza(zzku, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzdw", "zzgb", "zzgc", "zzkb", "zzkc", "zzkd", "zzke", "zzkf", zzcn.zzw(), "zzkg", "zzkh", "zzki", "zzkj", zzcn.zzw(), "zzkk", "zzkl", "zzkm", "zzkn", "zzko", "zzkp", "zzkq", "zzkr", "zzks", "zzkt"});
                    case 4:
                        return zzku;
                    case 5:
                        zzeim<zze> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zze.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzku);
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
                zze zzeVar = new zze();
                zzku = zzeVar;
                zzegp.zza(zze.class, zzeVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zzf extends zzegp<zzf, C0010zza> implements zzeib {
            private static volatile zzeim<zzf> zzel;
            private static final zzf zzkz;
            private int zzdw;
            private long zzhf = -1;
            private long zzhg = -1;
            private long zzkv = -1;
            private long zzkw = -1;
            private long zzkx = -1;
            private long zzky = -1;

            private zzf() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzcf$zza$zzf$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0010zza extends zzegp.zzb<zzf, C0010zza> implements zzeib {
                private C0010zza() {
                    super(zzf.zzkz);
                }

                public final C0010zza zzcy(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzf) this.zzift).zzdc(j);
                    return this;
                }

                public final C0010zza zzcz(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzf) this.zzift).zzdd(j);
                    return this;
                }

                public final C0010zza zzda(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzf) this.zzift).zzde(j);
                    return this;
                }

                public final C0010zza zzdb(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzf) this.zzift).zzdf(j);
                    return this;
                }

                /* synthetic */ C0010zza(zzce zzceVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdc(long j) {
                this.zzdw |= 4;
                this.zzkv = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdd(long j) {
                this.zzdw |= 8;
                this.zzkw = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzde(long j) {
                this.zzdw |= 16;
                this.zzkx = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzdf(long j) {
                this.zzdw |= 32;
                this.zzky = j;
            }

            public static C0010zza zzax() {
                return zzkz.zzbfj();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzce.zzdv[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0010zza(null);
                    case 3:
                        return zza(zzkz, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"zzdw", "zzhf", "zzhg", "zzkv", "zzkw", "zzkx", "zzky"});
                    case 4:
                        return zzkz;
                    case 5:
                        zzeim<zzf> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zzf.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzkz);
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
                zzf zzfVar = new zzf();
                zzkz = zzfVar;
                zzegp.zza(zzf.class, zzfVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzcf$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0008zza extends zzegp.zzb<zza, C0008zza> implements zzeib {
            private C0008zza() {
                super(zza.zzik);
            }

            public final C0008zza zzu(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzad(str);
                return this;
            }

            public final C0008zza zzv(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzae(str);
                return this;
            }

            public final C0008zza zze(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzal(j);
                return this;
            }

            public final C0008zza zzf(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzam(j);
                return this;
            }

            public final C0008zza zzg(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzan(j);
                return this;
            }

            public final C0008zza zzh(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzao(j);
                return this;
            }

            public final C0008zza zzi(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzap(j);
                return this;
            }

            public final C0008zza zzj(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzaq(j);
                return this;
            }

            public final C0008zza zzk(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzar(j);
                return this;
            }

            public final C0008zza zzl(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzas(j);
                return this;
            }

            public final C0008zza zzm(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzat(j);
                return this;
            }

            public final C0008zza zzn(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzau(j);
                return this;
            }

            public final C0008zza zzo(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzav(j);
                return this;
            }

            public final C0008zza zzp(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzaw(j);
                return this;
            }

            public final C0008zza zzw(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzaf(str);
                return this;
            }

            public final C0008zza zzx(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzag(str);
                return this;
            }

            public final C0008zza zzq(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzax(j);
                return this;
            }

            public final C0008zza zzr(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzay(j);
                return this;
            }

            public final C0008zza zzs(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzaz(j);
                return this;
            }

            public final C0008zza zzy(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzah(str);
                return this;
            }

            public final C0008zza zzt(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzba(j);
                return this;
            }

            @Deprecated
            public final C0008zza zzu(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbb(j);
                return this;
            }

            public final C0008zza zzv(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbc(j);
                return this;
            }

            public final C0008zza zzw(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbd(j);
                return this;
            }

            public final C0008zza zzx(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbe(j);
                return this;
            }

            public final C0008zza zzy(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbf(j);
                return this;
            }

            public final C0008zza zzz(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbg(j);
                return this;
            }

            public final C0008zza zzaa(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbh(j);
                return this;
            }

            public final C0008zza zzab(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbi(j);
                return this;
            }

            public final C0008zza zzz(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzai(str);
                return this;
            }

            public final C0008zza zzaa(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzaj(str);
                return this;
            }

            public final C0008zza zza(zzcn zzcnVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzf(zzcnVar);
                return this;
            }

            public final C0008zza zzb(zzcn zzcnVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzg(zzcnVar);
                return this;
            }

            public final C0008zza zzac(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbj(j);
                return this;
            }

            public final C0008zza zzad(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbk(j);
                return this;
            }

            public final C0008zza zzae(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbl(j);
                return this;
            }

            public final C0008zza zzc(zzcn zzcnVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzh(zzcnVar);
                return this;
            }

            public final C0008zza zza(zze zzeVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzc(zzeVar);
                return this;
            }

            public final C0008zza zzb(zze zzeVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzd(zzeVar);
                return this;
            }

            public final C0008zza zzai() {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzak();
                return this;
            }

            public final C0008zza zza(zzf zzfVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzb(zzfVar);
                return this;
            }

            public final C0008zza zzaf(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbm(j);
                return this;
            }

            public final C0008zza zzag(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbn(j);
                return this;
            }

            public final C0008zza zzah(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbo(j);
                return this;
            }

            public final C0008zza zzai(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbp(j);
                return this;
            }

            public final C0008zza zzaj(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbq(j);
                return this;
            }

            public final C0008zza zzab(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzak(str);
                return this;
            }

            public final C0008zza zzd(zzcn zzcnVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzi(zzcnVar);
                return this;
            }

            public final C0008zza zze(zzcn zzcnVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzj(zzcnVar);
                return this;
            }

            public final C0008zza zzac(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzal(str);
                return this;
            }

            public final C0008zza zza(zzc zzcVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzb(zzcVar);
                return this;
            }

            public final C0008zza zza(boolean z) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzb(z);
                return this;
            }

            public final C0008zza zzak(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzbr(j);
                return this;
            }

            /* synthetic */ C0008zza(zzce zzceVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzad(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzfp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzae(String str) {
            str.getClass();
            this.zzdw |= 2;
            this.zzeg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzal(long j) {
            this.zzdw |= 4;
            this.zzfq = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzam(long j) {
            this.zzdw |= 16;
            this.zzfs = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzan(long j) {
            this.zzdw |= 32;
            this.zzft = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzao(long j) {
            this.zzdw |= 1024;
            this.zzfy = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzap(long j) {
            this.zzdw |= 2048;
            this.zzfz = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaq(long j) {
            this.zzdw |= 8192;
            this.zzgb = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzar(long j) {
            this.zzdw |= 16384;
            this.zzgc = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzas(long j) {
            this.zzdw |= 32768;
            this.zzgd = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzat(long j) {
            this.zzdw |= 65536;
            this.zzge = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzau(long j) {
            this.zzdw |= 524288;
            this.zzgh = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzav(long j) {
            this.zzdw |= 1048576;
            this.zzgi = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaw(long j) {
            this.zzdw |= 2097152;
            this.zzgj = j;
        }

        public final boolean zzaj() {
            return (this.zzdw & 4194304) != 0;
        }

        public final String zzaf() {
            return this.zzfg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaf(String str) {
            str.getClass();
            this.zzdw |= 4194304;
            this.zzfg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzag(String str) {
            str.getClass();
            this.zzdw |= 16777216;
            this.zzgl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzax(long j) {
            this.zzdw |= 33554432;
            this.zzgm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzay(long j) {
            this.zzdw |= 67108864;
            this.zzgn = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaz(long j) {
            this.zzdw |= 134217728;
            this.zzgo = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzah(String str) {
            str.getClass();
            this.zzdw |= 268435456;
            this.zzfi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzba(long j) {
            this.zzdw |= 536870912;
            this.zzgp = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbb(long j) {
            this.zzdw |= 1073741824;
            this.zzgq = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbc(long j) {
            this.zzdw |= Integer.MIN_VALUE;
            this.zzgr = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbd(long j) {
            this.zzfn |= 2;
            this.zzgt = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbe(long j) {
            this.zzfn |= 4;
            this.zzgu = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbf(long j) {
            this.zzfn |= 8;
            this.zzgv = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbg(long j) {
            this.zzfn |= 16;
            this.zzgw = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbh(long j) {
            this.zzfn |= 32;
            this.zzgx = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbi(long j) {
            this.zzfn |= 64;
            this.zzgy = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzai(String str) {
            str.getClass();
            this.zzfn |= 128;
            this.zzfj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzaj(String str) {
            str.getClass();
            this.zzfn |= 256;
            this.zzfk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzcn zzcnVar) {
            this.zzha = zzcnVar.zzv();
            this.zzfn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(zzcn zzcnVar) {
            this.zzhb = zzcnVar.zzv();
            this.zzfn |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbj(long j) {
            this.zzfn |= 4096;
            this.zzhc = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbk(long j) {
            this.zzfn |= 8192;
            this.zzhd = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbl(long j) {
            this.zzfn |= 16384;
            this.zzhe = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(zzcn zzcnVar) {
            this.zzhh = zzcnVar.zzv();
            this.zzfn |= 131072;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzc(zze zzeVar) {
            zzeVar.getClass();
            this.zzhi = zzeVar;
            this.zzfn |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(zze zzeVar) {
            zzeVar.getClass();
            zzeha<zze> zzehaVar = this.zzhj;
            if (!zzehaVar.zzbdf()) {
                this.zzhj = zzegp.zza(zzehaVar);
            }
            this.zzhj.add(zzeVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzak() {
            this.zzhj = zzbfo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzf zzfVar) {
            zzfVar.getClass();
            this.zzhk = zzfVar;
            this.zzfn |= 524288;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbm(long j) {
            this.zzfn |= 2097152;
            this.zzhm = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbn(long j) {
            this.zzfn |= 4194304;
            this.zzhn = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbo(long j) {
            this.zzfn |= 8388608;
            this.zzho = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbp(long j) {
            this.zzfn |= 67108864;
            this.zzhr = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbq(long j) {
            this.zzfn |= 134217728;
            this.zzhs = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzak(String str) {
            str.getClass();
            this.zzfn |= 268435456;
            this.zzht = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(zzcn zzcnVar) {
            this.zzia = zzcnVar.zzv();
            this.zzfo |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzj(zzcn zzcnVar) {
            this.zzib = zzcnVar.zzv();
            this.zzfo |= 16;
        }

        public final String zzal() {
            return this.zzie;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzal(String str) {
            str.getClass();
            this.zzfo |= 128;
            this.zzie = str;
        }

        public final zzc zzam() {
            zzc zzl = zzc.zzl(this.zzif);
            return zzl == null ? zzc.DEVICE_IDENTIFIER_GLOBAL_ID : zzl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzc zzcVar) {
            this.zzif = zzcVar.zzv();
            this.zzfo |= 256;
        }

        public final boolean zzan() {
            return this.zzig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(boolean z) {
            this.zzfo |= 512;
            this.zzig = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbr(long j) {
            this.zzfo |= 2048;
            this.zzii = j;
        }

        public final boolean zzao() {
            return (this.zzfo & 4096) != 0;
        }

        public final zzd zzap() {
            zzd zzdVar = this.zzij;
            return zzdVar == null ? zzd.zzbi() : zzdVar;
        }

        public static zza zza(byte[] bArr, zzegc zzegcVar) throws zzegz {
            return (zza) zzegp.zza(zzik, bArr, zzegcVar);
        }

        public static C0008zza zzaq() {
            return zzik.zzbfj();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzce.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0008zza(null);
                case 3:
                    return zza(zzik, "\u0001N\u0000\u0003\u0001ÉN\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂF\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈG\u0019ဂK\u001aဌH\u001bဈ\u0016\u001cဇI\u001dဈ\u0018\u001eဈJ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEÉဉL", new Object[]{"zzdw", "zzfn", "zzfo", "zzfp", "zzeg", "zzfq", "zzfr", "zzfs", "zzft", "zzfu", "zzfv", "zzfw", "zzfx", "zzfy", "zzfz", "zzga", "zzgb", "zzgc", "zzgd", "zzge", "zzgf", "zzgg", "zzgh", "zzid", "zzgi", "zzgj", "zzie", "zzii", "zzif", zzc.zzw(), "zzfg", "zzig", "zzgl", "zzih", "zzgm", "zzgn", "zzgo", "zzfi", "zzgp", "zzgq", "zzgr", "zzgs", "zzgt", "zzgu", "zzgv", "zzgw", "zzhj", zze.class, "zzgx", "zzgy", "zzfj", "zzfk", "zzha", zzcn.zzw(), "zzhb", zzcn.zzw(), "zzhi", "zzhc", "zzhd", "zzhe", "zzhf", "zzhg", "zzhh", zzcn.zzw(), "zzhk", "zzhl", "zzhm", "zzhn", "zzho", "zzhr", "zzhs", "zzhu", "zzhv", zzcm.zzw(), "zzhw", zzcs.zzw(), "zzht", "zzhx", zzb.zzw(), "zzhy", "zzhz", "zzhp", "zzhq", "zzia", zzcn.zzw(), "zzgz", "zzgk", "zzib", zzcn.zzw(), "zzic", "zzij"});
                case 4:
                    return zzik;
                case 5:
                    zzeim<zza> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zza.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzik);
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

        public static zza zzar() {
            return zzik;
        }

        static {
            zza zzaVar = new zza();
            zzik = zzaVar;
            zzegp.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzegp<zzb, zza> implements zzeib {
        private static volatile zzeim<zzb> zzel;
        private static final zzb zzlf;
        private int zzdw;
        private long zzla;
        private int zzlb;
        private boolean zzlc;
        private zzegv zzld = zzbfm();
        private long zzle;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zzb, zza> implements zzeib {
            private zza() {
                super(zzb.zzlf);
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzce.zzdv[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzlf, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzdw", "zzla", "zzlb", "zzlc", "zzld", "zzle"});
                case 4:
                    return zzlf;
                case 5:
                    zzeim<zzb> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zzb.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzlf);
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
            zzlf = zzbVar;
            zzegp.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzd extends zzegp<zzd, zza> implements zzeib {
        private static volatile zzeim<zzd> zzel;
        private static final zzd zzme;
        private int zzdw;
        private long zzla;
        private String zzmc = "";
        private zzeff zzmd = zzeff.zzibd;

        private zzd() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zzd, zza> implements zzeib {
            private zza() {
                super(zzd.zzme);
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        public final boolean zzbg() {
            return (this.zzdw & 1) != 0;
        }

        public final long zzbh() {
            return this.zzla;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzce.zzdv[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzme, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzdw", "zzla", "zzmc", "zzmd"});
                case 4:
                    return zzme;
                case 5:
                    zzeim<zzd> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zzd.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzme);
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

        public static zzd zzbi() {
            return zzme;
        }

        static {
            zzd zzdVar = new zzd();
            zzme = zzdVar;
            zzegp.zza(zzd.class, zzdVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zze extends zzegp<zze, zza> implements zzeib {
        private static volatile zzeim<zze> zzel;
        private static final zze zzmf;
        private int zzdw;
        private String zzfl = "";

        private zze() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zze, zza> implements zzeib {
            private zza() {
                super(zze.zzmf);
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzce.zzdv[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzmf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdw", "zzfl"});
                case 4:
                    return zzmf;
                case 5:
                    zzeim<zze> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zze.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzmf);
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
            zze zzeVar = new zze();
            zzmf = zzeVar;
            zzegp.zza(zze.class, zzeVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzc extends zzegp<zzc, zza> implements zzeib {
        private static volatile zzeim<zzc> zzel;
        private static final zzc zzlk;
        private int zzdw;
        private zzeff zzlg = zzeff.zzibd;
        private zzeff zzlh = zzeff.zzibd;
        private zzeff zzli = zzeff.zzibd;
        private zzeff zzlj = zzeff.zzibd;

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zzc, zza> implements zzeib {
            private zza() {
                super(zzc.zzlk);
            }

            public final zza zza(zzeff zzeffVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzc) this.zzift).zze(zzeffVar);
                return this;
            }

            public final zza zzb(zzeff zzeffVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzc) this.zzift).zzf(zzeffVar);
                return this;
            }

            public final zza zzc(zzeff zzeffVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzc) this.zzift).zzg(zzeffVar);
                return this;
            }

            public final zza zzd(zzeff zzeffVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzc) this.zzift).zzh(zzeffVar);
                return this;
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        public final zzeff zzba() {
            return this.zzlg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zze(zzeff zzeffVar) {
            zzeffVar.getClass();
            this.zzdw |= 1;
            this.zzlg = zzeffVar;
        }

        public final zzeff zzbb() {
            return this.zzlh;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzeff zzeffVar) {
            zzeffVar.getClass();
            this.zzdw |= 2;
            this.zzlh = zzeffVar;
        }

        public final zzeff zzbc() {
            return this.zzli;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzg(zzeff zzeffVar) {
            zzeffVar.getClass();
            this.zzdw |= 4;
            this.zzli = zzeffVar;
        }

        public final zzeff zzbd() {
            return this.zzlj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzh(zzeff zzeffVar) {
            zzeffVar.getClass();
            this.zzdw |= 8;
            this.zzlj = zzeffVar;
        }

        public static zzc zzb(byte[] bArr, zzegc zzegcVar) throws zzegz {
            return (zzc) zzegp.zza(zzlk, bArr, zzegcVar);
        }

        public static zza zzbe() {
            return zzlk.zzbfj();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzce.zzdv[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzlk, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzdw", "zzlg", "zzlh", "zzli", "zzlj"});
                case 4:
                    return zzlk;
                case 5:
                    zzeim<zzc> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zzc.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzlk);
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
            zzc zzcVar = new zzc();
            zzlk = zzcVar;
            zzegp.zza(zzc.class, zzcVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzf extends zzegp<zzf, zza> implements zzeib {
        private static volatile zzeim<zzf> zzel;
        private static final zzf zzmh;
        private int zzdw;
        private zzeha<zzeff> zzmg = zzbfo();
        private zzeff zzlh = zzeff.zzibd;
        private int zzhw = 1;
        private int zzhv = 1;

        private zzf() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zzf, zza> implements zzeib {
            private zza() {
                super(zzf.zzmh);
            }

            public final zza zzj(zzeff zzeffVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzf) this.zzift).zzi(zzeffVar);
                return this;
            }

            public final zza zzk(zzeff zzeffVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzf) this.zzift).zzf(zzeffVar);
                return this;
            }

            public final zza zzb(zzcm zzcmVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzf) this.zzift).zza(zzcmVar);
                return this;
            }

            /* synthetic */ zza(zzce zzceVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzi(zzeff zzeffVar) {
            zzeffVar.getClass();
            zzeha<zzeff> zzehaVar = this.zzmg;
            if (!zzehaVar.zzbdf()) {
                this.zzmg = zzegp.zza(zzehaVar);
            }
            this.zzmg.add(zzeffVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzf(zzeff zzeffVar) {
            zzeffVar.getClass();
            this.zzdw |= 1;
            this.zzlh = zzeffVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzcm zzcmVar) {
            this.zzhv = zzcmVar.zzv();
            this.zzdw |= 4;
        }

        public static zza zzbl() {
            return zzmh.zzbfj();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzce.zzdv[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzmh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzdw", "zzmg", "zzlh", "zzhw", zzcs.zzw(), "zzhv", zzcm.zzw()});
                case 4:
                    return zzmh;
                case 5:
                    zzeim<zzf> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zzf.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzmh);
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
            zzf zzfVar = new zzf();
            zzmh = zzfVar;
            zzegp.zza(zzf.class, zzfVar);
        }
    }
}
