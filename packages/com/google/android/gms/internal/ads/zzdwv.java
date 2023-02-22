package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehz;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzdwv<PrimitiveT, KeyProtoT extends zzehz> implements zzdww<PrimitiveT> {
    private final zzdwx<KeyProtoT> zzhqr;
    private final Class<PrimitiveT> zzhqs;

    public zzdwv(zzdwx<KeyProtoT> zzdwxVar, Class<PrimitiveT> cls) {
        if (!zzdwxVar.zzaxt().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzdwxVar.toString(), cls.getName()));
        }
        this.zzhqr = zzdwxVar;
        this.zzhqs = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzdww
    public final PrimitiveT zzm(zzeff zzeffVar) throws GeneralSecurityException {
        try {
            return zzb(this.zzhqr.zzp(zzeffVar));
        } catch (zzegz e) {
            String valueOf = String.valueOf(this.zzhqr.zzaxr().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdww
    public final PrimitiveT zza(zzehz zzehzVar) throws GeneralSecurityException {
        String valueOf = String.valueOf(this.zzhqr.zzaxr().getName());
        String concat = valueOf.length() != 0 ? "Expected proto of type ".concat(valueOf) : new String("Expected proto of type ");
        if (!this.zzhqr.zzaxr().isInstance(zzehzVar)) {
            throw new GeneralSecurityException(concat);
        }
        return (PrimitiveT) zzb(zzehzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdww
    public final zzehz zzn(zzeff zzeffVar) throws GeneralSecurityException {
        try {
            return zzaxq().zzq(zzeffVar);
        } catch (zzegz e) {
            String valueOf = String.valueOf(this.zzhqr.zzaxv().zzaxw().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "Failures parsing proto of type ".concat(valueOf) : new String("Failures parsing proto of type "), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdww
    public final String getKeyType() {
        return this.zzhqr.getKeyType();
    }

    @Override // com.google.android.gms.internal.ads.zzdww
    public final zzebt zzo(zzeff zzeffVar) throws GeneralSecurityException {
        try {
            return (zzebt) ((zzegp) zzebt.zzbbb().zzhq(this.zzhqr.getKeyType()).zzaf(zzaxq().zzq(zzeffVar).zzbda()).zzb(this.zzhqr.zzaxs()).zzbfx());
        } catch (zzegz e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdww
    public final Class<PrimitiveT> zzaxp() {
        return this.zzhqs;
    }

    private final PrimitiveT zzb(KeyProtoT keyprotot) throws GeneralSecurityException {
        if (Void.class.equals(this.zzhqs)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.zzhqr.zzc(keyprotot);
        return (PrimitiveT) this.zzhqr.zza(keyprotot, (Class<PrimitiveT>) this.zzhqs);
    }

    private final zzdwy<?, KeyProtoT> zzaxq() {
        return new zzdwy<>(this.zzhqr.zzaxv());
    }
}
