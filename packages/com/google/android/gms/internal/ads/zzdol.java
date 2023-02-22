package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdol implements zzelo<ScheduledExecutorService> {
    private final zzelx<ThreadFactory> zzhgl;

    public zzdol(zzelx<ThreadFactory> zzelxVar) {
        this.zzhgl = zzelxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (ScheduledExecutorService) zzelu.zza(new ScheduledThreadPoolExecutor(1, this.zzhgl.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
