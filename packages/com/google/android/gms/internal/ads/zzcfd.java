package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcfd implements zzdsl<zzy, Bitmap> {
    private final /* synthetic */ double zzgau;
    private final /* synthetic */ boolean zzgav;
    private final /* synthetic */ zzcfe zzgaw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcfd(zzcfe zzcfeVar, double d, boolean z) {
        this.zzgaw = zzcfeVar;
        this.zzgau = d;
        this.zzgav = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdsl
    public final /* synthetic */ Bitmap apply(zzy zzyVar) {
        Bitmap zza;
        zza = this.zzgaw.zza(zzyVar.data, this.zzgau, this.zzgav);
        return zza;
    }
}
