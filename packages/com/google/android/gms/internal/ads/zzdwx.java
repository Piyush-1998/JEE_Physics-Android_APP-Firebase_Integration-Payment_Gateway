package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzebt;
import com.google.android.gms.internal.ads.zzehz;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdwx<KeyProtoT extends zzehz> {
    private final Class<KeyProtoT> zzhqt;
    private final Map<Class<?>, zzdwz<?, KeyProtoT>> zzhqu;
    private final Class<?> zzhqv;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzdwx(Class<KeyProtoT> cls, zzdwz<?, KeyProtoT>... zzdwzVarArr) {
        this.zzhqt = cls;
        HashMap hashMap = new HashMap();
        for (zzdwz<?, KeyProtoT> zzdwzVar : zzdwzVarArr) {
            if (hashMap.containsKey(zzdwzVar.zzaxp())) {
                String valueOf = String.valueOf(zzdwzVar.zzaxp().getCanonicalName());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(valueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            hashMap.put(zzdwzVar.zzaxp(), zzdwzVar);
        }
        if (zzdwzVarArr.length > 0) {
            this.zzhqv = zzdwzVarArr[0].zzaxp();
        } else {
            this.zzhqv = Void.class;
        }
        this.zzhqu = Collections.unmodifiableMap(hashMap);
    }

    public abstract String getKeyType();

    public abstract zzebt.zza zzaxs();

    public abstract void zzc(KeyProtoT keyprotot) throws GeneralSecurityException;

    public abstract KeyProtoT zzp(zzeff zzeffVar) throws zzegz;

    public final Class<KeyProtoT> zzaxr() {
        return this.zzhqt;
    }

    public final <P> P zza(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        zzdwz<?, KeyProtoT> zzdwzVar = this.zzhqu.get(cls);
        if (zzdwzVar == null) {
            String canonicalName = cls.getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
            sb.append("Requested primitive class ");
            sb.append(canonicalName);
            sb.append(" not supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        return (P) zzdwzVar.zzag(keyprotot);
    }

    public final Set<Class<?>> zzaxt() {
        return this.zzhqu.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> zzaxu() {
        return this.zzhqv;
    }

    public zzdxa<?, KeyProtoT> zzaxv() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
