package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbuk implements zzelo<zzbui> {
    private final zzelx<Set<zzbys<AdMetadataListener>>> zzfor;

    private zzbuk(zzelx<Set<zzbys<AdMetadataListener>>> zzelxVar) {
        this.zzfor = zzelxVar;
    }

    public static zzbuk zzm(zzelx<Set<zzbys<AdMetadataListener>>> zzelxVar) {
        return new zzbuk(zzelxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzelx
    public final /* synthetic */ Object get() {
        return new zzbui(this.zzfor.get());
    }
}
