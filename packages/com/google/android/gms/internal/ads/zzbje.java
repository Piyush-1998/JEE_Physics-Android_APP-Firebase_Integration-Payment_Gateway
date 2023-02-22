package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbje implements zzcbq {
    private zzbxj zzetx;
    private zzbsg zzety;
    private zzcbj zzetz;
    private zzdlj zzeua;
    private zzdjf zzeub;
    private zzdij zzeuc;
    private final /* synthetic */ zzbjc zzeud;

    private zzbje(zzbjc zzbjcVar) {
        this.zzeud = zzbjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    /* renamed from: zzaek */
    public final zzcbn zzael() {
        zzelu.zza(this.zzetx, zzbxj.class);
        zzelu.zza(this.zzety, zzbsg.class);
        zzelu.zza(this.zzetz, zzcbj.class);
        return new zzbjh(this.zzeud, this.zzetz, new zzbqh(), new zzdmi(), new zzbrq(), new zzclw(), this.zzetx, this.zzety, new zzdmq(), this.zzeua, this.zzeub, this.zzeuc);
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final /* synthetic */ zzcbq zza(zzcbj zzcbjVar) {
        this.zzetz = (zzcbj) zzelu.checkNotNull(zzcbjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final /* synthetic */ zzcbq zza(zzbsg zzbsgVar) {
        this.zzety = (zzbsg) zzelu.checkNotNull(zzbsgVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final /* synthetic */ zzcbq zza(zzbxj zzbxjVar) {
        this.zzetx = (zzbxj) zzelu.checkNotNull(zzbxjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzcbn> zza(zzdij zzdijVar) {
        this.zzeuc = zzdijVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzcbn> zza(zzdjf zzdjfVar) {
        this.zzeub = zzdjfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzcbn> zza(zzdlj zzdljVar) {
        this.zzeua = zzdljVar;
        return this;
    }
}
