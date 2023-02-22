package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzakt implements zzbbu<zzajx> {
    private final /* synthetic */ zzakk zzdgw;
    private final /* synthetic */ zzalb zzdha;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzakt(zzakk zzakkVar, zzalb zzalbVar) {
        this.zzdgw = zzakkVar;
        this.zzdha = zzalbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final /* synthetic */ void zzh(zzajx zzajxVar) {
        Object obj;
        zzalb zzalbVar;
        zzalb zzalbVar2;
        zzalb zzalbVar3;
        obj = this.zzdgw.lock;
        synchronized (obj) {
            this.zzdgw.status = 0;
            zzalbVar = this.zzdgw.zzdgq;
            if (zzalbVar != null) {
                zzalb zzalbVar4 = this.zzdha;
                zzalbVar2 = this.zzdgw.zzdgq;
                if (zzalbVar4 != zzalbVar2) {
                    zzaxy.zzei("New JS engine is loaded, marking previous one as destroyable.");
                    zzalbVar3 = this.zzdgw.zzdgq;
                    zzalbVar3.zzti();
                }
            }
            this.zzdgw.zzdgq = this.zzdha;
        }
    }
}
