package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcky implements zzbsz, zzbuj, zzbvj {
    private final zzclg zzgfa;
    private final zzcln zzgfb;

    public zzcky(zzclg zzclgVar, zzcln zzclnVar) {
        this.zzgfa = zzclgVar;
        this.zzgfb = zzclnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuj
    public final void onAdLoaded() {
        this.zzgfa.zzrr().put("action", "loaded");
        this.zzgfb.zzn(this.zzgfa.zzrr());
    }

    @Override // com.google.android.gms.internal.ads.zzbsz
    public final void zzg(zzuw zzuwVar) {
        this.zzgfa.zzrr().put("action", "ftl");
        this.zzgfa.zzrr().put("ftl", String.valueOf(zzuwVar.errorCode));
        this.zzgfa.zzrr().put("ed", zzuwVar.zzcgs);
        this.zzgfb.zzn(this.zzgfa.zzrr());
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzd(zzasp zzaspVar) {
        this.zzgfa.zzj(zzaspVar.zzdtd);
    }

    @Override // com.google.android.gms.internal.ads.zzbvj
    public final void zzb(zzdlj zzdljVar) {
        this.zzgfa.zzc(zzdljVar);
    }
}
