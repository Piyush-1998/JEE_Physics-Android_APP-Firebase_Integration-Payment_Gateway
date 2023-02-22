package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzecb;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdxm {
    private static final Logger logger = Logger.getLogger(zzdxm.class.getName());
    private static final ConcurrentMap<String, zzb> zzhrk = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zza> zzhrl = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zzhrm = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzdwp<?>> zzhrn = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzdxh<?>> zzhro = new ConcurrentHashMap();

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    interface zza {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    public interface zzb {
        Set<Class<?>> zzaxt();

        zzdww<?> zzayd();

        Class<?> zzaye();

        Class<?> zzayf();

        <P> zzdww<P> zzb(Class<P> cls) throws GeneralSecurityException;
    }

    private static <KeyProtoT extends zzehz> zzb zza(zzdwx<KeyProtoT> zzdwxVar) {
        return new zzdxo(zzdwxVar);
    }

    private static <KeyProtoT extends zzehz> zza zzb(zzdwx<KeyProtoT> zzdwxVar) {
        return new zzdxp(zzdwxVar);
    }

    private static synchronized zzb zzhm(String str) throws GeneralSecurityException {
        zzb zzbVar;
        synchronized (zzdxm.class) {
            if (!zzhrk.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zzbVar = zzhrk.get(str);
        }
        return zzbVar;
    }

    @Deprecated
    public static zzdwp<?> zzhn(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzdwp<?> zzdwpVar = zzhrn.get(str.toLowerCase());
        if (zzdwpVar == null) {
            String format = String.format("no catalogue found for %s. ", str);
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = String.valueOf(format).concat("Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        return zzdwpVar;
    }

    private static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private static synchronized void zza(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        synchronized (zzdxm.class) {
            if (zzhrk.containsKey(str)) {
                zzb zzbVar = zzhrk.get(str);
                if (!zzbVar.zzaye().equals(cls)) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger2.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzbVar.zzaye().getName(), cls.getName()));
                } else if (!z || zzhrm.get(str).booleanValue()) {
                } else {
                    String valueOf2 = String.valueOf(str);
                    throw new GeneralSecurityException(valueOf2.length() != 0 ? "New keys are already disallowed for key type ".concat(valueOf2) : new String("New keys are already disallowed for key type "));
                }
            }
        }
    }

    public static synchronized <P> void zza(zzdww<P> zzdwwVar, boolean z) throws GeneralSecurityException {
        synchronized (zzdxm.class) {
            if (zzdwwVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String keyType = zzdwwVar.getKeyType();
            zza(keyType, zzdwwVar.getClass(), z);
            if (!zzhrk.containsKey(keyType)) {
                zzhrk.put(keyType, new zzdxl(zzdwwVar));
            }
            zzhrm.put(keyType, Boolean.valueOf(z));
        }
    }

    public static synchronized <KeyProtoT extends zzehz> void zza(zzdwx<KeyProtoT> zzdwxVar, boolean z) throws GeneralSecurityException {
        synchronized (zzdxm.class) {
            String keyType = zzdwxVar.getKeyType();
            zza(keyType, zzdwxVar.getClass(), true);
            if (!zzhrk.containsKey(keyType)) {
                zzhrk.put(keyType, zza(zzdwxVar));
                zzhrl.put(keyType, zzb(zzdwxVar));
            }
            zzhrm.put(keyType, true);
        }
    }

    public static synchronized <KeyProtoT extends zzehz, PublicKeyProtoT extends zzehz> void zza(zzdxj<KeyProtoT, PublicKeyProtoT> zzdxjVar, zzdwx<PublicKeyProtoT> zzdwxVar, boolean z) throws GeneralSecurityException {
        Class<?> zzayf;
        synchronized (zzdxm.class) {
            String keyType = zzdxjVar.getKeyType();
            String keyType2 = zzdwxVar.getKeyType();
            zza(keyType, zzdxjVar.getClass(), true);
            zza(keyType2, zzdwxVar.getClass(), false);
            if (keyType.equals(keyType2)) {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
            if (zzhrk.containsKey(keyType) && (zzayf = zzhrk.get(keyType).zzayf()) != null && !zzayf.equals(zzdwxVar.getClass())) {
                Logger logger2 = logger;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder(String.valueOf(keyType).length() + 96 + String.valueOf(keyType2).length());
                sb.append("Attempted overwrite of a registered key manager for key type ");
                sb.append(keyType);
                sb.append(" with inconsistent public key type ");
                sb.append(keyType2);
                logger2.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzdxjVar.getClass().getName(), zzayf.getName(), zzdwxVar.getClass().getName()));
            }
            if (!zzhrk.containsKey(keyType) || zzhrk.get(keyType).zzayf() == null) {
                zzhrk.put(keyType, new zzdxn(zzdxjVar, zzdwxVar));
                zzhrl.put(keyType, zzb(zzdxjVar));
            }
            zzhrm.put(keyType, true);
            if (!zzhrk.containsKey(keyType2)) {
                zzhrk.put(keyType2, zza(zzdwxVar));
            }
            zzhrm.put(keyType2, false);
        }
    }

    public static synchronized <P> void zza(zzdxh<P> zzdxhVar) throws GeneralSecurityException {
        synchronized (zzdxm.class) {
            if (zzdxhVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> zzaxp = zzdxhVar.zzaxp();
            if (zzhro.containsKey(zzaxp)) {
                zzdxh<?> zzdxhVar2 = zzhro.get(zzaxp);
                if (!zzdxhVar.getClass().equals(zzdxhVar2.getClass())) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(zzaxp.toString());
                    logger2.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", valueOf.length() != 0 ? "Attempted overwrite of a registered SetWrapper for type ".concat(valueOf) : new String("Attempted overwrite of a registered SetWrapper for type "));
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzaxp.getName(), zzdxhVar2.getClass().getName(), zzdxhVar.getClass().getName()));
                }
            }
            zzhro.put(zzaxp, zzdxhVar);
        }
    }

    private static zzdww<?> zzho(String str) throws GeneralSecurityException {
        return zzhm(str).zzayd();
    }

    private static <P> zzdww<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzb zzhm = zzhm(str);
        if (cls == null) {
            return (zzdww<P>) zzhm.zzayd();
        }
        if (zzhm.zzaxt().contains(cls)) {
            return zzhm.zzb(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzhm.zzaye());
        Set<Class<?>> zzaxt = zzhm.zzaxt();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : zzaxt) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static synchronized zzebt zza(zzebw zzebwVar) throws GeneralSecurityException {
        zzebt zzo;
        synchronized (zzdxm.class) {
            zzdww<?> zzho = zzho(zzebwVar.zzbay());
            if (zzhrm.get(zzebwVar.zzbay()).booleanValue()) {
                zzo = zzho.zzo(zzebwVar.zzbaz());
            } else {
                String valueOf = String.valueOf(zzebwVar.zzbay());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzo;
    }

    public static synchronized zzehz zzb(zzebw zzebwVar) throws GeneralSecurityException {
        zzehz zzn;
        synchronized (zzdxm.class) {
            zzdww<?> zzho = zzho(zzebwVar.zzbay());
            if (zzhrm.get(zzebwVar.zzbay()).booleanValue()) {
                zzn = zzho.zzn(zzebwVar.zzbaz());
            } else {
                String valueOf = String.valueOf(zzebwVar.zzbay());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzn;
    }

    public static <P> P zza(String str, zzehz zzehzVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, (Class) checkNotNull(cls)).zza(zzehzVar);
    }

    private static <P> P zza(String str, zzeff zzeffVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, cls).zzm(zzeffVar);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, zzeff.zzu(bArr), (Class) checkNotNull(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> zzdxf<P> zza(zzdxc zzdxcVar, zzdww<P> zzdwwVar, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) checkNotNull(cls);
        zzdxq.zzc(zzdxcVar.zzaxx());
        zzdxf<P> zzdxfVar = (zzdxf<P>) zzdxf.zza(cls2);
        for (zzecb.zzb zzbVar : zzdxcVar.zzaxx().zzbbm()) {
            if (zzbVar.zzaya() == zzebu.ENABLED) {
                zzdxi zza2 = zzdxfVar.zza(zza(zzbVar.zzbbq().zzbay(), zzbVar.zzbbq().zzbaz(), cls2), zzbVar);
                if (zzbVar.zzbbr() == zzdxcVar.zzaxx().zzbbl()) {
                    zzdxfVar.zza(zza2);
                }
            }
        }
        return zzdxfVar;
    }

    public static <P> P zza(zzdxf<P> zzdxfVar) throws GeneralSecurityException {
        zzdxh<?> zzdxhVar = zzhro.get(zzdxfVar.zzaxp());
        if (zzdxhVar == null) {
            String valueOf = String.valueOf(zzdxfVar.zzaxp().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        }
        return (P) zzdxhVar.zza(zzdxfVar);
    }
}
