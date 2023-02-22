package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzald implements zzbbs {
    private final /* synthetic */ zzakx zzdhi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzald(zzalb zzalbVar, zzakx zzakxVar) {
        this.zzdhi = zzakxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbs
    public final void run() {
        zzaxy.zzei("Rejecting reference for JS Engine.");
        this.zzdhi.reject();
    }
}
