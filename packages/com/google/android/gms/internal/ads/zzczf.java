package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczf implements zzduv<zzasp, zzczg> {
    private Executor executor;
    private zzcnq zzgsa;

    public zzczf(Executor executor, zzcnq zzcnqVar) {
        this.executor = executor;
        this.zzgsa = zzcnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzduv
    public final /* synthetic */ zzdvt<zzczg> zzf(zzasp zzaspVar) throws Exception {
        final zzasp zzaspVar2 = zzaspVar;
        return zzdvl.zzb(this.zzgsa.zzg(zzaspVar2), new zzduv(zzaspVar2) { // from class: com.google.android.gms.internal.ads.zzcze
            private final zzasp zzftf;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzftf = zzaspVar2;
            }

            @Override // com.google.android.gms.internal.ads.zzduv
            public final zzdvt zzf(Object obj) {
                return zzdvl.zzaf(new zzczg(new JsonReader(new InputStreamReader((InputStream) obj))).zzo(this.zzftf.zzdtd));
            }
        }, this.executor);
    }
}
