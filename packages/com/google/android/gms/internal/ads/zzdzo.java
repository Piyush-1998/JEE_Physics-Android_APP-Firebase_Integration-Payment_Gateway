package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdzo {
    @Deprecated
    private static final zzeco zzhsa;
    @Deprecated
    private static final zzeco zzhsb;
    @Deprecated
    private static final zzeco zzhsc;
    private static final String zzhtd = new zzdzk().getKeyType();

    public static void zzayg() throws GeneralSecurityException {
        zzdxm.zza((zzdwx) new zzdzk(), true);
        zzdxm.zza((zzdwx) new zzdzf(), true);
        zzdxm.zza(new zzdzn());
    }

    static {
        zzeco zzbcl = zzeco.zzbcl();
        zzhsa = zzbcl;
        zzhsb = zzbcl;
        zzhsc = zzbcl;
        try {
            zzayg();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
