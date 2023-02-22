package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzakw implements zzbbs {
    private final /* synthetic */ zzakk zzdgw;
    private final /* synthetic */ zzalb zzdha;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakw(zzakk zzakkVar, zzalb zzalbVar) {
        this.zzdgw = zzakkVar;
        this.zzdha = zzalbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbs
    public final void run() {
        Object obj;
        obj = this.zzdgw.lock;
        synchronized (obj) {
            this.zzdgw.status = 1;
            zzaxy.zzei("Failed loading new engine. Marking new engine destroyable.");
            this.zzdha.zzti();
        }
    }
}
