package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zztw;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbe implements zzelo<zzcbb> {
    private final zzelx<Context> zzert;
    private final zzelx<zzbbg> zzfkr;
    private final zzelx<zztw.zza.EnumC0020zza> zzfne;
    private final zzelx<zzbfq> zzfoi;
    private final zzelx<zzdkx> zzfpe;

    private zzcbe(zzelx<Context> zzelxVar, zzelx<zzbfq> zzelxVar2, zzelx<zzdkx> zzelxVar3, zzelx<zzbbg> zzelxVar4, zzelx<zztw.zza.EnumC0020zza> zzelxVar5) {
        this.zzert = zzelxVar;
        this.zzfoi = zzelxVar2;
        this.zzfpe = zzelxVar3;
        this.zzfkr = zzelxVar4;
        this.zzfne = zzelxVar5;
    }

    public static zzcbe zzc(zzelx<Context> zzelxVar, zzelx<zzbfq> zzelxVar2, zzelx<zzdkx> zzelxVar3, zzelx<zzbbg> zzelxVar4, zzelx<zztw.zza.EnumC0020zza> zzelxVar5) {
        return new zzcbe(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcbb(this.zzert.get(), this.zzfoi.get(), this.zzfpe.get(), this.zzfkr.get(), this.zzfne.get());
    }
}
