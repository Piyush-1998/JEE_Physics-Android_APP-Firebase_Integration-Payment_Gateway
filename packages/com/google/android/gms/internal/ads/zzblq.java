package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzblq implements zzdvi<String> {
    private final /* synthetic */ zzbln zzflp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblq(zzbln zzblnVar) {
        this.zzflp = zzblnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        zzdps zzdpsVar;
        zzdlj zzdljVar;
        zzdkx zzdkxVar;
        zzdkx zzdkxVar2;
        zzdpsVar = this.zzflp.zzfli;
        zzdljVar = this.zzflp.zzflg;
        zzdkxVar = this.zzflp.zzflh;
        zzdkxVar2 = this.zzflp.zzflh;
        zzdpsVar.zza(zzdljVar, zzdkxVar, false, "", "failure_click_attok", zzdkxVar2.zzdis);
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(String str) {
        zzdps zzdpsVar;
        zzdlj zzdljVar;
        zzdkx zzdkxVar;
        zzdkx zzdkxVar2;
        String str2 = str;
        zzdpsVar = this.zzflp.zzfli;
        zzdljVar = this.zzflp.zzflg;
        zzdkxVar = this.zzflp.zzflh;
        zzdkxVar2 = this.zzflp.zzflh;
        zzdpsVar.zza(zzdljVar, zzdkxVar, false, "", str2, zzdkxVar2.zzdis);
    }
}
