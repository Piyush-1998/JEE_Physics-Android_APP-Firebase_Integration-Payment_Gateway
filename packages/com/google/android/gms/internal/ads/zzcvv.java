package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcvv implements zzcre<zzbni> {
    private final zzdpf zzfqo;
    private final zzboe zzglh;
    private final zzdvw zzgoi;
    private final Context zzgoo;
    private final zzabq zzgop;

    public zzcvv(Context context, zzboe zzboeVar, zzdpf zzdpfVar, zzdvw zzdvwVar, zzabq zzabqVar) {
        this.zzgoo = context;
        this.zzglh = zzboeVar;
        this.zzfqo = zzdpfVar;
        this.zzgoi = zzdvwVar;
        this.zzgop = zzabqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final boolean zza(zzdlj zzdljVar, zzdkx zzdkxVar) {
        return (this.zzgop == null || zzdkxVar.zzhao == null || zzdkxVar.zzhao.zzdou == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcre
    public final zzdvt<zzbni> zzb(zzdlj zzdljVar, zzdkx zzdkxVar) {
        zzbnh zza = this.zzglh.zza(new zzbpt(zzdljVar, zzdkxVar, null), new zzcwa(this, new View(this.zzgoo), null, zzcvy.zzgot, zzdkxVar.zzhaq.get(0)));
        final zzabj zzabjVar = new zzabj(zza.zzafu(), zzdkxVar.zzhao.zzdos, zzdkxVar.zzhao.zzdou);
        return this.zzfqo.zzu(zzdpg.CUSTOM_RENDER_SYN).zza(new zzdop(this, zzabjVar) { // from class: com.google.android.gms.internal.ads.zzcvx
            private final zzcvv zzgor;
            private final zzabj zzgos;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgor = this;
                this.zzgos = zzabjVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdop
            public final void run() {
                this.zzgor.zza(this.zzgos);
            }
        }, this.zzgoi).zzw(zzdpg.CUSTOM_RENDER_ACK).zze(zzdvl.zzaf(zza.zzafs())).zzauz();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzabj zzabjVar) throws Exception {
        this.zzgop.zza(zzabjVar);
    }
}
