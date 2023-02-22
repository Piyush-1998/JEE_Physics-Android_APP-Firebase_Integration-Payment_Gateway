package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class MediationConfiguration {
    private final Bundle zzeqc;
    private final AdFormat zzeqg;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.zzeqg = adFormat;
        this.zzeqc = bundle;
    }

    public AdFormat getFormat() {
        return this.zzeqg;
    }

    public Bundle getServerParameters() {
        return this.zzeqc;
    }
}
