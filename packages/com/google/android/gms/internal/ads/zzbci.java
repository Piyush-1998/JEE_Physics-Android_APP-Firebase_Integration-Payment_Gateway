package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbci implements Runnable {
    private final /* synthetic */ zzbcc zzefd;
    private final /* synthetic */ int zzefh;
    private final /* synthetic */ int zzefi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbci(zzbcc zzbccVar, int i, int i2) {
        this.zzefd = zzbccVar;
        this.zzefh = i;
        this.zzefi = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcm zzbcmVar;
        zzbcm zzbcmVar2;
        zzbcmVar = this.zzefd.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar2 = this.zzefd.zzefb;
            zzbcmVar2.zzk(this.zzefh, this.zzefi);
        }
    }
}
