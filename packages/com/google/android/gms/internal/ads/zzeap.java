package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeap extends zzegp<zzeap, zza> implements zzeib {
    private static volatile zzeim<zzeap> zzel;
    private static final zzeap zzhud;
    private int zzhtf;
    private int zzhtj;

    private zzeap() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeap, zza> implements zzeib {
        private zza() {
            super(zzeap.zzhud);
        }

        /* synthetic */ zza(zzeao zzeaoVar) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public static zzeap zzl(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeap) zzegp.zza(zzhud, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeao.zzdv[i - 1]) {
            case 1:
                return new zzeap();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhud, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzhtj", "zzhtf"});
            case 4:
                return zzhud;
            case 5:
                zzeim<zzeap> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeap.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhud);
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
        zzeap zzeapVar = new zzeap();
        zzhud = zzeapVar;
        zzegp.zza(zzeap.class, zzeapVar);
    }
}
