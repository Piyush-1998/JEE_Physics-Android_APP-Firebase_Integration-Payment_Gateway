package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzakq implements Runnable {
    private final zzajx zzdgx;

    private zzakq(zzajx zzajxVar) {
        this.zzdgx = zzajxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzajx zzajxVar) {
        return new zzakq(zzajxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdgx.destroy();
    }
}
