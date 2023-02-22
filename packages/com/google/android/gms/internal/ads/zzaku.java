package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzaku implements Runnable {
    private final zzajx zzdgx;

    private zzaku(zzajx zzajxVar) {
        this.zzdgx = zzajxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Runnable zzb(zzajx zzajxVar) {
        return new zzaku(zzajxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzdgx.destroy();
    }
}
