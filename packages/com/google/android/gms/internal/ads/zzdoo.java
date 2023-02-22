package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdoo implements zzelo<ThreadFactory> {
    public static zzdoo zzauv() {
        zzdoo zzdooVar;
        zzdooVar = zzdon.zzhgn;
        return zzdooVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (ThreadFactory) zzelu.zza(new zzdoa(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
