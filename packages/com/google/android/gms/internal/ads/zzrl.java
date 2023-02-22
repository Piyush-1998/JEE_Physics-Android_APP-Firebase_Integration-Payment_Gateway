package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzrl implements ValueCallback<String> {
    private final /* synthetic */ zzrm zzbtn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzrl(zzrm zzrmVar) {
        this.zzbtn = zzrmVar;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        this.zzbtn.zzbta.zza(this.zzbtn.zzbtp, this.zzbtn.zzbtq, str, this.zzbtn.zzbtr);
    }
}
