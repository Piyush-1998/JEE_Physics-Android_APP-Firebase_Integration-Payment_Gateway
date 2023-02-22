package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdzz extends zzegp<zzdzz, zza> implements zzeib {
    private static volatile zzeim<zzdzz> zzel;
    private static final zzdzz zzhts;
    private zzead zzhtq;
    private zzebp zzhtr;

    private zzdzz() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzdzz, zza> implements zzeib {
        private zza() {
            super(zzdzz.zzhts);
        }

        /* synthetic */ zza(zzdzy zzdzyVar) {
            this();
        }
    }

    public final zzead zzayu() {
        zzead zzeadVar = this.zzhtq;
        return zzeadVar == null ? zzead.zzazb() : zzeadVar;
    }

    public final zzebp zzayv() {
        zzebp zzebpVar = this.zzhtr;
        return zzebpVar == null ? zzebp.zzbat() : zzebpVar;
    }

    public static zzdzz zzf(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzdzz) zzegp.zza(zzhts, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzy.zzdv[i - 1]) {
            case 1:
                return new zzdzz();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhts, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzhtq", "zzhtr"});
            case 4:
                return zzhts;
            case 5:
                zzeim<zzdzz> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzdzz.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhts);
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
        zzdzz zzdzzVar = new zzdzz();
        zzhts = zzdzzVar;
        zzegp.zza(zzdzz.class, zzdzzVar);
    }
}
