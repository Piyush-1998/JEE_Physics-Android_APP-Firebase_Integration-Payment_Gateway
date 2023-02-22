package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzgq extends zzegp<zzgq, zza> implements zzeib {
    private static final zzgq zzacb;
    private static volatile zzeim<zzgq> zzel;
    private zzgr zzaby;
    private zzeff zzabz = zzeff.zzibd;
    private zzeff zzaca = zzeff.zzibd;
    private int zzdw;

    private zzgq() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzgq, zza> implements zzeib {
        private zza() {
            super(zzgq.zzacb);
        }

        /* synthetic */ zza(zzgp zzgpVar) {
            this();
        }
    }

    public final zzgr zzdc() {
        zzgr zzgrVar = this.zzaby;
        return zzgrVar == null ? zzgr.zzdm() : zzgrVar;
    }

    public final zzeff zzdd() {
        return this.zzabz;
    }

    public final zzeff zzde() {
        return this.zzaca;
    }

    public static zzgq zza(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzgq) zzegp.zza(zzacb, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzgp.zzdv[i - 1]) {
            case 1:
                return new zzgq();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzacb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzdw", "zzaby", "zzabz", "zzaca"});
            case 4:
                return zzacb;
            case 5:
                zzeim<zzgq> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzgq.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzacb);
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
        zzgq zzgqVar = new zzgq();
        zzacb = zzgqVar;
        zzegp.zza(zzgq.class, zzgqVar);
    }
}
