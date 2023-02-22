package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public class zzcuu extends zzcvw {
    private zzbzc zzgnq;

    public zzcuu(zzbst zzbstVar, zzbtl zzbtlVar, zzbtu zzbtuVar, zzbue zzbueVar, zzbtb zzbtbVar, zzbws zzbwsVar, zzbzh zzbzhVar, zzbur zzburVar, zzbzc zzbzcVar, zzbwp zzbwpVar) {
        super(zzbstVar, zzbtlVar, zzbtuVar, zzbueVar, zzbwsVar, zzburVar, zzbzhVar, zzbwpVar, zzbtbVar);
        this.zzgnq = zzbzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzana
    public final void zzty() {
        this.zzgnq.zzsv();
    }

    @Override // com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzana
    public final void zztz() throws RemoteException {
        this.zzgnq.zzsw();
    }

    @Override // com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzana
    public final void zza(zzaug zzaugVar) throws RemoteException {
        super.zza(zzaugVar);
        this.zzgnq.zza(new zzaue(zzaugVar.getType(), zzaugVar.getAmount()));
    }

    @Override // com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzana
    public final void zzb(zzaue zzaueVar) {
        super.zzb(zzaueVar);
        this.zzgnq.zza(zzaueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcvw, com.google.android.gms.internal.ads.zzana
    public final void onVideoEnd() {
        this.zzgnq.zzsw();
    }
}
