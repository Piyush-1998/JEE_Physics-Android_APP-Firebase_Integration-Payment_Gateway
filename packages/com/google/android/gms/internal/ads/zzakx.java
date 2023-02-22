package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzakx extends zzbbx<zzali> {
    private final Object lock = new Object();
    private final zzalb zzdhd;
    private boolean zzdhe;

    public zzakx(zzalb zzalbVar) {
        this.zzdhd = zzalbVar;
    }

    public final void release() {
        synchronized (this.lock) {
            if (this.zzdhe) {
                return;
            }
            this.zzdhe = true;
            zza(new zzala(this), new zzbbv());
            zza(new zzakz(this), new zzalc(this));
        }
    }
}
