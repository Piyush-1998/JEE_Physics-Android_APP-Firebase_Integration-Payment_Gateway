package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcli {
    private final Executor executor;
    private final zzcln zzgfb;
    private final Map<String, String> zzgff;

    public zzcli(zzcln zzclnVar, Executor executor) {
        this.zzgfb = zzclnVar;
        this.zzgff = zzclnVar.zzaos();
        this.executor = executor;
    }

    public final zzclh zzaor() {
        return zzclh.zza(new zzclh(this));
    }
}
