package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzdyy implements zzdxh<zzdwu> {
    private static final Logger logger = Logger.getLogger(zzdyy.class.getName());

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdwu {
        private final zzdxf<zzdwu> zzhst;

        public zza(zzdxf<zzdwu> zzdxfVar) {
            this.zzhst = zzdxfVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final Class<zzdwu> zzaxp() {
        return zzdwu.class;
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final /* synthetic */ zzdwu zza(zzdxf<zzdwu> zzdxfVar) throws GeneralSecurityException {
        return new zza(zzdxfVar);
    }
}
