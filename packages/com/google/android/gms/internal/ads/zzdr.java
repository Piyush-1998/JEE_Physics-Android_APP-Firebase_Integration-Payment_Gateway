package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdr implements Runnable {
    private final /* synthetic */ zzdp zzwd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdr(zzdp zzdpVar) {
        this.zzwd = zzdpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzdpy zzdpyVar;
        Object obj2;
        obj = this.zzwd.zzwb;
        synchronized (obj) {
            z = this.zzwd.zzwc;
            if (z) {
                return;
            }
            this.zzwd.zzwc = true;
            try {
                this.zzwd.zzbs();
            } catch (Exception e) {
                zzdpyVar = this.zzwd.zzvw;
                zzdpyVar.zza(2023, -1L, e);
            }
            obj2 = this.zzwd.zzwb;
            synchronized (obj2) {
                this.zzwd.zzwc = false;
            }
        }
    }
}
