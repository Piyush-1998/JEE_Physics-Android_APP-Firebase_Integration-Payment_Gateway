package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdal implements zzden<zzdek<Bundle>> {
    private final Executor executor;
    private final zzaxk zzbps;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdal(Executor executor, zzaxk zzaxkVar) {
        this.executor = executor;
        this.zzbps = zzaxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final zzdvt<zzdek<Bundle>> zzaqs() {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcqq)).booleanValue()) {
            return zzdvl.zzaf(null);
        }
        return zzdvl.zzb(this.zzbps.zzwk(), zzdak.zzdwg, this.executor);
    }
}
