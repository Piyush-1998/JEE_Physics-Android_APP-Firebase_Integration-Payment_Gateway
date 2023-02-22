package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.ads.zzayy;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzj extends RelativeLayout {
    private zzayy zzdol;
    boolean zzdom;

    public zzj(Context context, String str, String str2) {
        super(context);
        zzayy zzayyVar = new zzayy(context, str);
        this.zzdol = zzayyVar;
        zzayyVar.zzae(str2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzdom) {
            return false;
        }
        this.zzdol.zzd(motionEvent);
        return false;
    }
}
