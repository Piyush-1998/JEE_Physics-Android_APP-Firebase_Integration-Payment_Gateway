package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzpt extends Surface {
    private static boolean zzbko;
    private static boolean zzbkp;
    private final boolean zzbbb;
    private final zzpv zzbkq;
    private boolean zzbkr;

    public static synchronized boolean zzc(Context context) {
        boolean z;
        synchronized (zzpt.class) {
            if (!zzbkp) {
                if (zzpq.SDK_INT >= 17) {
                    boolean z2 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (!(zzpq.SDK_INT == 24 && (zzpq.MODEL.startsWith("SM-G950") || zzpq.MODEL.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                            z2 = true;
                        }
                    }
                    zzbko = z2;
                }
                zzbkp = true;
            }
            z = zzbko;
        }
        return z;
    }

    public static zzpt zzc(Context context, boolean z) {
        if (zzpq.SDK_INT < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        zzoz.checkState(!z || zzc(context));
        return new zzpv().zzm(z);
    }

    private zzpt(zzpv zzpvVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.zzbkq = zzpvVar;
        this.zzbbb = z;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzbkq) {
            if (!this.zzbkr) {
                this.zzbkq.release();
                this.zzbkr = true;
            }
        }
    }
}
