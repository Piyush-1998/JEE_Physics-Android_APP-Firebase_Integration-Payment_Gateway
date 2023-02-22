package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzakr implements Runnable {
    private final /* synthetic */ zzalb zzdgu;
    private final /* synthetic */ zzajx zzdgv;
    private final /* synthetic */ zzakk zzdgw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakr(zzakk zzakkVar, zzalb zzalbVar, zzajx zzajxVar) {
        this.zzdgw = zzakkVar;
        this.zzdgu = zzalbVar;
        this.zzdgv = zzajxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzdgw.lock;
        synchronized (obj) {
            if (this.zzdgu.getStatus() != -1 && this.zzdgu.getStatus() != 1) {
                this.zzdgu.reject();
                zzdvw zzdvwVar = zzbbi.zzedy;
                zzajx zzajxVar = this.zzdgv;
                zzajxVar.getClass();
                zzdvwVar.execute(zzaku.zzb(zzajxVar));
                zzaxy.zzei("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
