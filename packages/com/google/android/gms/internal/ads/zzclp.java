package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzclp implements zzelo<zzcln> {
    private final zzelx<Executor> zzerr;
    private final zzelx<Context> zzert;
    private final zzelx<zzbbh> zzfbu;
    private final zzelx<zzbbg> zzfkr;

    public zzclp(zzelx<Executor> zzelxVar, zzelx<zzbbh> zzelxVar2, zzelx<Context> zzelxVar3, zzelx<zzbbg> zzelxVar4) {
        this.zzerr = zzelxVar;
        this.zzfbu = zzelxVar2;
        this.zzert = zzelxVar3;
        this.zzfkr = zzelxVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcln(this.zzerr.get(), this.zzfbu.get(), this.zzert.get(), this.zzfkr.get());
    }
}
