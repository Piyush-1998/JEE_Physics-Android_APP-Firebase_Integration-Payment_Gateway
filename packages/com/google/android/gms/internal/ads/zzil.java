package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzil implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ String zzajc;
    private final /* synthetic */ long zzajd;
    private final /* synthetic */ long zzaje;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzil(zzij zzijVar, String str, long j, long j2) {
        this.zzaiz = zzijVar;
        this.zzajc = str;
        this.zzajd = j;
        this.zzaje = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzig zzigVar;
        zzigVar = this.zzaiz.zzaja;
        zzigVar.zza(this.zzajc, this.zzajd, this.zzaje);
    }
}
