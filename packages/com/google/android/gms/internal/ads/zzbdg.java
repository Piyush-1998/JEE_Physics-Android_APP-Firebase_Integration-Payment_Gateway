package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbdg implements Runnable {
    private boolean zzbsq = false;
    private zzbcr zzegi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdg(zzbcr zzbcrVar) {
        this.zzegi = zzbcrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzbsq) {
            return;
        }
        this.zzegi.zzzg();
        zzzx();
    }

    public final void pause() {
        this.zzbsq = true;
        this.zzegi.zzzg();
    }

    public final void resume() {
        this.zzbsq = false;
        zzzx();
    }

    private final void zzzx() {
        zzayh.zzeaj.removeCallbacks(this);
        zzayh.zzeaj.postDelayed(this, 250L);
    }
}
