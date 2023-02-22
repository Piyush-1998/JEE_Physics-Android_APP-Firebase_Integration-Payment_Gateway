package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdyn implements zzdwq {
    private static final byte[] zzhsk = new byte[0];
    private final zzebw zzhsl;
    private final zzdwq zzhsm;

    public zzdyn(zzebw zzebwVar, zzdwq zzdwqVar) {
        this.zzhsl = zzebwVar;
        this.zzhsm = zzdwqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwq
    public final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] byteArray = zzdxm.zzb(this.zzhsl).toByteArray();
        byte[] zzc = this.zzhsm.zzc(byteArray, zzhsk);
        byte[] zzc2 = ((zzdwq) zzdxm.zza(this.zzhsl.zzbay(), byteArray, zzdwq.class)).zzc(bArr, bArr2);
        return ByteBuffer.allocate(zzc.length + 4 + zzc2.length).putInt(zzc.length).put(zzc).put(zzc2).array();
    }
}
