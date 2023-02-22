package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzqh implements Runnable {
    private final /* synthetic */ zzho zzajb;
    private final /* synthetic */ zzqg zzbmt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqh(zzqg zzqgVar, zzho zzhoVar) {
        this.zzbmt = zzqgVar;
        this.zzajb = zzhoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqd zzqdVar;
        zzqdVar = this.zzbmt.zzbmu;
        zzqdVar.zzk(this.zzajb);
    }
}
