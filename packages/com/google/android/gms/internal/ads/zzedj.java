package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzedj implements zzdwu {
    private static final byte[] zzhsk = new byte[0];
    private final ECPrivateKey zzhyr;
    private final zzedl zzhys;
    private final String zzhyt;
    private final byte[] zzhyu;
    private final zzedr zzhyv;
    private final zzedk zzhyw;

    public zzedj(ECPrivateKey eCPrivateKey, byte[] bArr, String str, zzedr zzedrVar, zzedk zzedkVar) throws GeneralSecurityException {
        this.zzhyr = eCPrivateKey;
        this.zzhys = new zzedl(eCPrivateKey);
        this.zzhyu = bArr;
        this.zzhyt = str;
        this.zzhyv = zzedrVar;
        this.zzhyw = zzedkVar;
    }
}
