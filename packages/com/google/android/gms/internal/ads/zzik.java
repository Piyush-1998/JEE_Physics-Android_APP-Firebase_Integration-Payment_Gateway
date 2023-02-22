package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzik implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ zzho zzajb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzik(zzij zzijVar, zzho zzhoVar) {
        this.zzaiz = zzijVar;
        this.zzajb = zzhoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzig zzigVar;
        zzigVar = this.zzaiz.zzaja;
        zzigVar.zzb(this.zzajb);
    }
}
