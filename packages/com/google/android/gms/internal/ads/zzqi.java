package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzqi implements Runnable {
    private final /* synthetic */ String zzajc;
    private final /* synthetic */ long zzajd;
    private final /* synthetic */ long zzaje;
    private final /* synthetic */ zzqg zzbmt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzqi(zzqg zzqgVar, String str, long j, long j2) {
        this.zzbmt = zzqgVar;
        this.zzajc = str;
        this.zzajd = j;
        this.zzaje = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzqd zzqdVar;
        zzqdVar = this.zzbmt.zzbmu;
        zzqdVar.zzd(this.zzajc, this.zzajd, this.zzaje);
    }
}
