package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbse;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdhy<R extends zzbse<AdT>, AdT extends zzbpd> implements zzdiz<R, zzdnh<AdT>> {
    private final Executor executor = zzdvv.zzaxm();
    private R zzgxy;

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final zzdvt<zzdnh<AdT>> zza(zzdja zzdjaVar, zzdjb<R> zzdjbVar) {
        zzdvt<zzdlj> zzaiu;
        zzbsd<R> zzc = zzdjbVar.zzc(zzdjaVar.zzgzc);
        zzc.zza(new zzdjf(true));
        R zzael = zzc.zzael();
        this.zzgxy = zzael;
        final zzbqb zzafc = zzael.zzafc();
        final zzdnh zzdnhVar = new zzdnh();
        if (zzdjaVar.zzgzb != null) {
            zzaiu = zzafc.zza(zzdjaVar.zzgzb);
        } else {
            zzaiu = zzafc.zzaiu();
        }
        return zzdvc.zzg(zzaiu).zzb(new zzduv(this, zzdnhVar, zzafc) { // from class: com.google.android.gms.internal.ads.zzdib
            private final zzdhy zzgyb;
            private final zzdnh zzgyc;
            private final zzbqb zzgyd;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgyb = this;
                this.zzgyc = zzdnhVar;
                this.zzgyd = zzafc;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                zzdnh zzdnhVar2 = this.zzgyc;
                zzbqb zzbqbVar = this.zzgyd;
                zzdlj zzdljVar = (zzdlj) obj;
                zzdnhVar2.zzeua = zzdljVar;
                Iterator<zzdkx> it = zzdljVar.zzhbq.zzhbm.iterator();
                boolean z = false;
                boolean z2 = false;
                loop0: while (true) {
                    if (!it.hasNext()) {
                        z = z2;
                        break;
                    }
                    for (String str : it.next().zzhaf) {
                        if (!str.contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z2 = true;
                    }
                }
                if (!z) {
                    return zzdvl.zzaf(null);
                }
                return zzbqbVar.zzb(zzdvl.zzaf(zzdljVar));
            }
        }, this.executor).zza(new zzdsl(zzdnhVar) { // from class: com.google.android.gms.internal.ads.zzdia
            private final zzdnh zzgya;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgya = zzdnhVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdsl
            public final Object apply(Object obj) {
                zzdnh zzdnhVar2 = this.zzgya;
                zzdnhVar2.zzhfi = (AdT) obj;
                return zzdnhVar2;
            }
        }, this.executor);
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final /* synthetic */ Object zzasb() {
        return this.zzgxy;
    }
}
