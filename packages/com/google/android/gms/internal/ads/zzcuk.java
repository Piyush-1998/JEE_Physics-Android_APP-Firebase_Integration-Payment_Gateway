package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcuk<AdT> implements zzduv<zzdlj, AdT> {
    private final Executor executor;
    private final zzdps zzfli;
    private final ScheduledExecutorService zzfnh;
    private final zzdpf zzfqo;
    private final zzbsx zzfue;
    private final zzbpi<AdT> zzgnm;
    private final zzcud zzgnn;

    public zzcuk(zzdpf zzdpfVar, zzcud zzcudVar, zzbsx zzbsxVar, zzdps zzdpsVar, zzbpi<AdT> zzbpiVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zzfqo = zzdpfVar;
        this.zzgnn = zzcudVar;
        this.zzfue = zzbsxVar;
        this.zzfli = zzdpsVar;
        this.zzgnm = zzbpiVar;
        this.executor = executor;
        this.zzfnh = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final /* synthetic */ zzdvt zzf(zzdlj zzdljVar) throws Exception {
        final zzdlj zzdljVar2 = zzdljVar;
        zzdos zzauz = this.zzfqo.zzu(zzdpg.RENDER_CONFIG_INIT).zze(zzdvl.immediateFailedFuture(new zzcuh(zzdmd.zzhcq, "No ad config."))).zzauz();
        this.zzfue.zza(new zzblo(zzdljVar2, this.zzfli), this.executor);
        int i = 0;
        for (final zzdkx zzdkxVar : zzdljVar2.zzhbq.zzhbm) {
            Iterator<String> it = zzdkxVar.zzhaf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                final zzcre<AdT> zze = this.zzgnm.zze(zzdkxVar.zzhag, next);
                if (zze != null && zze.zza(zzdljVar2, zzdkxVar)) {
                    zzdox<I> zza = this.zzfqo.zza((zzdpf) zzdpg.RENDER_CONFIG_WATERFALL, (zzdvt) zzauz);
                    StringBuilder sb = new StringBuilder(String.valueOf(next).length() + 26);
                    sb.append("render-config-");
                    sb.append(i);
                    sb.append("-");
                    sb.append(next);
                    zzauz = zza.zzgx(sb.toString()).zza(Throwable.class, new zzduv(this, zzdljVar2, zzdkxVar, zze) { // from class: com.google.android.gms.internal.ads.zzcuj
                        private final zzdkx zzfoo;
                        private final zzdlj zzgbj;
                        private final zzcuk zzgnk;
                        private final zzcre zzgnl;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzgnk = this;
                            this.zzgbj = zzdljVar2;
                            this.zzfoo = zzdkxVar;
                            this.zzgnl = zze;
                        }

                        @Override // com.google.android.gms.internal.ads.zzduv
                        public final zzdvt zzf(Object obj) {
                            return this.zzgnk.zza(this.zzgbj, this.zzfoo, this.zzgnl, (Throwable) obj);
                        }
                    }).zzauz();
                    break;
                }
            }
            i++;
        }
        return zzauz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdlj zzdljVar, zzdkx zzdkxVar, zzcre zzcreVar, Throwable th) throws Exception {
        return this.zzgnn.zza(zzdljVar.zzhbq.zzhbn, zzdkxVar, zzdvl.zza(zzcreVar.zzb(zzdljVar, zzdkxVar), zzdkxVar.zzhax, TimeUnit.MILLISECONDS, this.zzfnh));
    }
}
