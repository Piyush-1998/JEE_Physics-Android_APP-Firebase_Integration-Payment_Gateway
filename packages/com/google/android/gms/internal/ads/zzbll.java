package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbll implements zzbtp {
    private final zzdlx zzfle;

    public zzbll(zzdlx zzdlxVar) {
        this.zzfle = zzdlxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzbz(Context context) {
        try {
            this.zzfle.pause();
        } catch (zzdlr e) {
            zzaxy.zzd("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzca(Context context) {
        try {
            this.zzfle.resume();
            if (context != null) {
                this.zzfle.onContextChanged(context);
            }
        } catch (zzdlr e) {
            zzaxy.zzd("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzcb(Context context) {
        try {
            this.zzfle.destroy();
        } catch (zzdlr e) {
            zzaxy.zzd("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }
}
