package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcom extends zzasi {
    private final /* synthetic */ zzcoj zzgig;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcom(zzcoj zzcojVar) {
        this.zzgig = zzcojVar;
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zzb(ParcelFileDescriptor parcelFileDescriptor) {
        this.zzgig.zzdih.set(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    @Override // com.google.android.gms.internal.ads.zzasj
    public final void zza(zzazl zzazlVar) {
        this.zzgig.zzdih.setException(new zzazk(zzazlVar.zzacm, zzazlVar.errorCode));
    }
}
