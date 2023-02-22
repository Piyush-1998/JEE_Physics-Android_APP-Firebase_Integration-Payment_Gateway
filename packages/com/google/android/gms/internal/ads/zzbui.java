package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.reward.AdMetadataListener;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbui extends zzbxe<AdMetadataListener> implements zzagl {
    private Bundle zzfsz;

    public zzbui(Set<zzbys<AdMetadataListener>> set) {
        super(set);
        this.zzfsz = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzagl
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzfsz.putAll(bundle);
        zza(zzbul.zzfst);
    }

    public final synchronized Bundle getAdMetadata() {
        return new Bundle(this.zzfsz);
    }
}
