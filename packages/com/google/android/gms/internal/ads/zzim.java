package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzim implements Runnable {
    private final /* synthetic */ zzij zzaiz;
    private final /* synthetic */ zzjl zzajf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzim(zzij zzijVar, zzjl zzjlVar) {
        this.zzaiz = zzijVar;
        this.zzajf = zzjlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzig zzigVar;
        this.zzajf.zzgl();
        zzigVar = this.zzaiz.zzaja;
        zzigVar.zzb(this.zzajf);
    }
}
