package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzagi extends zzafj {
    private final OnPublisherAdViewLoadedListener zzdds;

    public zzagi(OnPublisherAdViewLoadedListener onPublisherAdViewLoadedListener) {
        this.zzdds = onPublisherAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzafk
    public final void zza(zzwu zzwuVar, IObjectWrapper iObjectWrapper) {
        if (zzwuVar == null || iObjectWrapper == null) {
            return;
        }
        PublisherAdView publisherAdView = new PublisherAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzwuVar.zzki() instanceof zzuy) {
                zzuy zzuyVar = (zzuy) zzwuVar.zzki();
                publisherAdView.setAdListener(zzuyVar != null ? zzuyVar.getAdListener() : null);
            }
        } catch (RemoteException e) {
            zzbbd.zzc("", e);
        }
        try {
            if (zzwuVar.zzkh() instanceof zzvn) {
                zzvn zzvnVar = (zzvn) zzwuVar.zzkh();
                publisherAdView.setAppEventListener(zzvnVar != null ? zzvnVar.getAppEventListener() : null);
            }
        } catch (RemoteException e2) {
            zzbbd.zzc("", e2);
        }
        zzbat.zzaah.post(new zzagh(this, publisherAdView, zzwuVar));
    }
}
