package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbjo implements zzbod {
    private zzbxj zzetx;
    private zzbsg zzety;
    private zzcbj zzetz;
    private zzdlj zzeua;
    private zzdjf zzeub;
    private zzdij zzeuc;
    private final /* synthetic */ zzbjc zzeud;
    private zzcwh zzfga;
    private zzbpa zzfgb;
    private zzbnd zzfgc;

    private zzbjo(zzbjc zzbjcVar) {
        this.zzeud = zzbjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    /* renamed from: zzafp */
    public final zzboe zzael() {
        zzelu.zza(this.zzetx, zzbxj.class);
        zzelu.zza(this.zzety, zzbsg.class);
        zzelu.zza(this.zzfga, zzcwh.class);
        zzelu.zza(this.zzfgb, zzbpa.class);
        zzelu.zza(this.zzfgc, zzbnd.class);
        zzelu.zza(this.zzetz, zzcbj.class);
        return new zzbjr(this.zzeud, this.zzfgc, this.zzetz, new zzbqh(), new zzdmi(), new zzbrq(), new zzclw(), this.zzetx, this.zzety, new zzdmq(), this.zzfga, this.zzfgb, this.zzeua, this.zzeub, this.zzeuc);
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod zzb(zzcbj zzcbjVar) {
        this.zzetz = (zzcbj) zzelu.checkNotNull(zzcbjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod zzb(zzbnd zzbndVar) {
        this.zzfgc = (zzbnd) zzelu.checkNotNull(zzbndVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod zza(zzbpa zzbpaVar) {
        this.zzfgb = (zzbpa) zzelu.checkNotNull(zzbpaVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod zza(zzcwh zzcwhVar) {
        this.zzfga = (zzcwh) zzelu.checkNotNull(zzcwhVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod zzc(zzbsg zzbsgVar) {
        this.zzety = (zzbsg) zzelu.checkNotNull(zzbsgVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final /* synthetic */ zzbod zzc(zzbxj zzbxjVar) {
        this.zzetx = (zzbxj) zzelu.checkNotNull(zzbxjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzboe> zza(zzdij zzdijVar) {
        this.zzeuc = zzdijVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzboe> zza(zzdjf zzdjfVar) {
        this.zzeub = zzdjfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzboe> zza(zzdlj zzdljVar) {
        this.zzeua = zzdljVar;
        return this;
    }
}
