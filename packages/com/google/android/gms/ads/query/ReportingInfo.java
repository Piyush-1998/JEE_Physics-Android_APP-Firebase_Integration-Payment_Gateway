package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzarj;
import com.google.android.gms.internal.ads.zzark;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final zzarj zzhik;

    private ReportingInfo(Builder builder) {
        this.zzhik = new zzarj(builder.zzhil);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzark zzhil;

        public Builder(View view) {
            zzark zzarkVar = new zzark();
            this.zzhil = zzarkVar;
            zzarkVar.zzk(view);
        }

        public final Builder setAssetViews(Map<String, View> map) {
            this.zzhil.zzh(map);
            return this;
        }

        public final ReportingInfo build() {
            return new ReportingInfo(this);
        }
    }

    public final void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzhik.updateImpressionUrls(list, updateImpressionUrlsCallback);
    }

    public final void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzhik.updateClickUrl(uri, updateClickUrlCallback);
    }

    public final void reportTouchEvent(MotionEvent motionEvent) {
        this.zzhik.reportTouchEvent(motionEvent);
    }
}
