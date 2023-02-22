package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzchj implements com.google.android.gms.ads.internal.overlay.zzt {
    private final zzbtu zzgcr;

    private zzchj(zzbtu zzbtuVar) {
        this.zzgcr = zzbtuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.ads.internal.overlay.zzt zza(zzbtu zzbtuVar) {
        return new zzchj(zzbtuVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zzuz() {
        this.zzgcr.onAdLeftApplication();
    }
}
