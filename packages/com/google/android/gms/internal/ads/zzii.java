package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzii implements Runnable {
    private final /* synthetic */ zzjl zzaiy;
    private final /* synthetic */ zzij zzaiz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzii(zzij zzijVar, zzjl zzjlVar) {
        this.zzaiz = zzijVar;
        this.zzaiy = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzig zzigVar;
        zzigVar = this.zzaiz.zzaja;
        zzigVar.zza(this.zzaiy);
    }
}
