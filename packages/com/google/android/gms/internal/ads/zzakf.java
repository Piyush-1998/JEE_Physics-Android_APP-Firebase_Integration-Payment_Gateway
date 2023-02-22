package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzakf implements Runnable {
    private final /* synthetic */ zzajz zzdgg;
    private final /* synthetic */ String zzdgi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakf(zzajz zzajzVar, String str) {
        this.zzdgg = zzajzVar;
        this.zzdgi = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfq zzbfqVar;
        zzbfqVar = this.zzdgg.zzdgc;
        zzbfqVar.loadUrl(this.zzdgi);
    }
}
