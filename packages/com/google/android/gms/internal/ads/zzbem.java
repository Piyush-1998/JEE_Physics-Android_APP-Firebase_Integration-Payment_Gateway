package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbem implements zzbfd {
    @Override // com.google.android.gms.internal.ads.zzbfd
    public final zzbev zza(zzbde zzbdeVar, int i, String str, zzbdf zzbdfVar) {
        if (i > 0) {
            int zzaas = zzbeb.zzaas();
            if (zzaas < zzbdfVar.zzeib) {
                return new zzbfg(zzbdeVar, zzbdfVar);
            }
            if (zzaas < zzbdfVar.zzehv) {
                return new zzbfh(zzbdeVar, zzbdfVar);
            }
            return new zzbff(zzbdeVar);
        }
        return new zzbfc(zzbdeVar);
    }
}
