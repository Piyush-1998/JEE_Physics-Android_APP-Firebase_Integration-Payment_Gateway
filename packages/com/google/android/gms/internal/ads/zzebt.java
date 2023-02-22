package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzebt extends zzegp<zzebt, zzb> implements zzeib {
    private static volatile zzeim<zzebt> zzel;
    private static final zzebt zzhvz;
    private String zzhvw = "";
    private zzeff zzhvx = zzeff.zzibd;
    private int zzhvy;

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public enum zza implements zzegu {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final zzegt<zza> zzes = new zzebv();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzegu
        public final int zzv() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            return this.value;
        }

        public static zza zzfe(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zzv());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzebt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzegp.zzb<zzebt, zzb> implements zzeib {
        private zzb() {
            super(zzebt.zzhvz);
        }

        public final zzb zzhq(String str) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebt) this.zzift).zzhp(str);
            return this;
        }

        public final zzb zzaf(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebt) this.zzift).zzae(zzeffVar);
            return this;
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzebt) this.zzift).zza(zzaVar);
            return this;
        }

        /* synthetic */ zzb(zzebs zzebsVar) {
            this();
        }
    }

    public final String zzbay() {
        return this.zzhvw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzhp(String str) {
        str.getClass();
        this.zzhvw = str;
    }

    public final zzeff zzbaz() {
        return this.zzhvx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzae(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhvx = zzeffVar;
    }

    public final zza zzbba() {
        zza zzfe = zza.zzfe(this.zzhvy);
        return zzfe == null ? zza.UNRECOGNIZED : zzfe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        this.zzhvy = zzaVar.zzv();
    }

    public static zzb zzbbb() {
        return zzhvz.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebs.zzdv[i - 1]) {
            case 1:
                return new zzebt();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzhvz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhvw", "zzhvx", "zzhvy"});
            case 4:
                return zzhvz;
            case 5:
                zzeim<zzebt> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzebt.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhvz);
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

    public static zzebt zzbbc() {
        return zzhvz;
    }

    static {
        zzebt zzebtVar = new zzebt();
        zzhvz = zzebtVar;
        zzegp.zza(zzebt.class, zzebtVar);
    }
}
