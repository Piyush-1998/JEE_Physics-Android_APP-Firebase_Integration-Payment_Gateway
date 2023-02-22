package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdkq implements zzcya<zzchu> {
    private final /* synthetic */ zzdkr zzgzx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkq(zzdkr zzdkrVar) {
        this.zzgzx = zzdkrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzaqe() {
        synchronized (this.zzgzx) {
            this.zzgzx.zzgzw = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final /* synthetic */ void onSuccess(zzchu zzchuVar) {
        zzchu zzchuVar2;
        zzchu zzchuVar3 = zzchuVar;
        synchronized (this.zzgzx) {
            this.zzgzx.zzgzw = zzchuVar3;
            zzchuVar2 = this.zzgzx.zzgzw;
            zzchuVar2.zzahw();
        }
    }
}
