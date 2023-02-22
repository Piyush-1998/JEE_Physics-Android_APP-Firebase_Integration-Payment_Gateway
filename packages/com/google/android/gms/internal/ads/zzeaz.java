package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeaz extends zzegp<zzeaz, zza> implements zzeib {
    private static volatile zzeim<zzeaz> zzel;
    private static final zzeaz zzhup;
    private zzeba zzhuo;

    private zzeaz() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeaz, zza> implements zzeib {
        private zza() {
            super(zzeaz.zzhup);
        }

        /* synthetic */ zza(zzeay zzeayVar) {
            this();
        }
    }

    public final zzeba zzazv() {
        zzeba zzebaVar = this.zzhuo;
        return zzebaVar == null ? zzeba.zzbaa() : zzebaVar;
    }

    public static zzeaz zzo(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeaz) zzegp.zza(zzhup, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeay.zzdv[i - 1]) {
            case 1:
                return new zzeaz();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhup, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzhuo"});
            case 4:
                return zzhup;
            case 5:
                zzeim<zzeaz> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeaz.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhup);
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
        zzeaz zzeazVar = new zzeaz();
        zzhup = zzeazVar;
        zzegp.zza(zzeaz.class, zzeazVar);
    }
}
