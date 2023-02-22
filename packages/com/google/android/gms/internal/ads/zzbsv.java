package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbsv implements zzelo<zzbst> {
    private final zzelx<Set<zzbys<zzut>>> zzfor;

    private zzbsv(zzelx<Set<zzbys<zzut>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbsv zzg(zzelx<Set<zzbys<zzut>>> zzelxVar) {
        return new zzbsv(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbst(this.zzfor.get());
    }
}
