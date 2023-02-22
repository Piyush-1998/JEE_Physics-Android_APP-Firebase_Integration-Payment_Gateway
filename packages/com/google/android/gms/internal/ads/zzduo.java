package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzduo implements Runnable {
    private final /* synthetic */ zzdvt zzhox;
    private final /* synthetic */ int zzhoy;
    private final /* synthetic */ zzdup zzhoz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduo(zzdup zzdupVar, zzdvt zzdvtVar, int i) {
        this.zzhoz = zzdupVar;
        this.zzhox = zzdvtVar;
        this.zzhoy = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.zzhox.isCancelled()) {
                this.zzhoz.zzhpa = null;
                this.zzhoz.cancel(false);
            } else {
                this.zzhoz.zza(this.zzhoy, this.zzhox);
            }
        } finally {
            this.zzhoz.zza((zzdtf) null);
        }
    }
}
