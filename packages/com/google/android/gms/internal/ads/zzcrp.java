package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzcrp implements zzbpe {
    private final zzbfq zzepi;

    private zzcrp(zzbfq zzbfqVar) {
        this.zzepi = zzbfqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbpe zzp(zzbfq zzbfqVar) {
        return new zzcrp(zzbfqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final zzyg getVideoController() {
        return this.zzepi.zzzo();
    }
}
