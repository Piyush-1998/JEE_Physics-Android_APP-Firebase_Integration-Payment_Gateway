package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeae extends zzegp<zzeae, zza> implements zzeib {
    private static volatile zzeim<zzeae> zzel;
    private static final zzeae zzhtx;
    private int zzhtw;

    private zzeae() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeae, zza> implements zzeib {
        private zza() {
            super(zzeae.zzhtx);
        }

        /* synthetic */ zza(zzeaf zzeafVar) {
            this();
        }
    }

    public final int zzazd() {
        return this.zzhtw;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeaf.zzdv[i - 1]) {
            case 1:
                return new zzeae();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhtx, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhtw"});
            case 4:
                return zzhtx;
            case 5:
                zzeim<zzeae> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeae.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhtx);
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

    public static zzeae zzaze() {
        return zzhtx;
    }

    static {
        zzeae zzeaeVar = new zzeae();
        zzhtx = zzeaeVar;
        zzegp.zza(zzeae.class, zzeaeVar);
    }
}
