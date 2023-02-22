package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzblp implements zzdvi<String> {
    private final /* synthetic */ String zzflo;
    private final /* synthetic */ zzbln zzflp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblp(zzbln zzblnVar, String str) {
        this.zzflp = zzblnVar;
        this.zzflo = str;
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
        String str = this.zzflo;
        zzdkxVar2 = this.zzflp.zzflh;
        zzdpsVar.zza(zzdljVar, zzdkxVar, false, str, null, zzdkxVar2.zzdit);
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
        String str3 = this.zzflo;
        zzdkxVar2 = this.zzflp.zzflh;
        zzdpsVar.zza(zzdljVar, zzdkxVar, false, str3, str2, zzdkxVar2.zzdit);
    }
}
