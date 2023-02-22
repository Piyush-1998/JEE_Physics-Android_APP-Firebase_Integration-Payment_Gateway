package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzcvu implements zzbuf {
    private final /* synthetic */ zzcrg zzgnw;
    private boolean zzgol = false;
    private final /* synthetic */ zzbbq zzgom;
    private final /* synthetic */ zzcvp zzgon;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcvu(zzcvp zzcvpVar, zzcrg zzcrgVar, zzbbq zzbbqVar) {
        this.zzgon = zzcvpVar;
        this.zzgnw = zzcrgVar;
        this.zzgom = zzbbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final void onAdFailedToLoad(int i) {
        if (this.zzgol) {
            return;
        }
        zzi(new zzuw(i, zzcvp.zza(this.zzgnw.zzfqh, i), AdError.UNDEFINED_DOMAIN, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzf(int i, String str) {
        if (this.zzgol) {
            return;
        }
        this.zzgol = true;
        if (str == null) {
            str = zzcvp.zza(this.zzgnw.zzfqh, i);
        }
        zzi(new zzuw(i, str, AdError.UNDEFINED_DOMAIN, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void zzg(zzuw zzuwVar) {
        this.zzgol = true;
        zzi(zzuwVar);
    }

    private final void zzi(zzuw zzuwVar) {
        int i = zzdmd.zzhco;
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcuk)).booleanValue()) {
            i = zzdmd.zzhcq;
        }
        this.zzgom.setException(new zzcri(i, zzuwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbuf
    public final synchronized void onAdLoaded() {
        this.zzgom.set(null);
    }
}
