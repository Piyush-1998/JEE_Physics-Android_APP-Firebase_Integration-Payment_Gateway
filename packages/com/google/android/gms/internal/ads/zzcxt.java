package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcxt implements zzcya<zzbpd> {
    private final /* synthetic */ zzcxu zzgqu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcxt(zzcxu zzcxuVar) {
        this.zzgqu = zzcxuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzaqe() {
        synchronized (this.zzgqu) {
            this.zzgqu.zzaey = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final /* synthetic */ void onSuccess(zzbpd zzbpdVar) {
        zzbpd zzbpdVar2 = zzbpdVar;
        synchronized (this.zzgqu) {
            this.zzgqu.zzaey = false;
            this.zzgqu.zzadq = zzbpdVar2.zzaim();
            zzbpdVar2.zzahw();
        }
    }
}
