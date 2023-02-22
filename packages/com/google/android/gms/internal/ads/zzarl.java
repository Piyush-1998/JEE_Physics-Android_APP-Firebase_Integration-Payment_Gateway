package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzarl extends zzarf {
    private final /* synthetic */ UpdateClickUrlCallback zzdpl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarl(zzarj zzarjVar, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zzdpl = updateClickUrlCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void onSuccess(List<Uri> list) {
        this.zzdpl.onSuccess(list.get(0));
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void onError(String str) {
        this.zzdpl.onFailure(str);
    }
}
