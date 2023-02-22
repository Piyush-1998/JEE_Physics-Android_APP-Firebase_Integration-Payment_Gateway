package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdfh implements zzden<zzdfe> {
    private final Executor executor;
    private final PackageInfo zzdpx;
    private final zzaxg zzgvu;
    private final String zzgvx;

    public zzdfh(zzaxg zzaxgVar, Executor executor, String str, PackageInfo packageInfo) {
        this.zzgvu = zzaxgVar;
        this.executor = executor;
        this.zzgvx = str;
        this.zzdpx = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdfe> zzaqs() {
        return zzdvl.zzb(zzdvl.zzb(this.zzgvu.zza(this.zzgvx, this.zzdpx), zzdfg.zzdwg, this.executor), Throwable.class, new zzduv(this) { // from class: com.google.android.gms.internal.ads.zzdfj
            private final zzdfh zzgvz;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgvz = this;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return this.zzgvz.zzg((Throwable) obj);
            }
        }, this.executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdvt zzg(Throwable th) throws Exception {
        return zzdvl.zzaf(new zzdfe(this.zzgvx));
    }
}
