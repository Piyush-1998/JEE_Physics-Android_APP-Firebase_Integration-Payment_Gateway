package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehz;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzdwy<KeyFormatProtoT extends zzehz, KeyProtoT extends zzehz> {
    private final zzdxa<KeyFormatProtoT, KeyProtoT> zzhqw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwy(zzdxa<KeyFormatProtoT, KeyProtoT> zzdxaVar) {
        this.zzhqw = zzdxaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final KeyProtoT zzq(zzeff zzeffVar) throws GeneralSecurityException, zzegz {
        KeyFormatProtoT zzr = this.zzhqw.zzr(zzeffVar);
        this.zzhqw.zzd(zzr);
        return this.zzhqw.zze(zzr);
    }
}
