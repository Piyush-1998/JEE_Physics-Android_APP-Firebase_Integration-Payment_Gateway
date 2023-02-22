package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcap implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzbur zzfvb;
    private final zzbyo zzfvc;

    public zzcap(zzbur zzburVar, zzbyo zzbyoVar) {
        this.zzfvb = zzburVar;
        this.zzfvc = zzbyoVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzui() {
        this.zzfvb.zzui();
        this.zzfvc.onHide();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
        this.zzfvb.onPause();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
        this.zzfvb.onResume();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzuj() {
        this.zzfvb.zzuj();
        this.zzfvc.zzakg();
    }
}
