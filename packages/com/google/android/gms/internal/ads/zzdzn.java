package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
class zzdzn implements zzdxh<zzdxd> {
    private static final Logger logger = Logger.getLogger(zzdzn.class.getName());

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final Class<zzdxd> zzaxp() {
        return zzdxd.class;
    }

    /* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
    /* loaded from: classes.dex */
    static class zza implements zzdxd {
        private final zzdxf<zzdxd> zzhst;
        private final byte[] zzhte;

        private zza(zzdxf<zzdxd> zzdxfVar) {
            this.zzhte = new byte[]{0};
            this.zzhst = zzdxfVar;
        }

        @Override // com.google.android.gms.internal.ads.zzdxd
        public final byte[] zzl(byte[] bArr) throws GeneralSecurityException {
            if (this.zzhst.zzaxy().zzayb().equals(zzecn.LEGACY)) {
                return zzedd.zza(this.zzhst.zzaxy().zzayc(), this.zzhst.zzaxy().zzaxz().zzl(zzedd.zza(bArr, this.zzhte)));
            }
            return zzedd.zza(this.zzhst.zzaxy().zzayc(), this.zzhst.zzaxy().zzaxz().zzl(bArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdxh
    public final /* synthetic */ zzdxd zza(zzdxf<zzdxd> zzdxfVar) throws GeneralSecurityException {
        return new zza(zzdxfVar);
    }
}
