package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzakg implements Runnable {
    private final /* synthetic */ String zzdgf;
    private final /* synthetic */ zzajz zzdgg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakg(zzajz zzajzVar, String str) {
        this.zzdgg = zzajzVar;
        this.zzdgf = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfq zzbfqVar;
        zzbfqVar = this.zzdgg.zzdgc;
        zzbfqVar.loadData(this.zzdgf, "text/html", "UTF-8");
    }
}
