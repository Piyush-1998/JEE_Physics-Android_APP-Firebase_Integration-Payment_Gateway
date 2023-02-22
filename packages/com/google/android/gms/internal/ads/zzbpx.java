package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbpx implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzbtu zzfqj;
    private AtomicBoolean zzfqk = new AtomicBoolean(false);

    public zzbpx(zzbtu zzbtuVar) {
        this.zzfqj = zzbtuVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzui() {
        this.zzfqk.set(true);
        this.zzfqj.onAdClosed();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzuj() {
        this.zzfqj.onAdOpened();
    }

    public final boolean isClosed() {
        return this.zzfqk.get();
    }
}
