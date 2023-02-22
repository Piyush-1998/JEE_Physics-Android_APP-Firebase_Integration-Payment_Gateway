package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zztf extends zzbbq<InputStream> {
    private final /* synthetic */ zztg zzbvg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztf(zztg zztgVar) {
        this.zzbvg = zztgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbbq, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zzbvg.disconnect();
        return super.cancel(z);
    }
}
