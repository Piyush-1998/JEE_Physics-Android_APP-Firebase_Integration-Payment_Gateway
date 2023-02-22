package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxm;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdxo implements zzdxm.zzb {
    private final /* synthetic */ zzdwx zzhrr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxo(zzdwx zzdwxVar) {
        this.zzhrr = zzdwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Class<?> zzayf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final <Q> zzdww<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdwv(this.zzhrr, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final zzdww<?> zzayd() {
        zzdwx zzdwxVar = this.zzhrr;
        return new zzdwv(zzdwxVar, zzdwxVar.zzaxu());
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Class<?> zzaye() {
        return this.zzhrr.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Set<Class<?>> zzaxt() {
        return this.zzhrr.zzaxt();
    }
}
