package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddn implements zzelo<zzddl> {
    private final zzelx<Context> zzert;
    private final zzelx<String> zzeyb;

    private zzddn(zzelx<Context> zzelxVar, zzelx<String> zzelxVar2) {
        this.zzert = zzelxVar;
        this.zzeyb = zzelxVar2;
    }

    public static zzddn zzbf(zzelx<Context> zzelxVar, zzelx<String> zzelxVar2) {
        return new zzddn(zzelxVar, zzelxVar2);
    }

    public static zzddl zzu(Context context, String str) {
        return new zzddl(context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzu(this.zzert.get(), this.zzeyb.get());
    }
}
