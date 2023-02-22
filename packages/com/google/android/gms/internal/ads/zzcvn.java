package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvn extends zzcuu {
    private final zzbwp zzgof;

    public zzcvn(zzbst zzbstVar, zzbtl zzbtlVar, zzbtu zzbtuVar, zzbue zzbueVar, zzbtb zzbtbVar, zzbws zzbwsVar, zzbzh zzbzhVar, zzbur zzburVar, zzbzc zzbzcVar, zzbwp zzbwpVar) {
        super(zzbstVar, zzbtlVar, zzbtuVar, zzbueVar, zzbtbVar, zzbwsVar, zzbzhVar, zzburVar, zzbzcVar, zzbwpVar);
        this.zzgof = zzbwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzana
    public final void onAdImpression() {
        this.zzgof.zzaiy();
    }
}
