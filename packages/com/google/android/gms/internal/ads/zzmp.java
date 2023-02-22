package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzmp implements Runnable {
    private final /* synthetic */ zzmn zzbeg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzmp(zzmn zzmnVar) {
        this.zzbeg = zzmnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        zzna zznaVar;
        z = this.zzbeg.zzage;
        if (z) {
            return;
        }
        zznaVar = this.zzbeg.zzbdr;
        zznaVar.zza((zzna) this.zzbeg);
    }
}
