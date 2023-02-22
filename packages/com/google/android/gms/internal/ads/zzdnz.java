package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdnz implements zzelo<Executor> {
    public static zzdnz zzaug() {
        zzdnz zzdnzVar;
        zzdnzVar = zzdoc.zzhgg;
        return zzdnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (Executor) zzelu.zza(zzbbi.zzedy, "Cannot return null from a non-@Nullable @Provides method");
    }
}
