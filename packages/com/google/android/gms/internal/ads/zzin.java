package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzin implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ int zzajg;
    private final /* synthetic */ long zzajh;
    private final /* synthetic */ long zzaji;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzin(zzij zzijVar, int i, long j, long j2) {
        this.zzaiz = zzijVar;
        this.zzajg = i;
        this.zzajh = j;
        this.zzaji = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzig zzigVar;
        zzigVar = this.zzaiz.zzaja;
        zzigVar.zza(this.zzajg, this.zzajh, this.zzaji);
    }
}
