package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxm;
import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdxn implements zzdxm.zzb {
    private final /* synthetic */ zzdxj zzhrp;
    private final /* synthetic */ zzdwx zzhrq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxn(zzdxj zzdxjVar, zzdwx zzdwxVar) {
        this.zzhrp = zzdxjVar;
        this.zzhrq = zzdwxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final <Q> zzdww<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new zzdxk(this.zzhrp, this.zzhrq, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final zzdww<?> zzayd() {
        zzdxj zzdxjVar = this.zzhrp;
        return new zzdxk(zzdxjVar, this.zzhrq, zzdxjVar.zzaxu());
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Class<?> zzaye() {
        return this.zzhrp.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Set<Class<?>> zzaxt() {
        return this.zzhrp.zzaxt();
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Class<?> zzayf() {
        return this.zzhrq.getClass();
    }
}
