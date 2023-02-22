package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbag extends zzaxu {
    private final String url;
    private final zzbbh zzeck;

    public zzbag(Context context, String str, String str2) {
        this(str2, com.google.android.gms.ads.internal.zzp.zzkp().zzs(context, str));
    }

    private zzbag(String str, String str2) {
        this.zzeck = new zzbbh(str2);
        this.url = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaxu
    public final void zzuy() {
        this.zzeck.zzes(this.url);
    }
}
