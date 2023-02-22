package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzalb extends zzbbx<zzajx> {
    private zzazm<zzajx> zzdgp;
    private final Object lock = new Object();
    private boolean zzdhg = false;
    private int zzdhh = 0;

    public zzalb(zzazm<zzajx> zzazmVar) {
        this.zzdgp = zzazmVar;
    }

    public final zzakx zztg() {
        zzakx zzakxVar = new zzakx(this);
        synchronized (this.lock) {
            zza(new zzale(this, zzakxVar), new zzald(this, zzakxVar));
            Preconditions.checkState(this.zzdhh >= 0);
            this.zzdhh++;
        }
        return zzakxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzth() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdhh > 0);
            zzaxy.zzei("Releasing 1 reference for JS Engine");
            this.zzdhh--;
            zztj();
        }
    }

    public final void zzti() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdhh >= 0);
            zzaxy.zzei("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzdhg = true;
            zztj();
        }
    }

    private final void zztj() {
        synchronized (this.lock) {
            Preconditions.checkState(this.zzdhh >= 0);
            if (this.zzdhg && this.zzdhh == 0) {
                zzaxy.zzei("No reference is left (including root). Cleaning up engine.");
                zza(new zzalg(this), new zzbbv());
            } else {
                zzaxy.zzei("There are still references to the engine. Not destroying.");
            }
        }
    }
}
