package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
/* loaded from: classes.dex */
public final class zzagc {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zzddj;
    private final NativeCustomTemplateAd.OnCustomClickListener zzddk;
    private NativeCustomTemplateAd zzddl;

    public zzagc(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zzddj = onCustomTemplateAdLoadedListener;
        this.zzddk = onCustomClickListener;
    }

    public final zzafd zzst() {
        return new zzagd(this);
    }

    public final zzafc zzsu() {
        if (this.zzddk == null) {
            return null;
        }
        return new zzage(this);
    }

    public final synchronized NativeCustomTemplateAd zzb(zzaes zzaesVar) {
        if (this.zzddl != null) {
            return this.zzddl;
        }
        zzaet zzaetVar = new zzaet(zzaesVar);
        this.zzddl = zzaetVar;
        return zzaetVar;
    }
}
