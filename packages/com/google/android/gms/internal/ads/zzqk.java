package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzqk implements Runnable {
    private final /* synthetic */ zzqg zzbmt;
    private final /* synthetic */ int zzbmz;
    private final /* synthetic */ long zzbna;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqk(zzqg zzqgVar, int i, long j) {
        this.zzbmt = zzqgVar;
        this.zzbmz = i;
        this.zzbna = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqd zzqdVar;
        zzqdVar = this.zzbmt.zzbmu;
        zzqdVar.zze(this.zzbmz, this.zzbna);
    }
}
