package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdvx implements Runnable {
    private final /* synthetic */ Runnable zzhqa;
    private final /* synthetic */ zzdvy zzhqb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvx(zzdvy zzdvyVar, Runnable runnable) {
        this.zzhqb = zzdvyVar;
        this.zzhqa = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzhqb.zzhqc = false;
        this.zzhqa.run();
    }

    public final String toString() {
        return this.zzhqa.toString();
    }
}
