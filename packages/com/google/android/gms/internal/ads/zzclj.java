package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclj implements zzelo<zzcli> {
    private final zzelx<Executor> zzerr;
    private final zzelx<zzcln> zzesn;

    public zzclj(zzelx<zzcln> zzelxVar, zzelx<Executor> zzelxVar2) {
        this.zzesn = zzelxVar;
        this.zzerr = zzelxVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcli(this.zzesn.get(), this.zzerr.get());
    }
}
