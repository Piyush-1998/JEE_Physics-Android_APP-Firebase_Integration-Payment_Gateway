package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdab implements zzelo<zzczz> {
    private final zzelx<Set<String>> zzgsu;

    private zzdab(zzelx<Set<String>> zzelxVar) {
        this.zzgsu = zzelxVar;
    }

    public static zzdab zzal(zzelx<Set<String>> zzelxVar) {
        return new zzdab(zzelxVar);
    }

    public static zzczz zzd(Set<String> set) {
        return new zzczz(set);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zzd(this.zzgsu.get());
    }
}
