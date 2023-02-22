package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzejt {
    private static final boolean zzicg;
    private static final zzd zzikn;
    private static final boolean zziko;
    private static final long zzikp;
    private static final long zzikq;
    private static final long zzikr;
    private static final long zziks;
    private static final long zzikt;
    private static final long zziku;
    private static final long zzikv;
    private static final long zzikw;
    private static final long zzikx;
    private static final long zziky;
    private static final long zzikz;
    private static final long zzila;
    private static final long zzilb;
    private static final long zzilc;
    private static final int zzild;
    static final boolean zzile;
    private static final Logger logger = Logger.getLogger(zzejt.class.getName());
    private static final Unsafe zzhop = zzbie();
    private static final Class<?> zziau = zzeey.zzbde();
    private static final boolean zzikl = zzm(Long.TYPE);
    private static final boolean zzikm = zzm(Integer.TYPE);

    private zzejt() {
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final byte zzy(Object obj, long j) {
            if (zzejt.zzile) {
                return zzejt.zzq(obj, j);
            }
            return zzejt.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzejt.zzile) {
                zzejt.zza(obj, j, b);
            } else {
                zzejt.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final boolean zzm(Object obj, long j) {
            if (zzejt.zzile) {
                return zzejt.zzs(obj, j);
            }
            return zzejt.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzejt.zzile) {
                zzejt.zzb(obj, j, z);
            } else {
                zzejt.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final byte zzy(Object obj, long j) {
            return this.zzilh.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zze(Object obj, long j, byte b) {
            this.zzilh.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final boolean zzm(Object obj, long j) {
            return this.zzilh.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, boolean z) {
            this.zzilh.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final float zzn(Object obj, long j) {
            return this.zzilh.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, float f) {
            this.zzilh.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final double zzo(Object obj, long j) {
            return this.zzilh.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, double d) {
            this.zzilh.putDouble(obj, j, d);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final byte zzy(Object obj, long j) {
            if (zzejt.zzile) {
                return zzejt.zzq(obj, j);
            }
            return zzejt.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzejt.zzile) {
                zzejt.zza(obj, j, b);
            } else {
                zzejt.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final boolean zzm(Object obj, long j) {
            if (zzejt.zzile) {
                return zzejt.zzs(obj, j);
            }
            return zzejt.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzejt.zzile) {
                zzejt.zzb(obj, j, z);
            } else {
                zzejt.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzejt.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbic() {
        return zzicg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static abstract class zzd {
        Unsafe zzilh;

        zzd(Unsafe unsafe) {
            this.zzilh = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzilh.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzilh.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzilh.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzilh.putLong(obj, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzbid() {
        return zziko;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zzj(Class<T> cls) {
        try {
            return (T) zzhop.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzk(Class<?> cls) {
        if (zzicg) {
            return zzikn.zzilh.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzl(Class<?> cls) {
        if (zzicg) {
            return zzikn.zzilh.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(Object obj, long j) {
        return zzikn.zzk(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(Object obj, long j, int i) {
        zzikn.zzb(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzl(Object obj, long j) {
        return zzikn.zzl(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, long j2) {
        zzikn.zza(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzm(Object obj, long j) {
        return zzikn.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, boolean z) {
        zzikn.zza(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzn(Object obj, long j) {
        return zzikn.zzn(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, float f) {
        zzikn.zza(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzo(Object obj, long j) {
        return zzikn.zzo(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, double d) {
        zzikn.zza(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Object obj, long j) {
        return zzikn.zzilh.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, Object obj2) {
        zzikn.zzilh.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(byte[] bArr, long j) {
        return zzikn.zzy(bArr, zzikp + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j, byte b) {
        zzikn.zze(bArr, zzikp + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzbie() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzejv());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzbif() {
        Unsafe unsafe = zzhop;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (zzeey.zzbdd()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzbig() {
        Unsafe unsafe = zzhop;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzbih() == null) {
                return false;
            }
            if (zzeey.zzbdd()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzm(Class<?> cls) {
        if (zzeey.zzbdd()) {
            try {
                Class<?> cls2 = zziau;
                cls2.getMethod("peekLong", cls, Boolean.TYPE);
                cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
                cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
                cls2.getMethod("peekInt", cls, Boolean.TYPE);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    private static Field zzbih() {
        Field zzb2;
        if (!zzeey.zzbdd() || (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) == null) {
            Field zzb3 = zzb(Buffer.class, "address");
            if (zzb3 == null || zzb3.getType() != Long.TYPE) {
                return null;
            }
            return zzb3;
        }
        return zzb2;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static {
        zzd zzdVar;
        zzd zzdVar2 = null;
        if (zzhop != null) {
            if (zzeey.zzbdd()) {
                if (zzikl) {
                    zzdVar2 = new zzc(zzhop);
                } else if (zzikm) {
                    zzdVar2 = new zza(zzhop);
                }
            } else {
                zzdVar2 = new zzb(zzhop);
            }
        }
        zzikn = zzdVar2;
        zziko = zzbig();
        zzicg = zzbif();
        zzikp = zzk(byte[].class);
        zzikq = zzk(boolean[].class);
        zzikr = zzl(boolean[].class);
        zziks = zzk(int[].class);
        zzikt = zzl(int[].class);
        zziku = zzk(long[].class);
        zzikv = zzl(long[].class);
        zzikw = zzk(float[].class);
        zzikx = zzl(float[].class);
        zziky = zzk(double[].class);
        zzikz = zzl(double[].class);
        zzila = zzk(Object[].class);
        zzilb = zzl(Object[].class);
        Field zzbih = zzbih();
        zzilc = (zzbih == null || (zzdVar = zzikn) == null) ? -1L : zzdVar.zzilh.objectFieldOffset(zzbih);
        zzild = (int) (zzikp & 7);
        zzile = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }
}
