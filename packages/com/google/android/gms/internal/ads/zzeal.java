package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeal extends zzegp<zzeal, zza> implements zzeib {
    private static volatile zzeim<zzeal> zzel;
    private static final zzeal zzhub;
    private int zzhtw;

    private zzeal() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeal, zza> implements zzeib {
        private zza() {
            super(zzeal.zzhub);
        }

        /* synthetic */ zza(zzeak zzeakVar) {
            this();
        }
    }

    public final int zzazd() {
        return this.zzhtw;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeak.zzdv[i - 1]) {
            case 1:
                return new zzeal();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhub, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhtw"});
            case 4:
                return zzhub;
            case 5:
                zzeim<zzeal> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeal.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhub);
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

    public static zzeal zzazk() {
        return zzhub;
    }

    static {
        zzeal zzealVar = new zzeal();
        zzhub = zzealVar;
        zzegp.zza(zzeal.class, zzealVar);
    }
}
