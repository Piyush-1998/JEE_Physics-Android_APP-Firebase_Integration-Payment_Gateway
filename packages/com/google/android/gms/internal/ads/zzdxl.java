package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdxm;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdxl implements zzdxm.zzb {
    private final /* synthetic */ zzdww zzhrj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxl(zzdww zzdwwVar) {
        this.zzhrj = zzdwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Class<?> zzayf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final <Q> zzdww<Q> zzb(Class<Q> cls) throws GeneralSecurityException {
        if (!this.zzhrj.zzaxp().equals(cls)) {
            throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
        }
        return this.zzhrj;
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final zzdww<?> zzayd() {
        return this.zzhrj;
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Class<?> zzaye() {
        return this.zzhrj.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzdxm.zzb
    public final Set<Class<?>> zzaxt() {
        return Collections.singleton(this.zzhrj.zzaxp());
    }
}
