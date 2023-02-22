package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@19.3.0 */
/* loaded from: classes.dex */
public final class zzbzr extends zzbpd {
    private final WeakReference<zzbfq> zzfur;
    private final zzbyg zzfus;
    private final zzcaz zzfut;
    private final zzbpx zzfuu;
    private final zzdqm zzfuv;
    private final zzbtb zzfuw;
    private boolean zzfux;
    private final Context zzvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzr(zzbpg zzbpgVar, Context context, @Nullable zzbfq zzbfqVar, zzbyg zzbygVar, zzcaz zzcazVar, zzbpx zzbpxVar, zzdqm zzdqmVar, zzbtb zzbtbVar) {
        super(zzbpgVar);
        this.zzfux = false;
        this.zzvr = context;
        this.zzfur = new WeakReference<>(zzbfqVar);
        this.zzfus = zzbygVar;
        this.zzfut = zzcazVar;
        this.zzfuu = zzbpxVar;
        this.zzfuv = zzdqmVar;
        this.zzfuw = zzbtbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzbi(boolean r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcnp
            com.google.android.gms.internal.ads.zzaap r1 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r0 = r1.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L49
            com.google.android.gms.ads.internal.zzp.zzkp()
            android.content.Context r0 = r4.zzvr
            boolean r0 = com.google.android.gms.internal.ads.zzayh.zzav(r0)
            if (r0 == 0) goto L49
            java.lang.String r0 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            com.google.android.gms.internal.ads.zzaxy.zzfe(r0)
            com.google.android.gms.internal.ads.zzbtb r0 = r4.zzfuw
            r0.zzajk()
            com.google.android.gms.internal.ads.zzaai<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzaat.zzcnq
            com.google.android.gms.internal.ads.zzaap r3 = com.google.android.gms.internal.ads.zzwe.zzpu()
            java.lang.Object r0 = r3.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4f
            com.google.android.gms.internal.ads.zzdqm r0 = r4.zzfuv
            com.google.android.gms.internal.ads.zzdlj r3 = r4.zzflg
            com.google.android.gms.internal.ads.zzdlh r3 = r3.zzhbq
            com.google.android.gms.internal.ads.zzdkz r3 = r3.zzhbn
            java.lang.String r3 = r3.zzdsg
            r0.zzhc(r3)
            goto L4f
        L49:
            boolean r0 = r4.zzfux
            if (r0 != 0) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = 0
        L50:
            if (r0 != 0) goto L53
            return r2
        L53:
            com.google.android.gms.internal.ads.zzbyg r0 = r4.zzfus
            r0.zzaiz()
            com.google.android.gms.internal.ads.zzcaz r0 = r4.zzfut     // Catch: com.google.android.gms.internal.ads.zzcbc -> L67
            android.content.Context r3 = r4.zzvr     // Catch: com.google.android.gms.internal.ads.zzcbc -> L67
            r0.zza(r5, r3)     // Catch: com.google.android.gms.internal.ads.zzcbc -> L67
            com.google.android.gms.internal.ads.zzbyg r5 = r4.zzfus     // Catch: com.google.android.gms.internal.ads.zzcbc -> L67
            r5.zzaix()     // Catch: com.google.android.gms.internal.ads.zzcbc -> L67
            r4.zzfux = r1
            return r1
        L67:
            r5 = move-exception
            com.google.android.gms.internal.ads.zzbtb r0 = r4.zzfuw
            r0.zza(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzr.zzbi(boolean):boolean");
    }

    public final boolean isClosed() {
        return this.zzfuu.isClosed();
    }

    public final void finalize() throws Throwable {
        try {
            zzbfq zzbfqVar = this.zzfur.get();
            if (((Boolean) zzwe.zzpu().zzd(zzaat.zzcww)).booleanValue()) {
                if (!this.zzfux && zzbfqVar != null) {
                    zzdvw zzdvwVar = zzbbi.zzedy;
                    zzbfqVar.getClass();
                    zzdvwVar.execute(zzbzu.zzh(zzbfqVar));
                }
            } else if (zzbfqVar != null) {
                zzbfqVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
