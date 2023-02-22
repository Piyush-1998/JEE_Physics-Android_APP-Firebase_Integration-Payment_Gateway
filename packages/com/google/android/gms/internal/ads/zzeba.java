package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeba extends zzegp<zzeba, zza> implements zzeib {
    private static volatile zzeim<zzeba> zzel;
    private static final zzeba zzhut;
    private zzebh zzhuq;
    private zzeav zzhur;
    private int zzhus;

    private zzeba() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeba, zza> implements zzeib {
        private zza() {
            super(zzeba.zzhut);
        }

        /* synthetic */ zza(zzebb zzebbVar) {
            this();
        }
    }

    public final zzebh zzazx() {
        zzebh zzebhVar = this.zzhuq;
        return zzebhVar == null ? zzebh.zzban() : zzebhVar;
    }

    public final zzeav zzazy() {
        zzeav zzeavVar = this.zzhur;
        return zzeavVar == null ? zzeav.zzazt() : zzeavVar;
    }

    public final zzeau zzazz() {
        zzeau zzey = zzeau.zzey(this.zzhus);
        return zzey == null ? zzeau.UNRECOGNIZED : zzey;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzebb.zzdv[i - 1]) {
            case 1:
                return new zzeba();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhut, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzhuq", "zzhur", "zzhus"});
            case 4:
                return zzhut;
            case 5:
                zzeim<zzeba> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeba.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhut);
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

    public static zzeba zzbaa() {
        return zzhut;
    }

    static {
        zzeba zzebaVar = new zzeba();
        zzhut = zzebaVar;
        zzegp.zza(zzeba.class, zzebaVar);
    }
}
