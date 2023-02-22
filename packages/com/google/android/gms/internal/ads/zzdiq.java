package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbse;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdiq<RequestComponentT extends zzbse<AdT>, AdT> implements zzdiz<RequestComponentT, AdT> {
    private RequestComponentT zzgyk;
    private final zzdiz<RequestComponentT, AdT> zzgyx;

    public zzdiq(zzdiz<RequestComponentT, AdT> zzdizVar) {
        this.zzgyx = zzdizVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.ads.zzdiz
    /* renamed from: zzasc */
    public final synchronized RequestComponentT zzasb() {
        return this.zzgyk;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final synchronized zzdvt<AdT> zza(zzdja zzdjaVar, zzdjb<RequestComponentT> zzdjbVar) {
        if (zzdjaVar.zzgzb != null) {
            RequestComponentT zzael = zzdjbVar.zzc(zzdjaVar.zzgzc).zzael();
            this.zzgyk = zzael;
            return zzael.zzafc().zzb(zzdjaVar.zzgzb);
        }
        zzdvt<AdT> zza = this.zzgyx.zza(zzdjaVar, zzdjbVar);
        this.zzgyk = this.zzgyx.zzasb();
        return zza;
    }
}
