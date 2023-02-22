package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeai extends zzegp<zzeai, zza> implements zzeib {
    private static volatile zzeim<zzeai> zzel;
    private static final zzeai zzhua;
    private int zzhtj;
    private zzeal zzhty;

    private zzeai() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeai, zza> implements zzeib {
        private zza() {
            super(zzeai.zzhua);
        }

        /* synthetic */ zza(zzeaj zzeajVar) {
            this();
        }
    }

    public final zzeal zzazg() {
        zzeal zzealVar = this.zzhty;
        return zzealVar == null ? zzeal.zzazk() : zzealVar;
    }

    public final int getKeySize() {
        return this.zzhtj;
    }

    public static zzeai zzj(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeai) zzegp.zza(zzhua, zzeffVar, zzegcVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeaj.zzdv[i - 1]) {
            case 1:
                return new zzeai();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhua, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzhty", "zzhtj"});
            case 4:
                return zzhua;
            case 5:
                zzeim<zzeai> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeai.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhua);
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
        zzeai zzeaiVar = new zzeai();
        zzhua = zzeaiVar;
        zzegp.zza(zzeai.class, zzeaiVar);
    }
}
