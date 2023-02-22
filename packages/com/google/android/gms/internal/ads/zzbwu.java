package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbwu implements zzelo<zzbws> {
    private final zzelx<Set<zzbys<AppEventListener>>> zzfor;

    private zzbwu(zzelx<Set<zzbys<AppEventListener>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbwu zzr(zzelx<Set<zzbys<AppEventListener>>> zzelxVar) {
        return new zzbwu(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbws(this.zzfor.get());
    }
}
