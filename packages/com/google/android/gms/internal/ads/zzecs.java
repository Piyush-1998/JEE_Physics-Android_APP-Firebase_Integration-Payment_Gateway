package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzecs extends zzegp<zzecs, zza> implements zzeib {
    private static volatile zzeim<zzecs> zzel;
    private static final zzecs zzhxx;
    private int zzhtf;
    private zzeff zzhtg = zzeff.zzibd;

    private zzecs() {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zza extends zzegp.zzb<zzecs, zza> implements zzeib {
        private zza() {
            super(zzecs.zzhxx);
        }

        public final zza zzfn(int i) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecs) this.zzift).setVersion(0);
            return this;
        }

        public final zza zzag(zzeff zzeffVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzecs) this.zzift).zzs(zzeffVar);
            return this;
        }

        /* synthetic */ zza(zzecr zzecrVar) {
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

    public static zzecs zzx(zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (zzecs) zzegp.zza(zzhxx, zzeffVar, zzegcVar);
    }

    public static zza zzbcn() {
        return zzhxx.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzecr.zzdv[i - 1]) {
            case 1:
                return new zzecs();
            case 2:
                return new zza(null);
            case 3:
                return zza(zzhxx, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzhtf", "zzhtg"});
            case 4:
                return zzhxx;
            case 5:
                zzeim<zzecs> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzecs.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhxx);
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
        zzecs zzecsVar = new zzecs();
        zzhxx = zzecsVar;
        zzegp.zza(zzecs.class, zzecsVar);
    }
}
