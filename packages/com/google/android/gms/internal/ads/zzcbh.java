package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcbh implements zzbpi<zzbpj> {
    private final zzcdg zzfod;
    private final Map<String, zzcre<zzbpj>> zzfpx;
    private final Map<String, zzcre<zzcco>> zzfvi;
    private final Map<String, zzctf<zzcco>> zzfvj;
    private final zzelx<zzbpi<zzbni>> zzfvk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbh(Map<String, zzcre<zzbpj>> map, Map<String, zzcre<zzcco>> map2, Map<String, zzctf<zzcco>> map3, zzelx<zzbpi<zzbni>> zzelxVar, zzcdg zzcdgVar) {
        this.zzfpx = map;
        this.zzfvi = map2;
        this.zzfvj = map3;
        this.zzfvk = zzelxVar;
        this.zzfod = zzcdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpi
    public final zzcre<zzbpj> zze(int i, String str) {
        zzcre<zzbni> zze;
        zzcre<zzbpj> zzcreVar = this.zzfpx.get(str);
        if (zzcreVar != null) {
            return zzcreVar;
        }
        if (i == 1) {
            if (this.zzfod.zzamf() == null || (zze = this.zzfvk.get().zze(i, str)) == null) {
                return null;
            }
            return zzbpj.zza(zze);
        } else if (i != 4) {
            return null;
        } else {
            zzctf<zzcco> zzctfVar = this.zzfvj.get(str);
            if (zzctfVar != null) {
                return zzbpj.zza((zzctf<? extends zzbpd>) zzctfVar);
            }
            zzcre<zzcco> zzcreVar2 = this.zzfvi.get(str);
            if (zzcreVar2 != null) {
                return zzbpj.zza(zzcreVar2);
            }
            return null;
        }
    }
}
