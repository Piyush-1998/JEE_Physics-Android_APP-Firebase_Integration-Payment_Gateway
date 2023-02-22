package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzqj implements Runnable {
    private final /* synthetic */ zzqg zzbmt;
    private final /* synthetic */ int zzbmv;
    private final /* synthetic */ int zzbmw;
    private final /* synthetic */ int zzbmx;
    private final /* synthetic */ float zzbmy;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqj(zzqg zzqgVar, int i, int i2, int i3, float f) {
        this.zzbmt = zzqgVar;
        this.zzbmv = i;
        this.zzbmw = i2;
        this.zzbmx = i3;
        this.zzbmy = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqd zzqdVar;
        zzqdVar = this.zzbmt.zzbmu;
        zzqdVar.zza(this.zzbmv, this.zzbmw, this.zzbmx, this.zzbmy);
    }
}
