package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzccm extends zzadu {
    private final zzccv zzfvt;
    private IObjectWrapper zzfwv;

    public zzccm(zzccv zzccvVar) {
        this.zzfvt = zzccvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final float getAspectRatio() throws RemoteException {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwa)).booleanValue()) {
            if (this.zzfvt.getMediaContentAspectRatio() != 0.0f) {
                return this.zzfvt.getMediaContentAspectRatio();
            }
            if (this.zzfvt.getVideoController() != null) {
                return zzalh();
            }
            IObjectWrapper iObjectWrapper = this.zzfwv;
            if (iObjectWrapper != null) {
                return zzar(iObjectWrapper);
            }
            zzadw zzalp = this.zzfvt.zzalp();
            if (zzalp == null) {
                return 0.0f;
            }
            float width = (zzalp == null || zzalp.getWidth() == -1 || zzalp.getHeight() == -1) ? 0.0f : zzalp.getWidth() / zzalp.getHeight();
            return width != 0.0f ? width : zzar(zzalp.zzsd());
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final float getDuration() throws RemoteException {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwb)).booleanValue() && this.zzfvt.getVideoController() != null) {
            return this.zzfvt.getVideoController().getDuration();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final float getCurrentTime() throws RemoteException {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwb)).booleanValue() && this.zzfvt.getVideoController() != null) {
            return this.zzfvt.getVideoController().getCurrentTime();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final zzyg getVideoController() throws RemoteException {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwb)).booleanValue()) {
            return this.zzfvt.getVideoController();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final boolean hasVideoContent() throws RemoteException {
        return ((Boolean) zzwe.zzpu().zzd(zzaat.zzcwb)).booleanValue() && this.zzfvt.getVideoController() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zza(zzafi zzafiVar) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcwb)).booleanValue() && (this.zzfvt.getVideoController() instanceof zzbgk)) {
            ((zzbgk) this.zzfvt.getVideoController()).zza(zzafiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final void zzo(IObjectWrapper iObjectWrapper) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcrq)).booleanValue()) {
            this.zzfwv = iObjectWrapper;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadr
    public final IObjectWrapper zzsf() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzfwv;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzadw zzalp = this.zzfvt.zzalp();
        if (zzalp == null) {
            return null;
        }
        return zzalp.zzsd();
    }

    private final float zzalh() {
        try {
            return this.zzfvt.getVideoController().getAspectRatio();
        } catch (RemoteException e) {
            zzaxy.zzc("Remote exception getting video controller aspect ratio.", e);
            return 0.0f;
        }
    }

    private static float zzar(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }
}
