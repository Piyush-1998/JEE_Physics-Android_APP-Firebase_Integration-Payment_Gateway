package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbld implements zzduv<zzdlj, zzdlj> {
    private Map<String, zzblg> zzflc;

    public zzbld(Map<String, zzblg> map) {
        this.zzflc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final /* synthetic */ zzdvt<zzdlj> zzf(zzdlj zzdljVar) throws Exception {
        zzdlj zzdljVar2 = zzdljVar;
        for (zzdlg zzdlgVar : zzdljVar2.zzhbq.zzhbo) {
            if (this.zzflc.containsKey(zzdlgVar.name)) {
                this.zzflc.get(zzdlgVar.name).zzl(zzdlgVar.zzhbl);
            }
        }
        return zzdvl.zzaf(zzdljVar2);
    }
}
