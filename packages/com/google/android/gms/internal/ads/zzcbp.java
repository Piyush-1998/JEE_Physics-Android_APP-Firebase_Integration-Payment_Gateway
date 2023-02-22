package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzcbp implements zzelo<Set<String>> {
    private final zzelx<zzcdg> zzfok;

    public zzcbp(zzelx<zzcdg> zzelxVar) {
        this.zzfok = zzelxVar;
    }

    public static Set<String> zza(zzcdg zzcdgVar) {
        Set emptySet;
        if (zzcdgVar.zzamf() != null) {
            emptySet = Collections.singleton("banner");
        } else {
            emptySet = Collections.emptySet();
        }
        return (Set) zzelu.zza(emptySet, "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return zza(this.zzfok.get());
    }
}
