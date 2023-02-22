package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
@Deprecated
/* loaded from: classes.dex */
public final class zzeco extends zzegp<zzeco, zza> implements zzeib {
    private static volatile zzeim<zzeco> zzel;
    private static final zzeco zzhxw;
    private String zzhxu = "";
    private zzeha<zzeca> zzhxv = zzbfo();

    private zzeco() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeco, zza> implements zzeib {
        private zza() {
            super(zzeco.zzhxw);
        }

        /* synthetic */ zza(zzecq zzecqVar) {
            this();
        }
    }

    public final List<zzeca> zzbck() {
        return this.zzhxv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecq.zzdv[i - 1]) {
            case 1:
                return new zzeco();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhxw, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzhxu", "zzhxv", zzeca.class});
            case 4:
                return zzhxw;
            case 5:
                zzeim<zzeco> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeco.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhxw);
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

    public static zzeco zzbcl() {
        return zzhxw;
    }

    static {
        zzeco zzecoVar = new zzeco();
        zzhxw = zzecoVar;
        zzegp.zza(zzeco.class, zzecoVar);
    }
}
