package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvq extends zzcvw {
    private final zzbwp zzgof;

    public zzcvq(zzbst zzbstVar, zzbtl zzbtlVar, zzbtu zzbtuVar, zzbue zzbueVar, zzbws zzbwsVar, zzbur zzburVar, zzbzh zzbzhVar, zzbwp zzbwpVar, zzbtb zzbtbVar) {
        super(zzbstVar, zzbtlVar, zzbtuVar, zzbueVar, zzbwsVar, zzburVar, zzbzhVar, zzbwpVar, zzbtbVar);
        this.zzgof = zzbwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzana
    public final void onAdImpression() {
        this.zzgof.zzaiy();
    }
}
