package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzddm implements zzdek<Bundle> {
    private final String zzguk;

    public zzddm(String str) {
        this.zzguk = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final /* synthetic */ void zzs(Bundle bundle) {
        bundle.putString("rtb", this.zzguk);
    }
}
