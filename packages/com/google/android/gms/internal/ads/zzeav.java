package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeav extends zzegp<zzeav, zza> implements zzeib {
    private static volatile zzeim<zzeav> zzel;
    private static final zzeav zzhun;
    private zzebw zzhum;

    private zzeav() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeav, zza> implements zzeib {
        private zza() {
            super(zzeav.zzhun);
        }

        /* synthetic */ zza(zzeax zzeaxVar) {
            this();
        }
    }

    public final zzebw zzazs() {
        zzebw zzebwVar = this.zzhum;
        return zzebwVar == null ? zzebw.zzbbe() : zzebwVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeax.zzdv[i - 1]) {
            case 1:
                return new zzeav();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhun, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzhum"});
            case 4:
                return zzhun;
            case 5:
                zzeim<zzeav> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeav.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhun);
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

    public static zzeav zzazt() {
        return zzhun;
    }

    static {
        zzeav zzeavVar = new zzeav();
        zzhun = zzeavVar;
        zzegp.zza(zzeav.class, zzeavVar);
    }
}
