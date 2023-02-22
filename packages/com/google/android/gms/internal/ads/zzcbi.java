package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zztw;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbi implements zzelo<zzcbf> {
    private final zzelx<Context> zzert;
    private final zzelx<zzawb> zzfku;
    private final zzelx<View> zzflx;
    private final zzelx<zztw.zza.EnumC0020zza> zzfne;
    private final zzelx<zzavy> zzfpq;

    private zzcbi(zzelx<zzavy> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzawb> zzelxVar3, zzelx<View> zzelxVar4, zzelx<zztw.zza.EnumC0020zza> zzelxVar5) {
        this.zzfpq = zzelxVar;
        this.zzert = zzelxVar2;
        this.zzfku = zzelxVar3;
        this.zzflx = zzelxVar4;
        this.zzfne = zzelxVar5;
    }

    public static zzcbi zzd(zzelx<zzavy> zzelxVar, zzelx<Context> zzelxVar2, zzelx<zzawb> zzelxVar3, zzelx<View> zzelxVar4, zzelx<zztw.zza.EnumC0020zza> zzelxVar5) {
        return new zzcbi(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcbf(this.zzfpq.get(), this.zzert.get(), this.zzfku.get(), this.zzflx.get(), this.zzfne.get());
    }
}
