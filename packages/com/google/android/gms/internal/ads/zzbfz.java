package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbfz implements com.google.android.gms.ads.internal.overlay.zzo {
    private com.google.android.gms.ads.internal.overlay.zzo zzdor;
    private zzbfq zzemr;

    public zzbfz(zzbfq zzbfqVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.zzemr = zzbfqVar;
        this.zzdor = zzoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzuj() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzdor;
        if (zzoVar != null) {
            zzoVar.zzuj();
        }
        this.zzemr.zzuv();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzui() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzdor;
        if (zzoVar != null) {
            zzoVar.zzui();
        }
        this.zzemr.zzaax();
    }
}
