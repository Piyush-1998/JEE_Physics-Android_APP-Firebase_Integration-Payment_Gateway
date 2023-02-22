package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdqt;
import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdra extends zzegp<zzdra, zzb> implements zzeib {
    private static volatile zzeim<zzdra> zzel;
    private static final zzdra zzhkb;
    private int zzdw;
    private int zzhjy;
    private zzdqt zzhka;
    private String zzdx = "";
    private String zzhjz = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public enum zza implements zzegu {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        
        private static final zzegt<zza> zzes = new zzdrc();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzegu
        public final int zzv() {
            return this.value;
        }

        public static zza zzeh(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return BLOCKED_IMPRESSION;
            }
            return EVENT_TYPE_UNKNOWN;
        }

        public static zzegw zzw() {
            return zzdrb.zzeu;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzdra() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzegp.zzb<zzdra, zzb> implements zzeib {
        private zzb() {
            super(zzdra.zzhkb);
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdra) this.zzift).zza(zzaVar);
            return this;
        }

        public final zzb zzhf(String str) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdra) this.zzift).zzp(str);
            return this;
        }

        public final zzb zza(zzdqt.zzb zzbVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdra) this.zzift).zza((zzdqt) ((zzegp) zzbVar.zzbfx()));
            return this;
        }

        /* synthetic */ zzb(zzdqz zzdqzVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        this.zzhjy = zzaVar.zzv();
        this.zzdw |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzdx = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdqt zzdqtVar) {
        zzdqtVar.getClass();
        this.zzhka = zzdqtVar;
        this.zzdw |= 8;
    }

    public static zzb zzavo() {
        return zzhkb.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdqz.zzdv[i - 1]) {
            case 1:
                return new zzdra();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzhkb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzhjy", zza.zzw(), "zzdx", "zzhjz", "zzhka"});
            case 4:
                return zzhkb;
            case 5:
                zzeim<zzdra> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzdra.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhkb);
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
        zzdra zzdraVar = new zzdra();
        zzhkb = zzdraVar;
        zzegp.zza(zzdra.class, zzdraVar);
    }
}
