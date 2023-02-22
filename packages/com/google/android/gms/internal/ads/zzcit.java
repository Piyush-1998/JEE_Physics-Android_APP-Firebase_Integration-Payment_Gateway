package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcit implements zzaqf {
    private final /* synthetic */ zzcij zzgdm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcit(zzcij zzcijVar) {
        this.zzgdm = zzcijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqf
    public final void zza(int i, int i2, int i3, int i4) {
        zzbtu zzbtuVar;
        zzbtuVar = this.zzgdm.zzfqj;
        zzbtuVar.onAdOpened();
    }

    @Override // com.google.android.gms.internal.ads.zzaqf
    public final void zzum() {
        zzbtu zzbtuVar;
        zzbtuVar = this.zzgdm.zzfqj;
        zzbtuVar.onAdClosed();
    }

    @Override // com.google.android.gms.internal.ads.zzaqf
    public final void zzun() {
        zzbwl zzbwlVar;
        zzbwlVar = this.zzgdm.zzgdj;
        zzbwlVar.zzaia();
    }
}
