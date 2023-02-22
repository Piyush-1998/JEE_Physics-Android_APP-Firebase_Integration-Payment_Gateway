package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbjv implements zzcau {
    private zzbxj zzetx;
    private zzbsg zzety;
    private zzdlj zzeua;
    private zzdjf zzeub;
    private zzdij zzeuc;
    private final /* synthetic */ zzbjc zzeud;
    private zzcwh zzfga;

    private zzbjv(zzbjc zzbjcVar) {
        this.zzeud = zzbjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    /* renamed from: zzafz */
    public final zzcar zzael() {
        zzelu.zza(this.zzetx, zzbxj.class);
        zzelu.zza(this.zzety, zzbsg.class);
        zzelu.zza(this.zzfga, zzcwh.class);
        return new zzbju(this.zzeud, new zzbqh(), new zzdmi(), new zzbrq(), new zzclw(), this.zzetx, this.zzety, new zzdmq(), this.zzfga, this.zzeua, this.zzeub, this.zzeuc);
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final /* synthetic */ zzcau zzb(zzcwh zzcwhVar) {
        this.zzfga = (zzcwh) zzelu.checkNotNull(zzcwhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final /* synthetic */ zzcau zzd(zzbsg zzbsgVar) {
        this.zzety = (zzbsg) zzelu.checkNotNull(zzbsgVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcau
    public final /* synthetic */ zzcau zzd(zzbxj zzbxjVar) {
        this.zzetx = (zzbxj) zzelu.checkNotNull(zzbxjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzcar> zza(zzdij zzdijVar) {
        this.zzeuc = zzdijVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzcar> zza(zzdjf zzdjfVar) {
        this.zzeub = zzdjfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzcar> zza(zzdlj zzdljVar) {
        this.zzeua = zzdljVar;
        return this;
    }
}
