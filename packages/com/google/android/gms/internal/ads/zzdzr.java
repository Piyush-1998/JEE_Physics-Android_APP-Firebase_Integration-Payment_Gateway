package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdzr extends zzegp<zzdzr, zza> implements zzeib {
    private static volatile zzeim<zzdzr> zzel;
    private static final zzdzr zzhti;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzdzv zzhth;

    private zzdzr() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzdzr, zza> implements zzeib {
        private zza() {
            super(zzdzr.zzhti);
        }

        public final zza zzes(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzr) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzt(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzr) this.zzift).zzs(zzeffVar);
            return this;
        }

        public final zza zzd(zzdzv zzdzvVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdzr) this.zzift).zzc(zzdzvVar);
            return this;
        }

        /* synthetic */ zza(zzdzq zzdzqVar) {
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

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhtg = zzeffVar;
    }

    public final zzdzv zzayj() {
        zzdzv zzdzvVar = this.zzhth;
        return zzdzvVar == null ? zzdzv.zzayo() : zzdzvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(zzdzv zzdzvVar) {
        zzdzvVar.getClass();
        this.zzhth = zzdzvVar;
    }

    public static zzdzr zzc(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzdzr) zzegp.zza(zzhti, zzeffVar, zzegcVar);
    }

    public static zza zzayk() {
        return zzhti.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzq.zzdv[i - 1]) {
            case 1:
                return new zzdzr();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhti, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzhtf", "zzhtg", "zzhth"});
            case 4:
                return zzhti;
            case 5:
                zzeim<zzdzr> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzdzr.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhti);
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
        zzdzr zzdzrVar = new zzdzr();
        zzhti = zzdzrVar;
        zzegp.zza(zzdzr.class, zzdzrVar);
    }
}
