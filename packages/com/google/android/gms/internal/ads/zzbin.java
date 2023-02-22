package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbin implements zzelo<WeakReference<Context>> {
    private final zzbih zzern;

    public zzbin(zzbih zzbihVar) {
        this.zzern = zzbihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (WeakReference) zzelu.zza(this.zzern.zzadf(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
