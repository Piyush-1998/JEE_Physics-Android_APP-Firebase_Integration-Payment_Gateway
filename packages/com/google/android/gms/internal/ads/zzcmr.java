package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcmr extends zzaik {
    private final /* synthetic */ zzcmi zzggp;
    private final /* synthetic */ Object zzggq;
    private final /* synthetic */ String zzggr;
    private final /* synthetic */ long zzggs;
    private final /* synthetic */ zzbbq zzggt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcmr(zzcmi zzcmiVar, Object obj, String str, long j, zzbbq zzbbqVar) {
        this.zzggp = zzcmiVar;
        this.zzggq = obj;
        this.zzggr = str;
        this.zzggs = j;
        this.zzggt = zzbbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void onInitializationSucceeded() {
        zzcls zzclsVar;
        synchronized (this.zzggq) {
            this.zzggp.zza(this.zzggr, true, "", (int) (com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - this.zzggs));
            zzclsVar = this.zzggp.zzggh;
            zzclsVar.zzgk(this.zzggr);
            this.zzggt.set(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void onInitializationFailed(String str) {
        zzcls zzclsVar;
        synchronized (this.zzggq) {
            this.zzggp.zza(this.zzggr, false, str, (int) (com.google.android.gms.ads.internal.zzp.zzkw().elapsedRealtime() - this.zzggs));
            zzclsVar = this.zzggp.zzggh;
            zzclsVar.zzr(this.zzggr, "error");
            this.zzggt.set(false);
        }
    }
}
