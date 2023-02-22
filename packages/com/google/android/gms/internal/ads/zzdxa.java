package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehz;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public abstract class zzdxa<KeyFormatProtoT extends zzehz, KeyT> {
    private final Class<KeyFormatProtoT> zzhqt;

    public zzdxa(Class<KeyFormatProtoT> cls) {
        this.zzhqt = cls;
    }

    public abstract void zzd(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyT zze(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract KeyFormatProtoT zzr(zzeff zzeffVar) throws zzegz;

    public final Class<KeyFormatProtoT> zzaxw() {
        return this.zzhqt;
    }
}
