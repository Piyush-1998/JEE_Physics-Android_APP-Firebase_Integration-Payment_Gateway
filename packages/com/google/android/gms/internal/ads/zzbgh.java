package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbgh implements Runnable {
    private final /* synthetic */ zzbgf zzeow;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbgh(zzbgf zzbgfVar) {
        this.zzeow = zzbgfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfq zzbfqVar;
        zzbfqVar = this.zzeow.zzenj;
        zzbfqVar.destroy();
    }
}
