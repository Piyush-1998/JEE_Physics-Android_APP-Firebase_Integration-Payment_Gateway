package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzect extends zzegp<zzect, zza> implements zzeib {
    private static volatile zzeim<zzect> zzel;
    private static final zzect zzhxy;

    private zzect() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzect, zza> implements zzeib {
        private zza() {
            super(zzect.zzhxy);
        }

        /* synthetic */ zza(zzecu zzecuVar) {
            this();
        }
    }

    public static zzect zzy(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzect) zzegp.zza(zzhxy, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecu.zzdv[i - 1]) {
            case 1:
                return new zzect();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhxy, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhxy;
            case 5:
                zzeim<zzect> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzect.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhxy);
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
        zzect zzectVar = new zzect();
        zzhxy = zzectVar;
        zzegp.zza(zzect.class, zzectVar);
    }
}
