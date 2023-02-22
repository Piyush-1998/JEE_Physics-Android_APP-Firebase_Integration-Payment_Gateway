package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzces implements zzbtm {
    private final zzccv zzfvt;
    private final zzccz zzfwz;

    public zzces(zzccv zzccvVar, zzccz zzcczVar) {
        this.zzfvt = zzccvVar;
        this.zzfwz = zzcczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtm
    public final void onAdImpression() {
        if (this.zzfvt.zzalu() == null) {
            return;
        }
        zzbfq zzalt = this.zzfvt.zzalt();
        zzbfq zzals = this.zzfvt.zzals();
        if (zzalt == null) {
            zzalt = zzals != null ? zzals : null;
        }
        if (!this.zzfwz.zzalj() || zzalt == null) {
            return;
        }
        zzalt.zza("onSdkImpression", new ArrayMap());
    }
}
