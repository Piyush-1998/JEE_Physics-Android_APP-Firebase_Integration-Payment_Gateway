package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfc implements Runnable {
    private final /* synthetic */ zzex zzzk;
    private final /* synthetic */ int zzzn;
    private final /* synthetic */ boolean zzzo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfc(zzex zzexVar, int i, boolean z) {
        this.zzzk = zzexVar;
        this.zzzn = i;
        this.zzzo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zza;
        zzcf.zza zzb = this.zzzk.zzb(this.zzzn, this.zzzo);
        this.zzzk.zzzb = zzb;
        zza = zzex.zza(this.zzzn, zzb);
        if (zza) {
            this.zzzk.zza(this.zzzn + 1, this.zzzo);
        }
    }
}
