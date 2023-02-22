package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcqr implements zzdpl {
    private final zzcqq zzgki;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqr(zzcqq zzcqqVar) {
        this.zzgki = zzcqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zza(zzdpg zzdpgVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zzb(zzdpg zzdpgVar, String str) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue() && zzdpg.RENDERER == zzdpgVar) {
            this.zzgki.zzff(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zza(zzdpg zzdpgVar, String str, Throwable th) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue() && zzdpg.RENDERER == zzdpgVar && this.zzgki.zzapq() != 0) {
            this.zzgki.zzep(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - this.zzgki.zzapq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdpl
    public final void zzc(zzdpg zzdpgVar, String str) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcvx)).booleanValue() && zzdpg.RENDERER == zzdpgVar && this.zzgki.zzapq() != 0) {
            this.zzgki.zzep(com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - this.zzgki.zzapq());
        }
    }
}
