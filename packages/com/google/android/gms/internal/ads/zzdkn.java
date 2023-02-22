package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdkn implements zzcya<zzchu> {
    private final /* synthetic */ zzdkl zzgzt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkn(zzdkl zzdklVar) {
        this.zzgzt = zzdklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzaqe() {
        synchronized (this.zzgzt) {
            this.zzgzt.zzgzw = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final /* synthetic */ void onSuccess(zzchu zzchuVar) {
        zzchu zzchuVar2;
        zzchu zzchuVar3 = zzchuVar;
        synchronized (this.zzgzt) {
            this.zzgzt.zzgzw = zzchuVar3;
            zzchuVar2 = this.zzgzt.zzgzw;
            zzchuVar2.zzahw();
        }
    }
}
