package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdds implements zzelo<zzddp> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzcwu> zzesi;
    private final zzelx<ScheduledExecutorService> zzflu;
    private final zzelx<String> zzfne;
    private final zzelx<zzdln> zzfos;
    private final zzelx<zzcws> zzgog;

    private zzdds(zzelx<zzdvw> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<String> zzelxVar3, zzelx<zzcwu> zzelxVar4, zzelx<Context> zzelxVar5, zzelx<zzdln> zzelxVar6, zzelx<zzcws> zzelxVar7) {
        this.zzerr = zzelxVar;
        this.zzflu = zzelxVar2;
        this.zzfne = zzelxVar3;
        this.zzesi = zzelxVar4;
        this.zzert = zzelxVar5;
        this.zzfos = zzelxVar6;
        this.zzgog = zzelxVar7;
    }

    public static zzdds zzb(zzelx<zzdvw> zzelxVar, zzelx<ScheduledExecutorService> zzelxVar2, zzelx<String> zzelxVar3, zzelx<zzcwu> zzelxVar4, zzelx<Context> zzelxVar5, zzelx<zzdln> zzelxVar6, zzelx<zzcws> zzelxVar7) {
        return new zzdds(zzelxVar, zzelxVar2, zzelxVar3, zzelxVar4, zzelxVar5, zzelxVar6, zzelxVar7);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzddp(this.zzerr.get(), this.zzflu.get(), this.zzfne.get(), this.zzesi.get(), this.zzert.get(), this.zzfos.get(), this.zzgog.get());
    }
}
