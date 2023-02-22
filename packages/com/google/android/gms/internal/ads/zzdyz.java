package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdyz {
    private static final String zzhsr = new zzdyx().getKeyType();
    private static final String zzhss = new zzdys().getKeyType();
    @Deprecated
    public static final zzeco zzhsa = zzeco.zzbcl();
    @Deprecated
    private static final zzeco zzhsb = zzeco.zzbcl();
    @Deprecated
    private static final zzeco zzhsc = zzeco.zzbcl();

    static {
        try {
            zzdxs.zzayg();
            zzdxm.zza((zzdxj) new zzdys(), (zzdwx) new zzdyx(), true);
            zzdxm.zza(new zzdyy());
            zzdxm.zza(new zzdzc());
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
