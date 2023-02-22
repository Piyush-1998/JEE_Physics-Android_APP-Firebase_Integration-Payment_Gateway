package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcdw implements zzadk {
    private final /* synthetic */ zzcep zzfzn;
    private final /* synthetic */ ViewGroup zzfzo;
    private final /* synthetic */ zzcdr zzfzp;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcdw(zzcdr zzcdrVar, zzcep zzcepVar, ViewGroup viewGroup) {
        this.zzfzp = zzcdrVar;
        this.zzfzn = zzcepVar;
        this.zzfzo = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzse() {
        boolean zza;
        zzcdr zzcdrVar = this.zzfzp;
        zza = zzcdr.zza(this.zzfzn, zzcdp.zzfyv);
        if (zza) {
            this.zzfzn.onClick(this.zzfzo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzc(MotionEvent motionEvent) {
        this.zzfzn.onTouch(null, motionEvent);
    }
}
