package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcks implements zzdpl {
    private zzto zzgei;
    private Map<zzdpg, zzcku> zzger;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcks(zzto zztoVar, Map<zzdpg, zzcku> map) {
        this.zzger = map;
        this.zzgei = zztoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zza(zzdpg zzdpgVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zzb(zzdpg zzdpgVar, String str) {
        if (this.zzger.containsKey(zzdpgVar)) {
            this.zzgei.zza(this.zzger.get(zzdpgVar).zzget);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zza(zzdpg zzdpgVar, String str, Throwable th) {
        if (this.zzger.containsKey(zzdpgVar)) {
            this.zzgei.zza(this.zzger.get(zzdpgVar).zzgev);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zzc(zzdpg zzdpgVar, String str) {
        if (this.zzger.containsKey(zzdpgVar)) {
            this.zzgei.zza(this.zzger.get(zzdpgVar).zzgeu);
        }
    }
}
