package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcwy implements zzelo<zzcwu> {
    private final zzelx<Executor> zzerr;

    public zzcwy(zzelx<Executor> zzelxVar) {
        this.zzerr = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzcwu(this.zzerr.get());
    }
}
