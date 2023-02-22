package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaxi {
    private long zzdxm = -1;
    private long zzdxn = -1;
    private final /* synthetic */ zzaxj zzdxo;

    public zzaxi(zzaxj zzaxjVar) {
        this.zzdxo = zzaxjVar;
    }

    public final long zzvw() {
        return this.zzdxn;
    }

    public final void zzvx() {
        Clock clock;
        clock = this.zzdxo.zzbpw;
        this.zzdxn = clock.elapsedRealtime();
    }

    public final void zzvy() {
        Clock clock;
        clock = this.zzdxo.zzbpw;
        this.zzdxm = clock.elapsedRealtime();
    }

    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzdxm);
        bundle.putLong("tclose", this.zzdxn);
        return bundle;
    }
}
