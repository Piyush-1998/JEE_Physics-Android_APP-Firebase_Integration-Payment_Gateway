package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzbht implements zzahf<zzbfq> {
    private final /* synthetic */ zzbhr zzepu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbht(zzbhr zzbhrVar) {
        this.zzepu = zzbhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final /* synthetic */ void zza(zzbfq zzbfqVar, Map map) {
        int i;
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                synchronized (this.zzepu) {
                    i = this.zzepu.zzeon;
                    if (i != parseInt) {
                        this.zzepu.zzeon = parseInt;
                        this.zzepu.requestLayout();
                    }
                }
            } catch (Exception e) {
                zzaxy.zzd("Exception occurred while getting webview content height", e);
            }
        }
    }
}
