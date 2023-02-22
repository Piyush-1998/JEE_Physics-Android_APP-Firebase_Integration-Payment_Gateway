package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzby {

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp<zza, C0007zza> implements zzeib {
        private static volatile zzeim<zza> zzel;
        private static final zza zzex;
        private int zzdw;
        private zzb zzev;
        private zzc zzew;

        private zza() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzby$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0007zza extends zzegp.zzb<zza, C0007zza> implements zzeib {
            private C0007zza() {
                super(zza.zzex);
            }

            /* synthetic */ C0007zza(zzca zzcaVar) {
                this();
            }
        }

        public final boolean zzx() {
            return (this.zzdw & 1) != 0;
        }

        public final zzb zzy() {
            zzb zzbVar = this.zzev;
            return zzbVar == null ? zzb.zzad() : zzbVar;
        }

        public final boolean zzz() {
            return (this.zzdw & 2) != 0;
        }

        public final zzc zzaa() {
            zzc zzcVar = this.zzew;
            return zzcVar == null ? zzc.zzag() : zzcVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0007zza(null);
                case 3:
                    return zza(zzex, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzev", "zzew"});
                case 4:
                    return zzex;
                case 5:
                    zzeim<zza> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zza.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzex);
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
            zzex = zzaVar;
            zzegp.zza(zza.class, zzaVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzegp<zzb, zza> implements zzeib {
        private static volatile zzeim<zzb> zzel;
        private static final zzb zzez;
        private int zzdw;
        private int zzey = 2;

        private zzb() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zzb, zza> implements zzeib {
            private zza() {
                super(zzb.zzez);
            }

            /* synthetic */ zza(zzca zzcaVar) {
                this();
            }
        }

        public final zzcb zzac() {
            zzcb zzj = zzcb.zzj(this.zzey);
            return zzj == null ? zzcb.ENUM_SIGNAL_SOURCE_ADSHIELD : zzj;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zzdv[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzez, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzdw", "zzey", zzcb.zzw()});
                case 4:
                    return zzez;
                case 5:
                    zzeim<zzb> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zzb.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzez);
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

        public static zzb zzad() {
            return zzez;
        }

        static {
            zzb zzbVar = new zzb();
            zzez = zzbVar;
            zzegp.zza(zzb.class, zzbVar);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzc extends zzegp<zzc, zza> implements zzeib {
        private static volatile zzeim<zzc> zzel;
        private static final zzc zzfm;
        private int zzdw;
        private String zzfg = "";
        private String zzfh = "";
        private String zzfi = "";
        private String zzfj = "";
        private String zzfk = "";
        private String zzfl = "";

        private zzc() {
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zza extends zzegp.zzb<zzc, zza> implements zzeib {
            private zza() {
                super(zzc.zzfm);
            }

            /* synthetic */ zza(zzca zzcaVar) {
                this();
            }
        }

        public final String zzaf() {
            return this.zzfg;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzca.zzdv[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zza(zzfm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzdw", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzfl"});
                case 4:
                    return zzfm;
                case 5:
                    zzeim<zzc> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zzc.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzfm);
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

        public static zzc zzag() {
            return zzfm;
        }

        static {
            zzc zzcVar = new zzc();
            zzfm = zzcVar;
            zzegp.zza(zzc.class, zzcVar);
        }
    }
}
