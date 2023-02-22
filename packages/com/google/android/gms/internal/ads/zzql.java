package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzql implements Runnable {
    private final /* synthetic */ zzjl zzajf;
    private final /* synthetic */ zzqg zzbmt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzql(zzqg zzqgVar, zzjl zzjlVar) {
        this.zzbmt = zzqgVar;
        this.zzajf = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqd zzqdVar;
        this.zzajf.zzgl();
        zzqdVar = this.zzbmt.zzbmu;
        zzqdVar.zzf(this.zzajf);
    }
}
