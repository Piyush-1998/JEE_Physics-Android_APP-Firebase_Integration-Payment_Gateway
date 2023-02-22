package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
abstract class zzedh implements zzdwq {
    private final zzedf zzhyp;
    private final zzedf zzhyq;

    public zzedh(byte[] bArr) throws InvalidKeyException {
        this.zzhyp = zze(bArr, 1);
        this.zzhyq = zze(bArr, 0);
    }

    abstract zzedf zze(byte[] bArr, int i) throws InvalidKeyException;

    @Override // com.google.android.gms.internal.ads.zzdwq
    public byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > (Integer.MAX_VALUE - this.zzhyp.zzbcs()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.zzhyp.zzbcs() + 16);
        if (allocate.remaining() < bArr.length + this.zzhyp.zzbcs() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int position = allocate.position();
        this.zzhyp.zza(allocate, bArr);
        allocate.position(position);
        byte[] bArr3 = new byte[this.zzhyp.zzbcs()];
        allocate.get(bArr3);
        allocate.limit(allocate.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = new byte[32];
        this.zzhyq.zzd(bArr3, 0).get(bArr4);
        int length = bArr2.length % 16 == 0 ? bArr2.length : (bArr2.length + 16) - (bArr2.length % 16);
        int remaining = allocate.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr2);
        order.position(length);
        order.put(allocate);
        order.position(i2);
        order.putLong(bArr2.length);
        order.putLong(remaining);
        byte[] zze = zzeef.zze(bArr4, order.array());
        allocate.limit(allocate.limit() + 16);
        allocate.put(zze);
        return allocate.array();
    }
}
