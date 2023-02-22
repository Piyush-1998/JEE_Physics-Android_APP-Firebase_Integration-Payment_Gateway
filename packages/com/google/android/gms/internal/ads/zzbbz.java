package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbbz implements zzdvi<T> {
    private final /* synthetic */ zzbbu zzeej;
    private final /* synthetic */ zzbbs zzeek;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbz(zzbbx zzbbxVar, zzbbu zzbbuVar, zzbbs zzbbsVar) {
        this.zzeej = zzbbuVar;
        this.zzeek = zzbbsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void onSuccess(T t) {
        this.zzeej.zzh(t);
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        this.zzeek.run();
    }
}
