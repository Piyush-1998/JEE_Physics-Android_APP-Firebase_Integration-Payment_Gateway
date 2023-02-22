package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbpj {
    public final List<? extends zzdvt<? extends zzbpd>> zzfpy;

    public zzbpj(List<? extends zzdvt<? extends zzbpd>> list) {
        this.zzfpy = list;
    }

    public zzbpj(zzbpd zzbpdVar) {
        this.zzfpy = Collections.singletonList(zzdvl.zzaf(zzbpdVar));
    }

    public static zzcre<zzbpj> zza(zzctf<? extends zzbpd> zzctfVar) {
        return new zzcrd(zzctfVar, zzbpm.zzdwg);
    }

    public static zzcre<zzbpj> zza(zzcre<? extends zzbpd> zzcreVar) {
        return new zzcrd(zzcreVar, zzbpl.zzdwg);
    }
}
