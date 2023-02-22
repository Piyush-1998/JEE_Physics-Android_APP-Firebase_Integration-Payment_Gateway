package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeci extends zzegp<zzeci, zza> implements zzeib {
    private static volatile zzeim<zzeci> zzel;
    private static final zzeci zzhxh;
    private String zzhxg = "";

    private zzeci() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeci, zza> implements zzeib {
        private zza() {
            super(zzeci.zzhxh);
        }

        /* synthetic */ zza(zzech zzechVar) {
            this();
        }
    }

    public final String zzbca() {
        return this.zzhxg;
    }

    public static zzeci zzu(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeci) zzegp.zza(zzhxh, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzech.zzdv[i - 1]) {
            case 1:
                return new zzeci();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhxh, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzhxg"});
            case 4:
                return zzhxh;
            case 5:
                zzeim<zzeci> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeci.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhxh);
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

    public static zzeci zzbcb() {
        return zzhxh;
    }

    static {
        zzeci zzeciVar = new zzeci();
        zzhxh = zzeciVar;
        zzegp.zza(zzeci.class, zzeciVar);
    }
}
