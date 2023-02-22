package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeat extends zzegp<zzeat, zza> implements zzeib {
    private static volatile zzeim<zzeat> zzel;
    private static final zzeat zzhuf;

    private zzeat() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeat, zza> implements zzeib {
        private zza() {
            super(zzeat.zzhuf);
        }

        /* synthetic */ zza(zzeas zzeasVar) {
            this();
        }
    }

    public static zzeat zzn(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeat) zzegp.zza(zzhuf, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeas.zzdv[i - 1]) {
            case 1:
                return new zzeat();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhuf, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzhuf;
            case 5:
                zzeim<zzeat> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeat.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhuf);
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
        zzeat zzeatVar = new zzeat();
        zzhuf = zzeatVar;
        zzegp.zza(zzeat.class, zzeatVar);
    }
}
