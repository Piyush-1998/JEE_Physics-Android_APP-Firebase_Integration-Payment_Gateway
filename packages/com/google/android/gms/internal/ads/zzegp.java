package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzegp;
import com.google.android.gms.internal.ads.zzegp.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzegp<MessageType extends zzegp<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzeev<MessageType, BuilderType> {
    private static Map<Object, zzegp<?, ?>> zzifq = new ConcurrentHashMap();
    protected zzejq zzifo = zzejq.zzbhz();
    private int zzifp = -1;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static class zza<T extends zzegp<T, ?>> extends zzeew<T> {
        private final T zzifs;

        public zza(T t) {
            this.zzifs = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    static final class zzc implements zzegk<zzc> {
        @Override // com.google.android.gms.internal.ads.zzegk
        public final int zzv() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzegk
        public final zzeke zzbfe() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzegk
        public final zzekh zzbff() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzegk
        public final boolean zzbfg() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzegk
        public final boolean zzbfh() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzegk
        public final zzeic zza(zzeic zzeicVar, zzehz zzehzVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzegk
        public final zzeii zza(zzeii zzeiiVar, zzeii zzeiiVar2) {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public enum zze {
        public static final int zzifw = 1;
        public static final int zzifx = 2;
        public static final int zzify = 3;
        public static final int zzifz = 4;
        public static final int zziga = 5;
        public static final int zzigb = 6;
        public static final int zzigc = 7;
        public static final int zzige = 1;
        public static final int zzigf = 2;
        public static final int zzigh = 1;
        public static final int zzigi = 2;
        private static final /* synthetic */ int[] zzigd = {1, 2, 3, 4, 5, 6, 7};
        private static final /* synthetic */ int[] zzigg = {1, 2};
        private static final /* synthetic */ int[] zzigj = {1, 2};

        public static int[] zzbfz() {
            return (int[]) zzigd.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static class zzf<ContainingType extends zzehz, Type> extends zzegd<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzegp<MessageType, BuilderType> implements zzeib {
        protected zzegi<zzc> zzifv = zzegi.zzbfc();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zzegi<zzc> zzbfy() {
            if (this.zzifv.isImmutable()) {
                this.zzifv = (zzegi) this.zzifv.clone();
            }
            return this.zzifv;
        }
    }

    public String toString() {
        return zzeie.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zziaq != 0) {
            return this.zziaq;
        }
        this.zziaq = zzeio.zzbhg().zzaw(this).hashCode(this);
        return this.zziaq;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzegp<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzeeu<MessageType, BuilderType> {
        private final MessageType zzifs;
        protected MessageType zzift;
        protected boolean zzifu = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public zzb(MessageType messagetype) {
            this.zzifs = messagetype;
            this.zzift = (MessageType) messagetype.zza(zze.zzifz, null, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void zzbft() {
            MessageType messagetype = (MessageType) this.zzift.zza(zze.zzifz, null, null);
            zza(messagetype, this.zzift);
            this.zzift = messagetype;
        }

        @Override // com.google.android.gms.internal.ads.zzeib
        public final boolean isInitialized() {
            return zzegp.zza(this.zzift, false);
        }

        @Override // com.google.android.gms.internal.ads.zzeic
        /* renamed from: zzbfu */
        public MessageType zzbfw() {
            if (this.zzifu) {
                return this.zzift;
            }
            MessageType messagetype = this.zzift;
            zzeio.zzbhg().zzaw(messagetype).zzaj(messagetype);
            this.zzifu = true;
            return this.zzift;
        }

        @Override // com.google.android.gms.internal.ads.zzeic
        /* renamed from: zzbfv */
        public final MessageType zzbfx() {
            MessageType messagetype = (MessageType) zzbfw();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzejo(messagetype);
        }

        @Override // com.google.android.gms.internal.ads.zzeeu
        /* renamed from: zzb */
        public final BuilderType zza(MessageType messagetype) {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            zza(this.zzift, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzeio.zzbhg().zzaw(messagetype).zzg(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzegc zzegcVar) throws zzegz {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            try {
                zzeio.zzbhg().zzaw(this.zzift).zza(this.zzift, bArr, 0, i2 + 0, new zzefa(zzegcVar));
                return this;
            } catch (zzegz e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzegz.zzbgb();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.ads.zzeeu
        /* renamed from: zzb */
        public final BuilderType zza(zzefq zzefqVar, zzegc zzegcVar) throws IOException {
            if (this.zzifu) {
                zzbft();
                this.zzifu = false;
            }
            try {
                zzeio.zzbhg().zzaw(this.zzift).zza(this.zzift, zzefx.zza(zzefqVar), zzegcVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzeeu
        public final /* synthetic */ zzeeu zza(byte[] bArr, int i, int i2, zzegc zzegcVar) throws zzegz {
            return zzb(bArr, 0, i2, zzegcVar);
        }

        @Override // com.google.android.gms.internal.ads.zzeeu
        public final /* synthetic */ zzeeu zzbcz() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.ads.zzeib
        public final /* synthetic */ zzehz zzbfr() {
            return this.zzifs;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzeeu
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzifs.zza(zze.zziga, null, null);
            zzbVar.zza((zzegp) zzbfw());
            return zzbVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzeio.zzbhg().zzaw(this).equals(this, (zzegp) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzegp<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbfj() {
        return (BuilderType) zza(zze.zziga, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzeib
    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzbfk() {
        BuilderType buildertype = (BuilderType) zza(zze.zziga, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    final int zzbdb() {
        return this.zzifp;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    final void zzfq(int i) {
        this.zzifp = i;
    }

    @Override // com.google.android.gms.internal.ads.zzehz
    public final void zzb(zzefz zzefzVar) throws IOException {
        zzeio.zzbhg().zzaw(this).zza(this, zzegb.zza(zzefzVar));
    }

    @Override // com.google.android.gms.internal.ads.zzehz
    public final int zzbfl() {
        if (this.zzifp == -1) {
            this.zzifp = zzeio.zzbhg().zzaw(this).zzat(this);
        }
        return this.zzifp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzegp<?, ?>> T zzd(Class<T> cls) {
        zzegp<?, ?> zzegpVar = zzifq.get(cls);
        if (zzegpVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzegpVar = zzifq.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzegpVar == null) {
            zzegpVar = (T) ((zzegp) zzejt.zzj(cls)).zza(zze.zzigb, (Object) null, (Object) null);
            if (zzegpVar == null) {
                throw new IllegalStateException();
            }
            zzifq.put(cls, zzegpVar);
        }
        return (T) zzegpVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzegp<?, ?>> void zza(Class<T> cls, T t) {
        zzifq.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzehz zzehzVar, String str, Object[] objArr) {
        return new zzeiq(zzehzVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends zzegp<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zzifw, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzav = zzeio.zzbhg().zzaw(t).zzav(t);
        if (z) {
            t.zza(zze.zzifx, zzav ? t : null, null);
        }
        return zzav;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzegv zzbfm() {
        return zzegs.zzbga();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzegv zza(zzegv zzegvVar) {
        int size = zzegvVar.size();
        return zzegvVar.zzhb(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzegx zzbfn() {
        return zzehn.zzbgr();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzeha<E> zzbfo() {
        return zzein.zzbhf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzeha<E> zza(zzeha<E> zzehaVar) {
        int size = zzehaVar.size();
        return zzehaVar.zzft(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzegp<T, ?>> T zza(T t, zzefq zzefqVar, zzegc zzegcVar) throws zzegz {
        T t2 = (T) t.zza(zze.zzifz, null, null);
        try {
            zzeiv zzaw = zzeio.zzbhg().zzaw(t2);
            zzaw.zza(t2, zzefx.zza(zzefqVar), zzegcVar);
            zzaw.zzaj(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzegz) {
                throw ((zzegz) e.getCause());
            }
            throw new zzegz(e.getMessage()).zzl(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzegz) {
                throw ((zzegz) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzegp<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzegc zzegcVar) throws zzegz {
        T t2 = (T) t.zza(zze.zzifz, null, null);
        try {
            zzeiv zzaw = zzeio.zzbhg().zzaw(t2);
            zzaw.zza(t2, bArr, 0, i2, new zzefa(zzegcVar));
            zzaw.zzaj(t2);
            if (t2.zziaq == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzegz) {
                throw ((zzegz) e.getCause());
            }
            throw new zzegz(e.getMessage()).zzl(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzegz.zzbgb().zzl(t2);
        }
    }

    private static <T extends zzegp<T, ?>> T zza(T t) throws zzegz {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new zzegz(new zzejo(t).getMessage()).zzl(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzegp<T, ?>> T zza(T t, zzeff zzeffVar) throws zzegz {
        return (T) zza(zza(zzb(t, zzeffVar, zzegc.zzbex())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzegp<T, ?>> T zza(T t, zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        return (T) zza(zzb(t, zzeffVar, zzegcVar));
    }

    private static <T extends zzegp<T, ?>> T zzb(T t, zzeff zzeffVar, zzegc zzegcVar) throws zzegz {
        try {
            zzefq zzbdl = zzeffVar.zzbdl();
            T t2 = (T) zza(t, zzbdl, zzegcVar);
            try {
                zzbdl.zzfy(0);
                return t2;
            } catch (zzegz e) {
                throw e.zzl(t2);
            }
        } catch (zzegz e2) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzegp<T, ?>> T zza(T t, byte[] bArr) throws zzegz {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzegc.zzbex()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzegp<T, ?>> T zza(T t, byte[] bArr, zzegc zzegcVar) throws zzegz {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzegcVar));
    }

    @Override // com.google.android.gms.internal.ads.zzehz
    public final /* synthetic */ zzeic zzbfp() {
        zzb zzbVar = (zzb) zza(zze.zziga, (Object) null, (Object) null);
        zzbVar.zza(this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehz
    public final /* synthetic */ zzeic zzbfq() {
        return (zzb) zza(zze.zziga, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzeib
    public final /* synthetic */ zzehz zzbfr() {
        return (zzegp) zza(zze.zzigb, (Object) null, (Object) null);
    }
}
