package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdxc {
    private final zzecb zzhqx;

    private zzdxc(zzecb zzecbVar) {
        this.zzhqx = zzecbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzdxc zza(zzecb zzecbVar) throws GeneralSecurityException {
        if (zzecbVar == null || zzecbVar.zzbbn() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzdxc(zzecbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzecb zzaxx() {
        return this.zzhqx;
    }

    public final String toString() {
        return zzdxq.zzb(this.zzhqx).toString();
    }
}
