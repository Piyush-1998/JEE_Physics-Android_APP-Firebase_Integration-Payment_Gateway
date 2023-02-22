package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzarh;
import com.google.android.gms.internal.ads.zzzb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public class QueryInfo {
    private final zzzb zzhih;

    public QueryInfo(zzzb zzzbVar) {
        this.zzhih = zzzbVar;
    }

    public String getQuery() {
        return this.zzhih.getQuery();
    }

    public Bundle getQueryBundle() {
        return this.zzhih.getQueryBundle();
    }

    public String getRequestId() {
        return zzzb.zza(this);
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        new zzarh(context, adFormat, adRequest == null ? null : adRequest.zzdp()).zza(queryInfoGenerationCallback);
    }
}
