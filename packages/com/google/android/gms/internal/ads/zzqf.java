package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzqf implements Runnable {
    private final /* synthetic */ zzjl zzaiy;
    private final /* synthetic */ zzqg zzbmt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqf(zzqg zzqgVar, zzjl zzjlVar) {
        this.zzbmt = zzqgVar;
        this.zzaiy = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqd zzqdVar;
        zzqdVar = this.zzbmt.zzbmu;
        zzqdVar.zze(this.zzaiy);
    }
}
