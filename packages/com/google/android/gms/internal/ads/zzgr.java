package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzgr extends zzegp<zzgr, zza> implements zzeib {
    private static final zzgr zzach;
    private static volatile zzeim<zzgr> zzel;
    private String zzacc = "";
    private String zzacd = "";
    private long zzace;
    private long zzacf;
    private long zzacg;
    private int zzdw;

    private zzgr() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzgr, zza> implements zzeib {
        private zza() {
            super(zzgr.zzach);
        }

        public final zza zzaw(String str) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzgr) this.zzift).zzau(str);
            return this;
        }

        public final zza zzax(String str) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzgr) this.zzift).zzav(str);
            return this;
        }

        public final zza zzdj(long j) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzgr) this.zzift).zzdg(j);
            return this;
        }

        public final zza zzdk(long j) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzgr) this.zzift).zzdh(j);
            return this;
        }

        public final zza zzdl(long j) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzgr) this.zzift).zzdi(j);
            return this;
        }

        /* synthetic */ zza(zzgs zzgsVar) {
            this();
        }
    }

    public final String zzdg() {
        return this.zzacc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzau(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzacc = str;
    }

    public final String zzdh() {
        return this.zzacd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzav(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzacd = str;
    }

    public final long zzdi() {
        return this.zzace;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdg(long j) {
        this.zzdw |= 4;
        this.zzace = j;
    }

    public final long zzdj() {
        return this.zzacf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdh(long j) {
        this.zzdw |= 8;
        this.zzacf = j;
    }

    public final long zzdk() {
        return this.zzacg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzdi(long j) {
        this.zzdw |= 16;
        this.zzacg = j;
    }

    public static zzgr zzl(zzeff zzeffVar) throws zzegz {
        return (zzgr) zzegp.zza(zzach, zzeffVar);
    }

    public static zzgr zzb(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzgr) zzegp.zza(zzach, zzeffVar, zzegcVar);
    }

    public static zza zzdl() {
        return zzach.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzgs.zzdv[i - 1]) {
            case 1:
                return new zzgr();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzach, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzdw", "zzacc", "zzacd", "zzace", "zzacf", "zzacg"});
            case 4:
                return zzach;
            case 5:
                zzeim<zzgr> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzgr.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzach);
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

    public static zzgr zzdm() {
        return zzach;
    }

    static {
        zzgr zzgrVar = new zzgr();
        zzach = zzgrVar;
        zzegp.zza(zzgr.class, zzgrVar);
    }
}
