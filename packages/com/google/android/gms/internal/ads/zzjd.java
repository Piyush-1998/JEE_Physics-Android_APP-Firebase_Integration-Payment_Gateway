package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzjd implements zziu {
    private final /* synthetic */ zzjb zzamr;

    private zzjd(zzjb zzjbVar) {
        this.zzamr = zzjbVar;
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzx(int i) {
        zzjb.zza(this.zzamr).zzy(i);
        zzjb.zzx(i);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzel() {
        zzjb.zzgb();
        zzjb.zza(this.zzamr, true);
    }

    @Override // com.google.android.gms.internal.ads.zziu
    public final void zzc(int i, long j, long j2) {
        zzjb.zza(this.zzamr).zzb(i, j, j2);
        zzjb.zza(i, j, j2);
    }
}
