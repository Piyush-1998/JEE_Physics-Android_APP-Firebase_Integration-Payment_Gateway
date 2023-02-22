package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
final class zzagh implements Runnable {
    private final /* synthetic */ PublisherAdView zzddp;
    private final /* synthetic */ zzwu zzddq;
    private final /* synthetic */ zzagi zzddr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzagh(zzagi zzagiVar, PublisherAdView publisherAdView, zzwu zzwuVar) {
        this.zzddr = zzagiVar;
        this.zzddp = publisherAdView;
        this.zzddq = zzwuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener;
        if (!this.zzddp.zza(this.zzddq)) {
            zzbbd.zzfe("Could not bind.");
            return;
        }
        onPublisherAdViewLoadedListener = this.zzddr.zzdds;
        onPublisherAdViewLoadedListener.onPublisherAdViewLoaded(this.zzddp);
    }
}
