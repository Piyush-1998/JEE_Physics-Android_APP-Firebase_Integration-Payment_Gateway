package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdel implements zzelo<zzdee> {
    private final zzelx<zzdvw> zzerr;
    private final zzelx<Context> zzfrj;

    private zzdel(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2) {
        this.zzerr = zzelxVar;
        this.zzfrj = zzelxVar2;
    }

    public static zzdel zzbg(zzelx<zzdvw> zzelxVar, zzelx<Context> zzelxVar2) {
        return new zzdel(zzelxVar, zzelxVar2);
    }

    public static zzdee zza(zzdvw zzdvwVar, Context context) {
        return new zzdee(zzdvwVar, context);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzerr.get(), this.zzfrj.get());
    }
}
