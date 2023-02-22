package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzbav extends Thread {
    private final /* synthetic */ String zzeca;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbav(zzbas zzbasVar, String str) {
        this.zzeca = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzbbh().zzes(this.zzeca);
    }
}
