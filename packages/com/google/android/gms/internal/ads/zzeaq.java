package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeaq extends zzegp<zzeaq, zza> implements zzeib {
    private static volatile zzeim<zzeaq> zzel;
    private static final zzeaq zzhue;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;

    private zzeaq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeaq, zza> implements zzeib {
        private zza() {
            super(zzeaq.zzhue);
        }

        public final zza zzex(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaq) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzx(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaq) this.zzift).zzs(zzeffVar);
            return this;
        }

        /* synthetic */ zza(zzear zzearVar) {
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

    public static zzeaq zzm(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeaq) zzegp.zza(zzhue, zzeffVar, zzegcVar);
    }

    public static zza zzazp() {
        return zzhue.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzear.zzdv[i - 1]) {
            case 1:
                return new zzeaq();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhue, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzhtf", "zzhtg"});
            case 4:
                return zzhue;
            case 5:
                zzeim<zzeaq> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeaq.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhue);
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
        zzeaq zzeaqVar = new zzeaq();
        zzhue = zzeaqVar;
        zzegp.zza(zzeaq.class, zzeaqVar);
    }
}
