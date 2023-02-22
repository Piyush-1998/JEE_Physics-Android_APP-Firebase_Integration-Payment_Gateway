package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsj implements zzelo<Context> {
    private final zzelx<Context> zzfrj;
    private final zzbsg zzfsm;

    private zzbsj(zzbsg zzbsgVar, zzelx<Context> zzelxVar) {
        this.zzfsm = zzbsgVar;
        this.zzfrj = zzelxVar;
    }

    public static zzbsj zza(zzbsg zzbsgVar, zzelx<Context> zzelxVar) {
        return new zzbsj(zzbsgVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Context) zzelu.zza(this.zzfsm.zzcc(this.zzfrj.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
