package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbik implements zzelo<Context> {
    private final zzbih zzern;

    public zzbik(zzbih zzbihVar) {
        this.zzern = zzbihVar;
    }

    public static Context zza(zzbih zzbihVar) {
        return (Context) zzelu.zza(zzbihVar.zzade(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzern);
    }
}
