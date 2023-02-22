package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzari extends zzarf {
    private final /* synthetic */ UpdateImpressionUrlsCallback zzdpi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzari(zzarj zzarjVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zzdpi = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void onSuccess(List<Uri> list) {
        this.zzdpi.onSuccess(list);
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void onError(String str) {
        this.zzdpi.onFailure(str);
    }
}
