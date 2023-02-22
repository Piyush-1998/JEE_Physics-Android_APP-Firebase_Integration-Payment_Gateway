package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcgv implements zzadk {
    private final /* synthetic */ zzcgw zzgcg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcgv(zzcgw zzcgwVar) {
        this.zzgcg = zzcgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzc(MotionEvent motionEvent) {
    }

    @Override // com.google.android.gms.internal.ads.zzadk
    public final void zzse() {
        zzcco zzccoVar;
        zzcco zzccoVar2;
        zzccoVar = this.zzgcg.zzfyz;
        if (zzccoVar != null) {
            zzccoVar2 = this.zzgcg.zzfyz;
            zzccoVar2.zzfz(NativeCustomTemplateAd.ASSET_NAME_VIDEO);
        }
    }
}
