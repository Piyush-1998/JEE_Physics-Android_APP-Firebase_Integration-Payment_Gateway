package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzead extends zzegp<zzead, zza> implements zzeib {
    private static volatile zzeim<zzead> zzel;
    private static final zzead zzhtv;
    private int zzhtj;
    private zzeae zzhtt;

    private zzead() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzead, zza> implements zzeib {
        private zza() {
            super(zzead.zzhtv);
        }

        /* synthetic */ zza(zzeac zzeacVar) {
            this();
        }
    }

    public final zzeae zzayx() {
        zzeae zzeaeVar = this.zzhtt;
        return zzeaeVar == null ? zzeae.zzaze() : zzeaeVar;
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public static zzead zzh(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzead) zzegp.zza(zzhtv, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeac.zzdv[i - 1]) {
            case 1:
                return new zzead();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhtv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhtt", "zzhtj"});
            case 4:
                return zzhtv;
            case 5:
                zzeim<zzead> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzead.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhtv);
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

    public static zzead zzazb() {
        return zzhtv;
    }

    static {
        zzead zzeadVar = new zzead();
        zzhtv = zzeadVar;
        zzegp.zza(zzead.class, zzeadVar);
    }
}
