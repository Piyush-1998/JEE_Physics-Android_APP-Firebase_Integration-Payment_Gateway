package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcik implements com.google.android.gms.ads.internal.zzk {
    private final /* synthetic */ zzcih zzgdk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcik(zzcih zzcihVar) {
        this.zzgdk = zzcihVar;
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final void zzkl() {
        zzbvb zzbvbVar;
        zzbvbVar = this.zzgdk.zzgdg;
        zzbvbVar.onPause();
    }

    @Override // com.google.android.gms.ads.internal.zzk
    public final void zzkm() {
        zzbvb zzbvbVar;
        zzbvbVar = this.zzgdk.zzgdg;
        zzbvbVar.onResume();
    }
}
