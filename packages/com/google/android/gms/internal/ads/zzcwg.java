package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcwg implements com.google.android.gms.ads.internal.zzg {
    private final /* synthetic */ zzdkx zzgnh;
    private final /* synthetic */ zzdlj zzgnv;
    private final /* synthetic */ zzbbq zzgoz;
    private final /* synthetic */ zzcwm zzgpa;
    private final /* synthetic */ zzcwe zzgpb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcwg(zzcwe zzcweVar, zzbbq zzbbqVar, zzdlj zzdljVar, zzdkx zzdkxVar, zzcwm zzcwmVar) {
        this.zzgpb = zzcweVar;
        this.zzgoz = zzbbqVar;
        this.zzgnv = zzdljVar;
        this.zzgnh = zzdkxVar;
        this.zzgpa = zzcwmVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzka() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzkb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzh(View view) {
        zzcwf zzcwfVar;
        zzbbq zzbbqVar = this.zzgoz;
        zzcwfVar = this.zzgpb.zzgoy;
        zzbbqVar.set(zzcwfVar.zza(this.zzgnv, this.zzgnh, view, this.zzgpa));
    }
}
