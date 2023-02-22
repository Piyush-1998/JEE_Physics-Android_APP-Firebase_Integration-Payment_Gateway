package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeam extends zzegp<zzeam, zza> implements zzeib {
    private static volatile zzeim<zzeam> zzel;
    private static final zzeam zzhuc;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;

    private zzeam() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeam, zza> implements zzeib {
        private zza() {
            super(zzeam.zzhuc);
        }

        public final zza zzew(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeam) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzw(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeam) this.zzift).zzs(zzeffVar);
            return this;
        }

        /* synthetic */ zza(zzean zzeanVar) {
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

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhtg = zzeffVar;
    }

    public static zzeam zzk(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeam) zzegp.zza(zzhuc, zzeffVar, zzegcVar);
    }

    public static zza zzazm() {
        return zzhuc.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzean.zzdv[i - 1]) {
            case 1:
                return new zzeam();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhuc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhtf", "zzhtg"});
            case 4:
                return zzhuc;
            case 5:
                zzeim<zzeam> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeam.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhuc);
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
        zzeam zzeamVar = new zzeam();
        zzhuc = zzeamVar;
        zzegp.zza(zzeam.class, zzeamVar);
    }
}
