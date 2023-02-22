package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzecf extends zzegp<zzecf, zza> implements zzeib {
    private static volatile zzeim<zzecf> zzel;
    private static final zzecf zzhxf;
    private int zzhtf;
    private zzeci zzhxe;

    private zzecf() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzecf, zza> implements zzeib {
        private zza() {
            super(zzecf.zzhxf);
        }

        public final zza zzfk(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecf) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzb(zzeci zzeciVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecf) this.zzift).zza(zzeciVar);
            return this;
        }

        /* synthetic */ zza(zzecg zzecgVar) {
            this();
        }
    }

    public final int getVersion() {
        return this.zzhtf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzhtf = i;
    }

    public final zzeci zzbbx() {
        zzeci zzeciVar = this.zzhxe;
        return zzeciVar == null ? zzeci.zzbcb() : zzeciVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzeci zzeciVar) {
        zzeciVar.getClass();
        this.zzhxe = zzeciVar;
    }

    public static zzecf zzt(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzecf) zzegp.zza(zzhxf, zzeffVar, zzegcVar);
    }

    public static zza zzbby() {
        return zzhxf.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecg.zzdv[i - 1]) {
            case 1:
                return new zzecf();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhxf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzhtf", "zzhxe"});
            case 4:
                return zzhxf;
            case 5:
                zzeim<zzecf> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzecf.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhxf);
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
        zzecf zzecfVar = new zzecf();
        zzhxf = zzecfVar;
        zzegp.zza(zzecf.class, zzecfVar);
    }
}
