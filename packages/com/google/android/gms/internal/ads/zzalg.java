package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzalg implements zzbbu<zzajx> {
    final /* synthetic */ zzalb zzdhl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzalg(zzalb zzalbVar) {
        this.zzdhl = zzalbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbu
    public final /* synthetic */ void zzh(zzajx zzajxVar) {
        final zzajx zzajxVar2 = zzajxVar;
        zzbbi.zzedy.execute(new Runnable(this, zzajxVar2) { // from class: com.google.android.gms.internal.ads.zzalf
            private final zzalg zzdhj;
            private final zzajx zzdhk;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdhj = this;
                this.zzdhk = zzajxVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzazm zzazmVar;
                zzalg zzalgVar = this.zzdhj;
                zzajx zzajxVar3 = this.zzdhk;
                zzazmVar = zzalgVar.zzdhl.zzdgp;
                zzazmVar.zzh(zzajxVar3);
                zzajxVar3.destroy();
            }
        });
    }
}
