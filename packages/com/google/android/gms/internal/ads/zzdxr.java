package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzdxr implements zzdxh<zzdwq> {
    private static final Logger logger = Logger.getLogger(zzdxr.class.getName());

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final Class<zzdwq> zzaxp() {
        return zzdwq.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdwq {
        private final zzdxf<zzdwq> zzhsd;

        private zza(zzdxf<zzdwq> zzdxfVar) {
            this.zzhsd = zzdxfVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdwq
        public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return zzedd.zza(this.zzhsd.zzaxy().zzayc(), this.zzhsd.zzaxy().zzaxz().zzc(bArr, bArr2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final /* synthetic */ zzdwq zza(zzdxf<zzdwq> zzdxfVar) throws GeneralSecurityException {
        return new zza(zzdxfVar);
    }
}
