package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzaxu {
    private volatile Thread thread;
    private final Runnable zzdze = new zzaxx(this);
    private boolean zzdzf = false;

    public abstract void zzuy();

    public final zzdvt<?> zzwv() {
        return zzbbi.zzedv.zzf(this.zzdze);
    }
}
