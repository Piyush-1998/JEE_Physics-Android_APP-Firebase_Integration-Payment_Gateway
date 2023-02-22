package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzdcl implements zzdek<Bundle> {
    private final zzdkv zzfld;

    public zzdcl(zzdkv zzdkvVar) {
        this.zzfld = zzdkvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        Bundle bundle2 = bundle;
        zzdkv zzdkvVar = this.zzfld;
        if (zzdkvVar != null) {
            bundle2.putBoolean("render_in_browser", zzdkvVar.zzask());
            bundle2.putBoolean("disable_ml", this.zzfld.zzasl());
        }
    }
}
