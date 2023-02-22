package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbse;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdii<R extends zzbse<AdT>, AdT extends zzbpd> implements zzdiz<R, zzdim<AdT>> {
    private final Executor executor;
    private final zzdna zzgyr;
    private zzdvi<Void> zzgys = new zzdin(this);

    public zzdii(zzdna zzdnaVar, Executor executor) {
        this.zzgyr = zzdnaVar;
        this.executor = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final /* bridge */ /* synthetic */ Object zzasb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdiz
    public final zzdvt<zzdim<AdT>> zza(final zzdja zzdjaVar, final zzdjb<R> zzdjbVar) {
        return zzdvc.zzg(new zzdit(this.zzgyr, zzdjaVar.zzgzc, zzdjbVar, this.executor).zzasg()).zzb(new zzduv(this, zzdjaVar, zzdjbVar) { // from class: com.google.android.gms.internal.ads.zzdil
            private final zzdja zzgyf;
            private final zzdii zzgyu;
            private final zzdjb zzgyv;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgyu = this;
                this.zzgyf = zzdjaVar;
                this.zzgyv = zzdjbVar;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgyu.zza(this.zzgyf, this.zzgyv, (zzdix) obj);
            }
        }, this.executor).zza(Exception.class, new zzdik(this), this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zza(zzdja zzdjaVar, zzdjb zzdjbVar, zzdix zzdixVar) throws Exception {
        zzdnk zzdnkVar = zzdixVar.zzgyp;
        zzasp zzaspVar = zzdixVar.zzgid;
        zzdnh<?> zza = zzdnkVar != null ? this.zzgyr.zza(zzdnkVar) : null;
        if (zzdnkVar == null) {
            return zzdvl.zzaf(null);
        }
        if (zza != null && zzaspVar != null) {
            zzdvl.zza(((zzbse) zzdjbVar.zzc(zzdjaVar.zzgzc).zzael()).zzafc().zzc(zzaspVar), this.zzgys, this.executor);
        }
        return zzdvl.zzaf(new zzdim(zzdnkVar, zzaspVar, zza));
    }
}
