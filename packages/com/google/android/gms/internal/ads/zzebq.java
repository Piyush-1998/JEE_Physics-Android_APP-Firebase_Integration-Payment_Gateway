package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzebq extends zzegp<zzebq, zza> implements zzeib {
    private static volatile zzeim<zzebq> zzel;
    private static final zzebq zzhvv;
    private int zzhtl;
    private int zzhvu;

    private zzebq() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzebq, zza> implements zzeib {
        private zza() {
            super(zzebq.zzhvv);
        }

        /* synthetic */ zza(zzebr zzebrVar) {
            this();
        }
    }

    public final zzebj zzbav() {
        zzebj zzfc = zzebj.zzfc(this.zzhvu);
        return zzfc == null ? zzebj.UNRECOGNIZED : zzfc;
    }

    public final int zzayn() {
        return this.zzhtl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebr.zzdv[i - 1]) {
            case 1:
                return new zzebq();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhvv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzhvu", "zzhtl"});
            case 4:
                return zzhvv;
            case 5:
                zzeim<zzebq> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzebq.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhvv);
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

    public static zzebq zzbaw() {
        return zzhvv;
    }

    static {
        zzebq zzebqVar = new zzebq();
        zzhvv = zzebqVar;
        zzegp.zza(zzebq.class, zzebqVar);
    }
}
