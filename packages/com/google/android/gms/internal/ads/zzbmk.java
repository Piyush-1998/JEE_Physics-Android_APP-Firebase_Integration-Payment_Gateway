package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbmk implements zzelo<Set<zzbys<com.google.android.gms.ads.internal.overlay.zzo>>> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzbma> zzfmx;
    private final zzelx<JSONObject> zzfmy;

    private zzbmk(zzelx<zzbma> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<JSONObject> zzelxVar3) {
        this.zzfmx = zzelxVar;
        this.zzerr = zzelxVar2;
        this.zzfmy = zzelxVar3;
    }

    public static zzbmk zze(zzelx<zzbma> zzelxVar, zzelx<Executor> zzelxVar2, zzelx<JSONObject> zzelxVar3) {
        return new zzbmk(zzelxVar, zzelxVar2, zzelxVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        Set singleton;
        zzbma zzbmaVar = this.zzfmx.get();
        Executor executor = this.zzerr.get();
        if (this.zzfmy.get() == null) {
            singleton = Collections.emptySet();
        } else {
            singleton = Collections.singleton(new zzbys(zzbmaVar, executor));
        }
        return (Set) zzelu.zza(singleton, "Cannot return null from a non-@Nullable @Provides method");
    }
}
