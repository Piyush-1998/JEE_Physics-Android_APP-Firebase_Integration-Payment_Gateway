package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzip implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ int zzall;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zzij zzijVar, int i) {
        this.zzaiz = zzijVar;
        this.zzall = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzig zzigVar;
        zzigVar = this.zzaiz.zzaja;
        zzigVar.zzx(this.zzall);
    }
}
