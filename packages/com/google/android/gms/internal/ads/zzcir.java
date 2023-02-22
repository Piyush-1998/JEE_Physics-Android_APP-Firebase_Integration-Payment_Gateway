package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcir implements zzbzi {
    private final zzbfq zzepi;

    private zzcir(zzbfq zzbfqVar) {
        this.zzepi = zzbfqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbzi zzn(zzbfq zzbfqVar) {
        return new zzcir(zzbfqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzakj() {
        this.zzepi.destroy();
    }
}
