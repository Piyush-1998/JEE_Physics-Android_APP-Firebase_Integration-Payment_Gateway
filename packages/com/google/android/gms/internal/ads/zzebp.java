package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzebp extends zzegp<zzebp, zza> implements zzeib {
    private static volatile zzeim<zzebp> zzel;
    private static final zzebp zzhvt;
    private int zzhtf;
    private int zzhtj;
    private zzebq zzhvr;

    private zzebp() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzebp, zza> implements zzeib {
        private zza() {
            super(zzebp.zzhvt);
        }

        /* synthetic */ zza(zzebo zzeboVar) {
            this();
        }
    }

    public final zzebq zzbap() {
        zzebq zzebqVar = this.zzhvr;
        return zzebqVar == null ? zzebq.zzbaw() : zzebqVar;
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public static zzebp zzs(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzebp) zzegp.zza(zzhvt, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebo.zzdv[i - 1]) {
            case 1:
                return new zzebp();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhvt, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzhvr", "zzhtj", "zzhtf"});
            case 4:
                return zzhvt;
            case 5:
                zzeim<zzebp> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzebp.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhvt);
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

    public static zzebp zzbat() {
        return zzhvt;
    }

    static {
        zzebp zzebpVar = new zzebp();
        zzhvt = zzebpVar;
        zzegp.zza(zzebp.class, zzebpVar);
    }
}
