package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;

/* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdqt extends zzegp<zzdqt, zzb> implements zzeib {
    private static volatile zzeim<zzdqt> zzel;
    private static final zzegy<Integer, zza> zzhjq = new zzdqw();
    private static final zzdqt zzhju;
    private int zzdw;
    private zzegv zzhjp = zzbfm();
    private String zzhjr = "";
    private String zzhjs = "";
    private String zzhjt = "";

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public enum zza implements zzegu {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        
        private static final zzegt<zza> zzes = new zzdqx();
        private final int value;

        @Override // com.google.android.gms.internal.ads.zzegu
        public final int zzv() {
            return this.value;
        }

        public static zza zzeg(int i) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return BLOCKED_REASON_BACKGROUND;
            }
            return BLOCKED_REASON_UNKNOWN;
        }

        public static zzegw zzw() {
            return zzdqy.zzeu;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + '>';
        }

        zza(int i) {
            this.value = i;
        }
    }

    private zzdqt() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class zzb extends zzegp.zzb<zzdqt, zzb> implements zzeib {
        private zzb() {
            super(zzdqt.zzhju);
        }

        public final zzb zzb(zza zzaVar) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdqt) this.zzift).zza(zzaVar);
            return this;
        }

        public final zzb zzhe(String str) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            ((zzdqt) this.zzift).zzhd(str);
            return this;
        }

        /* synthetic */ zzb(zzdqw zzdqwVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zza zzaVar) {
        zzaVar.getClass();
        zzegv zzegvVar = this.zzhjp;
        if (!zzegvVar.zzbdf()) {
            this.zzhjp = zzegp.zza(zzegvVar);
        }
        this.zzhjp.zzhc(zzaVar.zzv());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzhd(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzhjr = str;
    }

    public static zzb zzavm() {
        return zzhju.zzbfj();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzegp
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzdqv.zzdv[i - 1]) {
            case 1:
                return new zzdqt();
            case 2:
                return new zzb(null);
            case 3:
                return zza(zzhju, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzdw", "zzhjp", zza.zzw(), "zzhjr", "zzhjs", "zzhjt"});
            case 4:
                return zzhju;
            case 5:
                zzeim<zzdqt> zzeimVar = zzel;
                if (zzeimVar == null) {
                    synchronized (zzdqt.class) {
                        zzeimVar = zzel;
                        if (zzeimVar == null) {
                            zzeimVar = new zzegp.zza<>(zzhju);
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
        zzdqt zzdqtVar = new zzdqt();
        zzhju = zzdqtVar;
        zzegp.zza(zzdqt.class, zzdqtVar);
    }
}
