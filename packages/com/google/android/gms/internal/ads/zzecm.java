package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzecm extends zzegp<zzecm, zza> implements zzeib {
    private static volatile zzeim<zzecm> zzel;
    private static final zzecm zzhxm;
    private String zzhxk = "";
    private zzebw zzhxl;

    private zzecm() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzecm, zza> implements zzeib {
        private zza() {
            super(zzecm.zzhxm);
        }

        /* synthetic */ zza(zzecl zzeclVar) {
            this();
        }
    }

    public final String zzbcg() {
        return this.zzhxk;
    }

    public final zzebw zzbch() {
        zzebw zzebwVar = this.zzhxl;
        return zzebwVar == null ? zzebw.zzbbe() : zzebwVar;
    }

    public static zzecm zzw(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzecm) zzegp.zza(zzhxm, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecl.zzdv[i - 1]) {
            case 1:
                return new zzecm();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhxm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzhxk", "zzhxl"});
            case 4:
                return zzhxm;
            case 5:
                zzeim<zzecm> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzecm.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhxm);
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

    public static zzecm zzbci() {
        return zzhxm;
    }

    static {
        zzecm zzecmVar = new zzecm();
        zzhxm = zzecmVar;
        zzegp.zza(zzecm.class, zzecmVar);
    }
}
