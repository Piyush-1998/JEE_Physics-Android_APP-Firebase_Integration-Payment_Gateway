package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
final class zzep implements zzer {
    private final /* synthetic */ Activity val$activity;
    private final /* synthetic */ Bundle zzym;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzep(zzej zzejVar, Activity activity, Bundle bundle) {
        this.val$activity = activity;
        this.zzym = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzer
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.val$activity, this.zzym);
    }
}
