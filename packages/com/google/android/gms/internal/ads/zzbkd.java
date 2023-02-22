package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbkd implements zzcyh {
    private zzbsg zzety;
    private final /* synthetic */ zzbjc zzeud;
    private zzcyx zzfkh;

    private zzbkd(zzbjc zzbjcVar) {
        this.zzeud = zzbjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final zzcyi zzagm() {
        zzelu.zza(this.zzety, zzbsg.class);
        zzelu.zza(this.zzfkh, zzcyx.class);
        return new zzbkc(this.zzeud, this.zzfkh, new zzbqh(), new zzclw(), this.zzety, new zzdmq());
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    @Deprecated
    public final /* synthetic */ zzcyh zzf(zzbxj zzbxjVar) {
        zzelu.checkNotNull(zzbxjVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final /* synthetic */ zzcyh zza(zzcyx zzcyxVar) {
        this.zzfkh = (zzcyx) zzelu.checkNotNull(zzcyxVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcyh
    public final /* synthetic */ zzcyh zzf(zzbsg zzbsgVar) {
        this.zzety = (zzbsg) zzelu.checkNotNull(zzbsgVar);
        return this;
    }
}
