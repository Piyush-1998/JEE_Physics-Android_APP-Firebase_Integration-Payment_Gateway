package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzajf {
    private final zzvh zzacs;
    private final zzwm zzact;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzajf(Context context, zzwm zzwmVar) {
        this(context, zzwmVar, zzvh.zzchm);
    }

    private zzajf(Context context, zzwm zzwmVar, zzvh zzvhVar) {
        this.zzvr = context;
        this.zzact = zzwmVar;
        this.zzacs = zzvhVar;
    }

    private final void zza(zzyo zzyoVar) {
        try {
            this.zzact.zzb(zzvh.zza(this.zzvr, zzyoVar));
        } catch (RemoteException e) {
            zzbbd.zze("#007 Could not call remote method.", e);
        }
    }

    public final void loadAd(AdRequest adRequest) {
        zza(adRequest.zzdp());
    }

    public final void loadAd(PublisherAdRequest publisherAdRequest) {
        zza(publisherAdRequest.zzdp());
    }
}
