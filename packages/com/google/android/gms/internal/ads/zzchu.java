package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzchu extends zzbpd {
    private final zzaug zzdvj;
    private final WeakReference<zzbfq> zzfur;
    private final zzbyg zzfus;
    private final zzbpx zzfuu;
    private final zzdqm zzfuv;
    private final zzbtb zzfuw;
    private final zzcaz zzfuz;
    private boolean zzgce;
    private final zzbui zzgcs;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzchu(zzbpg zzbpgVar, Context context, zzbfq zzbfqVar, zzcaz zzcazVar, zzbyg zzbygVar, zzbtb zzbtbVar, zzbui zzbuiVar, zzbpx zzbpxVar, zzdkx zzdkxVar, zzdqm zzdqmVar) {
        super(zzbpgVar);
        this.zzgce = false;
        this.zzvr = context;
        this.zzfuz = zzcazVar;
        this.zzfur = new WeakReference<>(zzbfqVar);
        this.zzfus = zzbygVar;
        this.zzfuw = zzbtbVar;
        this.zzgcs = zzbuiVar;
        this.zzfuu = zzbpxVar;
        this.zzfuv = zzdqmVar;
        this.zzdvj = new zzavh(zzdkxVar.zzdsh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.content.Context] */
    public final boolean zzb(boolean z, Activity activity) {
        if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnp)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzkp();
            if (zzayh.zzav(this.zzvr)) {
                zzaxy.zzfe("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzfuw.zzajk();
                if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcnq)).booleanValue()) {
                    this.zzfuv.zzhc(this.zzflg.zzhbq.zzhbn.zzdsg);
                }
                return false;
            }
        }
        if (this.zzgce) {
            zzaxy.zzfe("The rewarded ad have been showed.");
            this.zzfuw.zzh(zzdmb.zza(zzdmd.zzhcx, null, null));
            return false;
        }
        this.zzgce = true;
        this.zzfus.zzaiz();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzvr;
        }
        try {
            this.zzfuz.zza(z, activity2);
            this.zzfus.zzaix();
            return true;
        } catch (zzcbc e) {
            this.zzfuw.zza(e);
            return false;
        }
    }

    public final boolean zzanh() {
        return this.zzgce;
    }

    public final zzaug zzqw() {
        return this.zzdvj;
    }

    public final boolean isClosed() {
        return this.zzfuu.isClosed();
    }

    public final boolean zzqx() {
        zzbfq zzbfqVar = this.zzfur.get();
        return (zzbfqVar == null || zzbfqVar.zzabt()) ? false : true;
    }

    public final Bundle getAdMetadata() {
        return this.zzgcs.getAdMetadata();
    }

    public final void finalize() throws Throwable {
        try {
            zzbfq zzbfqVar = this.zzfur.get();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcww)).booleanValue()) {
                if (!this.zzgce && zzbfqVar != null) {
                    zzdvw zzdvwVar = zzbbi.zzedy;
                    zzbfqVar.getClass();
                    zzdvwVar.execute(zzcht.zzh(zzbfqVar));
                }
            } else if (zzbfqVar != null) {
                zzbfqVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
