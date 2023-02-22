package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbxk implements zzelo<zzbsx> {
    private final zzbxj zzfug;
    private final zzelx<Set<zzbys<zzbsz>>> zzfuh;

    private zzbxk(zzbxj zzbxjVar, zzelx<Set<zzbys<zzbsz>>> zzelxVar) {
        this.zzfug = zzbxjVar;
        this.zzfuh = zzelxVar;
    }

    public static zzbxk zza(zzbxj zzbxjVar, zzelx<Set<zzbys<zzbsz>>> zzelxVar) {
        return new zzbxk(zzbxjVar, zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return (zzbsx) zzelu.zza(this.zzfug.zzc(this.zzfuh.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
