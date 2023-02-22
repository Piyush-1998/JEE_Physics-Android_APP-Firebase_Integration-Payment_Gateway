package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzebw extends zzegp<zzebw, zza> implements zzeib {
    private static volatile zzeim<zzebw> zzel;
    private static final zzebw zzhwo;
    private String zzhvw = "";
    private zzeff zzhvx = zzeff.zzibd;
    private int zzhwn;

    private zzebw() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzebw, zza> implements zzeib {
        private zza() {
            super(zzebw.zzhwo);
        }

        /* synthetic */ zza(zzeby zzebyVar) {
            this();
        }
    }

    public final String zzbay() {
        return this.zzhvw;
    }

    public final zzeff zzbaz() {
        return this.zzhvx;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeby.zzdv[i - 1]) {
            case 1:
                return new zzebw();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhwo, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzhvw", "zzhvx", "zzhwn"});
            case 4:
                return zzhwo;
            case 5:
                zzeim<zzebw> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzebw.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhwo);
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

    public static zzebw zzbbe() {
        return zzhwo;
    }

    static {
        zzebw zzebwVar = new zzebw();
        zzhwo = zzebwVar;
        zzegp.zza(zzebw.class, zzebwVar);
    }
}
