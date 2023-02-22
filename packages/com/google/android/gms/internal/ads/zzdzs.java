package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdzs extends zzegp<zzdzs, zza> implements zzeib {
    private static volatile zzeim<zzdzs> zzel;
    private static final zzdzs zzhtk;
    private zzdzv zzhth;
    private int zzhtj;

    private zzdzs() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzdzs, zza> implements zzeib {
        private zza() {
            super(zzdzs.zzhtk);
        }

        /* synthetic */ zza(zzdzt zzdztVar) {
            this();
        }
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public final zzdzv zzayj() {
        zzdzv zzdzvVar = this.zzhth;
        return zzdzvVar == null ? zzdzv.zzayo() : zzdzvVar;
    }

    public static zzdzs zzd(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzdzs) zzegp.zza(zzhtk, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdzt.zzdv[i - 1]) {
            case 1:
                return new zzdzs();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhtk, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhtj", "zzhth"});
            case 4:
                return zzhtk;
            case 5:
                zzeim<zzdzs> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzdzs.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhtk);
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
        zzdzs zzdzsVar = new zzdzs();
        zzhtk = zzdzsVar;
        zzegp.zza(zzdzs.class, zzdzsVar);
    }
}
