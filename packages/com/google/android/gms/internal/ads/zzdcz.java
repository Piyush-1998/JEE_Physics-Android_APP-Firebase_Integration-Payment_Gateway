package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdcz implements zzelo<zzdcx> {
    private final zzelx<Context> zzert;
    private final zzelx<zzdvw> zzgsh;
    private final zzelx<Set<String>> zzgsu;

    private zzdcz(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2, zzelx<Set<String>> zzelxVar3) {
        this.zzgsh = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzgsu = zzelxVar3;
    }

    public static zzdcz zzs(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2, zzelx<Set<String>> zzelxVar3) {
        return new zzdcz(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzdcx(this.zzgsh.get(), this.zzert.get(), this.zzgsu.get());
    }
}
