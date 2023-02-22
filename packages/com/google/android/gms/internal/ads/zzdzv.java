package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdzv extends zzegp<zzdzv, zza> implements zzeib {
    private static volatile zzeim<zzdzv> zzel;
    private static final zzdzv zzhtm;
    private int zzhtl;

    private zzdzv() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzdzv, zza> implements zzeib {
        private zza() {
            super(zzdzv.zzhtm);
        }

        /* synthetic */ zza(zzdzu zzdzuVar) {
            this();
        }
    }

    public final int zzayn() {
        return this.zzhtl;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzu.zzdv[i - 1]) {
            case 1:
                return new zzdzv();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhtm, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzhtl"});
            case 4:
                return zzhtm;
            case 5:
                zzeim<zzdzv> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzdzv.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhtm);
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

    public static zzdzv zzayo() {
        return zzhtm;
    }

    static {
        zzdzv zzdzvVar = new zzdzv();
        zzhtm = zzdzvVar;
        zzegp.zza(zzdzv.class, zzdzvVar);
    }
}
