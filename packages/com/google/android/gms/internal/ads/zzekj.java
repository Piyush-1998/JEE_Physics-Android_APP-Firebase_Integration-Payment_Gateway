package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzekj {

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp<zza, zzb> implements zzeib {
        private static volatile zzeim<zza> zzel;
        private static final zza zzimu;
        private int zzdw;
        private int zzimn;
        private C0012zza zzimo;
        private boolean zzimr;
        private boolean zzims;
        private byte zzimt = 2;
        private zzeff zzimp = zzeff.zzibd;
        private zzeff zzimq = zzeff.zzibd;

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzekj$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0012zza extends zzegp<C0012zza, C0013zza> implements zzeib {
            private static volatile zzeim<C0012zza> zzel;
            private static final C0012zza zzimz;
            private int zzdw;
            private String zzimv = "";
            private String zzimw = "";
            private String zzimx = "";
            private int zzimy;

            private C0012zza() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzekj$zza$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0013zza extends zzegp.zzb<C0012zza, C0013zza> implements zzeib {
                private C0013zza() {
                    super(C0012zza.zzimz);
                }

                /* synthetic */ C0013zza(zzekl zzeklVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzekl.zzdv[i - 1]) {
                    case 1:
                        return new C0012zza();
                    case 2:
                        return new C0013zza(null);
                    case 3:
                        return zza(zzimz, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zzdw", "zzimv", "zzimw", "zzimx", "zzimy"});
                    case 4:
                        return zzimz;
                    case 5:
                        zzeim<C0012zza> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (C0012zza.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzimz);
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
                C0012zza c0012zza = new C0012zza();
                zzimz = c0012zza;
                zzegp.zza(C0012zza.class, c0012zza);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzegu {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            
            private static final zzegt<zzc> zzes = new zzekn();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzegu
            public final int zzv() {
                return this.value;
            }

            public static zzc zzht(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return DANGEROUS_HOST;
                            }
                            return POTENTIALLY_UNWANTED;
                        }
                        return UNKNOWN;
                    }
                    return DANGEROUS;
                }
                return SAFE;
            }

            public static zzegw zzw() {
                return zzekm.zzeu;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzc(int i) {
                this.value = i;
            }
        }

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzegp.zzb<zza, zzb> implements zzeib {
            private zzb() {
                super(zza.zzimu);
            }

            /* synthetic */ zzb(zzekl zzeklVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzekl.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(null);
                case 3:
                    return zza(zzimu, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ᔌ\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004ည\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzdw", "zzimn", zzc.zzw(), "zzimo", "zzimp", "zzimq", "zzimr", "zzims"});
                case 4:
                    return zzimu;
                case 5:
                    zzeim<zza> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zza.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzimu);
                                zzel = zzeimVar;
                            }
                        }
                    }
                    return zzeimVar;
                case 6:
                    return Byte.valueOf(this.zzimt);
                case 7:
                    this.zzimt = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zza zzaVar = new zza();
            zzimu = zzaVar;
            zzegp.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzegp<zzb, zza> implements zzeib {
        private static volatile zzeim<zzb> zzel;
        private static final zzb zzinv;
        private int zzbzm;
        private int zzdw;
        private int zzing;
        private C0014zzb zzinj;
        private zzf zzinm;
        private boolean zzinn;
        private boolean zzinq;
        private boolean zzinr;
        private zzi zzins;
        private byte zzimt = 2;
        private String zzimw = "";
        private String zzinh = "";
        private String zzini = "";
        private zzeha<zzh> zzink = zzbfo();
        private String zzinl = "";
        private zzeha<String> zzino = zzegp.zzbfo();
        private String zzinp = "";
        private zzeff zzimp = zzeff.zzibd;
        private zzeha<String> zzint = zzegp.zzbfo();
        private zzeha<String> zzinu = zzegp.zzbfo();

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zze extends zzegp<zze, zza> implements zzeib {
            private static volatile zzeim<zze> zzel;
            private static final zze zziom;
            private int zzdw;
            private int zzioe;
            private C0016zzb zziok;
            private byte zzimt = 2;
            private zzeha<zzc> zziob = zzbfo();
            private zzeff zzioc = zzeff.zzibd;
            private zzeff zziod = zzeff.zzibd;
            private zzeff zziol = zzeff.zzibd;

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzekj$zzb$zze$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0016zzb extends zzegp<C0016zzb, zza> implements zzeib {
                private static volatile zzeim<C0016zzb> zzel;
                private static final C0016zzb zziop;
                private int zzdw;
                private int zzion;
                private zzeff zzioo = zzeff.zzibd;
                private zzeff zzioi = zzeff.zzibd;

                private C0016zzb() {
                }

                /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
                /* renamed from: com.google.android.gms.internal.ads.zzekj$zzb$zze$zzb$zza */
                /* loaded from: classes.dex */
                public static final class zza extends zzegp.zzb<C0016zzb, zza> implements zzeib {
                    private zza() {
                        super(C0016zzb.zziop);
                    }

                    /* synthetic */ zza(zzekl zzeklVar) {
                        this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzegp
                public final Object zza(int i, Object obj, Object obj2) {
                    switch (zzekl.zzdv[i - 1]) {
                        case 1:
                            return new C0016zzb();
                        case 2:
                            return new zza(null);
                        case 3:
                            return zza(zziop, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzion", "zzioo", "zzioi"});
                        case 4:
                            return zziop;
                        case 5:
                            zzeim<C0016zzb> zzeimVar = zzel;
                            if (zzeimVar == null) {
                                synchronized (C0016zzb.class) {
                                    zzeimVar = zzel;
                                    if (zzeimVar == null) {
                                        zzeimVar = new zzegp.zza<>(zziop);
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
                    C0016zzb c0016zzb = new C0016zzb();
                    zziop = c0016zzb;
                    zzegp.zza(C0016zzb.class, c0016zzb);
                }
            }

            private zze() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzegp.zzb<zze, zza> implements zzeib {
                private zza() {
                    super(zze.zziom);
                }

                /* synthetic */ zza(zzekl zzeklVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzekl.zzdv[i - 1]) {
                    case 1:
                        return new zze();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zziom, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzdw", "zziok", "zziob", zzc.class, "zzioc", "zziod", "zzioe", "zziol"});
                    case 4:
                        return zziom;
                    case 5:
                        zzeim<zze> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zze.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zziom);
                                    zzel = zzeimVar;
                                }
                            }
                        }
                        return zzeimVar;
                    case 6:
                        return Byte.valueOf(this.zzimt);
                    case 7:
                        this.zzimt = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zze zzeVar = new zze();
                zziom = zzeVar;
                zzegp.zza(zze.class, zzeVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public enum zzg implements zzegu {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            
            private static final zzegt<zzg> zzes = new zzekr();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzegu
            public final int zzv() {
                return this.value;
            }

            public static zzg zzhv(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static zzegw zzw() {
                return zzekq.zzeu;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
            }

            zzg(int i) {
                this.value = i;
            }
        }

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzekj$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0014zzb extends zzegp<C0014zzb, zza> implements zzeib {
            private static volatile zzeim<C0014zzb> zzel;
            private static final C0014zzb zzinx;
            private int zzdw;
            private String zzinw = "";

            private C0014zzb() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzekj$zzb$zzb$zza */
            /* loaded from: classes.dex */
            public static final class zza extends zzegp.zzb<C0014zzb, zza> implements zzeib {
                private zza() {
                    super(C0014zzb.zzinx);
                }

                public final zza zzic(String str) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((C0014zzb) this.zzift).zzid(str);
                    return this;
                }

                /* synthetic */ zza(zzekl zzeklVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzid(String str) {
                str.getClass();
                this.zzdw |= 1;
                this.zzinw = str;
            }

            public static zza zzbis() {
                return zzinx.zzbfj();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzekl.zzdv[i - 1]) {
                    case 1:
                        return new C0014zzb();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzinx, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzdw", "zzinw"});
                    case 4:
                        return zzinx;
                    case 5:
                        zzeim<C0014zzb> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (C0014zzb.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzinx);
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
                C0014zzb c0014zzb = new C0014zzb();
                zzinx = c0014zzb;
                zzegp.zza(C0014zzb.class, c0014zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zzc extends zzegp<zzc, zza> implements zzeib {
            private static volatile zzeim<zzc> zzel;
            private static final zzc zzinz;
            private int zzdw;
            private byte zzimt = 2;
            private zzeff zziny = zzeff.zzibd;
            private zzeff zzhvx = zzeff.zzibd;

            private zzc() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzegp.zzb<zzc, zza> implements zzeib {
                private zza() {
                    super(zzc.zzinz);
                }

                public final zza zzan(zzeff zzeffVar) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzc) this.zzift).zzap(zzeffVar);
                    return this;
                }

                public final zza zzao(zzeff zzeffVar) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzc) this.zzift).zzae(zzeffVar);
                    return this;
                }

                /* synthetic */ zza(zzekl zzeklVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzap(zzeff zzeffVar) {
                zzeffVar.getClass();
                this.zzdw |= 1;
                this.zziny = zzeffVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzae(zzeff zzeffVar) {
                zzeffVar.getClass();
                this.zzdw |= 2;
                this.zzhvx = zzeffVar;
            }

            public static zza zzbiu() {
                return zzinz.zzbfj();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzekl.zzdv[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzinz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzdw", "zziny", "zzhvx"});
                    case 4:
                        return zzinz;
                    case 5:
                        zzeim<zzc> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zzc.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzinz);
                                    zzel = zzeimVar;
                                }
                            }
                        }
                        return zzeimVar;
                    case 6:
                        return Byte.valueOf(this.zzimt);
                    case 7:
                        this.zzimt = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzinz = zzcVar;
                zzegp.zza(zzc.class, zzcVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zzd extends zzegp<zzd, zza> implements zzeib {
            private static volatile zzeim<zzd> zzel;
            private static final zzd zziof;
            private int zzdw;
            private C0015zzb zzioa;
            private int zzioe;
            private byte zzimt = 2;
            private zzeha<zzc> zziob = zzbfo();
            private zzeff zzioc = zzeff.zzibd;
            private zzeff zziod = zzeff.zzibd;

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzekj$zzb$zzd$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0015zzb extends zzegp<C0015zzb, zza> implements zzeib {
                private static volatile zzeim<C0015zzb> zzel;
                private static final C0015zzb zzioj;
                private int zzdw;
                private zzeff zziog = zzeff.zzibd;
                private zzeff zzioh = zzeff.zzibd;
                private zzeff zzioi = zzeff.zzibd;

                private C0015zzb() {
                }

                /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
                /* renamed from: com.google.android.gms.internal.ads.zzekj$zzb$zzd$zzb$zza */
                /* loaded from: classes.dex */
                public static final class zza extends zzegp.zzb<C0015zzb, zza> implements zzeib {
                    private zza() {
                        super(C0015zzb.zzioj);
                    }

                    /* synthetic */ zza(zzekl zzeklVar) {
                        this();
                    }
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.android.gms.internal.ads.zzegp
                public final Object zza(int i, Object obj, Object obj2) {
                    switch (zzekl.zzdv[i - 1]) {
                        case 1:
                            return new C0015zzb();
                        case 2:
                            return new zza(null);
                        case 3:
                            return zza(zzioj, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zziog", "zzioh", "zzioi"});
                        case 4:
                            return zzioj;
                        case 5:
                            zzeim<C0015zzb> zzeimVar = zzel;
                            if (zzeimVar == null) {
                                synchronized (C0015zzb.class) {
                                    zzeimVar = zzel;
                                    if (zzeimVar == null) {
                                        zzeimVar = new zzegp.zza<>(zzioj);
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
                    C0015zzb c0015zzb = new C0015zzb();
                    zzioj = c0015zzb;
                    zzegp.zza(C0015zzb.class, c0015zzb);
                }
            }

            private zzd() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzegp.zzb<zzd, zza> implements zzeib {
                private zza() {
                    super(zzd.zziof);
                }

                public final zza zza(zzc zzcVar) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzd) this.zzift).zzb(zzcVar);
                    return this;
                }

                /* synthetic */ zza(zzekl zzeklVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzb(zzc zzcVar) {
                zzcVar.getClass();
                zzeha<zzc> zzehaVar = this.zziob;
                if (!zzehaVar.zzbdf()) {
                    this.zziob = zzegp.zza(zzehaVar);
                }
                this.zziob.add(zzcVar);
            }

            public static zza zzbiw() {
                return zziof.zzbfj();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzekl.zzdv[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zziof, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzdw", "zzioa", "zziob", zzc.class, "zzioc", "zziod", "zzioe"});
                    case 4:
                        return zziof;
                    case 5:
                        zzeim<zzd> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zzd.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zziof);
                                    zzel = zzeimVar;
                                }
                            }
                        }
                        return zzeimVar;
                    case 6:
                        return Byte.valueOf(this.zzimt);
                    case 7:
                        this.zzimt = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzd zzdVar = new zzd();
                zziof = zzdVar;
                zzegp.zza(zzd.class, zzdVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zzf extends zzegp<zzf, zza> implements zzeib {
            private static volatile zzeim<zzf> zzel;
            private static final zzf zzios;
            private int zzbzm;
            private int zzdw;
            private String zzioq = "";
            private zzeff zzior = zzeff.zzibd;

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzekj$zzb$zzf$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public enum EnumC0017zzb implements zzegu {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                
                private static final zzegt<EnumC0017zzb> zzes = new zzeko();
                private final int value;

                @Override // com.google.android.gms.internal.ads.zzegu
                public final int zzv() {
                    return this.value;
                }

                public static EnumC0017zzb zzhu(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            return null;
                        }
                        return TYPE_CREATIVE;
                    }
                    return TYPE_UNKNOWN;
                }

                public static zzegw zzw() {
                    return zzekp.zzeu;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                EnumC0017zzb(int i) {
                    this.value = i;
                }
            }

            private zzf() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzegp.zzb<zzf, zza> implements zzeib {
                private zza() {
                    super(zzf.zzios);
                }

                public final zza zza(EnumC0017zzb enumC0017zzb) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzf) this.zzift).zzb(enumC0017zzb);
                    return this;
                }

                public final zza zzie(String str) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzf) this.zzift).setMimeType(str);
                    return this;
                }

                public final zza zzaq(zzeff zzeffVar) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzf) this.zzift).zzar(zzeffVar);
                    return this;
                }

                /* synthetic */ zza(zzekl zzeklVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzb(EnumC0017zzb enumC0017zzb) {
                this.zzbzm = enumC0017zzb.zzv();
                this.zzdw |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setMimeType(String str) {
                str.getClass();
                this.zzdw |= 2;
                this.zzioq = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzar(zzeff zzeffVar) {
                zzeffVar.getClass();
                this.zzdw |= 4;
                this.zzior = zzeffVar;
            }

            public static zza zzbjb() {
                return zzios.zzbfj();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzekl.zzdv[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzios, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzbzm", EnumC0017zzb.zzw(), "zzioq", "zzior"});
                    case 4:
                        return zzios;
                    case 5:
                        zzeim<zzf> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zzf.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzios);
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
                zzios = zzfVar;
                zzegp.zza(zzf.class, zzfVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zzh extends zzegp<zzh, C0018zzb> implements zzeib {
            private static volatile zzeim<zzh> zzel;
            private static final zzh zzipu;
            private int zzdw;
            private int zzipm;
            private zzd zzipn;
            private zze zzipo;
            private int zzipp;
            private int zzips;
            private byte zzimt = 2;
            private String zzimw = "";
            private zzegv zzipq = zzbfm();
            private String zzipr = "";
            private zzeha<String> zzipt = zzegp.zzbfo();

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* loaded from: classes.dex */
            public enum zza implements zzegu {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                
                private static final zzegt<zza> zzes = new zzekt();
                private final int value;

                @Override // com.google.android.gms.internal.ads.zzegu
                public final int zzv() {
                    return this.value;
                }

                public static zza zzhw(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    return null;
                                }
                                return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                            }
                            return AD_RESOURCE_POST_CLICK;
                        }
                        return AD_RESOURCE_CREATIVE;
                    }
                    return AD_RESOURCE_UNKNOWN;
                }

                public static zzegw zzw() {
                    return zzeks.zzeu;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
                }

                zza(int i) {
                    this.value = i;
                }
            }

            private zzh() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzekj$zzb$zzh$zzb  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0018zzb extends zzegp.zzb<zzh, C0018zzb> implements zzeib {
                private C0018zzb() {
                    super(zzh.zzipu);
                }

                public final C0018zzb zzhx(int i) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzh) this.zzift).setId(i);
                    return this;
                }

                public final C0018zzb zzih(String str) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzh) this.zzift).setUrl(str);
                    return this;
                }

                public final C0018zzb zzb(zzd zzdVar) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzh) this.zzift).zza(zzdVar);
                    return this;
                }

                public final C0018zzb zzb(zza zzaVar) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzh) this.zzift).zza(zzaVar);
                    return this;
                }

                public final C0018zzb zzii(String str) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzh) this.zzift).zzif(str);
                    return this;
                }

                /* synthetic */ C0018zzb(zzekl zzeklVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setId(int i) {
                this.zzdw |= 1;
                this.zzipm = i;
            }

            public final String getUrl() {
                return this.zzimw;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void setUrl(String str) {
                str.getClass();
                this.zzdw |= 2;
                this.zzimw = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zzd zzdVar) {
                zzdVar.getClass();
                this.zzipn = zzdVar;
                this.zzdw |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zza(zza zzaVar) {
                this.zzips = zzaVar.zzv();
                this.zzdw |= 64;
            }

            public final int zzbjd() {
                return this.zzipt.size();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzif(String str) {
                str.getClass();
                zzeha<String> zzehaVar = this.zzipt;
                if (!zzehaVar.zzbdf()) {
                    this.zzipt = zzegp.zza(zzehaVar);
                }
                this.zzipt.add(str);
            }

            public static C0018zzb zzbje() {
                return zzipu.zzbfj();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzekl.zzdv[i - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C0018zzb(null);
                    case 3:
                        return zza(zzipu, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zzdw", "zzipm", "zzimw", "zzipn", "zzipo", "zzipp", "zzipq", "zzipr", "zzips", zza.zzw(), "zzipt"});
                    case 4:
                        return zzipu;
                    case 5:
                        zzeim<zzh> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zzh.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzipu);
                                    zzel = zzeimVar;
                                }
                            }
                        }
                        return zzeimVar;
                    case 6:
                        return Byte.valueOf(this.zzimt);
                    case 7:
                        this.zzimt = (byte) (obj == null ? 0 : 1);
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzh zzhVar = new zzh();
                zzipu = zzhVar;
                zzegp.zza(zzh.class, zzhVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zzi extends zzegp<zzi, zza> implements zzeib {
            private static volatile zzeim<zzi> zzel;
            private static final zzi zzipy;
            private int zzdw;
            private String zzipv = "";
            private long zzipw;
            private boolean zzipx;

            private zzi() {
            }

            /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
            /* loaded from: classes.dex */
            public static final class zza extends zzegp.zzb<zzi, zza> implements zzeib {
                private zza() {
                    super(zzi.zzipy);
                }

                public final zza zzij(String str) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzi) this.zzift).zzig(str);
                    return this;
                }

                public final zza zzfu(long j) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzi) this.zzift).zzft(j);
                    return this;
                }

                public final zza zzbx(boolean z) {
                    if (this.zzifu) {
                        zzbft();
                        this.zzifu = false;
                    }
                    ((zzi) this.zzift).zzbw(z);
                    return this;
                }

                /* synthetic */ zza(zzekl zzeklVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzig(String str) {
                str.getClass();
                this.zzdw |= 1;
                this.zzipv = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzft(long j) {
                this.zzdw |= 2;
                this.zzipw = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void zzbw(boolean z) {
                this.zzdw |= 4;
                this.zzipx = z;
            }

            public static zza zzbjg() {
                return zzipy.zzbfj();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzekl.zzdv[i - 1]) {
                    case 1:
                        return new zzi();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zza(zzipy, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002", new Object[]{"zzdw", "zzipv", "zzipw", "zzipx"});
                    case 4:
                        return zzipy;
                    case 5:
                        zzeim<zzi> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zzi.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzipy);
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
                zzi zziVar = new zzi();
                zzipy = zziVar;
                zzegp.zza(zzi.class, zziVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zzb, zza> implements zzeib {
            private zza() {
                super(zzb.zzinv);
            }

            public final zza zza(zzg zzgVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzb(zzgVar);
                return this;
            }

            public final String getUrl() {
                return ((zzb) this.zzift).getUrl();
            }

            public final zza zzhy(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).setUrl(str);
                return this;
            }

            public final zza zzhz(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzib(str);
                return this;
            }

            public final zza zza(C0014zzb c0014zzb) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzb(c0014zzb);
                return this;
            }

            public final List<zzh> zzbim() {
                return Collections.unmodifiableList(((zzb) this.zzift).zzbim());
            }

            public final zza zza(zzh zzhVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzb(zzhVar);
                return this;
            }

            public final String zzbin() {
                return ((zzb) this.zzift).zzbin();
            }

            public final zza zzia(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzea(str);
                return this;
            }

            public final zza zzbio() {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzbip();
                return this;
            }

            public final zza zza(zzf zzfVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzb(zzfVar);
                return this;
            }

            public final zza zza(zzi zziVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzb(zziVar);
                return this;
            }

            public final zza zzm(Iterable<String> iterable) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzo(iterable);
                return this;
            }

            public final zza zzn(Iterable<String> iterable) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zzb) this.zzift).zzp(iterable);
                return this;
            }

            /* synthetic */ zza(zzekl zzeklVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzg zzgVar) {
            this.zzbzm = zzgVar.zzv();
            this.zzdw |= 1;
        }

        public final String getUrl() {
            return this.zzimw;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setUrl(String str) {
            str.getClass();
            this.zzdw |= 4;
            this.zzimw = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzib(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzinh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(C0014zzb c0014zzb) {
            c0014zzb.getClass();
            this.zzinj = c0014zzb;
            this.zzdw |= 32;
        }

        public final List<zzh> zzbim() {
            return this.zzink;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzh zzhVar) {
            zzhVar.getClass();
            zzeha<zzh> zzehaVar = this.zzink;
            if (!zzehaVar.zzbdf()) {
                this.zzink = zzegp.zza(zzehaVar);
            }
            this.zzink.add(zzhVar);
        }

        public final String zzbin() {
            return this.zzinl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzea(String str) {
            str.getClass();
            this.zzdw |= 64;
            this.zzinl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzbip() {
            this.zzdw &= -65;
            this.zzinl = zzinv.zzinl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzf zzfVar) {
            zzfVar.getClass();
            this.zzinm = zzfVar;
            this.zzdw |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzi zziVar) {
            zziVar.getClass();
            this.zzins = zziVar;
            this.zzdw |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzo(Iterable<String> iterable) {
            zzeha<String> zzehaVar = this.zzint;
            if (!zzehaVar.zzbdf()) {
                this.zzint = zzegp.zza(zzehaVar);
            }
            zzeev.zza(iterable, this.zzint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzp(Iterable<String> iterable) {
            zzeha<String> zzehaVar = this.zzinu;
            if (!zzehaVar.zzbdf()) {
                this.zzinu = zzegp.zza(zzehaVar);
            }
            zzeev.zza(iterable, this.zzinu);
        }

        public static zza zzbiq() {
            return zzinv.zzbfj();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzekl.zzdv[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzinv, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\nဌ\u0000\u000bဌ\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0011ဉ\r\u0014\u001a\u0015\u001a", new Object[]{"zzdw", "zzimw", "zzinh", "zzini", "zzink", zzh.class, "zzinn", "zzino", "zzinp", "zzinq", "zzinr", "zzbzm", zzg.zzw(), "zzing", zza.zzc.zzw(), "zzinj", "zzinl", "zzinm", "zzimp", "zzins", "zzint", "zzinu"});
                case 4:
                    return zzinv;
                case 5:
                    zzeim<zzb> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zzb.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzinv);
                                zzel = zzeimVar;
                            }
                        }
                    }
                    return zzeimVar;
                case 6:
                    return Byte.valueOf(this.zzimt);
                case 7:
                    this.zzimt = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzinv = zzbVar;
            zzegp.zza(zzb.class, zzbVar);
        }
    }
}
