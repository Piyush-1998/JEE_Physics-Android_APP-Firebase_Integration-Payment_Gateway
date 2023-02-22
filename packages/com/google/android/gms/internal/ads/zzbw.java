package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbw {

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp<zza, C0005zza> implements zzeib {
        private static final zza zzek;
        private static volatile zzeim<zza> zzel;
        private int zzdw;
        private long zzdy;
        private long zzec;
        private long zzed;
        private long zzef;
        private int zzej;
        private String zzdx = "";
        private String zzdz = "";
        private String zzea = "";
        private String zzeb = "";
        private String zzee = "";
        private String zzeg = "";
        private String zzeh = "";
        private zzeha<zzb> zzei = zzbfo();

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public static final class zzb extends zzegp<zzb, C0006zza> implements zzeib {
            private static volatile zzeim<zzb> zzel;
            private static final zzb zzeo;
            private int zzdw;
            private String zzem = "";
            private String zzen = "";

            private zzb() {
            }

            /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbw$zza$zzb$zza  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0006zza extends zzegp.zzb<zzb, C0006zza> implements zzeib {
                private C0006zza() {
                    super(zzb.zzeo);
                }

                /* synthetic */ C0006zza(zzbv zzbvVar) {
                    this();
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.android.gms.internal.ads.zzegp
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzbv.zzdv[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C0006zza(null);
                    case 3:
                        return zza(zzeo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzdw", "zzem", "zzen"});
                    case 4:
                        return zzeo;
                    case 5:
                        zzeim<zzb> zzeimVar = zzel;
                        if (zzeimVar == null) {
                            synchronized (zzb.class) {
                                zzeimVar = zzel;
                                if (zzeimVar == null) {
                                    zzeimVar = new zzegp.zza<>(zzeo);
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
                zzeo = zzbVar;
                zzegp.zza(zzb.class, zzbVar);
            }
        }

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* loaded from: classes.dex */
        public enum zzc implements zzegu {
            UNKNOWN(0),
            ENABLED(1),
            DISABLED(2);
            
            private static final zzegt<zzc> zzes = new zzbx();
            private final int value;

            @Override // com.google.android.gms.internal.ads.zzegu
            public final int zzv() {
                return this.value;
            }

            public static zzc zzh(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return DISABLED;
                    }
                    return ENABLED;
                }
                return UNKNOWN;
            }

            public static zzegw zzw() {
                return zzbz.zzeu;
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

        /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbw$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0005zza extends zzegp.zzb<zza, C0005zza> implements zzeib {
            private C0005zza() {
                super(zza.zzek);
            }

            public final C0005zza zzk(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzp(str);
                return this;
            }

            public final C0005zza zzc(long j) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzd(j);
                return this;
            }

            public final C0005zza zzl(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzq(str);
                return this;
            }

            public final C0005zza zzm(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzr(str);
                return this;
            }

            public final C0005zza zzn(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzs(str);
                return this;
            }

            public final C0005zza zzo(String str) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzt(str);
                return this;
            }

            public final C0005zza zza(zzc zzcVar) {
                if (this.zzifu) {
                    zzbft();
                    this.zzifu = false;
                }
                ((zza) this.zzift).zzb(zzcVar);
                return this;
            }

            /* synthetic */ C0005zza(zzbv zzbvVar) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzp(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzdx = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzd(long j) {
            this.zzdw |= 2;
            this.zzdy = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzq(String str) {
            str.getClass();
            this.zzdw |= 4;
            this.zzdz = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzr(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzea = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzs(String str) {
            str.getClass();
            this.zzdw |= 16;
            this.zzeb = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzt(String str) {
            str.getClass();
            this.zzdw |= 1024;
            this.zzeh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzb(zzc zzcVar) {
            this.zzej = zzcVar.zzv();
            this.zzdw |= 2048;
        }

        public static C0005zza zzs() {
            return zzek.zzbfj();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.ads.zzegp
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzbv.zzdv[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0005zza(null);
                case 3:
                    return zza(zzek, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzdw", "zzdx", "zzdy", "zzdz", "zzea", "zzeb", "zzec", "zzed", "zzee", "zzef", "zzeg", "zzeh", "zzei", zzb.class, "zzej", zzc.zzw()});
                case 4:
                    return zzek;
                case 5:
                    zzeim<zza> zzeimVar = zzel;
                    if (zzeimVar == null) {
                        synchronized (zza.class) {
                            zzeimVar = zzel;
                            if (zzeimVar == null) {
                                zzeimVar = new zzegp.zza<>(zzek);
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
            zzek = zzaVar;
            zzegp.zza(zza.class, zzaVar);
        }
    }
}
