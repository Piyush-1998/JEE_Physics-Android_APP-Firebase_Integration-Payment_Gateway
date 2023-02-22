package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzeg;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzl implements View.OnTouchListener {
    private final /* synthetic */ zzj zzbpi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzj zzjVar) {
        this.zzbpi = zzjVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzeg zzegVar;
        zzeg zzegVar2;
        zzegVar = this.zzbpi.zzbpg;
        if (zzegVar != null) {
            zzegVar2 = this.zzbpi.zzbpg;
            zzegVar2.zza(motionEvent);
            return false;
        }
        return false;
    }
}
