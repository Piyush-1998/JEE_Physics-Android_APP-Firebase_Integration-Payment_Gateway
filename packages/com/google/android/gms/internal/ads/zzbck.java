package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbck implements Runnable {
    private final /* synthetic */ zzbcc zzefd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbck(zzbcc zzbccVar) {
        this.zzefd = zzbccVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcm zzbcmVar;
        zzbcm zzbcmVar2;
        zzbcmVar = this.zzefd.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar2 = this.zzefd.zzefb;
            zzbcmVar2.zzyz();
        }
    }
}
