package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzabt {
    private MotionEvent zzcyx = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzcyy = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    public final void zza(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zzcyx.getEventTime()) {
            this.zzcyx = motionEvent;
        } else if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzcyy.getEventTime()) {
        } else {
            this.zzcyy = motionEvent;
        }
    }

    public final MotionEvent zzrs() {
        return this.zzcyx;
    }

    public final MotionEvent zzrt() {
        return this.zzcyy;
    }
}
