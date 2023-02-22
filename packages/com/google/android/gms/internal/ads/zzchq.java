package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchq extends VideoController.VideoLifecycleCallbacks {
    private final zzccv zzfvt;

    public zzchq(zzccv zzccvVar) {
        this.zzfvt = zzccvVar;
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzyl zza = zza(this.zzfvt);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoStart();
        } catch (RemoteException e) {
            zzaxy.zzd("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzyl zza = zza(this.zzfvt);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoPause();
        } catch (RemoteException e) {
            zzaxy.zzd("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzyl zza = zza(this.zzfvt);
        if (zza == null) {
            return;
        }
        try {
            zza.onVideoEnd();
        } catch (RemoteException e) {
            zzaxy.zzd("Unable to call onVideoEnd()", e);
        }
    }

    private static zzyl zza(zzccv zzccvVar) {
        zzyg videoController = zzccvVar.getVideoController();
        if (videoController == null) {
            return null;
        }
        try {
            return videoController.zzqj();
        } catch (RemoteException unused) {
            return null;
        }
    }
}
