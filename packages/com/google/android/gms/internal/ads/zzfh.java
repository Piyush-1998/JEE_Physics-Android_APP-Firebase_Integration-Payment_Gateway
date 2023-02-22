package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzfh implements Runnable {
    private final /* synthetic */ zzfi zzaag;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfh(zzfi zzfiVar) {
        this.zzaag = zzfiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaag.zzcv();
    }
}
