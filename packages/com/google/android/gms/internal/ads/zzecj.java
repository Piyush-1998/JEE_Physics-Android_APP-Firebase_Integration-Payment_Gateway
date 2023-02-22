package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzecj extends zzegp<zzecj, zza> implements zzeib {
    private static volatile zzeim<zzecj> zzel;
    private static final zzecj zzhxj;
    private int zzhtf;
    private zzecm zzhxi;

    private zzecj() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzecj, zza> implements zzeib {
        private zza() {
            super(zzecj.zzhxj);
        }

        public final zza zzfl(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecj) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzb(zzecm zzecmVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecj) this.zzift).zza(zzecmVar);
            return this;
        }

        /* synthetic */ zza(zzeck zzeckVar) {
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

    public final zzecm zzbcd() {
        zzecm zzecmVar = this.zzhxi;
        return zzecmVar == null ? zzecm.zzbci() : zzecmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzecm zzecmVar) {
        zzecmVar.getClass();
        this.zzhxi = zzecmVar;
    }

    public static zzecj zzv(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzecj) zzegp.zza(zzhxj, zzeffVar, zzegcVar);
    }

    public static zza zzbce() {
        return zzhxj.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeck.zzdv[i - 1]) {
            case 1:
                return new zzecj();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhxj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhtf", "zzhxi"});
            case 4:
                return zzhxj;
            case 5:
                zzeim<zzecj> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzecj.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhxj);
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
        zzecj zzecjVar = new zzecj();
        zzhxj = zzecjVar;
        zzegp.zza(zzecj.class, zzecjVar);
    }
}
