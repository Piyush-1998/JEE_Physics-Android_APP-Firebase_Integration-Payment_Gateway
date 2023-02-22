package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzajp extends zzbhv {
    private final /* synthetic */ zzajj zzdfu;

    private zzajp(zzajj zzajjVar) {
        this.zzdfu = zzajjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zza(zzbhu zzbhuVar) {
        if (zzajj.zza(this.zzdfu) != null) {
            zzajj.zza(this.zzdfu).zzte();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzb(zzbhu zzbhuVar) {
        this.zzdfu.zzg(zzbhuVar.uri);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final boolean zzc(zzbhu zzbhuVar) {
        return this.zzdfu.zzg(zzbhuVar.uri);
    }
}
