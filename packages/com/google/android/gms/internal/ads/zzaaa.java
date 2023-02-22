package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.formats.ShouldDelayBannerRenderingListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzaaa extends zzafp {
    private final ShouldDelayBannerRenderingListener zzckt;

    public zzaaa(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
        this.zzckt = shouldDelayBannerRenderingListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafq
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        return this.zzckt.shouldDelayBannerRendering((Runnable) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
