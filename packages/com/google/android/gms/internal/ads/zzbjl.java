package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbjl implements zzbmv {
    private zzbxj zzetx;
    private zzbsg zzety;
    private zzdlj zzeua;
    private zzdjf zzeub;
    private zzdij zzeuc;
    private final /* synthetic */ zzbjc zzeud;

    private zzbjl(zzbjc zzbjcVar) {
        this.zzeud = zzbjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    /* renamed from: zzafl */
    public final zzbmw zzael() {
        zzelu.zza(this.zzetx, zzbxj.class);
        zzelu.zza(this.zzety, zzbsg.class);
        return new zzbjk(this.zzeud, new zzbqh(), new zzdmi(), new zzbrq(), new zzclw(), this.zzetx, this.zzety, new zzdmq(), this.zzeua, this.zzeub, this.zzeuc);
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    @Deprecated
    public final /* synthetic */ zzbmv zza(zzbnd zzbndVar) {
        zzelu.checkNotNull(zzbndVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final /* synthetic */ zzbmv zzb(zzbsg zzbsgVar) {
        this.zzety = (zzbsg) zzelu.checkNotNull(zzbsgVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbmv
    public final /* synthetic */ zzbmv zzb(zzbxj zzbxjVar) {
        this.zzetx = (zzbxj) zzelu.checkNotNull(zzbxjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzbmw> zza(zzdij zzdijVar) {
        this.zzeuc = zzdijVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzbmw> zza(zzdjf zzdjfVar) {
        this.zzeub = zzdjfVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzbsd
    public final /* synthetic */ zzbsd<zzbmw> zza(zzdlj zzdljVar) {
        this.zzeua = zzdljVar;
        return this;
    }
}
