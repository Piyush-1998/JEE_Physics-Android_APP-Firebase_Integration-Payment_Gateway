package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbcg implements Runnable {
    private final /* synthetic */ zzbcc zzefd;
    private final /* synthetic */ String zzeff;
    private final /* synthetic */ String zzefg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcg(zzbcc zzbccVar, String str, String str2) {
        this.zzefd = zzbccVar;
        this.zzeff = str;
        this.zzefg = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbcm zzbcmVar;
        zzbcm zzbcmVar2;
        zzbcmVar = this.zzefd.zzefb;
        if (zzbcmVar != null) {
            zzbcmVar2 = this.zzefd.zzefb;
            zzbcmVar2.zzm(this.zzeff, this.zzefg);
        }
    }
}
