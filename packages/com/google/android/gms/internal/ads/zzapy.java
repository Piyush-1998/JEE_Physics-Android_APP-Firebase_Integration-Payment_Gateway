package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzapy {
    private final zzbfq zzdgc;
    private final boolean zzdmv;
    private final String zzdmw;

    public zzapy(zzbfq zzbfqVar, Map<String, String> map) {
        this.zzdgc = zzbfqVar;
        this.zzdmw = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.zzdmv = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.zzdmv = true;
        }
    }

    public final void execute() {
        int zzxs;
        if (this.zzdgc == null) {
            zzaxy.zzfe("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.zzdmw)) {
            com.google.android.gms.ads.internal.zzp.zzkr();
            zzxs = 7;
        } else if ("landscape".equalsIgnoreCase(this.zzdmw)) {
            com.google.android.gms.ads.internal.zzp.zzkr();
            zzxs = 6;
        } else {
            zzxs = this.zzdmv ? -1 : com.google.android.gms.ads.internal.zzp.zzkr().zzxs();
        }
        this.zzdgc.setRequestedOrientation(zzxs);
    }
}
