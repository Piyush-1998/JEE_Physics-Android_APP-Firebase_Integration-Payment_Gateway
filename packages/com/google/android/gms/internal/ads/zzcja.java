package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcja implements zzbtp {
    private final zzbfq zzdgc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcja(zzbfq zzbfqVar) {
        this.zzdgc = ((Boolean) zzwe.zzpu().zzd(zzaat.zzcnx)).booleanValue() ? zzbfqVar : null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzbz(Context context) {
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null) {
            zzbfqVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzca(Context context) {
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null) {
            zzbfqVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    public final void zzcb(Context context) {
        zzbfq zzbfqVar = this.zzdgc;
        if (zzbfqVar != null) {
            zzbfqVar.destroy();
        }
    }
}
