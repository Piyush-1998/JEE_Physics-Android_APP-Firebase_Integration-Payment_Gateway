package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzalx implements zzbbs {
    private final /* synthetic */ zzbbq zzdew;
    private final /* synthetic */ zzakx zzdib;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalx(zzalv zzalvVar, zzbbq zzbbqVar, zzakx zzakxVar) {
        this.zzdew = zzbbqVar;
        this.zzdib = zzakxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbs
    public final void run() {
        this.zzdew.setException(new zzalj("Unable to obtain a JavascriptEngine."));
        this.zzdib.release();
    }
}
