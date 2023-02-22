package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzczs implements zzelo<zzczr> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzdvt<String>> zzgsk;

    private zzczs(zzelx<zzdvt<String>> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzgsk = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    public static zzczs zzaw(zzelx<zzdvt<String>> zzelxVar, zzelx<Executor> zzelxVar2) {
        return new zzczs(zzelxVar, zzelxVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzczr(this.zzgsk.get(), this.zzerr.get());
    }
}
