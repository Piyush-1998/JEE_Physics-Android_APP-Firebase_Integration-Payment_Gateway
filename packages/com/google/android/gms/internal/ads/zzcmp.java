package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcmp implements zzdvi<String> {
    final /* synthetic */ zzcmi zzggp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmp(zzcmi zzcmiVar) {
        this.zzggp = zzcmiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        long j;
        zzbbq zzbbqVar;
        synchronized (this) {
            this.zzggp.zzggc = true;
            zzcmi zzcmiVar = this.zzggp;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
            j = this.zzggp.zzggd;
            zzcmiVar.zza("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (elapsedRealtime - j));
            zzbbqVar = this.zzggp.zzgge;
            zzbbqVar.setException(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final /* synthetic */ void onSuccess(@Nullable String str) {
        long j;
        Executor executor;
        final String str2 = str;
        synchronized (this) {
            this.zzggp.zzggc = true;
            zzcmi zzcmiVar = this.zzggp;
            long elapsedRealtime = com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime();
            j = this.zzggp.zzggd;
            zzcmiVar.zza("com.google.android.gms.ads.MobileAds", true, "", (int) (elapsedRealtime - j));
            executor = this.zzggp.executor;
            executor.execute(new Runnable(this, str2) { // from class: com.google.android.gms.internal.ads.zzcms
                private final String zzdft;
                private final zzcmp zzggu;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzggu = this;
                    this.zzdft = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzcmp zzcmpVar = this.zzggu;
                    zzcmpVar.zzggp.zzgl(this.zzdft);
                }
            });
        }
    }
}
