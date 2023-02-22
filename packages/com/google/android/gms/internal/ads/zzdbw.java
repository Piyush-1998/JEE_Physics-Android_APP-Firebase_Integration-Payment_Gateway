package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdbw implements zzelo<zzdbs> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzfrj;

    private zzdbw(zzelx<Context> zzelxVar, zzelx<zzdvw> zzelxVar2) {
        this.zzfrj = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzdbw zzba(zzelx<Context> zzelxVar, zzelx<zzdvw> zzelxVar2) {
        return new zzdbw(zzelxVar, zzelxVar2);
    }

    public static zzdbs zza(Context context, zzdvw zzdvwVar) {
        return new zzdbs(context, zzdvwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfrj.get(), this.zzerr.get());
    }
}
