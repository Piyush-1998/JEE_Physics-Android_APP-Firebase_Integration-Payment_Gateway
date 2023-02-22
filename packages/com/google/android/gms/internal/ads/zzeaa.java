package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzeaa extends zzegp<zzeaa, zza> implements zzeib {
    private static volatile zzeim<zzeaa> zzel;
    private static final zzeaa zzhtu;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;
    private zzeae zzhtt;

    private zzeaa() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzeaa, zza> implements zzeib {
        private zza() {
            super(zzeaa.zzhtu);
        }

        public final zza zzeu(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaa) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzc(zzeae zzeaeVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaa) this.zzift).zzb(zzeaeVar);
            return this;
        }

        public final zza zzu(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzeaa) this.zzift).zzs(zzeffVar);
            return this;
        }

        /* synthetic */ zza(zzeab zzeabVar) {
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

    public final zzeae zzayx() {
        zzeae zzeaeVar = this.zzhtt;
        return zzeaeVar == null ? zzeae.zzaze() : zzeaeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzeae zzeaeVar) {
        zzeaeVar.getClass();
        this.zzhtt = zzeaeVar;
    }

    public final zzeff zzayi() {
        return this.zzhtg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs(zzeff zzeffVar) {
        zzeffVar.getClass();
        this.zzhtg = zzeffVar;
    }

    public static zzeaa zzg(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzeaa) zzegp.zza(zzhtu, zzeffVar, zzegcVar);
    }

    public static zza zzayy() {
        return zzhtu.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzeab.zzdv[i - 1]) {
            case 1:
                return new zzeaa();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhtu, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhtf", "zzhtt", "zzhtg"});
            case 4:
                return zzhtu;
            case 5:
                zzeim<zzeaa> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzeaa.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhtu);
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

    public static zzeaa zzayz() {
        return zzhtu;
    }

    static {
        zzeaa zzeaaVar = new zzeaa();
        zzhtu = zzeaaVar;
        zzegp.zza(zzeaa.class, zzeaaVar);
    }
}
