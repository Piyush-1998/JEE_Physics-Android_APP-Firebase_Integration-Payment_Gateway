package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzedi extends zzedh {
    public zzedi(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    final zzedf zze(byte[] bArr, int i) throws InvalidKeyException {
        return new zzedg(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzedh, com.google.android.gms.internal.ads.zzdwq
    public final /* bridge */ /* synthetic */ byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.zzc(bArr, bArr2);
    }
}
