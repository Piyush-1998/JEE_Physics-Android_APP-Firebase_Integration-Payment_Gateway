package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbbp implements zzdvi<Object> {
    private final /* synthetic */ String zzeed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbp(String str) {
        this.zzeed = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void onSuccess(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzdvi
    public final void zzb(Throwable th) {
        com.google.android.gms.ads.internal.zzp.zzkt().zza(th, this.zzeed);
    }
}
