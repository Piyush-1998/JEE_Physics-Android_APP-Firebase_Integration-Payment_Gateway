package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbse;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdih<R extends zzbse<AdT>, AdT extends zzbpd> implements zzdnw<AdT> {
    private final zzdiz<R, zzdnh<AdT>> zzgyq;

    public zzdih(zzdiz<R, zzdnh<AdT>> zzdizVar) {
        this.zzgyq = zzdizVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zzb(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdnw
    public final zzdvt<zzdnh<AdT>> zza(zzdnv zzdnvVar) {
        zzdig zzdigVar = (zzdig) zzdnvVar;
        return this.zzgyq.zza(zzdigVar.zzgyo, zzdigVar.zzgyn);
    }

    @Override // com.google.android.gms.internal.ads.zzdnw
    public final void zza(zzdnh<AdT> zzdnhVar) {
        zzdnhVar.zzhfh = this.zzgyq.zzasb().zzafc();
    }
}
